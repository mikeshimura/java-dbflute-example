$c.checkAndCreate("$w")
 
$w.handleChange = (e) ->
  name=e.target.name
  if name == "form#db"
    $w.flux.actions.getDatabases(e.target.value)
  if name == "form#database"
    $w.flux.actions.getTables(e.target.value)
  if name == "form#template"
    $w.flux.actions.getParameter(e.target.value)
  $c.handleChange($w.app,e.target.name,e.target.value)
$w.handleClick = (e) ->
  name=e.target.name
  if name=="alert#CloseBtn"
     $w.flux.actions.$c_alertHide()
  if name=="btnSearch"
    $w.flux.actions.search()
  if name=="btnExec"
    $w.flux.actions.exec()
  if typeof(e.target.id)=="undefined"
    return
$w.constants =
  $W_getdbs_SUCCESS: "W_getdbs_SUCCESS"
  $W_getDatabases_SUCCESS: "W_getDatabases_SUCCESS"
  $W_getTables_SUCCESS: "W_getTables_SUCCESS"
  $W_getColInfo_SUCCESS: "W_getColInfo_SUCCESS"
  $W_getParameter_SUCCESS: "W_getParameter_SUCCESS"
  $W_search_SUCCESS: "W_search_SUCCESS"
  $W_exec_SUCCESS: "W_exec_SUCCESS"
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
  getTables:(value) ->
    params = {
      operationType: "getTables"
      database:value
      db:$w.app.state.form.db
    }    
    $c.ajaxPostJson("/ajax/dbflute",params,"application/json",
      $c.ajaxCallback.bind(this,params,$w.constants.$W_getTables_SUCCESS))
  getParameter:(value) ->
    params = {
      operationType: "getParameter"
      template:value
    }    
    $c.ajaxPostJson("/ajax/template",params,"application/json",
      $c.ajaxCallback.bind(this,params,$w.constants.$W_getParameter_SUCCESS))
  search:(value) ->
    params = {
      operationType: "search"
      tempsel:$w.app.state.form.tempsel
    }    
    $c.ajaxPostJson("/ajax/template",params,"application/json",
      $c.ajaxCallback.bind(this,params,$w.constants.$W_search_SUCCESS))
  exec:() ->
    params = {
      operationType: "exec"
      db:$w.app.state.form.db
      database:$w.app.state.form.database
      table:$w.app.state.form.table
      template:$w.app.state.form.template
      items:$w.app.state.form.items
      p1:$w.app.state.form.p1
      p2:$w.app.state.form.p2
      p3:$w.app.state.form.p3
      l1:$w.app.state.form.l1
      l2:$w.app.state.form.l2
      l3:$w.app.state.form.l3
    }    
    $c.ajaxPostJson("/ajax/template",params,"application/json",
      $c.ajaxCallback.bind(this,params,$w.constants.$W_exec_SUCCESS))
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
        parameter:""
        res:""
      }
    @bindActions $w.constants.$W_getdbs_SUCCESS, @getdbsSuccess,
      $w.constants.$W_getDatabases_SUCCESS, @getDatabasesSuccess,
      $w.constants.$W_getTables_SUCCESS, @getTablesSuccess,
      $w.constants.$W_getColInfo_SUCCESS, @getColInfoSuccess,
      $w.constants.$W_getParameter_SUCCESS, @getParameterSuccess,
      $w.constants.$W_search_SUCCESS, @searchSuccess,
      $w.constants.$W_exec_SUCCESS, @execSuccess,
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
  getParameterSuccess: (res) -> 
    @data.parameter=res.response.data
    @emit "change"
    return
  searchSuccess: (res) -> 
    @data.templates=res.response.data
    @emit "change"
    return
  execSuccess: (res) -> 
    @data.res=res.response.data
    @emit "change"
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


