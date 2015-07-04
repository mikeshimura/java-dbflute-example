package dbfexample.dbflute.cbean.nss;

import dbfexample.dbflute.cbean.cq.EmployeeCQ;

/**
 * The nest select set-upper of employee.
 * @author DBFlute(AutoGenerator)
 */
public class EmployeeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final EmployeeCQ _query;
    public EmployeeNss(EmployeeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * user_table by my sec_id, named 'userTable'.
     */
    public void withUserTable() {
        _query.xdoNss(() -> _query.queryUserTable());
    }
}
