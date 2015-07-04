 var b = ReactBootstrap;
$w.width=800;
$w.height=800;
$w.tableHeight=340;
$w.tableColW={c1:50,c2:50,c3:50,c4:50,c5:50,c6:50,
                      c7:50,c8:50,c9:50,c10:50,c11:50,c12:50,
                      c13:50,c14:50,c15:50,c16:50,c17:50,c18:50}, 
$w.LoginRows = React.createClass({

    render: function() {
        var rows = this.props.rcds.map(function(rcd, i){
        var bgcolor="";
        var sxbool = "";
        var snbool = "";
        if (rcd.xbool == true) 
            sxbool = "true";
        else
            sxbool = "false";
        if (typeof(rcd.nbool) == "boolean") 
            if (rcd.nbool == true)  
                snbool = "true";
            else
                snbool = "false";
        if (i==this.props.selRow)
          bgcolor="#d9edf7";
        else
          if (i%2 == 1)
            bgcolor="#F8F8F8";
          else
            bgcolor="#FFFFFF";
        return (
          <tr key={i} >
          <td id={"loginrow#str#"+i} style={{width:this.props.cw.c1,backgroundColor:bgcolor}}>{rcd.str}</td>
          <td id={"loginrow#nstr#"+i} style={{width:this.props.cw.c2,backgroundColor:bgcolor}}>{rcd.nstr}</td>
          <td id={"loginrow#xint#"+i} style={{width:this.props.cw.c3,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.xint}</td>
          <td id={"loginrow#nint#"+i} style={{width:this.props.cw.c4,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.nint}</td>
          <td id={"loginrow#flt#"+i} style={{width:this.props.cw.c5,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.flt}</td>
          <td id={"loginrow#nflt#"+i} style={{width:this.props.cw.c6,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.nflt}</td>
          <td id={"loginrow#nbool#"+i} style={{width:this.props.cw.c7,backgroundColor:bgcolor}}>{sxbool}</td>
          <td id={"loginrow#nbool#"+i} style={{width:this.props.cw.c8,backgroundColor:bgcolor}}>{snbool}</td>
          <td id={"loginrow#num#"+i} style={{width:this.props.cw.c9,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.num}</td>
          <td id={"loginrow#nnum#"+i} style={{width:this.props.cw.c10,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.nnum}</td>
          <td id={"loginrow#xtime#"+i} style={{width:this.props.cw.c11,backgroundColor:bgcolor}}>{rcd.xtime}</td>
          <td id={"loginrow#ntime#"+i} style={{width:this.props.cw.c12,backgroundColor:bgcolor}}>{rcd.ntime}</td>
          <td id={"loginrow#date#"+i} style={{width:this.props.cw.c13,backgroundColor:bgcolor}}>{rcd.date}</td>
          <td id={"loginrow#ndate#"+i} style={{width:this.props.cw.c14,backgroundColor:bgcolor}}>{rcd.ndate}</td>
          <td id={"loginrow#xtimestamp#"+i} style={{width:this.props.cw.c15,backgroundColor:bgcolor}}>{rcd.xtimestamp}</td>
          <td id={"loginrow#ntimestamp#"+i} style={{width:this.props.cw.c16,backgroundColor:bgcolor}}>{rcd.ntimestamp}</td>
          <td id={"loginrow#id#"+i} style={{width:this.props.cw.c17,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.id}</td>
          <td id={"loginrow#versionNo#"+i} style={{width:this.props.cw.c18,backgroundColor:bgcolor,textAlign:"right"}}>{rcd.versionNo}</td>
         </tr>
        )
        }, this);
          return ( 
            <tbody >
                {rows}
            </tbody>
          );
    }
  });
$w.Application = React.createClass({
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
                  cw:$w.tableColW,
                  totalW:$c.totalW($w.tableColW)+2,
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
      <div className="container-fixed" 
          style={{fontSize:12,border:1,borderStyle:"solid",width:$w.width,height:$w.height,backgroundColor: "#F0F0F0"}}>

      <b.Row className="darkBgLarge" 
          style={{margin:0,height:40,lineHeight:"40px",verticalAlign: "middle"}}>
        <b.Col xs={5} style={{textAlign: "center"}}>ALL TYPE
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
        name="btnSearch" style={{width:60,marginLeft:10}}>検索</b.Button>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>Login ID
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} style={{height:24,  fontSize:12}}
               name={"search#loginId"}
              defaultValue={this.state.search.loginId} onChange= {$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.loginId_s} 
            name="search#loginId_s" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.loginId_e} 
            name="search#loginId_e" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>氏名
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} 
              style={{height:24,  fontSize:12}} name={"search#name"}
              defaultValue={this.state.search.name} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.name_s} 
            name="search#name_s" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.name_e} 
            name="search#name_e" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={1} style={{textAlign: "right"}}>氏名
          </b.Col>
          <b.Col xs={2} >
          <$c.SelectOption options={$c.stringOption} 
              style={{height:24,  fontSize:12}} name={"search#name"}
              defaultValue={this.state.search.name} onChange={$w.handleChange} />
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.name_s} 
            name="search#name_s" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
          <b.Col xs={3}>
          <b.Input type="text" value={this.state.search.name_e} 
            name="search#name_e" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <div style={{width:$w.width-2,border:1,borderStyle:"solid",
          borderColor:"black",height:$w.tableHeight,backgroundColor: "#FFFFFF"}}>
      <div ref="tableHead"  
          style={{width:$w.width-20,height:20,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable" >
       <thead style={{width:this.state.alltype.totalW,overflowX:"hidden",overflowY:"hidden"}}>
        <tr >
          <th　style={{width:this.state.alltype.cw.c1}}>str</th>
          <th style={{width:this.state.alltype.cw.c2}}>nstr</th>
          <th　style={{width:this.state.alltype.cw.c3}}>xint</th>
          <th style={{width:this.state.alltype.cw.c4}}>nint</th>
          <th　style={{width:this.state.alltype.cw.c5}}>flt</th>
          <th style={{width:this.state.alltype.cw.c6}}>nflt</th>
          <th　style={{width:this.state.alltype.cw.c7}}>xbool</th>
          <th style={{width:this.state.alltype.cw.c8}}>nbool</th>
          <th style={{width:this.state.alltype.cw.c9}}>num</th>
          <th　style={{width:this.state.alltype.cw.c10}}>nnum</th>
          <th style={{width:this.state.alltype.cw.c11}}>xtime</th>
          <th style={{width:this.state.alltype.cw.c12}}>ntime</th>
          <th　style={{width:this.state.alltype.cw.c13}}>date</th>
          <th style={{width:this.state.alltype.cw.c14}}>ndate</th>
          <th style={{width:this.state.alltype.cw.c15}}>xtimestamp</th>
          <th　style={{width:this.state.alltype.cw.c16}}>ntimestamp</th>
          <th　style={{width:this.state.alltype.cw.c17}}>id</th>
          <th style={{width:this.state.alltype.cw.c18}}>versionNo</th>
        </tr>
      </thead>
      </b.Table>
       </div>
      <div ref="tableBody" 
        style={{width:$w.width-4,height:$w.tableHeight-22,overflowX:"scroll",overflowY:"scroll"}}>
      <div style={{width:this.state.alltype.totalW,overflowX:"hidden",overflowY:"hidden"}}>
      <b.Table bordered condensed className="wscrolltable" 
       onClick={$w.handleClick}> 
      <$w.LoginRows rcds={this.state.alltype.rcds} cw={this.state.alltype.cw}
          selRow={this.state.alltype.selRow}/>
      </b.Table>
      </div>
      </div>
      </div>
      <b.Row style={{margin:5}}>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick}
            name="btnNew" style={{width:60,marginLeft:10}}>新規</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
            name="btnUpdate" style={{width:60,marginLeft:10}}>更新</b.Button>
        <b.Button bsSize="xsmall" bsStyle="primary" onClick={$w.handleClick} 
            name="btnDelete" style={{width:60,marginLeft:10}}>削除</b.Button>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>str
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.str} 
            name="form#str" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
         <b.Col xs={2} style={{textAlign: "right"}}>nstr
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.nstr} 
            name="form#nstr" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>      
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>xint
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.xint} 
            name="form#xint" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
         <b.Col xs={2} style={{textAlign: "right"}}>nint
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.nint} 
            name="form#nint" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>flt
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.flt} 
            name="form#flt" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
         <b.Col xs={2} style={{textAlign: "right"}}>nflt
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.nflt} 
            name="form#nflt" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>xbool
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="checkbox" checked={this.state.form.xbool} 
            name="form#xbool" onChange={$w.handleChange} 
            style={{height:12,fontSize:12,width:"38%",top:-8}}/>
          </b.Col>
         <b.Col xs={2} style={{textAlign: "right"}}>nbool
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="checkbox" checked={this.state.form.nbool} 
            name="form#nbool" onChange={$w.handleChange} 
            style={{height:12,fontSize:12,width:"38%",top:-8}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>num
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.num} 
            name="form#num" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
         <b.Col xs={2} style={{textAlign: "right"}}>nnum
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.nnum} 
            name="form#nnum" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>xtime
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.xtime} 
            name="form#xtime" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
         <b.Col xs={2} style={{textAlign: "right"}}>ntime
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.ntime} 
            name="form#ntime" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>date
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.date} 
            name="form#date" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
         <b.Col xs={2} style={{textAlign: "right"}}>ndate
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.ndate} 
            name="form#ndate" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>xtimestamp
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.xtimestamp} 
            name="form#xtimestamp" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
         <b.Col xs={2} style={{textAlign: "right"}}>ntimestamp
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.ntimestamp} 
            name="form#ntimestamp" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
      <b.Row　style={{verticalAlign:"middle", lineHeight:"26px",marginLeft:0}}>
         <b.Col xs={2} style={{textAlign: "right"}}>id
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.id} 
            name="form#id" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
         <b.Col xs={2} style={{textAlign: "right"}}>versionNo
          </b.Col>
          <b.Col xs={2}>
          <b.Input type="text" value={this.state.form.versionNo} 
            name="form#versionNo" onChange={$w.handleChange} 
            style={{height:24,fontSize:12,width:"100%"}}/>
          </b.Col>
      </b.Row>
            
      <$c.Alert isShow={this.state.common.alert.isShow} 
          message={this.state.common.alert.message} onClick={$w.handleClick} />
      <$c.DeleteConfirm isShow={this.state.common.deleteCfm.isShow}
          onClick={$w.handleClick}/>
      </div>
    );
  },
  componentDidMount: function() {
     $w.onscroll();
  }

});

React.render(<$w.Application flux={$w.flux}/>, document.getElementById('content'));