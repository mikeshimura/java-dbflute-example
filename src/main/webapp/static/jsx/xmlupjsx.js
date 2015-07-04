 var b = ReactBootstrap;
$w.Application = React.createClass({
  mixins: [$w.FluxMixin, $w.StoreWatchMixin("COMMON","RCD","PAGE")],
  getInitialState: function() {
  $w.app = this;
      blank={
                    db:"",
                    database:"",
                    xml:"",
                 };
      return {
                user:$c.login.name,
                xmlup:{
                  url:"/ajax/xmlup",
                  rcds:[],
                  blank:_.cloneDeep(blank),
                },
                form:_.cloneDeep(blank)
              };
  },
  getStateFromFlux: function() {
    return {
      page:_.cloneDeep($w.page.data),
      common:_.cloneDeep($w.common.data),
      rcd:_.cloneDeep($w.rcd.data)
      };
  },
  render: function() {
    return (
      <div className="container-fixed" 
          style={{fontSize:12,border:1,borderStyle:"solid",width:800,height:600,backgroundColor: "#F0F0F0"}}>

      <b.Row className="darkBgLarge" 
          style={{margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}>
        <b.Col xs={5} style={{textAlign: "center"}}>XML UPLLOAD
        </b.Col>
        <b.Col xs={5} className="darkBgMid" style={{textAlign: "center"}}>
        {this.state.user}
        </b.Col>
        <b.Col xs={1} className="darkBgMid" >
        </b.Col>
         <b.Col xs={1} >
        <$c.Loader src="../static/img/ajax-loader.gif" isLoading={this.state.common.loading}/>
        </b.Col>
      </b.Row>
      <b.Row style={{margin:5}}>
      <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
        name="btnUpload" style={{width:60,marginLeft:10}}>UPLOAD</b.Button>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>DB
          </b.Col>
          <b.Col xs={3}>
          <$c.SelectOption options={this.state.page.dbs} style={{height:24,  fontSize:12}}
               name={"form#db"}
              defaultValue={this.state.form.db} onChange= {$w.handleChange} />
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>Database
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.form.database} 
            name="form#database" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"top", marginLeft:0}}>
          <b.Col xs={11}>
          <b.Input type="textarea" value={this.state.form.xml} 
            name="form#xml" onChange={$w.handleChange} 
            style={{fontSize:12,width:"100%"}} rows={26}/>
          </b.Col>
      </b.Row>
      <$c.Alert isShow={this.state.common.alert.isShow} 
          message={this.state.common.alert.message} onClick={$w.handleClick} />
      </div>
    );
  },
  componentDidMount: function() {
      $w.flux.actions.getdbs()
  }

});

React.render(<$w.Application flux={$w.flux}/>, document.getElementById('content'));