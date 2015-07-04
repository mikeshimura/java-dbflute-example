 var b = ReactBootstrap;
$w.width=900;
$w.height=800;
$w.tableHeight=340;
$w.tableColW={c1:140,c2:130,c3:130,c4:150,c5:150,c6:150,c7:60,c8:60,c9:60,c10:60,c11:60}
$w.UsertblRows = React.createClass({

    render: function() {
        var rows = this.props.rcds.map(function(rcd, i){
        var bgcolor="";
        if (i==this.props.selRow)
          bgcolor="#d9edf7";
        else
          if (i%2 == 1)
            bgcolor="#F8F8F8";
          else
            bgcolor="#FFFFFF";
        return (
          <tr key={i} >
          <td id={"usertbl_row#tableName#"+i} 
            style={{width:this.props.cw.c1,backgroundColor:bgcolor}}>{rcd.tableName}</td>
          <td id={"usertbl_row#key1#"+i} 
            style={{width:this.props.cw.c2,backgroundColor:bgcolor}}>{rcd.key1}</td>
          <td id={"usertbl_row#key2#"+i} 
            style={{width:this.props.cw.c3,backgroundColor:bgcolor}}>{rcd.key2}</td>
          <td id={"usertbl_row#s1Data#"+i} 
          style={{width:this.props.cw.c4,backgroundColor:bgcolor}}>{rcd.s1Data}</td>
          <td id={"usertbl_row#s2Data#"+i} 
          style={{width:this.props.cw.c5,backgroundColor:bgcolor}}>{rcd.s2Data}</td>
          <td id={"usertbl_row#s3Data#"+i} 
          style={{width:this.props.cw.c6,backgroundColor:bgcolor}}>{rcd.s3Data}</td>
          <td id={"usertbl_row#n1Data#"+i} 
          style={{width:this.props.cw.c7,backgroundColor:bgcolor,textAlign:"right"}}>
            {rcd.n1Data}</td>
          <td id={"usertbl_row#n2Data#"+i} 
          style={{width:this.props.cw.c8,backgroundColor:bgcolor,textAlign:"right"}}>
            {rcd.n2Data}</td>
          <td id={"usertbl_row#n3Data#"+i} 
          style={{width:this.props.cw.c9,backgroundColor:bgcolor,textAlign:"right"}}>
            {rcd.n3Data}</td>
          <td id={"usertbl_row#vid#"+i} 
          style={{width:this.props.cw.c10,backgroundColor:bgcolor,textAlign:"right"}}>
            {rcd.id}</td>
          <td id={"usertbl_row#versionNo#"+i} 
          style={{width:this.props.cw.c11,backgroundColor:bgcolor,textAlign:"right"}}>
            {rcd.versionNo}</td>
         </tr>
        )
        }, this);
          return ( 
            <tbody>
                {rows}
            </tbody>
          );
    }
  });
$w.Application = React.createClass({
  mixins: [$w.FluxMixin, $w.StoreWatchMixin("PAGE","COMMON","RCD")],
  getInitialState: function() {
  $w.app = this;
  usertbl_blank={
          tableName:"",
          key1:"",
          key2:"",
          s1Data:"",
          s2Data:"",
          s3Data:"",
          n1Data:"",
          n2Data:"",
          n3Data:"",
          id:"",
          versionNo:""   
  };
      return {
                user:$c.login.name,
                usertbl_search:{
                  tableName:"starts with",
                  tableName_s:"",
                  tableName_e:"",
                  key1:"starts with",
                  key1_s:"",
                  key1_e:"",
                  maxRecord:"300"
                },
                usertbl:{
                  url:"/ajax/usertbl",
                  cw:$w.tableColW,
                  totalW:$c.totalW($w.tableColW)+2,
                  rcds:[],
                  blank:_.cloneDeep(usertbl_blank), 
                  selRow:-1
                },
                usertbl_form:_.cloneDeep(usertbl_blank)
              };
  },
  getStateFromFlux: function() {
    //this.props.flux=$w.flux;
    var pageStore = $w.flux.stores.PAGE;
    var commonStore = $w.flux.stores.COMMON;
    var rcdStore = $w.flux.stores.RCD;
    return {
      page: _.cloneDeep(pageStore.data),
      common:_.cloneDeep(commonStore.data),
      rcd:_.cloneDeep(rcdStore.data)
      };
  },
  render: function() {
    return (
      <div className="container-fixed" 
          style={{fontSize:12,border:1,borderStyle:"solid",
            width:$w.width,height:$w.height,backgroundColor: "#F0F0F0"}}>
      <b.Row className="darkBgLarge" 
          style={{margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}>
        <b.Col xs={5} style={{textAlign: "center"}}>ユーザーテーブル管理
        </b.Col>
        <b.Col xs={5} className="darkBgMid" style={{textAlign: "center"}}>
        {this.state.user}
        </b.Col>
        <b.Col xs={1} className="darkBgMid" >
        </b.Col>
         <b.Col xs={1} >
        <$c.Loader src="../static/img/ajax-loader.gif" isLoading={this.state.common.loading}/>
        </b.Col>
      </b.Row>
      <b.Row style={{margin:5}}>
      <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
        name="usertbl_btnSearch" style={{width:60,marginLeft:10}}>検索</b.Button>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>tableName
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} style={{height:24,  fontSize:12}}
               name={"usertbl_search#tableName"}
              defaultValue={this.state.usertbl_search.tableName} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_search.tableName_s} 
            name="usertbl_search#tableName_s" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_search.tableName_e} 
            name="usertbl_search#tableName_e" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={1} style={{textAlign: "right"}}>MaxRecord
          </b.Col>
          <b.Col xs={1} >
            <b.Input type="text" value={this.state.usertbl_search.maxRecord} 
            name="usertbl_search#names" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>key1
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} 
              style={{height:24,  fontSize:12}} name={"usertbl_search#key1"}
              defaultValue={this.state.usertbl_search.key1} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_search.key1_s} 
            name="usertbl_search#key1_s" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_search.key1_e} 
            name="usertbl_search#key1_e" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <div style={{width:$w.width-2,border:1,borderStyle:"solid",
          borderColor:"black",height:$w.tableHeight,backgroundColor: "#FFFFFF"}}>
      <div ref="usertbl_tableHead"  
          style={{width:$w.width-20,height:20,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable" >
       <thead style={{width:this.state.usertbl.totalW,overflowX:"hidden",overflowY:"hidden"}}>
        <tr >
          <th　style={{width:this.state.usertbl.cw.c1}}>tableName</th>
          <th style={{width:this.state.usertbl.cw.c2}}>key1</th>
          <th　style={{width:this.state.usertbl.cw.c3}}>key2</th>
          <th style={{width:this.state.usertbl.cw.c4}}>s1Data</th>
          <th style={{width:this.state.usertbl.cw.c5}}>s2Data</th>
          <th style={{width:this.state.usertbl.cw.c6}}>s3Data</th>
          <th style={{width:this.state.usertbl.cw.c7}}>n1Data</th>
          <th style={{width:this.state.usertbl.cw.c8}}>n2Data</th>
          <th style={{width:this.state.usertbl.cw.c9}}>n3Data</th>
          <th　style={{width:this.state.usertbl.cw.c10}}>id</th>
          <th style={{width:this.state.usertbl.cw.c11}}>versionNo</th>
        </tr>
      </thead>
      </b.Table>
       </div>
      <div ref="usertbl_tableBody" 
        style={{width:$w.width-4,height:$w.tableHeight-22,overflowX:"scroll",overflowY:"scroll"}}>
      <div style={{width:this.state.usertbl.totalW,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable" 
       onClick={$w.handleClick}>   
      <$w.UsertblRows rcds={this.state.usertbl.rcds} cw={this.state.usertbl.cw}
          selRow={this.state.usertbl.selRow}/>
      </b.Table>
      </div>
      </div>
      </div>
      <b.Row style={{margin:5}}>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick}
            name="usertbl_btnNew" style={{width:60,marginLeft:10}}>新規</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
            name="usertbl_btnUpdate" style={{width:60,marginLeft:10}}>更新</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
            name="usertbl_btnDelete" style={{width:60,marginLeft:10}}>削除</b.Button>

      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>tableName
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_form.tableName} 
            name="usertbl_form#tableName" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={1} style={{textAlign: "right"}}>key1
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_form.key1} 
            name="usertbl_form#key1" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={1} style={{textAlign: "right"}}>key2
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_form.key2} 
            name="usertbl_form#key2" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>s1Data
          </b.Col>
          <b.Col xs={11}>
          <b.Input type="textarea" value={this.state.usertbl_form.s1Data} 
            name="usertbl_form#s1Data" onChange={$w.handleChange} 
            rows={10}
            style={{fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
          <b.Col xs={1} style={{textAlign: "right"}}>s2Data
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_form.s2Data} 
            name="usertbl_form#s2Data" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={1} style={{textAlign: "right"}}>s3Data
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_form.s3Data} 
            name="usertbl_form#s3Data" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>n1Data
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_form.n1Data} 
            name="usertbl_form#n1Data" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={1} style={{textAlign: "right"}}>n2Data
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_form.n2Data} 
            name="usertbl_form#n2Data" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={1} style={{textAlign: "right"}}>n3Data
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.usertbl_form.n3Data} 
            name="usertbl_form#n3Data" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>id
          </b.Col>
          <b.Col xs={1}>
          <b.Input type="text" value={this.state.usertbl_form.id} 
            name="usertbl_form#id" onChange={$w.handleChange} 
            disabled
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
         <b.Col xs={1} xsOffset={2} style={{textAlign: "right"}}>ver. No
          </b.Col>
          <b.Col xs={1}>
          <b.Input type="text" value={this.state.usertbl_form.versionNo} 
            name="usertbl_form#versionNo" onChange={$w.handleChange} 
            disabled
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <$c.Alert isShow={this.state.common.alert.isShow} 
          message={this.state.common.alert.message} onClick={$w.handleClick} />
      <$c.DeleteConfirm isShow={this.state.common.deleteCfm.isShow}
          onClick={$w.handleClick}/>
      </div>
    );
  },
  componentDidMount: function() {
    $w.usertbl_onscroll();
  }
});

React.render(<$w.Application flux={$w.flux}/>, document.getElementById('content'));