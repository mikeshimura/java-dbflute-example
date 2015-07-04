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
 * The DB meta of sales_slip. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SalesSlipDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SalesSlipDbm _instance = new SalesSlipDbm();
    private SalesSlipDbm() {}
    public static SalesSlipDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SalesSlip)et).getId(), (et, vl) -> ((SalesSlip)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getSlipNo(), (et, vl) -> ((SalesSlip)et).setSlipNo(cti(vl)), "slipNo");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getLine(), (et, vl) -> ((SalesSlip)et).setLine(cti(vl)), "line");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getSalesDate(), (et, vl) -> ((SalesSlip)et).setSalesDate(ctld(vl)), "salesDate");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getSalesId(), (et, vl) -> ((SalesSlip)et).setSalesId(cti(vl)), "salesId");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getCusId(), (et, vl) -> ((SalesSlip)et).setCusId(cti(vl)), "cusId");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getPrdId(), (et, vl) -> ((SalesSlip)et).setPrdId(cti(vl)), "prdId");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getQty(), (et, vl) -> ((SalesSlip)et).setQty(cti(vl)), "qty");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getUnit(), (et, vl) -> ((SalesSlip)et).setUnit((String)vl), "unit");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getUnitPrice(), (et, vl) -> ((SalesSlip)et).setUnitPrice(cti(vl)), "unitPrice");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getSalesAmount(), (et, vl) -> ((SalesSlip)et).setSalesAmount(ctl(vl)), "salesAmount");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getSlipAmount(), (et, vl) -> ((SalesSlip)et).setSlipAmount(ctl(vl)), "slipAmount");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getSlipCons(), (et, vl) -> ((SalesSlip)et).setSlipCons(ctl(vl)), "slipCons");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getVersionNo(), (et, vl) -> ((SalesSlip)et).setVersionNo(cti(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getDelFlag(), (et, vl) -> ((SalesSlip)et).setDelFlag(cti(vl)), "delFlag");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getRegisterDatetime(), (et, vl) -> ((SalesSlip)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getRegisterUser(), (et, vl) -> ((SalesSlip)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getRegisterProcess(), (et, vl) -> ((SalesSlip)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getUpdateDatetime(), (et, vl) -> ((SalesSlip)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getUpdateUser(), (et, vl) -> ((SalesSlip)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((SalesSlip)et).getUpdateProcess(), (et, vl) -> ((SalesSlip)et).setUpdateProcess((String)vl), "updateProcess");
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
        setupEfpg(_efpgMap, et -> ((SalesSlip)et).getProduct(), (et, vl) -> ((SalesSlip)et).setProduct((OptionalEntity<Product>)vl), "product");
        setupEfpg(_efpgMap, et -> ((SalesSlip)et).getEmployee(), (et, vl) -> ((SalesSlip)et).setEmployee((OptionalEntity<Employee>)vl), "employee");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "sales_slip";
    protected final String _tableDispName = "sales_slip";
    protected final String _tablePropertyName = "salesSlip";
    protected final TableSqlName _tableSqlName = new TableSqlName("sales_slip", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, "nextval('sales_slip_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipNo = cci("slip_no", "slip_no", null, null, Integer.class, "slipNo", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLine = cci("line", "line", null, null, Integer.class, "line", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesDate = cci("sales_date", "sales_date", null, null, java.time.LocalDate.class, "salesDate", null, false, false, true, "date", 13, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesId = cci("sales_id", "sales_id", null, null, Integer.class, "salesId", null, false, false, true, "int4", 10, 0, null, false, null, null, "employee", null, null, false);
    protected final ColumnInfo _columnCusId = cci("cus_id", "cus_id", null, null, Integer.class, "cusId", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrdId = cci("prd_id", "prd_id", null, null, Integer.class, "prdId", null, false, false, true, "int4", 10, 0, null, false, null, null, "product", null, null, false);
    protected final ColumnInfo _columnQty = cci("qty", "qty", null, null, Integer.class, "qty", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit = cci("unit", "unit", null, null, String.class, "unit", null, false, false, true, "varchar", 30, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("unit_price", "unit_price", null, null, Integer.class, "unitPrice", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesAmount = cci("sales_amount", "sales_amount", null, null, Long.class, "salesAmount", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipAmount = cci("slip_amount", "slip_amount", null, null, Long.class, "slipAmount", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipCons = cci("slip_cons", "slip_cons", null, null, Long.class, "slipCons", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null, false);
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
     * slip_no: {UQ+, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipNo() { return _columnSlipNo; }
    /**
     * line: {+UQ, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLine() { return _columnLine; }
    /**
     * sales_date: {NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesDate() { return _columnSalesDate; }
    /**
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesId() { return _columnSalesId; }
    /**
     * cus_id: {IX, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCusId() { return _columnCusId; }
    /**
     * prd_id: {IX, NotNull, int4(10), FK to product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrdId() { return _columnPrdId; }
    /**
     * qty: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty() { return _columnQty; }
    /**
     * unit: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit() { return _columnUnit; }
    /**
     * unit_price: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitPrice() { return _columnUnitPrice; }
    /**
     * sales_amount: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesAmount() { return _columnSalesAmount; }
    /**
     * slip_amount: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipAmount() { return _columnSlipAmount; }
    /**
     * slip_cons: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipCons() { return _columnSlipCons; }
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
        ls.add(columnSlipNo());
        ls.add(columnLine());
        ls.add(columnSalesDate());
        ls.add(columnSalesId());
        ls.add(columnCusId());
        ls.add(columnPrdId());
        ls.add(columnQty());
        ls.add(columnUnit());
        ls.add(columnUnitPrice());
        ls.add(columnSalesAmount());
        ls.add(columnSlipAmount());
        ls.add(columnSlipCons());
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
        ls.add(columnSlipNo());
        ls.add(columnLine());
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
        return cfi("sales_slip_product_fkey", "product", this, ProductDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "salesSlipList", false);
    }
    /**
     * employee by my sales_id, named 'employee'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignEmployee() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSalesId(), EmployeeDbm.getInstance().columnId());
        return cfi("sales_slip_sales_id_fkey", "employee", this, EmployeeDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "salesSlipList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "sales_slip_id_seq"; }
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
    public String getEntityTypeName() { return "dbfexample.dbflute.exentity.SalesSlip"; }
    public String getConditionBeanTypeName() { return "dbfexample.dbflute.cbean.SalesSlipCB"; }
    public String getBehaviorTypeName() { return "dbfexample.dbflute.exbhv.SalesSlipBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SalesSlip> getEntityType() { return SalesSlip.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SalesSlip newEntity() { return new SalesSlip(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SalesSlip)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SalesSlip)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
