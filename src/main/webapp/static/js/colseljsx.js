 var b = ReactBootstrap;
$w.Application = React.createClass({displayName: 'Application',
  mixins: [$w.FluxMixin, $w.StoreWatchMixin("COMMON","RCD","PAGE")],  
  getInitialState: function() {
  $w.app = this;
      blank={
                    db:"",
                    database:"",
                    table:"",
                    all:"",
                    sel:"",
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
        React.createElement(b.Col, {xs: 5, style: {textAlign: "center"}}, "COLUMN SELECT"
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
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "DB"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement($c.SelectOption, {options: this.state.page.dbs, style: {height:24,  fontSize:12}, 
               name: "form#db", 
              defaultValue: this.state.form.db, onChange: $w.handleChange})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "Database"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement($c.SelectOption, {options: this.state.page.database, style: {height:24,  fontSize:12}, 
               name: "form#database", 
              defaultValue: this.state.form.database, onChange: $w.handleChange})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "Table"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement($c.SelectOption, {options: this.state.page.table, style: {height:24,  fontSize:12}, 
               name: "form#table", 
              defaultValue: this.state.form.table, onChange: $w.handleChange})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
          React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "ALL ITEM"
          ), 
          React.createElement(b.Col, {xs: 9}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.all, 
            name: "form#all", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
          React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "SELECT ITEM"
          ), 
          React.createElement(b.Col, {xs: 9}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.sel, 
            name: "form#sel", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
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