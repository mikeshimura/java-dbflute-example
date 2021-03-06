 var b = ReactBootstrap;
$w.width=900;
$w.height=800;
$w.tableHeight=340;
$w.tableColW={c1:140,c2:130,c3:130,c4:150,c5:150,c6:150,c7:60,c8:60,c9:60,c10:60,c11:60}
$w.UsertblRows = React.createClass({displayName: 'UsertblRows',

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
          React.createElement("td", {id: "usertbl_row#tableName#"+i, 
            style: {width:this.props.cw.c1,backgroundColor:bgcolor}}, rcd.tableName), 
          React.createElement("td", {id: "usertbl_row#key1#"+i, 
            style: {width:this.props.cw.c2,backgroundColor:bgcolor}}, rcd.key1), 
          React.createElement("td", {id: "usertbl_row#key2#"+i, 
            style: {width:this.props.cw.c3,backgroundColor:bgcolor}}, rcd.key2), 
          React.createElement("td", {id: "usertbl_row#s1Data#"+i, 
          style: {width:this.props.cw.c4,backgroundColor:bgcolor}}, rcd.s1Data), 
          React.createElement("td", {id: "usertbl_row#s2Data#"+i, 
          style: {width:this.props.cw.c5,backgroundColor:bgcolor}}, rcd.s2Data), 
          React.createElement("td", {id: "usertbl_row#s3Data#"+i, 
          style: {width:this.props.cw.c6,backgroundColor:bgcolor}}, rcd.s3Data), 
          React.createElement("td", {id: "usertbl_row#n1Data#"+i, 
          style: {width:this.props.cw.c7,backgroundColor:bgcolor,textAlign:"right"}}, 
            rcd.n1Data), 
          React.createElement("td", {id: "usertbl_row#n2Data#"+i, 
          style: {width:this.props.cw.c8,backgroundColor:bgcolor,textAlign:"right"}}, 
            rcd.n2Data), 
          React.createElement("td", {id: "usertbl_row#n3Data#"+i, 
          style: {width:this.props.cw.c9,backgroundColor:bgcolor,textAlign:"right"}}, 
            rcd.n3Data), 
          React.createElement("td", {id: "usertbl_row#vid#"+i, 
          style: {width:this.props.cw.c10,backgroundColor:bgcolor,textAlign:"right"}}, 
            rcd.id), 
          React.createElement("td", {id: "usertbl_row#versionNo#"+i, 
          style: {width:this.props.cw.c11,backgroundColor:bgcolor,textAlign:"right"}}, 
            rcd.versionNo)
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
  usertbl_blank={
          tableName:"",
          key1:"",
          key2:"",
          s1Data:"",
          s2Data:"",
          s3Data:"",
          n1Data:"",
          n2Data:"",
          n3Data:"",
          id:"",
          versionNo:""   
  };
      return {
                user:$c.login.name,
                usertbl_search:{
                  tableName:"starts with",
                  tableName_s:"",
                  tableName_e:"",
                  key1:"starts with",
                  key1_s:"",
                  key1_e:"",
                  maxRecord:"300"
                },
                usertbl:{
                  url:"/ajax/usertbl",
                  cw:$w.tableColW,
                  totalW:$c.totalW($w.tableColW)+2,
                  rcds:[],
                  blank:_.cloneDeep(usertbl_blank), 
                  selRow:-1
                },
                usertbl_form:_.cloneDeep(usertbl_blank)
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
      React.createElement(b.Row, {className: "darkBgLarge", 
          style: {margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}, 
        React.createElement(b.Col, {xs: 5, style: {textAlign: "center"}}, "ユーザーテーブル管理"
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
      React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: this.handleClick, 
        name: "usertbl_btnSearch", style: {width:60,marginLeft:10}}, "検索")
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "tableName"
          ), 
          React.createElement(b.Col, {xs: 2}, 
          React.createElement($c.SelectOption, {options: $c.stringOption, style: {height:24,  fontSize:12}, 
               name: "usertbl_search#tableName", 
              defaultValue: this.state.usertbl_search.tableName, onChange: this.handleChange})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.usertbl_search.tableName_s, 
            name: "usertbl_search#tableName_s", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.usertbl_search.tableName_e, 
            name: "usertbl_search#tableName_e", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "MaxRecord"
          ), 
          React.createElement(b.Col, {xs: 1}, 
            React.createElement(b.Input, {type: "text", value: this.state.usertbl_search.maxRecord, 
            name: "usertbl_search#names", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "key1"
          ), 
          React.createElement(b.Col, {xs: 2}, 
          React.createElement($c.SelectOption, {options: $c.stringOption, 
              style: {height:24,  fontSize:12}, name: "usertbl_search#key1", 
              defaultValue: this.state.usertbl_search.key1, onChange: this.handleChange})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.usertbl_search.key1_s, 
            name: "usertbl_search#key1_s", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.usertbl_search.key1_e, 
            name: "usertbl_search#key1_e", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement("div", {style: {width:$w.width-2,border:1,borderStyle:"solid",
          borderColor:"black",height:$w.tableHeight,backgroundColor: "#FFFFFF"}}, 
      React.createElement("div", {ref: "usertbl_tableHead", 
          style: {width:$w.width-20,height:20,overflowX:"hidden",overflowY:"hidden"}}, 
      React.createElement(b.Table, {bordered: true, condensed: true, className: "wscrolltable"}, 
       React.createElement("thead", {style: {width:this.state.usertbl.totalW,overflowX:"hidden",overflowY:"hidden"}}, 
        React.createElement("tr", null, 
          React.createElement("th", {　style: {width:this.state.usertbl.cw.c1}}, "tableName"), 
          React.createElement("th", {style: {width:this.state.usertbl.cw.c2}}, "key1"), 
          React.createElement("th", {　style: {width:this.state.usertbl.cw.c3}}, "key2"), 
          React.createElement("th", {style: {width:this.state.usertbl.cw.c4}}, "s1Data"), 
          React.createElement("th", {style: {width:this.state.usertbl.cw.c5}}, "s2Data"), 
          React.createElement("th", {style: {width:this.state.usertbl.cw.c6}}, "s3Data"), 
          React.createElement("th", {style: {width:this.state.usertbl.cw.c7}}, "n1Data"), 
          React.createElement("th", {style: {width:this.state.usertbl.cw.c8}}, "n2Data"), 
          React.createElement("th", {style: {width:this.state.usertbl.cw.c9}}, "n3Data"), 
          React.createElement("th", {　style: {width:this.state.usertbl.cw.c10}}, "id"), 
          React.createElement("th", {style: {width:this.state.usertbl.cw.c11}}, "versionNo")
        )
      )
      )
       ), 
      React.createElement("div", {ref: "usertbl_tableBody", 
        style: {width:$w.width-4,height:$w.tableHeight-22,overflowX:"scroll",overflowY:"scroll"}}, 
      React.createElement("div", {style: {width:this.state.usertbl.totalW,overflowX:"hidden",overflowY:"hidden"}}, 
      React.createElement(b.Table, {bordered: true, condensed: true, className: "wscrolltable", 
       onClick: this.handleClick}, 
      React.createElement($w.UsertblRows, {rcds: this.state.usertbl.rcds, cw: this.state.usertbl.cw, 
          selRow: this.state.usertbl.selRow})
      )
      )
      )
      ), 
      React.createElement(b.Row, {style: {margin:5}}, 
        React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: this.handleClick, 
            name: "usertbl_btnNew", style: {width:60,marginLeft:10}}, "新規"), 
        React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: this.handleClick, 
            name: "usertbl_btnUpdate", style: {width:60,marginLeft:10}}, "更新"), 
        React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: this.handleClick, 
            name: "usertbl_btnDelete", style: {width:60,marginLeft:10}}, "削除")

      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "tableName"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.tableName, 
            name: "form#tableName", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "key1"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.key1, 
            name: "form#key1", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "key2"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.key2, 
            name: "form#key2", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "s1Data"
          ), 
          React.createElement(b.Col, {xs: 11}, 
          React.createElement(b.Input, {type: "textarea", value: this.state.form.s1Data, 
            name: "form#s1Data", onChange: this.handleChange, 
            rows: 10, 
            style: {fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
          React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "s2Data"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.s2Data, 
            name: "form#s2Data", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "s3Data"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.s3Data, 
            name: "form#s3Data", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "n1Data"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.n1Data, 
            name: "form#n1Data", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "n2Data"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.n2Data, 
            name: "form#n2Data", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "n3Data"
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.n3Data, 
            name: "form#n3Data", onChange: this.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0,marginRight:5}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "id"
          ), 
          React.createElement(b.Col, {xs: 1}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.id, 
            name: "form#id", onChange: this.handleChange, 
            disabled: true, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
         React.createElement(b.Col, {xs: 1, xsOffset: 2, style: {textAlign: "right"}}, "ver. No"
          ), 
          React.createElement(b.Col, {xs: 1}, 
          React.createElement(b.Input, {type: "text", value: this.state.form.versionNo, 
            name: "form#versionNo", onChange: this.handleChange, 
            disabled: true, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement($c.Alert, {isShow: this.state.common.alert.isShow, 
          message: this.state.common.alert.message, onClick: this.handleClick}), 
      React.createElement($c.DeleteConfirm, {isShow: this.state.common.deleteCfm.isShow, 
          onClick: this.handleClick})
      )
    );
  },
  componentDidMount: function() {
    $w.usertbl_onscroll();
  },
  handleChange: function (e) {
    $w.handleChange(this,e);
  },
  handleClick: function (e) {
    $w.handleClick(this,e);
  }

});

React.render(React.createElement($w.Application, {flux: $w.flux}), document.getElementById('content'));