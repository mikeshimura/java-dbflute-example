package dbfexample.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import dbfexample.dbflute.allcommon.*;
import dbfexample.dbflute.exentity.*;

/**
 * The DB meta of stock. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class StockDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final StockDbm _instance = new StockDbm();
    private StockDbm() {}
    public static StockDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Stock)et).getId(), (et, vl) -> ((Stock)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Stock)et).getYyyymm(), (et, vl) -> ((Stock)et).setYyyymm((String)vl), "yyyymm");
        setupEpg(_epgMap, et -> ((Stock)et).getPrdId(), (et, vl) -> ((Stock)et).setPrdId(cti(vl)), "prdId");
        setupEpg(_epgMap, et -> ((Stock)et).getName(), (et, vl) -> ((Stock)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((Stock)et).getCost(), (et, vl) -> ((Stock)et).setCost(cti(vl)), "cost");
        setupEpg(_epgMap, et -> ((Stock)et).getPrice(), (et, vl) -> ((Stock)et).setPrice(cti(vl)), "price");
        setupEpg(_epgMap, et -> ((Stock)et).getUnit(), (et, vl) -> ((Stock)et).setUnit((String)vl), "unit");
        setupEpg(_epgMap, et -> ((Stock)et).getBeforeQty(), (et, vl) -> ((Stock)et).setBeforeQty(cti(vl)), "beforeQty");
        setupEpg(_epgMap, et -> ((Stock)et).getPurQty(), (et, vl) -> ((Stock)et).setPurQty(cti(vl)), "purQty");
        setupEpg(_epgMap, et -> ((Stock)et).getRcvQty(), (et, vl) -> ((Stock)et).setRcvQty(cti(vl)), "rcvQty");
        setupEpg(_epgMap, et -> ((Stock)et).getSalesQty(), (et, vl) -> ((Stock)et).setSalesQty(cti(vl)), "salesQty");
        setupEpg(_epgMap, et -> ((Stock)et).getOutQty(), (et, vl) -> ((Stock)et).setOutQty(cti(vl)), "outQty");
        setupEpg(_epgMap, et -> ((Stock)et).getStockQty(), (et, vl) -> ((Stock)et).setStockQty(cti(vl)), "stockQty");
        setupEpg(_epgMap, et -> ((Stock)et).getStockAmount(), (et, vl) -> ((Stock)et).setStockAmount(ctl(vl)), "stockAmount");
        setupEpg(_epgMap, et -> ((Stock)et).getVersionNo(), (et, vl) -> ((Stock)et).setVersionNo(cti(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((Stock)et).getDelFlag(), (et, vl) -> ((Stock)et).setDelFlag(cti(vl)), "delFlag");
        setupEpg(_epgMap, et -> ((Stock)et).getRegisterDatetime(), (et, vl) -> ((Stock)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Stock)et).getRegisterUser(), (et, vl) -> ((Stock)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Stock)et).getRegisterProcess(), (et, vl) -> ((Stock)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((Stock)et).getUpdateDatetime(), (et, vl) -> ((Stock)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Stock)et).getUpdateUser(), (et, vl) -> ((Stock)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Stock)et).getUpdateProcess(), (et, vl) -> ((Stock)et).setUpdateProcess((String)vl), "updateProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Stock)et).getProduct(), (et, vl) -> ((Stock)et).setProduct((OptionalEntity<Product>)vl), "product");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "stock";
    protected final String _tableDispName = "stock";
    protected final String _tablePropertyName = "stock";
    protected final TableSqlName _tableSqlName = new TableSqlName("stock", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, "nextval('stock_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYyyymm = cci("yyyymm", "yyyymm", null, null, String.class, "yyyymm", null, false, false, true, "varchar", 6, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrdId = cci("prd_id", "prd_id", null, null, Integer.class, "prdId", null, false, false, true, "int4", 10, 0, null, false, null, null, "product", null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCost = cci("cost", "cost", null, null, Integer.class, "cost", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice = cci("price", "price", null, null, Integer.class, "price", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit = cci("unit", "unit", null, null, String.class, "unit", null, false, false, true, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBeforeQty = cci("before_qty", "before_qty", null, null, Integer.class, "beforeQty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurQty = cci("pur_qty", "pur_qty", null, null, Integer.class, "purQty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvQty = cci("rcv_qty", "rcv_qty", null, null, Integer.class, "rcvQty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesQty = cci("sales_qty", "sales_qty", null, null, Integer.class, "salesQty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOutQty = cci("out_qty", "out_qty", null, null, Integer.class, "outQty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockQty = cci("stock_qty", "stock_qty", null, null, Integer.class, "stockQty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockAmount = cci("stock_amount", "stock_amount", null, null, Long.class, "stockAmount", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null, false);
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
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYyyymm() { return _columnYyyymm; }
    /**
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrdId() { return _columnPrdId; }
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
     * unit: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit() { return _columnUnit; }
    /**
     * before_qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBeforeQty() { return _columnBeforeQty; }
    /**
     * pur_qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurQty() { return _columnPurQty; }
    /**
     * rcv_qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvQty() { return _columnRcvQty; }
    /**
     * sales_qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesQty() { return _columnSalesQty; }
    /**
     * out_qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutQty() { return _columnOutQty; }
    /**
     * stock_qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockQty() { return _columnStockQty; }
    /**
     * stock_amount: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockAmount() { return _columnStockAmount; }
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
        ls.add(columnYyyymm());
        ls.add(columnPrdId());
        ls.add(columnName());
        ls.add(columnCost());
        ls.add(columnPrice());
        ls.add(columnUnit());
        ls.add(columnBeforeQty());
        ls.add(columnPurQty());
        ls.add(columnRcvQty());
        ls.add(columnSalesQty());
        ls.add(columnOutQty());
        ls.add(columnStockQty());
        ls.add(columnStockAmount());
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
        ls.add(columnYyyymm());
        ls.add(columnPrdId());
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
    /**
     * product by my prd_id, named 'product'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrdId(), ProductDbm.getInstance().columnId());
        return cfi("stock_product_fkey", "product", this, ProductDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "stockList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "stock_id_seq"; }
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
    public String getEntityTypeName() { return "dbfexample.dbflute.exentity.Stock"; }
    public String getConditionBeanTypeName() { return "dbfexample.dbflute.cbean.StockCB"; }
    public String getBehaviorTypeName() { return "dbfexample.dbflute.exbhv.StockBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Stock> getEntityType() { return Stock.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Stock newEntity() { return new Stock(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Stock)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Stock)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
