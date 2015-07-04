package dbfexample.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import dbfexample.dbflute.allcommon.*;
import dbfexample.dbflute.exentity.*;

/**
 * The DB meta of product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ProductDbm _instance = new ProductDbm();
    private ProductDbm() {}
    public static ProductDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Product)et).getId(), (et, vl) -> ((Product)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Product)et).getPrdCd(), (et, vl) -> ((Product)et).setPrdCd((String)vl), "prdCd");
        setupEpg(_epgMap, et -> ((Product)et).getPrdCat(), (et, vl) -> ((Product)et).setPrdCat((String)vl), "prdCat");
        setupEpg(_epgMap, et -> ((Product)et).getName(), (et, vl) -> ((Product)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((Product)et).getCost(), (et, vl) -> ((Product)et).setCost(cti(vl)), "cost");
        setupEpg(_epgMap, et -> ((Product)et).getPrice(), (et, vl) -> ((Product)et).setPrice(cti(vl)), "price");
        setupEpg(_epgMap, et -> ((Product)et).getPerQty(), (et, vl) -> ((Product)et).setPerQty(cti(vl)), "perQty");
        setupEpg(_epgMap, et -> ((Product)et).getUnit(), (et, vl) -> ((Product)et).setUnit((String)vl), "unit");
        setupEpg(_epgMap, et -> ((Product)et).getPurQty(), (et, vl) -> ((Product)et).setPurQty(cti(vl)), "purQty");
        setupEpg(_epgMap, et -> ((Product)et).getPurAmount(), (et, vl) -> ((Product)et).setPurAmount(ctl(vl)), "purAmount");
        setupEpg(_epgMap, et -> ((Product)et).getSalesQty(), (et, vl) -> ((Product)et).setSalesQty(cti(vl)), "salesQty");
        setupEpg(_epgMap, et -> ((Product)et).getSalesAmount(), (et, vl) -> ((Product)et).setSalesAmount(ctl(vl)), "salesAmount");
        setupEpg(_epgMap, et -> ((Product)et).getVersionNo(), (et, vl) -> ((Product)et).setVersionNo(cti(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((Product)et).getDelFlag(), (et, vl) -> ((Product)et).setDelFlag(cti(vl)), "delFlag");
        setupEpg(_epgMap, et -> ((Product)et).getRegisterDatetime(), (et, vl) -> ((Product)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Product)et).getRegisterUser(), (et, vl) -> ((Product)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Product)et).getRegisterProcess(), (et, vl) -> ((Product)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((Product)et).getUpdateDatetime(), (et, vl) -> ((Product)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Product)et).getUpdateUser(), (et, vl) -> ((Product)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Product)et).getUpdateProcess(), (et, vl) -> ((Product)et).setUpdateProcess((String)vl), "updateProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "product";
    protected final String _tableDispName = "product";
    protected final String _tablePropertyName = "product";
    protected final TableSqlName _tableSqlName = new TableSqlName("product", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, "nextval('product_id_seq'::regclass)", false, null, null, null, "salesSlipList,stockList", null, false);
    protected final ColumnInfo _columnPrdCd = cci("prd_cd", "prd_cd", null, null, String.class, "prdCd", null, false, false, true, "varchar", 40, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrdCat = cci("prd_cat", "prd_cat", null, null, String.class, "prdCat", null, false, false, true, "varchar", 40, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCost = cci("cost", "cost", null, null, Integer.class, "cost", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice = cci("price", "price", null, null, Integer.class, "price", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPerQty = cci("per_qty", "per_qty", null, null, Integer.class, "perQty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit = cci("unit", "unit", null, null, String.class, "unit", null, false, false, true, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurQty = cci("pur_qty", "pur_qty", null, null, Integer.class, "purQty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurAmount = cci("pur_amount", "pur_amount", null, null, Long.class, "purAmount", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesQty = cci("sales_qty", "sales_qty", null, null, Integer.class, "salesQty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesAmount = cci("sales_amount", "sales_amount", null, null, Long.class, "salesAmount", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, Integer.class, "versionNo", null, false, false, true, "int4", 10, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlag = cci("del_flag", "del_flag", null, null, Integer.class, "delFlag", null, false, false, true, "int4", 10, 0, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 29, 6, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, true, "varchar", 30, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, String.class, "registerProcess", null, false, false, true, "varchar", 30, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "timestamp", 29, 6, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, true, "varchar", 30, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, String.class, "updateProcess", null, false, false, true, "varchar", 30, 0, null, true, null, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * prd_cd: {UQ+, NotNull, varchar(40)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrdCd() { return _columnPrdCd; }
    /**
     * prd_cat: {NotNull, varchar(40)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrdCat() { return _columnPrdCat; }
    /**
     * name: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * cost: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCost() { return _columnCost; }
    /**
     * price: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrice() { return _columnPrice; }
    /**
     * per_qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPerQty() { return _columnPerQty; }
    /**
     * unit: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit() { return _columnUnit; }
    /**
     * pur_qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurQty() { return _columnPurQty; }
    /**
     * pur_amount: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurAmount() { return _columnPurAmount; }
    /**
     * sales_qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesQty() { return _columnSalesQty; }
    /**
     * sales_amount: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesAmount() { return _columnSalesAmount; }
    /**
     * version_no: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlag() { return _columnDelFlag; }
    /**
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_user: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * register_process: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_user: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * update_process: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnPrdCd());
        ls.add(columnPrdCat());
        ls.add(columnName());
        ls.add(columnCost());
        ls.add(columnPrice());
        ls.add(columnPerQty());
        ls.add(columnUnit());
        ls.add(columnPurQty());
        ls.add(columnPurAmount());
        ls.add(columnSalesQty());
        ls.add(columnSalesAmount());
        ls.add(columnVersionNo());
        ls.add(columnDelFlag());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPrdCd());
        ls.add(columnDelFlag());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * sales_slip by prd_id, named 'salesSlipList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSalesSlipList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), SalesSlipDbm.getInstance().columnPrdId());
        return cri("sales_slip_product_fkey", "salesSlipList", this, SalesSlipDbm.getInstance(), mp, false, "product");
    }
    /**
     * stock by prd_id, named 'stockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), StockDbm.getInstance().columnPrdId());
        return cri("stock_product_fkey", "stockList", this, StockDbm.getInstance(), mp, false, "product");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "product_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dbfexample.dbflute.exentity.Product"; }
    public String getConditionBeanTypeName() { return "dbfexample.dbflute.cbean.ProductCB"; }
    public String getBehaviorTypeName() { return "dbfexample.dbflute.exbhv.ProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Product> getEntityType() { return Product.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Product newEntity() { return new Product(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Product)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Product)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
