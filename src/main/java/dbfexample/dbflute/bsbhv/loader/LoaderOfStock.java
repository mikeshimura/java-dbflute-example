package dbfexample.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dbfexample.dbflute.exbhv.*;
import dbfexample.dbflute.exentity.*;

/**
 * The referrer loader of stock as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, yyyymm, prd_id, name, cost, price, unit, before_qty, pur_qty, rcv_qty, sales_qty, out_qty, stock_qty, stock_amount, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 *
 * [sequence]
 *     stock_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     product
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     product
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfStock {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Stock> _selectedList;
    protected BehaviorSelector _selector;
    protected StockBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfStock ready(List<Stock> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected StockBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(StockBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfProduct _foreignProductLoader;
    public LoaderOfProduct pulloutProduct() {
        if (_foreignProductLoader == null)
        { _foreignProductLoader = new LoaderOfProduct().ready(myBhv().pulloutProduct(_selectedList), _selector); }
        return _foreignProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Stock> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
