
$c.checkAndCreate("$w")
$w.handleChange = (e) ->
  names = e.target.name.split("#");
  if (names[0] == "customer_row")
    temp={ customer:$w.app.state.customer }
    temp.customer.rcds[names[2]][names[1]]=e.target.value
    $w.app.setState(temp)
    return
  $c.handleChange($w.app,e.target.name,e.target.value);
$w.setFocus = (ref,def) ->
  refnode=$w._customerRows.refs[ref]
  if typeof(refnode)=="undefined"
    refnode=$w._customerRows.refs[def]
  refnode.getInputDOMNode().focus()
$w.handleClick = (e) ->
  name=e.target.name
  if name=="alert#CloseBtn"
     $w.flux.actions.$c_alertHide()
  if name=="deleteCfm#CloseBtn"
     $w.flux.actions.$c_deleteCfmHide()
  if name=="deleteCfm#YesBtn"
     $w.flux.actions.$c_deleteCfmHide()
     $w.app.state.common.deleteCfm.callback()
  if name == "btncustomer_Cancel"
    $w.customer_formCancel()
  if name == "btncustomer_Search"
    $w.customer_formSearch()
  if name == "btncustomer_Update"
    $w.customer_formUpdate()
  if name == "btncustomer_Delete"
    $w.customer_formDelete()
  if typeof(e.target.id)=="undefined"
    return
  ids = e.target.id.split("#");
  if (ids[0] == "customer_row")
    temp={ customer:$w.app.state.customer }
    selRow = Number(ids[2])
    temp.customer.selRow=selRow
    ref="customer_row#"+ids[1]+"#"+selRow
    def="customer_row#cusCd#"+selRow
    $w.app.setState(temp,$w.setFocus.bind(this,ref,def))
$w.handleRowKeyDown = (e) ->
  jsx=$w.app
  name=e.target.name
  names=name.split("#")
  temp={ customer:jsx.state.customer }
  curRow = temp.customer.selRow
  done = false
  if e.key =="ArrowDown"
    curRow++
    done = true
  if e.key =="ArrowUp"
    curRow--
    done = true
  if e.key =="Enter"
    done = true
  if done == false
    return
  if curRow < 0
    curRow =0
  if curRow > (temp.customer.rcds.length - 1)
    temp.customer.rcds.push(_.cloneDeep(temp.customer.blank))
  if e.key =="Enter"
    temp.customer.selRow = -1
    jsx.setState(temp)
    return
  temp.customer.selRow = curRow
  ref="customer_row#"+names[1]+"#"+curRow
  def="customer_row#cusCd#"+curRow
  jsx.setState(temp,$w.setFocus.bind(this,ref,def))
$w.customer_formSearch = () ->
  criteria=$c.createCriteria($w.app.state.customer_search,["cusCd","name"])
  maxRecord=$w.app.state.customer_search.maxRecord
  $w.flux.actions.$c_rcd_fetch($w.app.state.customer,$w.app.state.customer_form,"customer",criteria,maxRecord)
$w.customer_formUpdate = () ->
  oldrcds=$w.app.state.rcd.customer.rcds
  rcds=$w.app.state.customer.rcds
  rules = []
  rules.push("required,cusCd,cusCdは必須項目です"); 
  params = {
    transactions:[]
  }
  for rcd,i in rcds
    res = $v.validate(rcd,rules)
    if res.length > 0
      $w.flux.actions.$c_alertShow(res) 
      customertemp={customer:$w.app.state.customer}
      customertemp.customer.i
      ref="customerrow#customerId#"+i
      def=ref
      $w.app.setState(customertemp,$w.setFocus.bind(this,ref,def))
      return 
    if rcd.id == ""
      tran={
        operationType:"add"
        data:rcd
      } 
      params.transactions.push(tran)
    else
      oldrecord= $c.getRecordById(oldrcds,rcd.id)
      dirty=$c.dirtyCheck(oldrecord,rcd)
      if dirty
        tran={
        operationType:"update"
        data:rcd
        } 
        params.transactions.push(tran)
  if params.transactions.length > 0
    $w.flux.actions.$c_rcd_transaction($w.app.state.customer,params,"customer")
$w.customer_formDelete = () ->
  if $w.app.state.customer.rcds[$w.app.state.customer.selRow].id == ""
    $w.flux.actions.$c_rcd_delete_id_blank()
    return
  $w.flux.actions.$c_deleteCfmShow($w.customer_formDeleteCfm)
$w.customer_formDeleteCfm = () ->
  $w.flux.actions.$c_rcd_delete($w.app.state.customer,
    $w.app.state.customer.rcds[$w.app.state.customer.selRow],"customer")
$w.customer_formCancel = () ->
  $w.rcdSet()
$w.customer_formClear = () ->
  formtemp={
    customer_form:_.cloneDeep($w.app.state.customer.blank)
    customer:$w.app.state.customer
  }
  formtemp.customer.selRow=-1
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
rcdStore.addTable("customer")
$w.FluxMixin = Fluxxor.FluxMixin(React)
$w.StoreWatchMixin = Fluxxor.StoreWatchMixin
$w.rcdSet =  ->
  rcdTemp=_.cloneDeep($w.app.state.rcd.customer)
  temp={
    customer:$w.app.state.customer
  }
  temp.customer.rcds=rcdTemp.rcds
  temp.customer_form=rcdTemp.rcd
  temp.customer.selRow=rcdTemp.selRow
  $w.app.setState(temp) 
$w.rcdStore.on("rcdComplete_customer", ->
  $w.rcdSet()  
)
$w.getDom = (refname) ->
  return $w.app.refs[refname].getDOMNode()
  
$w.customer_scroll = ->
  $w.getDom("customer_tableHead").scrollLeft=$w.getDom("customer_tableBody").scrollLeft
$w.customer_onscroll = ->
  $w.getDom("customer_tableBody").onscroll=$w.customer_scroll