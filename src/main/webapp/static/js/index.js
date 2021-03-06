// Generated by CoffeeScript 1.9.3
(function() {
  var rules;

  $c.checkAndCreate("$w");

  $w.windowArray = [];

  $w.maxWindow = -1;

  $w.windowOpen = function(jspath) {
    var w;
    w = window.open($c_contextpath + jspath, '_blank', "");
    window.focus();
    $w.maxWindow = $w.maxWindow + 1;
    return $w.windowArray[$w.maxWindow] = w;
  };

  $w.windowClose = function() {
    var i, j, ref;
    for (i = j = 0, ref = $w.maxWindow; 0 <= ref ? j <= ref : j >= ref; i = 0 <= ref ? ++j : --j) {
      if (typeof $w.windowArray[i] !== "undefined") {
        if (typeof $w.windowArray[i].window === "object" && $w.windowArray[i].window !== null) {
          $w.windowArray[i].window.close();
        }
      }
    }
    return $w.maxWindow = -1;
  };

  $w.handleChange = function(e) {
    return $c.handleChange($w.app, e.target.name, e.target.value);
  };

  $w.handleClick = function(e) {
    var jsx, name;
    jsx = $w.app;
    name = e.target.name;
    if (name === "loginForm#CancelBtn") {
      jsx.setState({
        loginForm_isShow: false,
        loginForm: {
          loginId: "",
          password: ""
        }
      });
      return;
    }
    if (name === "loginForm#LoginBtn") {
      $w.flux.actions.loginClick(jsx.state.loginForm);
      return;
    }
    if (name === "alert#CloseBtn") {
      $w.flux.actions.$c_alertHide();
      return;
    }
    if (name === "btnLogin") {
      if (jsx.state.page.logbtn === "LOGIN") {
        jsx.setState({
          loginForm_isShow: true
        });
        return;
      }
      $w.windowClose();
      $w.flux.actions.logoffClick();
      return;
    }
    if (jsx.state.page.name === "") {
      $w.flux.actions.$c_alertShow("LOINしていません");
      return;
    }
    if (name === "btnCustomer") {
      $w.windowOpen("/customer");
    }
    if (name === "btnCustomert") {
      $w.windowOpen("/customert");
    }
    if (name === "btnCustomerin") {
      $w.windowOpen("/customerin");
    }
    if (name === "btnUsertbl") {
      return $w.windowOpen("/usertbl");
    }
  };

  $w.handleLoginKeyPress = function(jsx, e) {
    var key;
    key = e.key;
    if (e.key === "Enter") {
      return $w.flux.actions.loginClick(jsx.state.loginForm);
    }
  };

  $w.constants = {
    $W_LOGIN_SUCCESS: "$W_LOGIN_SUCCESS",
    $W_LOGOFF_SUCCESS: "$W_LOGOFF_SUCCESS"
  };

  rules = [];

  rules.push("required,loginId,loginIdは必須項目です");

  rules.push("required,password,psswordは必須項目です");

  $w.actions = {
    loginClick: function(loginForm) {
      var res;
      res = $v.validate(loginForm, rules);
      if (res.length > 0) {
        this.dispatch($c.constants.$C_ALERT_SHOW, res);
        return;
      }
      this.dispatch($c.constants.$C_LOADING);
      return $c.ajaxPostJson("/ajax/loginauth", loginForm, "application/json", $c.ajaxCallback.bind(this, loginForm, $w.constants.$W_LOGIN_SUCCESS));
    },
    logoffClick: function() {
      this.dispatch($c.constants.$C_LOADING);
      return $c.ajaxPostJson("/ajax/logout", "", "application/json", $c.ajaxCallback.bind(this, "", $w.constants.$W_LOGOFF_SUCCESS));
    }
  };

  $w.PageStore = Fluxxor.createStore({
    initialize: function() {
      this.data = {
        logbtn: "LOGIN",
        uid: "",
        name: ""
      };
      this.bindActions($w.constants.$W_LOGIN_SUCCESS, this.onLoginSuccess, $w.constants.$W_LOGOFF_SUCCESS, this.onLogoffSuccess);
    },
    onLoginSuccess: function(res) {
      this.data.logbtn = "LOGOFF";
      this.data.uid = res.response.data.uid;
      this.data.name = res.response.data.name;
      this.emit("change");
      this.emit("loginComplete");
    },
    onLogoffSuccess: function(res) {
      this.data.logbtn = "LOGIN";
      this.data.uid = "";
      this.data.name = "";
      this.emit("change");
    }
  });

  $w.flux = new Fluxxor.Flux();

  $w.pageStore = new $w.PageStore;

  $w.flux.addStore("PAGE", $w.pageStore);

  $w.flux.addActions($w.actions);

  $w.commonStore = new $c.CommonStore;

  $w.flux.addStore("COMMON", $w.commonStore);

  $w.flux.addActions($c.actions);

  $w.FluxMixin = Fluxxor.FluxMixin(React);

  $w.StoreWatchMixin = Fluxxor.StoreWatchMixin;

  $w.pageStore.on("loginComplete", function() {
    return $w.app.setState({
      loginForm_isShow: false,
      loginForm: {
        loginId: "",
        password: ""
      }
    });
  });

}).call(this);
