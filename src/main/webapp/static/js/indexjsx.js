var b = ReactBootstrap;


$w.LoginModal = React.createClass({displayName: 'LoginModal',
  mixins: [b.OverlayMixin],
  render: function () {
    return (
      React.createElement("span", null)
    );
  },
  renderOverlay: function () {
    if (!this.props.isShow) {
      return React.createElement("span", null);
    }

    return (
        React.createElement(b.Modal, {title: "Login Form", 
          onRequestHide: this.props.onClick.bind(this,{target:{name:"loginForm#CancelBtn"}}), 
         className: "form-login"}, 
          React.createElement("div", {className: "modal-body"}, 
            React.createElement(b.Row, {style: {height:26}}, 
              React.createElement(b.Col, {xs: 3, xsOffset: 1, style: {textAlign: "right"}}, "Login ID"
              ), 
              React.createElement(b.Col, {xs: 3}, 
              React.createElement(b.Input, {type: "text", value: this.props.loginId, onKeyPress: this.props.onKeyPress, 
                name: "loginForm#loginId", onChange: this.props.onChange, style: {height:24,fontSize:12,width:150}})
              )
            ), 
            React.createElement(b.Row, {style: {height:26}}, 
              React.createElement(b.Col, {xs: 3, xsOffset: 1, style: {textAlign: "right"}}, "Password"
              ), 
              React.createElement(b.Col, {xs: 3}, 
              React.createElement(b.Input, {type: "password", value: this.props.password, onKeyPress: this.props.onKeyPress, 
                name: "loginForm#password", onChange: this.props.onChange, style: {height:24,fontSize:12,width:150}})
              )
            )
          ), 
          React.createElement("div", {className: "modal-footer"}, 
            React.createElement(b.Button, {onClick: this.props.onClick, name: "loginForm#LoginBtn"}, "Login"), 
            React.createElement(b.Button, {onClick: this.props.onClick, name: "loginForm#CancelBtn"}, "Cancel")
          )
        )
      );
  }
});

$w.Application = React.createClass({displayName: 'Application',
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
      React.createElement("div", {className: "container-fixed", style: {fontSize:12,border:1,borderStyle:"solid",width:800,height:600}}, 

      React.createElement(b.Row, {className: "darkBgLarge", style: {margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}, 
        React.createElement(b.Col, {xs: 5, style: {textAlign: "center"}}, "JAVA DBFlute WEB Framework"
        ), 
        React.createElement(b.Col, {xs: 5, className: "darkBgMid", style: {textAlign: "center"}}, this.state.page.name
        ), 
        React.createElement(b.Col, {xs: 1, className: "darkBgMid"}, 
        React.createElement(b.Button, {bsSize: "small", bsStyle: "primary", onClick: this.handleClick, name: "btnLogin", style: {marginTop:5}}, 
        this.state.page.logbtn)
        ), 
         React.createElement(b.Col, {xs: 1}, 
        React.createElement($c.Loader, {src: "../static/img/ajax-loader.gif", isLoading: this.state.common.loading})
        )
      ), 
      React.createElement(b.Row, {　style: {height:20}}

      ), 
      React.createElement(b.Row, {style: {height:32}}, 
        React.createElement(b.Col, {xs: 1, xsOffset: 1}, 
        React.createElement(b.Button, {bsSize: "small", bsStyle: "primary", onClick: this.handleClick, name: "btnCustomer", 
        style: {width:160,height:26}}, 
        "Customer管理 標準")
        )
      ), 
      React.createElement(b.Row, {style: {height:32}}, 
        React.createElement(b.Col, {xs: 1, xsOffset: 1}, 
        React.createElement(b.Button, {bsSize: "small", bsStyle: "primary", onClick: this.handleClick, name: "btnCustomert", 
        style: {width:160,height:26}}, 
        "Customer管理 タブ")
        )
      ), 
      React.createElement(b.Row, {style: {height:32}}, 
        React.createElement(b.Col, {xs: 1, xsOffset: 1}, 
        React.createElement(b.Button, {bsSize: "small", bsStyle: "primary", onClick: this.handleClick, name: "btnCustomerin", 
        style: {width:160,height:26}}, 
        "Customer管理 インライン")
        )
      ), 
      React.createElement(b.Row, {style: {height:32}}, 
        React.createElement(b.Col, {xs: 1, xsOffset: 1}, 
        React.createElement(b.Button, {bsSize: "small", bsStyle: "primary", onClick: this.handleClick, name: "btnUsertbl", 
        style: {width:160,height:26}}, 
        "User Table管理")
        )
      ), 
      React.createElement($w.LoginModal, {isShow: this.state.loginForm_isShow, loginId: this.state.loginForm.loginId, 
       password: this.state.loginForm.password, 
        onClick: this.handleClick, onChange: this.handleChange, onKeyPress: this.handleLoginKeyPress}), 
      React.createElement($c.Alert, {isShow: this.state.common.alert.isShow, message: this.state.common.alert.message, onClick: this.handleClick}
        )
      )
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

React.render(React.createElement($w.Application, {flux: $w.flux}), document.getElementById('content'));