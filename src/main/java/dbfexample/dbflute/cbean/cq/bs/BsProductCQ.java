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
 * The base condition-query of product.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductCQ extends AbstractBsProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from product) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProductCIQ xcreateCIQ() {
        ProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProductCIQ xnewCIQ() {
        return new ProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join product on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, SalesSlipCQ> xdfgetId_ExistsReferrer_SalesSlipList() { return xgetSQueMap("id_ExistsReferrer_SalesSlipList"); }
    public String keepId_ExistsReferrer_SalesSlipList(SalesSlipCQ sq) { return xkeepSQue("id_ExistsReferrer_SalesSlipList", sq); }

    public Map<String, StockCQ> xdfgetId_ExistsReferrer_StockList() { return xgetSQueMap("id_ExistsReferrer_StockList"); }
    public String keepId_ExistsReferrer_StockList(StockCQ sq) { return xkeepSQue("id_ExistsReferrer_StockList", sq); }

    public Map<String, SalesSlipCQ> xdfgetId_NotExistsReferrer_SalesSlipList() { return xgetSQueMap("id_NotExistsReferrer_SalesSlipList"); }
    public String keepId_NotExistsReferrer_SalesSlipList(SalesSlipCQ sq) { return xkeepSQue("id_NotExistsReferrer_SalesSlipList", sq); }

    public Map<String, StockCQ> xdfgetId_NotExistsReferrer_StockList() { return xgetSQueMap("id_NotExistsReferrer_StockList"); }
    public String keepId_NotExistsReferrer_StockList(StockCQ sq) { return xkeepSQue("id_NotExistsReferrer_StockList", sq); }

    public Map<String, SalesSlipCQ> xdfgetId_SpecifyDerivedReferrer_SalesSlipList() { return xgetSQueMap("id_SpecifyDerivedReferrer_SalesSlipList"); }
    public String keepId_SpecifyDerivedReferrer_SalesSlipList(SalesSlipCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_SalesSlipList", sq); }

    public Map<String, StockCQ> xdfgetId_SpecifyDerivedReferrer_StockList() { return xgetSQueMap("id_SpecifyDerivedReferrer_StockList"); }
    public String keepId_SpecifyDerivedReferrer_StockList(StockCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_StockList", sq); }

    public Map<String, SalesSlipCQ> xdfgetId_QueryDerivedReferrer_SalesSlipList() { return xgetSQueMap("id_QueryDerivedReferrer_SalesSlipList"); }
    public String keepId_QueryDerivedReferrer_SalesSlipList(SalesSlipCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_SalesSlipList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_SalesSlipListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_SalesSlipList"); }
    public String keepId_QueryDerivedReferrer_SalesSlipListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_SalesSlipList", pm); }

    public Map<String, StockCQ> xdfgetId_QueryDerivedReferrer_StockList() { return xgetSQueMap("id_QueryDerivedReferrer_StockList"); }
    public String keepId_QueryDerivedReferrer_StockList(StockCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_StockList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_StockListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_StockList"); }
    public String keepId_QueryDerivedReferrer_StockListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_StockList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _prdCd;
    public ConditionValue xdfgetPrdCd()
    { if (_prdCd == null) { _prdCd = nCV(); }
      return _prdCd; }
    protected ConditionValue xgetCValuePrdCd() { return xdfgetPrdCd(); }

    /** 
     * Add order-by as ascend. <br>
     * prd_cd: {UQ+, NotNull, varchar(40)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_PrdCd_Asc() { regOBA("prd_cd"); return this; }

    /**
     * Add order-by as descend. <br>
     * prd_cd: {UQ+, NotNull, varchar(40)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_PrdCd_Desc() { regOBD("prd_cd"); return this; }

    protected ConditionValue _prdCat;
    public ConditionValue xdfgetPrdCat()
    { if (_prdCat == null) { _prdCat = nCV(); }
      return _prdCat; }
    protected ConditionValue xgetCValuePrdCat() { return xdfgetPrdCat(); }

    /** 
     * Add order-by as ascend. <br>
     * prd_cat: {NotNull, varchar(40)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_PrdCat_Asc() { regOBA("prd_cat"); return this; }

    /**
     * Add order-by as descend. <br>
     * prd_cat: {NotNull, varchar(40)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_PrdCat_Desc() { regOBD("prd_cat"); return this; }

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
    public BsProductCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

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
    public BsProductCQ addOrderBy_Cost_Asc() { regOBA("cost"); return this; }

    /**
     * Add order-by as descend. <br>
     * cost: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_Cost_Desc() { regOBD("cost"); return this; }

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
    public BsProductCQ addOrderBy_Price_Asc() { regOBA("price"); return this; }

    /**
     * Add order-by as descend. <br>
     * price: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_Price_Desc() { regOBD("price"); return this; }

    protected ConditionValue _perQty;
    public ConditionValue xdfgetPerQty()
    { if (_perQty == null) { _perQty = nCV(); }
      return _perQty; }
    protected ConditionValue xgetCValuePerQty() { return xdfgetPerQty(); }

    /** 
     * Add order-by as ascend. <br>
     * per_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_PerQty_Asc() { regOBA("per_qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * per_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_PerQty_Desc() { regOBD("per_qty"); return this; }

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
    public BsProductCQ addOrderBy_Unit_Asc() { regOBA("unit"); return this; }

    /**
     * Add order-by as descend. <br>
     * unit: {NotNull, varchar(100)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_Unit_Desc() { regOBD("unit"); return this; }

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
    public BsProductCQ addOrderBy_PurQty_Asc() { regOBA("pur_qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * pur_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_PurQty_Desc() { regOBD("pur_qty"); return this; }

    protected ConditionValue _purAmount;
    public ConditionValue xdfgetPurAmount()
    { if (_purAmount == null) { _purAmount = nCV(); }
      return _purAmount; }
    protected ConditionValue xgetCValuePurAmount() { return xdfgetPurAmount(); }

    /** 
     * Add order-by as ascend. <br>
     * pur_amount: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_PurAmount_Asc() { regOBA("pur_amount"); return this; }

    /**
     * Add order-by as descend. <br>
     * pur_amount: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_PurAmount_Desc() { regOBD("pur_amount"); return this; }

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
    public BsProductCQ addOrderBy_SalesQty_Asc() { regOBA("sales_qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * sales_qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_SalesQty_Desc() { regOBD("sales_qty"); return this; }

    protected ConditionValue _salesAmount;
    public ConditionValue xdfgetSalesAmount()
    { if (_salesAmount == null) { _salesAmount = nCV(); }
      return _salesAmount; }
    protected ConditionValue xgetCValueSalesAmount() { return xdfgetSalesAmount(); }

    /** 
     * Add order-by as ascend. <br>
     * sales_amount: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_SalesAmount_Asc() { regOBA("sales_amount"); return this; }

    /**
     * Add order-by as descend. <br>
     * sales_amount: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_SalesAmount_Desc() { regOBD("sales_amount"); return this; }

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
    public BsProductCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * version_no: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

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
    public BsProductCQ addOrderBy_DelFlag_Asc() { regOBA("del_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_DelFlag_Desc() { regOBD("del_flag"); return this; }

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
    public BsProductCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsProductCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_user: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

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
    public BsProductCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_process: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

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
    public BsProductCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsProductCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_user: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

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
    public BsProductCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_process: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

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
    public BsProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ProductCQ> _myselfExistsMap;
    public Map<String, ProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProductCB.class.getName(); }
    protected String xCQ() { return ProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
