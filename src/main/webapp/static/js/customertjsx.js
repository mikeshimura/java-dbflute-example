 
  
 var b = ReactBootstrap;
$w.width=900;
$w.height=600;
$w.heightHeader=64;
$w.tableHeight=451;
$w.tableColW={c1:60,c2:150,c3:180,c4:100,c5:80,c6:100,c7:100,c8:80,c9:50,c10:50}
$w.customerRows = React.createClass({displayName: 'customerRows',

    render: function() {
        var rows = this.props.rcds.map(function(rcd, i){
        var bgcolor="";
        if (i==this.props.selRow)
          bgcolor="#d9edf7";
        else
          if (i%2 == 1)
            bgcolor="#F8F8F8";
          else
            bgcolor="#FFFFFF";
        return (
          React.createElement("tr", {key: i}, 
 React.createElement("td", {id: "customer_row#cusCd#"+i, 
            style: {width:this.props.cw.c1,backgroundColor:bgcolor,textAlign:"left"}}, rcd.cusCd), 
 React.createElement("td", {id: "customer_row#name#"+i, 
            style: {width:this.props.cw.c2,backgroundColor:bgcolor,textAlign:"left"}}, rcd.name), 
 React.createElement("td", {id: "customer_row#addr#"+i, 
            style: {width:this.props.cw.c3,backgroundColor:bgcolor,textAlign:"left"}}, rcd.addr), 
 React.createElement("td", {id: "customer_row#bldg#"+i, 
            style: {width:this.props.cw.c4,backgroundColor:bgcolor,textAlign:"left"}}, rcd.bldg), 
 React.createElement("td", {id: "customer_row#cusConSec#"+i, 
            style: {width:this.props.cw.c5,backgroundColor:bgcolor,textAlign:"left"}}, rcd.cusConSec), 
 React.createElement("td", {id: "customer_row#cusConName#"+i, 
            style: {width:this.props.cw.c6,backgroundColor:bgcolor,textAlign:"left"}}, rcd.cusConName), 
 React.createElement("td", {id: "customer_row#tel#"+i, 
            style: {width:this.props.cw.c7,backgroundColor:bgcolor,textAlign:"left"}}, rcd.tel), 
 React.createElement("td", {id: "customer_row#salesAmount#"+i, 
            style: {width:this.props.cw.c8,backgroundColor:bgcolor,textAlign:"right"}}, rcd.salesAmount), 
 React.createElement("td", {id: "customer_row#id#"+i, 
            style: {width:this.props.cw.c9,backgroundColor:bgcolor,textAlign:"right"}}, rcd.id), 
 React.createElement("td", {id: "customer_row#versionNo#"+i, 
            style: {width:this.props.cw.c10,backgroundColor:bgcolor,textAlign:"right"}}, rcd.versionNo)

         )
        )
        }, this);
          return (
            React.createElement("tbody", null, 
                rows
            )
          );
    }
  });
$w.Application = React.createClass({displayName: 'Application',
  mixins: [$w.FluxMixin, $w.StoreWatchMixin("PAGE","COMMON","RCD")],
  getInitialState: function() {
  $w.app = this;
  customer_blank={
          cusCd:"",
          name:"",
          addr:"",
          bldg:"",
          cusConSec:"",
          cusConName:"",
          tel:"",
          salesAmount:"",
          id:"",
          versionNo:"",

  };
      return {
                user:$c.login.name,
                customer_search:{
                  maxRecord:"300",

                  cusCd:"starts with",
                  cusCd_s:"",
                  cusCd_e:"",
                  name:"starts with",
                  name_s:"",
                  name_e:"",
                },
                customer:{
                  url:"/ajax/customer",
                  cw:$w.tableColW,
                  totalW:$c.totalW($w.tableColW)+2,
                  rcds:[],
                  blank:_.cloneDeep(customer_blank),
                  selRow:-1
                },
                customer_form:_.cloneDeep(customer_blank)
              };
  },
  getStateFromFlux: function() {
    //this.props.flux=$w.flux;
    var pageStore = $w.flux.stores.PAGE;
    var commonStore = $w.flux.stores.COMMON;
    var rcdStore = $w.flux.stores.RCD;
    return {
      page: _.cloneDeep(pageStore.data),
      common:_.cloneDeep(commonStore.data),
      rcd:_.cloneDeep(rcdStore.data)
      };
  },
  render: function() {
    return (
      React.createElement("div", {className: "container-fixed", 
          style: {fontSize:12,border:1,borderStyle:"solid",
            width:$w.width,height:$w.height,backgroundColor: "#F0F0F0"}}, 
      /*                                      
        *   Header Area
        */
      React.createElement(b.Row, {className: "darkBgLarge", 
          style: {margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}, 
        React.createElement(b.Col, {xs: 5, style: {textAlign: "center"}}, "カストマー管理"
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
      React.createElement(b.TabbedArea, {activeKey: this.state.tabkey, className: "usertab", bsStyle: "pills", 
      onSelect: $w.handleTabSelect, 
      style: {backgroundColor: "#FFFFFF"}}, 
       /*                                      
        *   TAB 一覧
        */
      React.createElement(b.TabPane, {eventKey: 1, tab: "一覧", 
        style: {border:1,borderStyle:"solid",height:$w.height-$w.heightHeader}}, 
      React.createElement(b.Row, {style: {margin:5}}, 
      React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
        name: "btncustomer_Search", style: {width:60,marginLeft:10}}, "検索")
      ), 

      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "cusCd"
          ), 
          React.createElement(b.Col, {xs: 2}, 
          React.createElement($c.SelectOption, {options: $c.stringOption, style: {height:24,  fontSize:12}, 
               name: "customer_search#cusCd", 
              defaultValue: this.state.customer_search.cusCd, onChange: $w.handleChange})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_search.cusCd_s, 
            name: "customer_search#cusCd_s", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_search.cusCd_e, 
            name: "customer_search#cusCd_e", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 

          React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "MaxRecord"
          ), 
          React.createElement(b.Col, {xs: 1}, 
            React.createElement(b.Input, {type: "text", value: this.state.customer_search.maxRecord, 
            name: "customer_search#maxRecord", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 

      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "name"
          ), 
          React.createElement(b.Col, {xs: 2}, 
          React.createElement($c.SelectOption, {options: $c.stringOption, style: {height:24,  fontSize:12}, 
               name: "customer_search#name", 
              defaultValue: this.state.customer_search.name, onChange: $w.handleChange})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_search.name_s, 
            name: "customer_search#name_s", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_search.name_e, 
            name: "customer_search#name_e", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )

      ), 

      React.createElement("div", {style: {width:$w.width-2,border:1,borderStyle:"solid",
          borderColor:"black",height:$w.tableHeight,backgroundColor: "#FFFFFF"}}, 
      React.createElement("div", {ref: "customer_tableHead", 
          style: {width:$w.width-20,height:20,overflowX:"hidden",overflowY:"hidden"}}, 
      React.createElement(b.Table, {bordered: true, condensed: true, className: "wscrolltable"}, 
       React.createElement("thead", {style: {width:this.state.customer.totalW,overflowX:"hidden",overflowY:"hidden"}}, 
        React.createElement("tr", null, 
          React.createElement("th", {style: {width:this.state.customer.cw.c1}}, "cusCd"), 
          React.createElement("th", {style: {width:this.state.customer.cw.c2}}, "name"), 
          React.createElement("th", {style: {width:this.state.customer.cw.c3}}, "addr"), 
          React.createElement("th", {style: {width:this.state.customer.cw.c4}}, "bldg"), 
          React.createElement("th", {style: {width:this.state.customer.cw.c5}}, "cusConSec"), 
          React.createElement("th", {style: {width:this.state.customer.cw.c6}}, "cusConName"), 
          React.createElement("th", {style: {width:this.state.customer.cw.c7}}, "tel"), 
          React.createElement("th", {style: {width:this.state.customer.cw.c8}}, "salesAmount"), 
          React.createElement("th", {style: {width:this.state.customer.cw.c9}}, "id"), 
          React.createElement("th", {style: {width:this.state.customer.cw.c10}}, "versionNo")

        )
      )
      )
       ), 
      React.createElement("div", {ref: "customer_tableBody", 
        style: {width:$w.width-4,height:$w.tableHeight-22,overflowX:"scroll",overflowY:"scroll"}}, 
      React.createElement("div", {style: {width:this.state.customer.totalW,overflowX:"hidden",overflowY:"hidden"}}, 
      React.createElement(b.Table, {bordered: true, condensed: true, className: "wscrolltable", 
       onClick: $w.handleClick}, 
      React.createElement($w.customerRows, {rcds: this.state.customer.rcds, cw: this.state.customer.cw, 
          selRow: this.state.customer.selRow})
      )
      )
      )
      ), 
    "　　"), 
      /*
        *   TAB 個別
        */
      React.createElement(b.TabPane, {eventKey: 2, tab: "個別", 
      style: {border:1,borderStyle:"solid",height:$w.height-$w.heightHeader}}, 
      React.createElement(b.Row, {style: {margin:5}}, 
        React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
            name: "btncustomer_New", style: {width:60,marginLeft:10}}, "新規"), 
        React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
            name: "btncustomer_Update", style: {width:60,marginLeft:10}}, "更新"), 
        React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
            name: "btncustomer_Delete", style: {width:60,marginLeft:10}}, "削除")

      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "cusCd"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.cusCd, 
            name: "customer_form#cusCd", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "name"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.name, 
            name: "customer_form#name", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "addr"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.addr, 
            name: "customer_form#addr", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "bldg"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.bldg, 
            name: "customer_form#bldg", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "cusConSec"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.cusConSec, 
            name: "customer_form#cusConSec", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "cusConName"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.cusConName, 
            name: "customer_form#cusConName", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "tel"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.tel, 
            name: "customer_form#tel", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "salesAmount"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.salesAmount, 
            name: "customer_form#salesAmount", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "id"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.id, 
            name: "customer_form#id", onChange: $w.handleChange, 
            disabled: true, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "versionNo"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.customer_form.versionNo, 
            name: "customer_form#versionNo", onChange: $w.handleChange, 
            disabled: true, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      )

      )
      ), 
      React.createElement($c.Alert, {isShow: this.state.common.alert.isShow, 
          message: this.state.common.alert.message, onClick: $w.handleClick}), 
      React.createElement($c.DeleteConfirm, {isShow: this.state.common.deleteCfm.isShow, 
          onClick: $w.handleClick})
      )
    );
  },
  componentDidMount: function() {
    $w.customer_onscroll();
  }
});

React.render(React.createElement($w.Application, {flux: $w.flux}), document.getElementById('content'));
