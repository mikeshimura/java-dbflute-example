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
  $w.application = this
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
                onChange={this.handleChange} />
     */
    return (
      <div className="container-fixed" style={{fontSize:12,border:1,borderStyle:"solid",width:800,height:600}}>

      <b.Row className="darkBgLarge" style={{margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}>
        <b.Col xs={5} style={{textAlign: "center"}}>Test System
        </b.Col>
        <b.Col xs={5} className="darkBgMid" style={{textAlign: "center"}}>{this.state.page.name}
        </b.Col>
        <b.Col xs={1} className="darkBgMid" >
        <b.Button bsSize="small" bsStyle="primary" onClick={this.handleClick} name="btnLogin" style={{marginTop:5}}>
        {this.state.page.logbtn}</b.Button>
        </b.Col>
         <b.Col xs={1} >
        <$c.Loader src="../static/img/ajax-loader.gif" isLoading={this.state.common.loading}/>
        </b.Col>
      </b.Row>
      <b.Row　style={{height:20}}>

      </b.Row>
      <b.Row>
        <b.Col xs={1} xsOffset={1} >
        <b.Button bsSize="small" bsStyle="primary" onClick={this.handleClick} name="btnLoginWin">
        USER管理</b.Button>
        </b.Col>      
      </b.Row>
      <$w.LoginModal isShow={this.state.loginForm_isShow} loginId={this.state.loginForm.loginId}
       password={this.state.loginForm.password} 
        onClick={this.handleClick} onChange={this.handleChange} onKeyPress={this.handleLoginKeyPress}/>
      <$c.Alert isShow={this.state.common.alert.isShow} message={this.state.common.alert.message} onClick={this.handleClick}
        />
      </div>
    );
  },
  componentDidMount: function() {

  },
  handleChange: function (e) {
    $w.handleChange(this,e);
  },
  handleClick: function (e) {
    $w.handleClick(this,e);
  },
  handleLoginKeyPress: function (e) {
    $w.handleLoginKeyPress(this,e);
  }
});

React.render(<$w.Application flux={$w.flux}/>, document.getElementById('content'));