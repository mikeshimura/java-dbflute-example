package dbfexample.dbflute.cbean.nss;

import dbfexample.dbflute.cbean.cq.StockCQ;

/**
 * The nest select set-upper of stock.
 * @author DBFlute(AutoGenerator)
 */
public class StockNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final StockCQ _query;
    public StockNss(StockCQ query) { _query = query; }
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
}
