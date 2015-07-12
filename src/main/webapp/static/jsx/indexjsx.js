var b = ReactBootstrap;


$w.LoginModal = React.createClass({
  mixins: [b.OverlayMixin],
  render: function () {
    return (
      <span/>
    );
  },
  renderOverlay: function () {
    if (!this.props.isShow) {
      return <span/>;
    }

    return (
        <b.Modal title="Login Form"  
          onRequestHide={this.props.onClick.bind(this,{target:{name:"loginForm#CancelBtn"}})} 
         className="form-login">
          <div className="modal-body">
            <b.Row style={{height:26}}>
              <b.Col xs={3} xsOffset={1}style={{textAlign: "right"}}>Login ID
              </b.Col>
              <b.Col xs={3}>
              <b.Input type="text" value={this.props.loginId} onKeyPress={this.props.onKeyPress}
                name="loginForm#loginId" onChange={this.props.onChange} style={{height:24,fontSize:12,width:150}}/>
              </b.Col>
            </b.Row> 
            <b.Row style={{height:26}}>
              <b.Col xs={3} xsOffset={1}style={{textAlign: "right"}}>Password
              </b.Col>
              <b.Col xs={3}>
              <b.Input type="password" value={this.props.password} onKeyPress={this.props.onKeyPress}
                name="loginForm#password" onChange={this.props.onChange} style={{height:24,fontSize:12,width:150}}/>
              </b.Col>
            </b.Row> 
          </div>
          <div className="modal-footer">
            <b.Button onClick={this.props.onClick} name="loginForm#LoginBtn">Login</b.Button>
            <b.Button onClick={this.props.onClick} name="loginForm#CancelBtn">Cancel</b.Button>
          </div>
        </b.Modal>
      );
  }
});

$w.Application = React.createClass({
  mixins: [$w.FluxMixin, $w.StoreWatchMixin("PAGE","COMMON")],
  getInitialState: function() {
  $w.app = this
      return {
                loginForm:
                  {
                    loginId:"",
                    password:""
                  } , 
                loginForm_isShow:false,
              };
  },
  getStateFromFlux: function() {
    //this.props.flux=$w.flux;
    var pageStore = $w.flux.store("PAGE");
    var commonStore = $w.flux.store("COMMON");
    return {
      page: _.cloneDeep(pageStore.data),
      common:_.cloneDeep(commonStore.data)
      };
  },
  render: function() {
    var optionv =  [
            {
              value: "optionOne",
              label: "Option One" 
            },
            {
              value: "optionsTwo",
              label: "Option Two",
              selected: true,
            }
          ];
    /*
      <$c.SelectOption options={optionv} style={{width:150,height:24, fontSize:12}} name={"testname"}
                onChange={$w.handleChange} />
     */
    return (
      <div className="container-fixed" style={{fontSize:12,border:1,borderStyle:"solid",width:800,height:600}}>

      <b.Row className="darkBgLarge" style={{margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}>
        <b.Col xs={5} style={{textAlign: "center"}}>JAVA DBFlute WEB Framework
        </b.Col>
        <b.Col xs={5} className="darkBgMid" style={{textAlign: "center"}}>{this.state.page.name}
        </b.Col>
        <b.Col xs={1} className="darkBgMid" >
        <b.Button bsSize="small" bsStyle="primary" onClick={$w.handleClick} name="btnLogin" style={{marginTop:5}}>
        {this.state.page.logbtn}</b.Button>
        </b.Col>
         <b.Col xs={1} >
        <$c.Loader src="../static/img/ajax-loader.gif" isLoading={this.state.common.loading}/>
        </b.Col>
      </b.Row>
      <b.Row　style={{height:20}}>

      </b.Row>
      <b.Row style={{height:32}}>
        <b.Col xs={1} xsOffset={1} >
        <b.Button bsSize="small" bsStyle="primary" onClick={$w.handleClick} name="btnCustomer"
        style={{width:160,height:26}}>
        Customer管理 標準</b.Button>
        </b.Col>      
      </b.Row>
      <b.Row style={{height:32}}>
        <b.Col xs={1} xsOffset={1} >
        <b.Button bsSize="small" bsStyle="primary" onClick={$w.handleClick} name="btnCustomert"
        style={{width:160,height:26}}>
        Customer管理 タブ</b.Button>
        </b.Col>      
      </b.Row>
      <b.Row style={{height:32}}>
        <b.Col xs={1} xsOffset={1} >
        <b.Button bsSize="small" bsStyle="primary" onClick={$w.handleClick} name="btnCustomerin"
        style={{width:160,height:26}}>
        Customer管理 インライン</b.Button>
        </b.Col>      
      </b.Row>
      <b.Row style={{height:32}}>
        <b.Col xs={1} xsOffset={1} >
        <b.Button bsSize="small" bsStyle="primary" onClick={$w.handleClick} name="btnUsertbl"
        style={{width:160,height:26}}>
        User Table管理</b.Button>
        </b.Col>      
      </b.Row>
      <$w.LoginModal isShow={this.state.loginForm_isShow} loginId={this.state.loginForm.loginId}
       password={this.state.loginForm.password} 
        onClick={$w.handleClick} onChange={$w.handleChange} onKeyPress={this.handleLoginKeyPress}/>
      <$c.Alert isShow={this.state.common.alert.isShow} message={this.state.common.alert.message} onClick={$w.handleClick}
        />
      </div>
    );
  },
  componentDidMount: function() {

  },
  handleLoginKeyPress: function (e) {
    $w.handleLoginKeyPress(this,e);
  }
});

React.render(<$w.Application flux={$w.flux}/>, document.getElementById('content'));