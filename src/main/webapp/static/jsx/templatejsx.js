 var b = ReactBootstrap;
$w.Application = React.createClass({
  mixins: [$w.FluxMixin, $w.StoreWatchMixin("COMMON","RCD","PAGE")],  
  getInitialState: function() {
  $w.app = this;
      blank={
                    db:"",
                    database:"",
                    table:"",
                    items:"",
                    tempsel:"",
                    p1:"",
                    p2:"",
                    p3:"",
                    l1:"",
                    l2:"",
                    l3:"",
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
        <b.Col xs={5} style={{textAlign: "center"}}>TEMPLATE
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
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>Template
          </b.Col>
          <b.Col xs={3}>
          <$c.SelectOption options={this.state.page.templates} style={{height:24,  fontSize:12}}
               name={"form#template"}
              defaultValue={this.state.form.template} onChange= {$w.handleChange} />
          </b.Col>
                    <b.Col xs={1} style={{textAlign: "right"}}>含む
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.tempsel} 
            name="form#tempsel" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
        name="btnSearch" style={{width:60,marginLeft:10}}>検索</b.Button>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>Parameter
          </b.Col>
          <b.Col xs={8} style={{textAlign: "right"}}>
          <b.Input type="text" value={this.state.page.parameter} 
            name="form#parameter" readonly={true}
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
     </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>DB
          </b.Col>
          <b.Col xs={3}>
          <$c.SelectOption options={this.state.page.dbs} style={{height:24,  fontSize:12}}
               name={"form#db"}
              defaultValue={this.state.form.db} onChange= {$w.handleChange} />
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>Database
          </b.Col>
          <b.Col xs={3}>
          <$c.SelectOption options={this.state.page.database} style={{height:24,  fontSize:12}}
               name={"form#database"}
              defaultValue={this.state.form.database} onChange= {$w.handleChange} />
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>Table
          </b.Col>
          <b.Col xs={3}>
          <$c.SelectOption options={this.state.page.table} style={{height:24,  fontSize:12}}
               name={"form#table"}
              defaultValue={this.state.form.table} onChange= {$w.handleChange} />
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={4} style={{textAlign: "right"}}>以下 Template 実行Parameter
          </b.Col>
          <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
        name="btnExec" style={{width:60,marginLeft:10}}>実行</b.Button>
      </b.Row>   
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
          <b.Col xs={2} style={{textAlign: "right"}}>ITEMS (指定する場合)
          </b.Col>
          <b.Col xs={9}>
          <b.Input type="text" value={this.state.form.items} 
            name="form#items" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
          <b.Col xs={2} style={{textAlign: "right"}}>P1
          </b.Col>
          <b.Col xs={9}>
          <b.Input type="text" value={this.state.form.p1} 
            name="form#p1" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
          <b.Col xs={2} style={{textAlign: "right"}}>P2
          </b.Col>
          <b.Col xs={9}>
          <b.Input type="text" value={this.state.form.p2} 
            name="form#p2" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
          <b.Col xs={2} style={{textAlign: "right"}}>P3
          </b.Col>
          <b.Col xs={9}>
          <b.Input type="text" value={this.state.form.p3} 
            name="form#p3" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
          <b.Col xs={2} style={{textAlign: "right"}}>L1　(:XX:XX:)
          </b.Col>
          <b.Col xs={9}>
          <b.Input type="text" value={this.state.form.l1} 
            name="form#l1" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
          <b.Col xs={2} style={{textAlign: "right"}}>L2　(:XX:XX:)
          </b.Col>
          <b.Col xs={9}>
          <b.Input type="text" value={this.state.form.l2} 
            name="form#l2" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
          <b.Col xs={2} style={{textAlign: "right"}}>L3　(:XX:XX:)
          </b.Col>
          <b.Col xs={9}>
          <b.Input type="text" value={this.state.form.l3} 
            name="form#l3" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", marginLeft:0,marginRight:5}}>
         <b.Col xs={1} style={{textAlign: "right"}}>実行結果
          </b.Col>
          <b.Col xs={11}>
          <b.Input type="textarea" value={this.state.page.res} 
            name="form#res" 
            rows={10}
            style={{fontSize:12,width:"100%"}}/>
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