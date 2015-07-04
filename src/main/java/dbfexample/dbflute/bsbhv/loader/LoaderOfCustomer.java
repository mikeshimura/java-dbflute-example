package dbfexample.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dbfexample.dbflute.exbhv.*;
import dbfexample.dbflute.exentity.*;

/**
 * The referrer loader of customer as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, cus_cd, name, addr, bldg, cus_con_sec, cus_con_name, tel, sales_amount, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 *
 * [sequence]
 *     customer_id_seq
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCustomer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Customer> _selectedList;
    protected BehaviorSelector _selector;
    protected CustomerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCustomer ready(List<Customer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CustomerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CustomerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Customer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
