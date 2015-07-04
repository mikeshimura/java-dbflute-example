package dbfexample.dbflute.cbean.nss;

import dbfexample.dbflute.cbean.cq.SalesSlipCQ;

/**
 * The nest select set-upper of sales_slip.
 * @author DBFlute(AutoGenerator)
 */
public class SalesSlipNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final SalesSlipCQ _query;
    public SalesSlipNss(SalesSlipCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * product by my prd_id, named 'product'.
     */
    public void withProduct() {
        _query.xdoNss(() -> _query.queryProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * employee by my sales_id, named 'employee'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public EmployeeNss withEmployee() {
        _query.xdoNss(() -> _query.queryEmployee());
        return new EmployeeNss(_query.queryEmployee());
    }
}
