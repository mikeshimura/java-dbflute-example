
$c.checkAndCreate("$w")
 
$w.handleChange = (e) ->
  $c.handleChange($w.app,e.target.name,e.target.value);

$w.handleClick = (e) ->
  name=e.target.name
  if name=="alert#CloseBtn"
     $w.flux.actions.$c_alertHide()
  if name=="deleteCfm#CloseBtn"
     $w.flux.actions.$c_deleteCfmHide()
  if name=="deleteCfm#YesBtn"
     $w.flux.actions.$c_deleteCfmHide()
     $w.app.state.common.deleteCfm.callback()
  if name == "btnlogin_New"
    $w.login_formClear()
  if name == "btnlogin_Search"
    $w.login_formSearch()
  if name == "btnlogin_Update"
    $w.login_formUpdate()
  if name == "btnlogin_Delete"
    $w.login_formDelete()
  if typeof(e.target.id)=="undefined"
    return
  ids = e.target.id.split("#");
  if (ids[0] == "login_row")
    temp={ login:$w.app.state.login }
    selRow = Number(ids[2])
    temp.login.selRow=selRow
    temp.login_form=_.cloneDeep(temp.login.rcds[selRow])
    $w.app.setState(temp)
$w.login_formSearch = () ->
  criteria=$c.createCriteria($w.app.state.login_search,["loginId","name"])
  $w.flux.actions.$c_rcd_fetch($w.app.state.login,$w.app.state.login_form,"login",criteria)
$w.login_formUpdate = () ->
  $w.flux.actions.$c_rcd_update($w.app.state.login,$w.app.state.login_form,"login")
$w.login_formDelete = () ->
  if $w.app.state.login_form.id == ""
    $w.flux.actions.$c_rcd_delete_id_blank()
    return
  $w.flux.actions.$c_deleteCfmShow($w.login_formDeleteCfm)
$w.login_formDeleteCfm = () ->
  $w.flux.actions.$c_rcd_delete($w.app.state.login,$w.app.state.login_form,"login")
$w.login_formClear = () ->
  formtemp={
    login_form:_.cloneDeep($w.app.state.login.blank)
    login:$w.app.state.login
  }
  formtemp.login.selRow=-1
  $w.app.setState(formtemp)
$w.constants =
  $W_LOGIN_SUCCESS: "$W_LOGIN_SUCCESS"


$w.actions = {
} 

$w.PageStore = Fluxxor.createStore(
  initialize: ->
    @data = 
      {
      }
    #@bindActions $w.constants.$W_LOGIN_SUCCESS, @onLoginSuccess,

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
rcdStore = $w.flux.store("RCD")
rcdStore.addTable("login")
$w.FluxMixin = Fluxxor.FluxMixin(React)
$w.StoreWatchMixin = Fluxxor.StoreWatchMixin
$w.rcdStore.on("rcdComplete_login", ->
  rcdTemp=_.cloneDeep($w.app.state.rcd.login)
  temp={
    login:$w.app.state.login
  }
  temp.login.rcds=rcdTemp.rcds
  temp.login_form=rcdTemp.rcd
  temp.login.selRow=rcdTemp.selRow
  $w.app.setState(temp) 
)
$w.getDom = (refname) ->
  return $w.app.refs[refname].getDOMNode()
  
$w.login_scroll = ->
  $w.getDom("login_tableHead").scrollLeft=$w.getDom("login_tableBody").scrollLeft
$w.login_onscroll = ->
  $w.getDom("login_tableBody").onscroll=$w.login_scroll