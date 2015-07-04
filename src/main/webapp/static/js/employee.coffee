
$c.checkAndCreate("$w")
 
$w.handleChange = (e) ->
  name=e.target.name
  if name=="form#secId"
    $w.setSec(e)
    return
  $c.handleChange($w.app,e.target.name,e.target.value);

$w.handleClick = (e) ->
  name=e.target.name
  if name=="alert#CloseBtn"
     $w.flux.actions.$c_alertHide()
  if name=="deleteCfm#CloseBtn"
     $w.flux.actions.$c_deleteCfmHide()
  if name=="deleteCfm#YesBtn"
     $w.flux.actions.$c_deleteCfmHide()
     $w.formDeleteCfm()
  if name == "btnNew"
    $w.formClear()
  if name == "btnSearch"
    $w.formSearch()
  if name == "btnUpdate"
    $w.formUpdate()
  if name == "btnDelete"
    $w.formDelete()
  if typeof(e.target.id)=="undefined"
    return
  ids = e.target.id.split("#");
  if (ids[0] == "row")
    temp={ employee:$w.app.state.employee }
    selRow = Number(ids[2])
    temp.employee.selRow=selRow
    temp.form=_.cloneDeep(temp.employee.rcds[selRow])
    $w.app.setState(temp)
$w.setSec = (e) ->
  x=parseInt(e.target.value)
  for s in $w.app.state.page.secData
    if s.value == x
      formtemp={
        form:$w.app.state.form
      }
      formtemp.form.secId=parseInt(s.value)
      formtemp.form.sec=s.label
      $w.app.setState(formtemp) 
      return     
$w.formSearch = () ->
  criteria=$c.createCriteria($w.app.state.search,["s1Data","empCd"])
  $w.flux.actions.$c_rcd_fetch($w.app.state.employee,$w.app.state.form,"employee",criteria)
$w.formUpdate = () ->
  form = $w.app.state.form
  $w.flux.actions.$c_rcd_update($w.app.state.employee,$w.app.state.form,"employee")
$w.formDelete = () ->
  if $w.app.state.form.id == ""
    $w.flux.actions.$c_rcd_delete_id_blank()
    return
  $w.flux.actions.$c_deleteCfmShow($w.formDeleteCfm)
$w.formDeleteCfm = () ->
  $w.flux.actions.$c_rcd_delete($w.app.state.employee,$w.app.state.form,"employee")
$w.formClear = () ->
  formtemp={
    form:_.cloneDeep($w.app.state.employee.blank)
    employee:$w.app.state.employee
  }
  formtemp.employee.selRow=-1
  $w.app.setState(formtemp)
$w.constants =
  $W_getSecData_SUCCESS: "W_getSecData_SUCCESS"


$w.actions = {
  getSecData:() ->
    params = {
      operationType: "getSecData"
    }
    $c.ajaxPostJson("/ajax/employee",params,"application/json",
      $c.ajaxCallback.bind(this,params,$w.constants.$W_getSecData_SUCCESS))
} 

$w.PageStore = Fluxxor.createStore(
  initialize: ->
    @data = 
      {
        secData:[]       
      }
    @bindActions $w.constants.$W_getSecData_SUCCESS, @getSecDataSuccess
    return
  getSecDataSuccess: (res) -> 
    @data.secData=res.response.data
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
rcdStore = $w.flux.store("RCD")
rcdStore.addTable("employee")
$w.FluxMixin = Fluxxor.FluxMixin(React)
$w.StoreWatchMixin = Fluxxor.StoreWatchMixin
$w.rcdStore.on("rcdComplete_employee", ->
  rcdTemp=_.cloneDeep($w.app.state.rcd.employee)
  temp={
    employee:$w.app.state.employee
  }
  temp.employee.rcds=rcdTemp.rcds
  temp.form=rcdTemp.rcd
  temp.employee.selRow=rcdTemp.selRow
  $w.app.setState(temp) 
)
$w.getDom = (refname) ->
  return $w.app.refs[refname].getDOMNode()
  
$w.scroll = ->
  $w.getDom("tableHead").scrollLeft=$w.getDom("tableBody").scrollLeft
$w.onscroll = ->
  $w.getDom("tableBody").onscroll=$w.scroll