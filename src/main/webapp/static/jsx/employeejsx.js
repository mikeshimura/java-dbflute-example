 
  
 var b = ReactBootstrap;
$w.width=900;
$w.height=800;
$w.tableHeight=340;
$w.tableColW={c1:50,c2:120,c3:120,c4:50,c5:50}
$w.DetailRows = React.createClass({

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
 <td id={"row#empCd#"+i} 
            style={{width:this.props.cw.c1,backgroundColor:bgcolor,textAlign:"left"}}>{rcd.empCd}</td> 
 <td id={"row##"+i} 
            style={{width:this.props.cw.c2,backgroundColor:bgcolor,textAlign:""}}>{rcd.sec}</td> 
 <td id={"row#name#"+i} 
            style={{width:this.props.cw.c3,backgroundColor:bgcolor,textAlign:"left"}}>{rcd.name}</td> 
 <td id={"row#id#"+i} 
            style={{width:this.props.cw.c4,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.id}</td> 
 <td id={"row#versionNo#"+i} 
            style={{width:this.props.cw.c5,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.versionNo}</td> 

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
  blank={
          empCd:"",
          secId:0,
          sec:"",
          name:"",
          id:"",
          versionNo:"",
 
  };
      return {
                user:$c.login.name,
                search:{
                  s1Data:"starts with",
                  s1Data_s:"",
                  s1Data_e:"",
                  empCd:"starts with",
                  empCd_s:"",
                  empCd_e:"",
                  
                },
                employee:{
                  url:"/ajax/employee",
                  cw:$w.tableColW,
                  totalW:$c.totalW($w.tableColW)+2,
                  rcds:[],
                  blank:_.cloneDeep(blank), 
                  selRow:-1
                },
                form:_.cloneDeep(blank)
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
        <b.Col xs={5} style={{textAlign: "center"}}>従業員マスター
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
        name="btnSearch" style={{width:60,marginLeft:10}}>検索</b.Button>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>sec
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} style={{height:24,  fontSize:12}}
               name={"search#s1Data"}
              defaultValue={this.state.search.s1Data} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.s1Data_s} 
            name="search#s1Data_s" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.s1Data_e} 
            name="search#s1Data_e" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={1} style={{textAlign: "right"}}>MaxRecord
          </b.Col>
          <b.Col xs={1} >
            <b.Input type="text" value={this.state.search.maxRecord} 
            name="search#names" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>empCd
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} style={{height:24,  fontSize:12}}
               name={"search#empCd"}
              defaultValue={this.state.search.empCd} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.empCd_s} 
            name="search#empCd_s" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.empCd_e} 
            name="search#empCd_e" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={1} style={{textAlign: "right"}}>MaxRecord
          </b.Col>
          <b.Col xs={1} >
            <b.Input type="text" value={this.state.search.maxRecord} 
            name="search#names" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <div style={{width:$w.width-2,border:1,borderStyle:"solid",
          borderColor:"black",height:$w.tableHeight,backgroundColor: "#FFFFFF"}}>
      <div ref="tableHead"  
          style={{width:$w.width-20,height:20,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable" >
       <thead style={{width:this.state.employee.totalW,overflowX:"hidden",overflowY:"hidden"}}>
        <tr >
          <th style={{width:this.state.employee.cw.c1}}>empCd</th>
          <th style={{width:this.state.employee.cw.c2}}>sec</th>
          <th style={{width:this.state.employee.cw.c3}}>name</th>
          <th style={{width:this.state.employee.cw.c4}}>id</th>
          <th style={{width:this.state.employee.cw.c5}}>versionNo</th>

        </tr>
      </thead>
      </b.Table>
       </div>
      <div ref="tableBody" 
        style={{width:$w.width-4,height:$w.tableHeight-22,overflowX:"scroll",overflowY:"scroll"}}>
      <div style={{width:this.state.employee.totalW,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable" 
       onClick={$w.handleClick}>   
      <$w.DetailRows rcds={this.state.employee.rcds} cw={this.state.employee.cw}
          selRow={this.state.employee.selRow}/>
      </b.Table>
      </div>
      </div>
      </div>
      <b.Row style={{margin:5}}>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick}
            name="btnNew" style={{width:60,marginLeft:10}}>新規</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
            name="btnUpdate" style={{width:60,marginLeft:10}}>更新</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
            name="btnDelete" style={{width:60,marginLeft:10}}>削除</b.Button>

      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>empCd
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.form.empCd} 
            name="form#empCd" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>secId
          </b.Col>
          <b.Col xs={3}>
          <$c.SelectOption options={this.state.page.secData} style={{height:24,  fontSize:12}}
               name={"form#secId"}
              defaultValue={this.state.form.secId} onChange= {$w.handleChange} />
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>name
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.form.name} 
            name="form#name" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>id
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.form.id} 
            name="form#id" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>versionNo
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.form.versionNo} 
            name="form#versionNo" onChange={$w.handleChange} 
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
    $w.onscroll();
    $w.flux.actions.getSecData()
  }
});

React.render(<$w.Application flux={$w.flux}/>, document.getElementById('content'));