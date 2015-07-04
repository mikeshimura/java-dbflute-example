package dbfexample.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import dbfexample.dbflute.cbean.cq.ciq.*;
import dbfexample.dbflute.cbean.*;
import dbfexample.dbflute.cbean.cq.*;

/**
 * The base condition-query of stock.
 * @author DBFlute(AutoGenerator)
 */
public class BsStockCQ extends AbstractBsStockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected StockCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsStockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from stock) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public StockCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected StockCIQ xcreateCIQ() {
        StockCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected StockCIQ xnewCIQ() {
        return new StockCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join stock on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public StockCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        StockCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /** 
     * Add order-by as ascend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _yyyymm;
    public ConditionValue xdfgetYyyymm()
    { if (_yyyymm == null) { _yyyymm = nCV(); }
      return _yyyymm; }
    protected ConditionValue xgetCValueYyyymm() { return xdfgetYyyymm(); }

    /** 
     * Add order-by as ascend. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Yyyymm_Asc() { regOBA("yyyymm"); return this; }

    /**
     * Add order-by as descend. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Yyyymm_Desc() { regOBD("yyyymm"); return this; }

    protected ConditionValue _prdId;
    public ConditionValue xdfgetPrdId()
    { if (_prdId == null) { _prdId = nCV(); }
      return _prdId; }
    protected ConditionValue xgetCValuePrdId() { return xdfgetPrdId(); }

    /** 
     * Add order-by as ascend. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_PrdId_Asc() { regOBA("prd_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_PrdId_Desc() { regOBD("prd_id"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /** 
     * Add order-by as ascend. <br>
     * name: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _cost;
    public ConditionValue xdfgetCost()
    { if (_cost == null) { _cost = nCV(); }
      return _cost; }
    protected ConditionValue xgetCValueCost() { return xdfgetCost(); }

    /** 
     * Add order-by as ascend. <br>
     * cost: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Cost_Asc() { regOBA("cost"); return this; }

    /**
     * Add order-by as descend. <br>
     * cost: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Cost_Desc() { regOBD("cost"); return this; }

    protected ConditionValue _price;
    public ConditionValue xdfgetPrice()
    { if (_price == null) { _price = nCV(); }
      return _price; }
    protected ConditionValue xgetCValuePrice() { return xdfgetPrice(); }

    /** 
     * Add order-by as ascend. <br>
     * price: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Price_Asc() { regOBA("price"); return this; }

    /**
     * Add order-by as descend. <br>
     * price: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Price_Desc() { regOBD("price"); return this; }

    protected ConditionValue _unit;
    public ConditionValue xdfgetUnit()
    { if (_unit == null) { _unit = nCV(); }
      return _unit; }
    protected ConditionValue xgetCValueUnit() { return xdfgetUnit(); }

    /** 
     * Add order-by as ascend. <br>
     * unit: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Unit_Asc() { regOBA("unit"); return this; }

    /**
     * Add order-by as descend. <br>
     * unit: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_Unit_Desc() { regOBD("unit"); return this; }

    protected ConditionValue _beforeQty;
    public ConditionValue xdfgetBeforeQty()
    { if (_beforeQty == null) { _beforeQty = nCV(); }
      return _beforeQty; }
    protected ConditionValue xgetCValueBeforeQty() { return xdfgetBeforeQty(); }

    /** 
     * Add order-by as ascend. <br>
     * before_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_BeforeQty_Asc() { regOBA("before_qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * before_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_BeforeQty_Desc() { regOBD("before_qty"); return this; }

    protected ConditionValue _purQty;
    public ConditionValue xdfgetPurQty()
    { if (_purQty == null) { _purQty = nCV(); }
      return _purQty; }
    protected ConditionValue xgetCValuePurQty() { return xdfgetPurQty(); }

    /** 
     * Add order-by as ascend. <br>
     * pur_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_PurQty_Asc() { regOBA("pur_qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * pur_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_PurQty_Desc() { regOBD("pur_qty"); return this; }

    protected ConditionValue _rcvQty;
    public ConditionValue xdfgetRcvQty()
    { if (_rcvQty == null) { _rcvQty = nCV(); }
      return _rcvQty; }
    protected ConditionValue xgetCValueRcvQty() { return xdfgetRcvQty(); }

    /** 
     * Add order-by as ascend. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_RcvQty_Asc() { regOBA("rcv_qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_RcvQty_Desc() { regOBD("rcv_qty"); return this; }

    protected ConditionValue _salesQty;
    public ConditionValue xdfgetSalesQty()
    { if (_salesQty == null) { _salesQty = nCV(); }
      return _salesQty; }
    protected ConditionValue xgetCValueSalesQty() { return xdfgetSalesQty(); }

    /** 
     * Add order-by as ascend. <br>
     * sales_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_SalesQty_Asc() { regOBA("sales_qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * sales_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_SalesQty_Desc() { regOBD("sales_qty"); return this; }

    protected ConditionValue _outQty;
    public ConditionValue xdfgetOutQty()
    { if (_outQty == null) { _outQty = nCV(); }
      return _outQty; }
    protected ConditionValue xgetCValueOutQty() { return xdfgetOutQty(); }

    /** 
     * Add order-by as ascend. <br>
     * out_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_OutQty_Asc() { regOBA("out_qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * out_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_OutQty_Desc() { regOBD("out_qty"); return this; }

    protected ConditionValue _stockQty;
    public ConditionValue xdfgetStockQty()
    { if (_stockQty == null) { _stockQty = nCV(); }
      return _stockQty; }
    protected ConditionValue xgetCValueStockQty() { return xdfgetStockQty(); }

    /** 
     * Add order-by as ascend. <br>
     * stock_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_StockQty_Asc() { regOBA("stock_qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * stock_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_StockQty_Desc() { regOBD("stock_qty"); return this; }

    protected ConditionValue _stockAmount;
    public ConditionValue xdfgetStockAmount()
    { if (_stockAmount == null) { _stockAmount = nCV(); }
      return _stockAmount; }
    protected ConditionValue xgetCValueStockAmount() { return xdfgetStockAmount(); }

    /** 
     * Add order-by as ascend. <br>
     * stock_amount: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_StockAmount_Asc() { regOBA("stock_amount"); return this; }

    /**
     * Add order-by as descend. <br>
     * stock_amount: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_StockAmount_Desc() { regOBD("stock_amount"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * version_no: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * version_no: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

    protected ConditionValue _delFlag;
    public ConditionValue xdfgetDelFlag()
    { if (_delFlag == null) { _delFlag = nCV(); }
      return _delFlag; }
    protected ConditionValue xgetCValueDelFlag() { return xdfgetDelFlag(); }

    /** 
     * Add order-by as ascend. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_DelFlag_Asc() { regOBA("del_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_DelFlag_Desc() { regOBD("del_flag"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * register_user: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_user: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue xdfgetRegisterProcess()
    { if (_registerProcess == null) { _registerProcess = nCV(); }
      return _registerProcess; }
    protected ConditionValue xgetCValueRegisterProcess() { return xdfgetRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * register_process: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_process: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * update_user: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_user: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue xdfgetUpdateProcess()
    { if (_updateProcess == null) { _updateProcess = nCV(); }
      return _updateProcess; }
    protected ConditionValue xgetCValueUpdateProcess() { return xdfgetUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * update_process: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_process: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsStockCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsStockCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsStockCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        StockCQ bq = (StockCQ)bqs;
        StockCQ uq = (StockCQ)uqs;
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * product by my prd_id, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCQ queryProduct() {
        return xdfgetConditionQueryProduct();
    }
    public ProductCQ xdfgetConditionQueryProduct() {
        String prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCQ xcreateQueryProduct() {
        String nrp = xresolveNRP("stock", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, StockCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(StockCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, StockCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(StockCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, StockCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(StockCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, StockCQ> _myselfExistsMap;
    public Map<String, StockCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(StockCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, StockCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(StockCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return StockCB.class.getName(); }
    protected String xCQ() { return StockCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
