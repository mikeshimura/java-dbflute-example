 
  
 var b = ReactBootstrap;
$w.width=900;
$w.height=800;
$w.tableHeight=340;
$w.tableColW={c1:50,c2:90,c3:120,c4:50,c5:50,c6:50}
$w.testtableRows = React.createClass({

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
 <td id={"testtable_row#testId#"+i}
            style={{width:this.props.cw.c1,backgroundColor:bgcolor,textAlign:"left"}}>{rcd.testId}</td>
 <td id={"testtable_row#testDate#"+i}
            style={{width:this.props.cw.c2,backgroundColor:bgcolor,textAlign:"left"}}>{rcd.testDate}</td>
 <td id={"testtable_row#testTimestamp#"+i}
            style={{width:this.props.cw.c3,backgroundColor:bgcolor,textAlign:"left"}}>{rcd.testTimestamp}</td>
 <td id={"testtable_row#testNbr#"+i}
            style={{width:this.props.cw.c4,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.testNbr}</td>
 <td id={"testtable_row#id#"+i}
            style={{width:this.props.cw.c5,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.id}</td>
 <td id={"testtable_row#versionNo#"+i}
            style={{width:this.props.cw.c6,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.versionNo}</td>

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
  testtable_blank={
          testId:"",
          testDate:"",
          testTimestamp:"",
          testNbr:"",
          id:"",
          versionNo:"",

  };
      return {
                user:$c.login.name,
                testtable_search:{
                  maxRecord:"300",

                  testId:"starts with",
                  testId_s:"",
                  testId_e:"",
                  testDate:"=",
                  testDate_s:"",
                  testDate_e:"",
                  testTimestamp:"=",
                  testTimestamp_s:"",
                  testTimestamp_e:"",
                  testNbr:"=",
                  testNbr_s:"",
                  testNbr_e:"",
                },
                testtable:{
                  url:"/ajax/testtable",
                  cw:$w.tableColW,
                  totalW:$c.totalW($w.tableColW)+2,
                  rcds:[],
                  blank:_.cloneDeep(testtable_blank),
                  selRow:-1
                },
                testtable_form:_.cloneDeep(testtable_blank)
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
        <b.Col xs={5} style={{textAlign: "center"}}>TEST TABLE 管理
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
        name="btntesttable_Search" style={{width:60,marginLeft:10}}>検索</b.Button>
      </b.Row>

      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>testId
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} style={{height:24,  fontSize:12}}
               name={"testtable_search#testId"}
              defaultValue={this.state.testtable_search.testId} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_search.testId_s}
            name="testtable_search#testId_s" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_search.testId_e}
            name="testtable_search#testId_e" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>

          <b.Col xs={1} style={{textAlign: "right"}}>MaxRecord
          </b.Col>
          <b.Col xs={1} >
            <b.Input type="text" value={this.state.testtable_search.maxRecord}
            name="testtable_search#maxRecord" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>

      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>testDate
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.numberOption} style={{height:24,  fontSize:12}}
               name={"testtable_search#testDate"}
              defaultValue={this.state.testtable_search.testDate} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_search.testDate_s}
            name="testtable_search#testDate_s" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_search.testDate_e}
            name="testtable_search#testDate_e" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>

      </b.Row>

      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>testTimestamp
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.numberOption} style={{height:24,  fontSize:12}}
               name={"testtable_search#testTimestamp"}
              defaultValue={this.state.testtable_search.testTimestamp} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_search.testTimestamp_s}
            name="testtable_search#testTimestamp_s" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_search.testTimestamp_e}
            name="testtable_search#testTimestamp_e" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>

      </b.Row>

      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>testNbr
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.numberOption} style={{height:24,  fontSize:12}}
               name={"testtable_search#testNbr"}
              defaultValue={this.state.testtable_search.testNbr} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_search.testNbr_s}
            name="testtable_search#testNbr_s" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_search.testNbr_e}
            name="testtable_search#testNbr_e" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>

      </b.Row>

      <div style={{width:$w.width-2,border:1,borderStyle:"solid",
          borderColor:"black",height:$w.tableHeight,backgroundColor: "#FFFFFF"}}>
      <div ref="testtable_tableHead"
          style={{width:$w.width-20,height:20,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable" >
       <thead style={{width:this.state.testtable.totalW,overflowX:"hidden",overflowY:"hidden"}}>
        <tr >
          <th style={{width:this.state.testtable.cw.c1}}>testId</th>
          <th style={{width:this.state.testtable.cw.c2}}>testDate</th>
          <th style={{width:this.state.testtable.cw.c3}}>testTimestamp</th>
          <th style={{width:this.state.testtable.cw.c4}}>testNbr</th>
          <th style={{width:this.state.testtable.cw.c5}}>id</th>
          <th style={{width:this.state.testtable.cw.c6}}>versionNo</th>

        </tr>
      </thead>
      </b.Table>
       </div>
      <div ref="testtable_tableBody"
        style={{width:$w.width-4,height:$w.tableHeight-22,overflowX:"scroll",overflowY:"scroll"}}>
      <div style={{width:this.state.testtable.totalW,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable"
       onClick={$w.handleClick}>
      <$w.testtableRows rcds={this.state.testtable.rcds} cw={this.state.testtable.cw}
          selRow={this.state.testtable.selRow}/>
      </b.Table>
      </div>
      </div>
      </div>
      <b.Row style={{margin:5}}>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick}
            name="btntesttable_New" style={{width:60,marginLeft:10}}>新規</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick}
            name="btntesttable_Update" style={{width:60,marginLeft:10}}>更新</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick}
            name="btntesttable_Delete" style={{width:60,marginLeft:10}}>削除</b.Button>

      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>testId
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_form.testId}
            name="testtable_form#testId" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>testDate
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_form.testDate}
            name="testtable_form#testDate" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>testTimestamp
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_form.testTimestamp}
            name="testtable_form#testTimestamp" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>testNbr
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_form.testNbr}
            name="testtable_form#testNbr" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>id
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_form.id}
            name="testtable_form#id" onChange={$w.handleChange}
            disabled
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>versionNo
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.testtable_form.versionNo}
            name="testtable_form#versionNo" onChange={$w.handleChange}
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
    $w.testtable_onscroll();
  }
});

React.render(<$w.Application flux={$w.flux}/>, document.getElementById('content'));
