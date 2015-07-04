 
  
 var b = ReactBootstrap;
$w.width=900;
$w.height=800;
$w.tableHeight=340;
$w.tableColW={c1:50,c2:100,c3:80,c4:50,c5:50}
$w.loginRows = React.createClass({

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
 <td id={"login_row#loginId#"+i}
            style={{width:this.props.cw.c1,backgroundColor:bgcolor,textAlign:"left"}}>{rcd.loginId}</td>
 <td id={"login_row#name#"+i}
            style={{width:this.props.cw.c2,backgroundColor:bgcolor,textAlign:"left"}}>{rcd.name}</td>
 <td id={"login_row#password#"+i}
            style={{width:this.props.cw.c3,backgroundColor:bgcolor,textAlign:"left"}}>{rcd.password}</td>
 <td id={"login_row#id#"+i}
            style={{width:this.props.cw.c4,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.id}</td>
 <td id={"login_row#versionNo#"+i}
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
  login_blank={
          loginId:"",
          name:"",
          password:"",
          id:"",
          versionNo:"",

  };
      return {
                user:$c.login.name,
                login_search:{
                  maxRecord:"300",

                  loginId:"starts with",
                  loginId_s:"",
                  loginId_e:"",
                  name:"starts with",
                  name_s:"",
                  name_e:"",
                },
                login:{
                  url:"/ajax/login",
                  cw:$w.tableColW,
                  totalW:$c.totalW($w.tableColW)+2,
                  rcds:[],
                  blank:_.cloneDeep(login_blank),
                  selRow:-1
                },
                login_form:_.cloneDeep(login_blank)
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
        <b.Col xs={5} style={{textAlign: "center"}}>Login 画面
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
        name="btnlogin_Search" style={{width:60,marginLeft:10}}>検索</b.Button>
      </b.Row>

      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>loginId
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} style={{height:24,  fontSize:12}}
               name={"login_search#loginId"}
              defaultValue={this.state.login_search.loginId} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.login_search.loginId_s}
            name="login_search#loginId_s" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.login_search.loginId_e}
            name="login_search#loginId_e" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>

          <b.Col xs={1} style={{textAlign: "right"}}>MaxRecord
          </b.Col>
          <b.Col xs={1} >
            <b.Input type="text" value={this.state.login_search.maxRecord}
            name="login_search#maxRecord" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>

      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>name
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} style={{height:24,  fontSize:12}}
               name={"login_search#name"}
              defaultValue={this.state.login_search.name} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.login_search.name_s}
            name="login_search#name_s" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.login_search.name_e}
            name="login_search#name_e" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>

      </b.Row>

      <div style={{width:$w.width-2,border:1,borderStyle:"solid",
          borderColor:"black",height:$w.tableHeight,backgroundColor: "#FFFFFF"}}>
      <div ref="login_tableHead"
          style={{width:$w.width-20,height:20,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable" >
       <thead style={{width:this.state.login.totalW,overflowX:"hidden",overflowY:"hidden"}}>
        <tr >
          <th style={{width:this.state.login.cw.c1}}>loginId</th>
          <th style={{width:this.state.login.cw.c2}}>name</th>
          <th style={{width:this.state.login.cw.c3}}>password</th>
          <th style={{width:this.state.login.cw.c4}}>id</th>
          <th style={{width:this.state.login.cw.c5}}>versionNo</th>

        </tr>
      </thead>
      </b.Table>
       </div>
      <div ref="login_tableBody"
        style={{width:$w.width-4,height:$w.tableHeight-22,overflowX:"scroll",overflowY:"scroll"}}>
      <div style={{width:this.state.login.totalW,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable"
       onClick={$w.handleClick}>
      <$w.loginRows rcds={this.state.login.rcds} cw={this.state.login.cw}
          selRow={this.state.login.selRow}/>
      </b.Table>
      </div>
      </div>
      </div>
      <b.Row style={{margin:5}}>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick}
            name="btnlogin_New" style={{width:60,marginLeft:10}}>新規</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick}
            name="btnlogin_Update" style={{width:60,marginLeft:10}}>更新</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick}
            name="btnlogin_Delete" style={{width:60,marginLeft:10}}>削除</b.Button>

      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>loginId
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.login_form.loginId}
            name="login_form#loginId" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>name
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.login_form.name}
            name="login_form#name" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>password
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.login_form.password}
            name="login_form#password" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>id
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.login_form.id}
            name="login_form#id" onChange={$w.handleChange}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>versionNo
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.login_form.versionNo}
            name="login_form#versionNo" onChange={$w.handleChange}
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
    $w.login_onscroll();
  }
});

React.render(<$w.Application flux={$w.flux}/>, document.getElementById('content'));
