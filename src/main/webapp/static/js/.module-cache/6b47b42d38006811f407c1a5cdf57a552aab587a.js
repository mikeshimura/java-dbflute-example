 var b = ReactBootstrap;
$w.Application = React.createClass({displayName: 'Application',
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
      React.createElement("div", {className: "container-fixed", 
          style: {fontSize:12,border:1,borderStyle:"solid",width:800,height:600,backgroundColor: "#F0F0F0"}}, 

      React.createElement(b.Row, {className: "darkBgLarge", 
          style: {margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}, 
        React.createElement(b.Col, {xs: 5, style: {textAlign: "center"}}, "TEMPLATE"
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
         React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "Template"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement($c.SelectOption, {options: this.state.page.templates, style: {height:24,  fontSize:12}, 
               name: "form#template", 
              defaultValue: this.state.form.template, onChange: $w.handleChange})
          ), 
                    React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "含む"
          ), 
          React.createElement(b.Col, {xs: 2}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.tempsel, 
            name: "form#tempsel", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
        name: "btnSearch", style: {width:60,marginLeft:10}}, "検索")
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "Parameter"
          ), 
          React.createElement(b.Col, {xs: 8, style: {textAlign: "right"}}, 
          React.createElement(b.Input, {type: "text", value: this.state.page.parameter, 
            name: "form#parameter", readonly: true, 
            style: {height:24,fontSize:12,width:"100%"}})
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
         React.createElement(b.Col, {xs: 4, style: {textAlign: "right"}}, "以下 Template 実行Parameter"
          ), 
          React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
        name: "btnExec", style: {width:60,marginLeft:10}}, "実行")
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
          React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "ITEMS (指定する場合)"
          ), 
          React.createElement(b.Col, {xs: 9}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.items, 
            name: "form#items", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
          React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "P1"
          ), 
          React.createElement(b.Col, {xs: 9}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.p1, 
            name: "form#p1", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
          React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "P2"
          ), 
          React.createElement(b.Col, {xs: 9}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.p2, 
            name: "form#p2", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
          React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "P3"
          ), 
          React.createElement(b.Col, {xs: 9}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.p3, 
            name: "form#p3", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
          React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "L1　(:XX:XX:)"
          ), 
          React.createElement(b.Col, {xs: 9}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.l1, 
            name: "form#l1", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
          React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "L2　(:XX:XX:)"
          ), 
          React.createElement(b.Col, {xs: 9}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.l2, 
            name: "form#l2", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
          React.createElement(b.Col, {xs: 2, style: {textAlign: "right"}}, "L3　(:XX:XX:)"
          ), 
          React.createElement(b.Col, {xs: 9}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.l3, 
            name: "form#l3", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "実行結果"
          ), 
          React.createElement(b.Col, {xs: 11}, 
          React.createElement(b.Input, {type: "textarea", value: this.state.page.res, 
            name: "form#res", 
            rows: 10, 
            style: {fontSize:12,width:"100%"}})
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