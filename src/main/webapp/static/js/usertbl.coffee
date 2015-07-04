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
  if name == "usertbl_btnNew"
    $w.usertbl_formClear()
  if name == "usertbl_btnSearch"
    $w.usertbl_formSearch()
  if name == "usertbl_btnUpdate"
    $w.usertbl_formUpdate()
  if name == "usertbl_btnDelete"
    $w.usertbl_formDelete()
  if typeof(e.target.id)=="undefined"
    return
  ids = e.target.id.split("#");
  if (ids[0] == "usertbl_row")
    temp={ usertbl:$w.app.state.usertbl }
    selRow = Number(ids[2])
    temp.usertbl.selRow=selRow
    temp.usertbl_form=_.cloneDeep(temp.usertbl.rcds[selRow])
    $w.app.setState(temp)
$w.usertbl_formSearch = () ->
  criteria=$c.createCriteria($w.app.state.usertbl_search,["tableName","key1"])
  $w.flux.actions.$c_rcd_fetch($w.app.state.usertbl,$w.app.state.usertbl_form,"usertbl",criteria)
$w.usertbl_formUpdate = () ->
  form = $w.app.state.usertbl_form
  res = ""
  if form.id==""
    rules = []

  if res.length > 0
    $w.flux.actions.$c_alertShow(res)
    return
  $w.flux.actions.$c_rcd_update($w.app.state.usertbl,$w.app.state.usertbl_form,"usertbl")
$w.usertbl_formDelete = () ->
  if $w.app.state.usertbl_form.id == ""
    $w.flux.actions.$c_rcd_delete_id_blank()
    return
  $w.flux.actions.$c_deleteCfmShow($w.formDeleteCfm)
$w.formDeleteCfm = () ->
  $w.flux.actions.$c_rcd_delete($w.app.state.usertbl,$w.app.state.usertbl_form,"usertbl")
 
$w.usertbl_formClear = () ->
  formtemp={
    usertbl_form:_.cloneDeep($w.app.state.usertbl.blank)
    usertbl:$w.app.state.usertbl
  }
  formtemp.usertbl.selRow=-1
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
rcdStore.addTable("usertbl")
$w.FluxMixin = Fluxxor.FluxMixin(React)
$w.StoreWatchMixin = Fluxxor.StoreWatchMixin
#$w.fix = ->
#  $('#tableusertbl').tablefix({width:900,height:300,fixRows:1})
$w.rcdStore.on("rcdComplete_usertbl", ->
  rcdTemp=_.cloneDeep($w.app.state.rcd.usertbl)
  temp={
    usertbl:$w.app.state.usertbl
  }
  temp.usertbl.rcds=rcdTemp.rcds
  temp.usertbl_form=rcdTemp.rcd
  temp.usertbl.selRow=rcdTemp.selRow
  $w.app.setState(temp) 
)
$w.getDom = (refname) ->
  return $w.app.refs[refname].getDOMNode()
  
$w.usertbl_scroll = ->
  $w.getDom("usertbl_tableHead").scrollLeft=$w.getDom("usertbl_tableBody").scrollLeft
$w.usertbl_onscroll = ->
  $w.getDom("usertbl_tableBody").onscroll=$w.usertbl_scroll