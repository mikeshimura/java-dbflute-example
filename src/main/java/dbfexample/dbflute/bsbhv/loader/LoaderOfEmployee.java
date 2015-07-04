package dbfexample.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dbfexample.dbflute.exbhv.*;
import dbfexample.dbflute.exentity.*;
import dbfexample.dbflute.cbean.*;

/**
 * The referrer loader of employee as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, emp_cd, sec_id, name, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 *
 * [sequence]
 *     employee_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     user_table
 *
 * [referrer table]
 *     sales_slip
 *
 * [foreign property]
 *     userTable
 *
 * [referrer property]
 *     salesSlipList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfEmployee {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Employee> _selectedList;
    protected BehaviorSelector _selector;
    protected EmployeeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEmployee ready(List<Employee> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EmployeeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EmployeeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<SalesSlip> _referrerSalesSlip;

    /**
     * Load referrer of salesSlipList by the set-upper of referrer. <br>
     * sales_slip by sales_id, named 'salesSlipList'.
     * <pre>
     * <span style="color: #0000C0">employeeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">employeeList</span>, <span style="color: #553000">employeeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">employeeLoader</span>.<span style="color: #CC4747">loadSalesSlip</span>(<span style="color: #553000">slipCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">slipCB</span>.setupSelect...
     *         <span style="color: #553000">slipCB</span>.query().set...
     *         <span style="color: #553000">slipCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">slipLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    slipLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Employee employee : <span style="color: #553000">employeeList</span>) {
     *     ... = employee.<span style="color: #CC4747">getSalesSlipList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesId_InScope(pkList);
     * cb.query().addOrderBy_SalesId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSalesSlip> loadSalesSlip(ReferrerConditionSetupper<SalesSlipCB> refCBLambda) {
        myBhv().loadSalesSlip(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSalesSlip = refLs);
        return hd -> hd.handle(new LoaderOfSalesSlip().ready(_referrerSalesSlip, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUserTable _foreignUserTableLoader;
    public LoaderOfUserTable pulloutUserTable() {
        if (_foreignUserTableLoader == null)
        { _foreignUserTableLoader = new LoaderOfUserTable().ready(myBhv().pulloutUserTable(_selectedList), _selector); }
        return _foreignUserTableLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Employee> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
