package dbfexample.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dbfexample.dbflute.exbhv.*;
import dbfexample.dbflute.exentity.*;
import dbfexample.dbflute.cbean.*;

/**
 * The referrer loader of user_table as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, table_name, key_1, key_2, s1_data, s2_data, s3_data, n1_data, n2_data, n3_data, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 *
 * [sequence]
 *     user_table_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     employee
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     employeeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUserTable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserTable> _selectedList;
    protected BehaviorSelector _selector;
    protected UserTableBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserTable ready(List<UserTable> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserTableBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserTableBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Employee> _referrerEmployee;

    /**
     * Load referrer of employeeList by the set-upper of referrer. <br>
     * employee by sec_id, named 'employeeList'.
     * <pre>
     * <span style="color: #0000C0">userTableBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userTableList</span>, <span style="color: #553000">tableLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tableLoader</span>.<span style="color: #CC4747">loadEmployee</span>(<span style="color: #553000">employeeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">employeeCB</span>.setupSelect...
     *         <span style="color: #553000">employeeCB</span>.query().set...
     *         <span style="color: #553000">employeeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">employeeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    employeeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (UserTable userTable : <span style="color: #553000">userTableList</span>) {
     *     ... = userTable.<span style="color: #CC4747">getEmployeeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSecId_InScope(pkList);
     * cb.query().addOrderBy_SecId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfEmployee> loadEmployee(ReferrerConditionSetupper<EmployeeCB> refCBLambda) {
        myBhv().loadEmployee(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerEmployee = refLs);
        return hd -> hd.handle(new LoaderOfEmployee().ready(_referrerEmployee, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserTable> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
