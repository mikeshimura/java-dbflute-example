
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
  if name == "btntesttable_New"
    $w.testtable_formClear()
  if name == "btntesttable_Search"
    $w.testtable_formSearch()
  if name == "btntesttable_Update"
    $w.testtable_formUpdate()
  if name == "btntesttable_Delete"
    $w.testtable_formDelete()
  if typeof(e.target.id)=="undefined"
    return
  ids = e.target.id.split("#");
  if (ids[0] == "testtable_row")
    temp={ testtable:$w.app.state.testtable }
    selRow = Number(ids[2])
    temp.testtable.selRow=selRow
    temp.testtable_form=_.cloneDeep(temp.testtable.rcds[selRow])
    $w.app.setState(temp)
$w.testtable_formSearch = () ->
  criteria=$c.createCriteria($w.app.state.testtable_search,["testId","testDate","testTimestamp","testNbr"])
  maxRecord=$w.app.state.testtable_search.maxRecord
  $w.flux.actions.$c_rcd_fetch($w.app.state.testtable,$w.app.state.testtable_form,"testtable",criteria,maxRecord)
$w.testtable_formUpdate = () ->
  $w.flux.actions.$c_rcd_update($w.app.state.testtable,$w.app.state.testtable_form,"testtable")
$w.testtable_formDelete = () ->
  if $w.app.state.testtable_form.id == ""
    $w.flux.actions.$c_rcd_delete_id_blank()
    return
  $w.flux.actions.$c_deleteCfmShow($w.testtable_formDeleteCfm)
$w.testtable_formDeleteCfm = () ->
  $w.flux.actions.$c_rcd_delete($w.app.state.testtable,$w.app.state.testtable_form,"testtable")
$w.testtable_formClear = () ->
  formtemp={
    testtable_form:_.cloneDeep($w.app.state.testtable.blank)
    testtable:$w.app.state.testtable
  }
  formtemp.testtable.selRow=-1
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
rcdStore.addTable("testtable")
$w.FluxMixin = Fluxxor.FluxMixin(React)
$w.StoreWatchMixin = Fluxxor.StoreWatchMixin
$w.rcdStore.on("rcdComplete_testtable", ->
  rcdTemp=_.cloneDeep($w.app.state.rcd.testtable)
  temp={
    testtable:$w.app.state.testtable
  }
  temp.testtable.rcds=rcdTemp.rcds
  temp.testtable_form=rcdTemp.rcd
  temp.testtable.selRow=rcdTemp.selRow
  $w.app.setState(temp) 
)
$w.getDom = (refname) ->
  return $w.app.refs[refname].getDOMNode()
  
$w.testtable_scroll = ->
  $w.getDom("testtable_tableHead").scrollLeft=$w.getDom("testtable_tableBody").scrollLeft
$w.testtable_onscroll = ->
  $w.getDom("testtable_tableBody").onscroll=$w.testtable_scroll