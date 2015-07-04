 var b = ReactBootstrap;
$w.Application = React.createClass({displayName: 'Application',
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
      React.createElement("div", {className: "container-fixed", 
          style: {fontSize:12,border:1,borderStyle:"solid",width:800,height:600,backgroundColor: "#F0F0F0"}}, 

      React.createElement(b.Row, {className: "darkBgLarge", 
          style: {margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}, 
        React.createElement(b.Col, {xs: 5, style: {textAlign: "center"}}, "XML UPLLOAD"
        ), 
        React.createElement(b.Col, {xs: 5, className: "darkBgMid", style: {textAlign: "center"}}, 
        this.state.user
        ), 
        React.createElement(b.Col, {xs: 1, className: "darkBgMid"}
        ), 
         React.createElement(b.Col, {xs: 1}, 
        React.createElement($c.Loader, {src: "../static/img/ajax-loader.gif", isLoading: this.state.common.loading})
        )
      ), 
      React.createElement(b.Row, {style: {margin:5}}, 
      React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
        name: "btnUpload", style: {width:60,marginLeft:10}}, "UPLOAD")
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "DB"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement($c.SelectOption, {options: this.state.page.dbs, style: {height:24,  fontSize:12}, 
               name: "form#db", 
              defaultValue: this.state.form.db, onChange: $w.handleChange})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "Database"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.database, 
            name: "form#database", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"top", marginLeft:0}}, 
          React.createElement(b.Col, {xs: 11}, 
          React.createElement(b.Input, {type: "textarea", value: this.state.form.xml, 
            name: "form#xml", onChange: $w.handleChange, 
            style: {fontSize:12,width:"100%"}, rows: 26})
          )
      ), 
      React.createElement($c.Alert, {isShow: this.state.common.alert.isShow, 
          message: this.state.common.alert.message, onClick: $w.handleClick})
      )
    );
  },
  componentDidMount: function() {
      $w.flux.actions.getdbs()
  }

});

React.render(React.createElement($w.Application, {flux: $w.flux}), document.getElementById('content'));