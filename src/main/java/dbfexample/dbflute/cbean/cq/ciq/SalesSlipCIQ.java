package dbfexample.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import dbfexample.dbflute.cbean.*;
import dbfexample.dbflute.cbean.cq.bs.*;
import dbfexample.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of sales_slip.
 * @author DBFlute(AutoGenerator)
 */
public class SalesSlipCIQ extends AbstractBsSalesSlipCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSalesSlipCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SalesSlipCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSalesSlipCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueId() { return _myCQ.xdfgetId(); }
    protected ConditionValue xgetCValueSlipNo() { return _myCQ.xdfgetSlipNo(); }
    protected ConditionValue xgetCValueLine() { return _myCQ.xdfgetLine(); }
    protected ConditionValue xgetCValueSalesDate() { return _myCQ.xdfgetSalesDate(); }
    protected ConditionValue xgetCValueSalesId() { return _myCQ.xdfgetSalesId(); }
    protected ConditionValue xgetCValueCusId() { return _myCQ.xdfgetCusId(); }
    protected ConditionValue xgetCValuePrdId() { return _myCQ.xdfgetPrdId(); }
    protected ConditionValue xgetCValueQty() { return _myCQ.xdfgetQty(); }
    protected ConditionValue xgetCValueUnit() { return _myCQ.xdfgetUnit(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValueSalesAmount() { return _myCQ.xdfgetSalesAmount(); }
    protected ConditionValue xgetCValueSlipAmount() { return _myCQ.xdfgetSlipAmount(); }
    protected ConditionValue xgetCValueSlipCons() { return _myCQ.xdfgetSlipCons(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected ConditionValue xgetCValueDelFlag() { return _myCQ.xdfgetDelFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueRegisterUser() { return _myCQ.xdfgetRegisterUser(); }
    protected ConditionValue xgetCValueRegisterProcess() { return _myCQ.xdfgetRegisterProcess(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected ConditionValue xgetCValueUpdateUser() { return _myCQ.xdfgetUpdateUser(); }
    protected ConditionValue xgetCValueUpdateProcess() { return _myCQ.xdfgetUpdateProcess(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(SalesSlipCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SalesSlipCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SalesSlipCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SalesSlipCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SalesSlipCB.class.getName(); }
    protected String xinCQ() { return SalesSlipCQ.class.getName(); }
}
