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
 * The base condition-query of sales_slip.
 * @author DBFlute(AutoGenerator)
 */
public class BsSalesSlipCQ extends AbstractBsSalesSlipCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SalesSlipCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSalesSlipCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from sales_slip) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SalesSlipCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SalesSlipCIQ xcreateCIQ() {
        SalesSlipCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SalesSlipCIQ xnewCIQ() {
        return new SalesSlipCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join sales_slip on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SalesSlipCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SalesSlipCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsSalesSlipCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _slipNo;
    public ConditionValue xdfgetSlipNo()
    { if (_slipNo == null) { _slipNo = nCV(); }
      return _slipNo; }
    protected ConditionValue xgetCValueSlipNo() { return xdfgetSlipNo(); }

    /** 
     * Add order-by as ascend. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SlipNo_Asc() { regOBA("slip_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SlipNo_Desc() { regOBD("slip_no"); return this; }

    protected ConditionValue _line;
    public ConditionValue xdfgetLine()
    { if (_line == null) { _line = nCV(); }
      return _line; }
    protected ConditionValue xgetCValueLine() { return xdfgetLine(); }

    /** 
     * Add order-by as ascend. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_Line_Asc() { regOBA("line"); return this; }

    /**
     * Add order-by as descend. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_Line_Desc() { regOBD("line"); return this; }

    protected ConditionValue _salesDate;
    public ConditionValue xdfgetSalesDate()
    { if (_salesDate == null) { _salesDate = nCV(); }
      return _salesDate; }
    protected ConditionValue xgetCValueSalesDate() { return xdfgetSalesDate(); }

    /** 
     * Add order-by as ascend. <br>
     * sales_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SalesDate_Asc() { regOBA("sales_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * sales_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SalesDate_Desc() { regOBD("sales_date"); return this; }

    protected ConditionValue _salesId;
    public ConditionValue xdfgetSalesId()
    { if (_salesId == null) { _salesId = nCV(); }
      return _salesId; }
    protected ConditionValue xgetCValueSalesId() { return xdfgetSalesId(); }

    /** 
     * Add order-by as ascend. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SalesId_Asc() { regOBA("sales_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SalesId_Desc() { regOBD("sales_id"); return this; }

    protected ConditionValue _cusId;
    public ConditionValue xdfgetCusId()
    { if (_cusId == null) { _cusId = nCV(); }
      return _cusId; }
    protected ConditionValue xgetCValueCusId() { return xdfgetCusId(); }

    /** 
     * Add order-by as ascend. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_CusId_Asc() { regOBA("cus_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_CusId_Desc() { regOBD("cus_id"); return this; }

    protected ConditionValue _prdId;
    public ConditionValue xdfgetPrdId()
    { if (_prdId == null) { _prdId = nCV(); }
      return _prdId; }
    protected ConditionValue xgetCValuePrdId() { return xdfgetPrdId(); }

    /** 
     * Add order-by as ascend. <br>
     * prd_id: {IX, NotNull, int4(10), FK to product}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_PrdId_Asc() { regOBA("prd_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * prd_id: {IX, NotNull, int4(10), FK to product}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_PrdId_Desc() { regOBD("prd_id"); return this; }

    protected ConditionValue _qty;
    public ConditionValue xdfgetQty()
    { if (_qty == null) { _qty = nCV(); }
      return _qty; }
    protected ConditionValue xgetCValueQty() { return xdfgetQty(); }

    /** 
     * Add order-by as ascend. <br>
     * qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_Qty_Asc() { regOBA("qty"); return this; }

    /**
     * Add order-by as descend. <br>
     * qty: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_Qty_Desc() { regOBD("qty"); return this; }

    protected ConditionValue _unit;
    public ConditionValue xdfgetUnit()
    { if (_unit == null) { _unit = nCV(); }
      return _unit; }
    protected ConditionValue xgetCValueUnit() { return xdfgetUnit(); }

    /** 
     * Add order-by as ascend. <br>
     * unit: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_Unit_Asc() { regOBA("unit"); return this; }

    /**
     * Add order-by as descend. <br>
     * unit: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_Unit_Desc() { regOBD("unit"); return this; }

    protected ConditionValue _unitPrice;
    public ConditionValue xdfgetUnitPrice()
    { if (_unitPrice == null) { _unitPrice = nCV(); }
      return _unitPrice; }
    protected ConditionValue xgetCValueUnitPrice() { return xdfgetUnitPrice(); }

    /** 
     * Add order-by as ascend. <br>
     * unit_price: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_UnitPrice_Asc() { regOBA("unit_price"); return this; }

    /**
     * Add order-by as descend. <br>
     * unit_price: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_UnitPrice_Desc() { regOBD("unit_price"); return this; }

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
    public BsSalesSlipCQ addOrderBy_SalesAmount_Asc() { regOBA("sales_amount"); return this; }

    /**
     * Add order-by as descend. <br>
     * sales_amount: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SalesAmount_Desc() { regOBD("sales_amount"); return this; }

    protected ConditionValue _slipAmount;
    public ConditionValue xdfgetSlipAmount()
    { if (_slipAmount == null) { _slipAmount = nCV(); }
      return _slipAmount; }
    protected ConditionValue xgetCValueSlipAmount() { return xdfgetSlipAmount(); }

    /** 
     * Add order-by as ascend. <br>
     * slip_amount: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SlipAmount_Asc() { regOBA("slip_amount"); return this; }

    /**
     * Add order-by as descend. <br>
     * slip_amount: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SlipAmount_Desc() { regOBD("slip_amount"); return this; }

    protected ConditionValue _slipCons;
    public ConditionValue xdfgetSlipCons()
    { if (_slipCons == null) { _slipCons = nCV(); }
      return _slipCons; }
    protected ConditionValue xgetCValueSlipCons() { return xdfgetSlipCons(); }

    /** 
     * Add order-by as ascend. <br>
     * slip_cons: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SlipCons_Asc() { regOBA("slip_cons"); return this; }

    /**
     * Add order-by as descend. <br>
     * slip_cons: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_SlipCons_Desc() { regOBD("slip_cons"); return this; }

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
    public BsSalesSlipCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * version_no: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

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
    public BsSalesSlipCQ addOrderBy_DelFlag_Asc() { regOBA("del_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_DelFlag_Desc() { regOBD("del_flag"); return this; }

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
    public BsSalesSlipCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsSalesSlipCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_user: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

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
    public BsSalesSlipCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_process: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

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
    public BsSalesSlipCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsSalesSlipCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_user: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

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
    public BsSalesSlipCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_process: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsSalesSlipCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

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
    public BsSalesSlipCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSalesSlipCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        SalesSlipCQ bq = (SalesSlipCQ)bqs;
        SalesSlipCQ uq = (SalesSlipCQ)uqs;
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
        if (bq.hasConditionQueryEmployee()) {
            uq.queryEmployee().reflectRelationOnUnionQuery(bq.queryEmployee(), uq.queryEmployee());
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
        String nrp = xresolveNRP("sales_slip", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    /**
     * Get the condition-query for relation table. <br>
     * employee by my sales_id, named 'employee'.
     * @return The instance of condition-query. (NotNull)
     */
    public EmployeeCQ queryEmployee() {
        return xdfgetConditionQueryEmployee();
    }
    public EmployeeCQ xdfgetConditionQueryEmployee() {
        String prop = "employee";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryEmployee()); xsetupOuterJoinEmployee(); }
        return xgetQueRlMap(prop);
    }
    protected EmployeeCQ xcreateQueryEmployee() {
        String nrp = xresolveNRP("sales_slip", "employee"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new EmployeeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "employee", nrp);
    }
    protected void xsetupOuterJoinEmployee() { xregOutJo("employee"); }
    public boolean hasConditionQueryEmployee() { return xhasQueRlMap("employee"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SalesSlipCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SalesSlipCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SalesSlipCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SalesSlipCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SalesSlipCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SalesSlipCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SalesSlipCQ> _myselfExistsMap;
    public Map<String, SalesSlipCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SalesSlipCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SalesSlipCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SalesSlipCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SalesSlipCB.class.getName(); }
    protected String xCQ() { return SalesSlipCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
