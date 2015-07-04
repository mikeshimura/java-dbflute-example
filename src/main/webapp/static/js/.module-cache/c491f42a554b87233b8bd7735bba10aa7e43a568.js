 var b = ReactBootstrap;
$w.LoginRows = React.createClass({displayName: 'LoginRows',

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
          React.createElement("td", {id: "loginrow#str#"+i, style: {width:this.props.cw.c1,backgroundColor:bgcolor}}, rcd.str), 
          React.createElement("td", {id: "loginrow#nstr#"+i, style: {width:this.props.cw.c2,backgroundColor:bgcolor}}, rcd.nstr), 
          React.createElement("td", {id: "loginrow#xint#"+i, style: {width:this.props.cw.c3,backgroundColor:bgcolor,textAlign:"right"}}, rcd.xint), 
          React.createElement("td", {id: "loginrow#nint#"+i, style: {width:this.props.cw.c4,backgroundColor:bgcolor,textAlign:"right"}}, rcd.nint), 
          React.createElement("td", {id: "loginrow#flt#"+i, style: {width:this.props.cw.c5,backgroundColor:bgcolor,textAlign:"right"}}, rcd.flt), 
          React.createElement("td", {id: "loginrow#nflt#"+i, style: {width:this.props.cw.c6,backgroundColor:bgcolor,textAlign:"right"}}, rcd.nflt), 
          React.createElement("td", {id: "loginrow#xbool#"+i, style: {width:this.props.cw.c7,backgroundColor:bgcolor}}, " ", React.createElement(b.Input, {type: "checkbox", value: rcd.xbool, 
                   style: {height:24,fontSize:12,width:"100%"}})), 
          React.createElement("td", {id: "loginrow#nbool#"+i, style: {width:this.props.cw.c8,backgroundColor:bgcolor}}, rcd.nbool), 
          React.createElement("td", {id: "loginrow#num#"+i, style: {width:this.props.cw.c9,backgroundColor:bgcolor,textAlign:"right"}}, rcd.num), 
          React.createElement("td", {id: "loginrow#nnum#"+i, style: {width:this.props.cw.c10,backgroundColor:bgcolor,textAlign:"right"}}, rcd.nnum), 
          React.createElement("td", {id: "loginrow#xtime#"+i, style: {width:this.props.cw.c11,backgroundColor:bgcolor}}, rcd.xtime), 
          React.createElement("td", {id: "loginrow#ntime#"+i, style: {width:this.props.cw.c12,backgroundColor:bgcolor}}, rcd.ntime), 
          React.createElement("td", {id: "loginrow#date#"+i, style: {width:this.props.cw.c13,backgroundColor:bgcolor}}, rcd.date), 
          React.createElement("td", {id: "loginrow#ndate#"+i, style: {width:this.props.cw.c14,backgroundColor:bgcolor}}, rcd.ndate), 
          React.createElement("td", {id: "loginrow#xtimestamp#"+i, style: {width:this.props.cw.c15,backgroundColor:bgcolor}}, rcd.xtimestamp), 
          React.createElement("td", {id: "loginrow#ntimestamp#"+i, style: {width:this.props.cw.c16,backgroundColor:bgcolor}}, rcd.ntimestamp), 
          React.createElement("td", {id: "loginrow#id#"+i, style: {width:this.props.cw.c17,backgroundColor:bgcolor,textAlign:"right"}}, rcd.id), 
          React.createElement("td", {id: "loginrow#versionNo#"+i, style: {width:this.props.cw.c18,backgroundColor:bgcolor,textAlign:"right"}}, rcd.versionNo)
         )
        )
        }, this);
          return ( 
            React.createElement("tbody", {style: {overflowY:"auto",height:92}}, 
                rows
            )
          );
    }
  });
$w.Application = React.createClass({displayName: 'Application',
  mixins: [$w.FluxMixin, $w.StoreWatchMixin("COMMON","RCD")],
  getInitialState: function() {
  $w.app = this;
      blank={
                    str:"",
                    nstr:"",
                    xint:"",
                    nint:"",
                    flt:"",
                    nflt:"",
                    xbool:"",
                    nbool:"",
                    num:"",
                    nnum:"",
                    xtime:"",
                    ntime:"",
                    date:"",
                    ndate:"",
                    xtimestamp:"",
                    ntimestamp:"",
                    versionNo:"",
                    id:"",
                    
                };
      return {
                user:$c.login.name,
                search:{
                  loginId:"starts with",
                  loginId_s:"",
                  loginId_e:"",
                  name:"starts with",
                  name_s:"",
                  name_e:""
                },
                alltype:{
                  url:"/ajax/alltype",
                  cw:{c1:50,c2:50,c3:50,c4:50,c5:50,c6:50,
                      c7:50,c8:50,c9:50,c10:50,c11:50,c12:50,
                      c13:50,c14:50,c15:50,c16:50,c17:50,c18:50,
                      c19:50,c20:50,},
                  rcds:[],
                  blank:_.cloneDeep(blank),
                  selRow:-1
                },
                form:_.cloneDeep(blank)
              };
  },
  getStateFromFlux: function() {
    return {
      common:_.cloneDeep($w.common.data),
      rcd:_.cloneDeep($w.rcd.data)
      };
  },
  render: function() {
    return (
      React.createElement("div", {className: "container-fixed", 
          style: {fontSize:12,border:1,borderStyle:"solid",width:912,height:600,backgroundColor: "#F0F0F0"}}, 

      React.createElement(b.Row, {className: "darkBgLarge", 
          style: {margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}, 
        React.createElement(b.Col, {xs: 5, style: {textAlign: "center"}}, "ALL TYPE"
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
        name: "btnSearch", style: {width:60,marginLeft:10}}, "検索")
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "Login ID"
          ), 
          React.createElement(b.Col, {xs: 2}, 
          React.createElement($c.SelectOption, {options: $c.stringOption, style: {height:24,  fontSize:12}, 
               name: "search#loginId", 
              defaultValue: this.state.search.loginId, onChange: $w.handleChange})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.search.loginId_s, 
            name: "search#loginId_s", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.search.loginId_e, 
            name: "search#loginId_e", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement(b.Row, {　style: {verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}, 
         React.createElement(b.Col, {xs: 1, style: {textAlign: "right"}}, "氏名"
          ), 
          React.createElement(b.Col, {xs: 2}, 
          React.createElement($c.SelectOption, {options: $c.stringOption, 
              style: {height:24,  fontSize:12}, name: "search#name", 
              defaultValue: this.state.search.name, onChange: $w.handleChange})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.search.name_s, 
            name: "search#name_s", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          ), 
          React.createElement(b.Col, {xs: 3}, 
          React.createElement(b.Input, {type: "text", value: this.state.search.name_e, 
            name: "search#name_e", onChange: $w.handleChange, 
            style: {height:24,fontSize:12,width:"100%"}})
          )
      ), 
      React.createElement("div", {style: {width:910,border:1,borderStyle:"solid",
          borderColor:"black",height:120,backgroundColor: "#FFFFFF"}}, 
      React.createElement(b.Table, {bordered: true, condensed: true, className: "wscrolltable", 
          style: {width:"100%",height:"100%"}, 
      onClick: $w.handleClick}, 
       React.createElement("thead", null, 
        React.createElement("tr", null, 
          React.createElement("th", {　style: {width:this.state.alltype.cw.c1}}, "str"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c2}}, "nstr"), 
          React.createElement("th", {　style: {width:this.state.alltype.cw.c3}}, "xint"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c4}}, "nint"), 
          React.createElement("th", {　style: {width:this.state.alltype.cw.c5}}, "flt"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c6}}, "nflt"), 
          React.createElement("th", {　style: {width:this.state.alltype.cw.c7}}, "xbool"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c8}}, "nbool"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c9}}, "num"), 
          React.createElement("th", {　style: {width:this.state.alltype.cw.c10}}, "nnum"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c11}}, "xtime"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c12}}, "ntime"), 
          React.createElement("th", {　style: {width:this.state.alltype.cw.c13}}, "date"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c14}}, "ndate"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c15}}, "xtimestamp"), 
          React.createElement("th", {　style: {width:this.state.alltype.cw.c16}}, "ntimestamp"), 
          React.createElement("th", {　style: {width:this.state.alltype.cw.c17}}, "id"), 
          React.createElement("th", {style: {width:this.state.alltype.cw.c18}}, "versionNo")
        )
      ), 
      React.createElement($w.LoginRows, {rcds: this.state.alltype.rcds, cw: this.state.alltype.cw, 
          selRow: this.state.alltype.selRow})
      )
      ), 
      React.createElement(b.Row, {style: {margin:5}}, 
        React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
            name: "btnNew", style: {width:60,marginLeft:10}}, "新規"), 
        React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
            name: "btnUpdate", style: {width:60,marginLeft:10}}, "更新"), 
        React.createElement(b.Button, {bsSize: "xsmall", bsStyle: "primary", onClick: $w.handleClick, 
            name: "btnDelete", style: {width:60,marginLeft:10}}, "削除")

      ), 

      React.createElement($c.Alert, {isShow: this.state.common.alert.isShow, 
          message: this.state.common.alert.message, onClick: $w.handleClick}), 
      React.createElement($c.DeleteConfirm, {isShow: this.state.common.deleteCfm.isShow, 
          onClick: $w.handleClick})
      )
    );
  },
  componentDidMount: function() {
  }

});

React.render(React.createElement($w.Application, {flux: $w.flux}), document.getElementById('content'));