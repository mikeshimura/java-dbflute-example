package dbfexample.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dbfexample.dbflute.exbhv.*;
import dbfexample.dbflute.exentity.*;

/**
 * The referrer loader of sales_slip as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, slip_no, line, sales_date, sales_id, cus_id, prd_id, qty, unit, unit_price, sales_amount, slip_amount, slip_cons, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 *
 * [sequence]
 *     sales_slip_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     product, employee
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     product, employee
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSalesSlip {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SalesSlip> _selectedList;
    protected BehaviorSelector _selector;
    protected SalesSlipBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSalesSlip ready(List<SalesSlip> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SalesSlipBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SalesSlipBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfProduct _foreignProductLoader;
    public LoaderOfProduct pulloutProduct() {
        if (_foreignProductLoader == null)
        { _foreignProductLoader = new LoaderOfProduct().ready(myBhv().pulloutProduct(_selectedList), _selector); }
        return _foreignProductLoader;
    }

    protected LoaderOfEmployee _foreignEmployeeLoader;
    public LoaderOfEmployee pulloutEmployee() {
        if (_foreignEmployeeLoader == null)
        { _foreignEmployeeLoader = new LoaderOfEmployee().ready(myBhv().pulloutEmployee(_selectedList), _selector); }
        return _foreignEmployeeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SalesSlip> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
