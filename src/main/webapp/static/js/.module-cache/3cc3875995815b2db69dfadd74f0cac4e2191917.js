(function() {
  $c.checkAndCreate("$w");
  $w.handleChange = function(e) {
    var jsx;
    jsx = $w.app;
    return $c.handleChange(jsx, e.target.name, e.target.value);
  };
  $w.handleClick = function(e) {
    var jsx, name;
    jsx = $w.app;
    name = e.target.name;
    if (name === "alert#CloseBtn") {
      $w.flux.actions.$c_alertHide();
    }
    if (name === "btnUpload") {
      $w.flux.actions.$c_rcd_update(jsx.state.xmlup, jsx.state.form, "xmlup");
    }
    if (typeof e.target.id === "undefined") {
      ;
    }
  };
  $w.formClear = function(jsx) {
    var formtemp;
    formtemp = {
      form: _.cloneDeep(jsx.state.xmlup.blank)
    };
    return jsx.setState(formtemp);
  };
  $w.constants = {
    $W_GETDBS_SUCCESS: "W_GETDBS_SUCCESS"
  };
  $w.actions = {
    getdbs: function() {
      var params;
      params = {
        operationType: "getdbs"
      };
      return $c.ajaxPostJson("/ajax/systbl", params, "application/json", $c.ajaxCallback.bind(this, params, $w.constants.$W_GETDBS_SUCCESS));
    }
  };
  $w.PageStore = Fluxxor.createStore({
    initialize: function() {
      this.data = {
        dbs: []
      };
      this.bindActions($w.constants.$W_GETDBS_SUCCESS, this.getdbSuccess);
    },
    getdbSuccess: function(res) {
      this.data.dbs = res.response.data;
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
  $w.rcdStore = new $c.RcdStore;
  $w.flux.addStore("RCD", $w.rcdStore);
  $w.flux.addActions($c.rcdActions);
  $w.FluxMixin = Fluxxor.FluxMixin(React);
  $w.StoreWatchMixin = Fluxxor.StoreWatchMixin;
  $w.page = $w.flux.stores.PAGE;
  $w.common = $w.flux.stores.COMMON;
  $w.rcd = $w.flux.stores.RCD;
  $w.rcd.addTable("xmlup");
  $w.rcdStore.on("rcdComplete_xmlup", function() {});
}).call(this);
