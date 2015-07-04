package dbfexample.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import dbfexample.dbflute.exbhv.*;
import dbfexample.dbflute.exentity.*;
import dbfexample.dbflute.cbean.*;

/**
 * The referrer loader of product as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, prd_cd, prd_cat, name, cost, price, per_qty, unit, pur_qty, pur_amount, sales_qty, sales_amount, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 *
 * [sequence]
 *     product_id_seq
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
 *     sales_slip, stock
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     salesSlipList, stockList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Product> _selectedList;
    protected BehaviorSelector _selector;
    protected ProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfProduct ready(List<Product> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<SalesSlip> _referrerSalesSlip;

    /**
     * Load referrer of salesSlipList by the set-upper of referrer. <br>
     * sales_slip by prd_id, named 'salesSlipList'.
     * <pre>
     * <span style="color: #0000C0">productBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadSalesSlip</span>(<span style="color: #553000">slipCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">slipCB</span>.setupSelect...
     *         <span style="color: #553000">slipCB</span>.query().set...
     *         <span style="color: #553000">slipCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">slipLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    slipLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Product product : <span style="color: #553000">productList</span>) {
     *     ... = product.<span style="color: #CC4747">getSalesSlipList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrdId_InScope(pkList);
     * cb.query().addOrderBy_PrdId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSalesSlip> loadSalesSlip(ReferrerConditionSetupper<SalesSlipCB> refCBLambda) {
        myBhv().loadSalesSlip(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSalesSlip = refLs);
        return hd -> hd.handle(new LoaderOfSalesSlip().ready(_referrerSalesSlip, _selector));
    }

    protected List<Stock> _referrerStock;

    /**
     * Load referrer of stockList by the set-upper of referrer. <br>
     * stock by prd_id, named 'stockList'.
     * <pre>
     * <span style="color: #0000C0">productBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadStock</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Product product : <span style="color: #553000">productList</span>) {
     *     ... = product.<span style="color: #CC4747">getStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrdId_InScope(pkList);
     * cb.query().addOrderBy_PrdId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfStock> loadStock(ReferrerConditionSetupper<StockCB> refCBLambda) {
        myBhv().loadStock(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerStock = refLs);
        return hd -> hd.handle(new LoaderOfStock().ready(_referrerStock, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Product> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
