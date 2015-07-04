$c.checkAndCreate("$w")
 
$w.handleChange = (e) ->
  jsx=$w.app
  name=e.target.name
  if name == "form#db"
    $w.flux.actions.getDatabases(e.target.value)
  if name == "form#database"
    $w.flux.actions.getTables(e.target.value,jsx)
  if name == "form#table"
    $w.flux.actions.getColInfo(e.target.value,jsx)
  $c.handleChange(jsx,e.target.name,e.target.value)
$w.handleClick = (e) ->
  jsx=$w.app
  name=e.target.name
  if name=="alert#CloseBtn"
     $w.flux.actions.$c_alertHide()

  if typeof(e.target.id)=="undefined"
    return
$w.formClear = (jsx) ->
  formtemp={
      form:_.cloneDeep(jsx.state.xmlup.blank)
  }
  jsx.setState(formtemp)
$w.constants =
  $W_getdbs_SUCCESS: "W_getdbs_SUCCESS"
  $W_getDatabases_SUCCESS: "W_getDatabases_SUCCESS"
  $W_getTables_SUCCESS: "W_getTables_SUCCESS"
  $W_getColInfo_SUCCESS: "W_getColInfo_SUCCESS"
$w.actions = {
  getdbs:() ->
    params = {
      operationType: "getdbs"
    }
    $c.ajaxPostJson("/ajax/systbl",params,"application/json",
      $c.ajaxCallback.bind(this,params,$w.constants.$W_getdbs_SUCCESS))
  getDatabases:(value) ->
    params = {
      operationType: "getDatabases"
      db:value
    }    
    $c.ajaxPostJson("/ajax/dbflute",params,"application/json",
      $c.ajaxCallback.bind(this,params,$w.constants.$W_getDatabases_SUCCESS))
  getTables:(value,jsx) ->
    params = {
      operationType: "getTables"
      database:value
      db:jsx.state.form.db
    }    
    $c.ajaxPostJson("/ajax/dbflute",params,"application/json",
      $c.ajaxCallback.bind(this,params,$w.constants.$W_getTables_SUCCESS))
  getColInfo:(value,jsx) ->
    params = {
      operationType: "getColInfo"
      db:jsx.state.form.db
      database:jsx.state.form.database
      table:value
    }    
    $c.ajaxPostJson("/ajax/dbflute",params,"application/json",
      $c.ajaxCallback.bind(this,params,$w.constants.$W_getColInfo_SUCCESS))
}
$w.PageStore = Fluxxor.createStore(
  initialize: ->
    @data = 
      {
        dbs:[]
        database:[]
        table:[]
        items:[]
        templates:[]
      }
    @bindActions $w.constants.$W_getdbs_SUCCESS, @getdbsSuccess,
      $w.constants.$W_getDatabases_SUCCESS, @getDatabasesSuccess,
      $w.constants.$W_getTables_SUCCESS, @getTablesSuccess,
      $w.constants.$W_getColInfo_SUCCESS, @getColInfoSuccess,
    return
  getdbsSuccess: (res) -> 
    @data.dbs=res.response.data
    @data.database=[]
    @data.table=[]
    @data.items=[]
    @emit "change"
    return
  getDatabasesSuccess: (res) -> 
    @data.database=res.response.data
    @data.table=[]
    @data.items=[]
    @emit "change"
    return
  getTablesSuccess: (res) -> 
    @data.table=res.response.data
    @data.items=[]
    @emit "change"
    return
  getColInfoSuccess: (res) -> 
    @data.items=res.response.data
    @emit "change"
    @emit "colinfo"
    return
) 
$w.flux = new Fluxxor.Flux()
$w.pageStore=new $w.PageStore;
$w.flux.addStore("PAGE",$w.pageStore)
$w.flux.addActions($w.actions)
$w.commonStore=new $c.CommonStore;
$w.flux.addStore("COMMON",$w.commonStore)
$w.flux.addActions($c.actions)
$w.rcdStore=new $c.RcdStore;
$w.flux.addStore("RCD",$w.rcdStore)
$w.flux.addActions($c.rcdActions)
$w.FluxMixin = Fluxxor.FluxMixin(React)
$w.StoreWatchMixin = Fluxxor.StoreWatchMixin
$w.page=$w.flux.stores.PAGE
$w.common=$w.flux.stores.COMMON
$w.rcd=$w.flux.stores.RCD
$w.rcd.addTable("xmlup")
$w.pageStore.on("colinfo", ->
  items=$w.app.state.page.items
  formtemp={
      form:_.cloneDeep($w.app.state.form)
  }
  formtemp.form.all=items[0]
  formtemp.form.sel=items[1]
  $w.app.setState(formtemp)
)


