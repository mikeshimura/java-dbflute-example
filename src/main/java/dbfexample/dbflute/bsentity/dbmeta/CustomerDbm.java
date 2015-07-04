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
 * The DB meta of customer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CustomerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CustomerDbm _instance = new CustomerDbm();
    private CustomerDbm() {}
    public static CustomerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Customer)et).getId(), (et, vl) -> ((Customer)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Customer)et).getCusCd(), (et, vl) -> ((Customer)et).setCusCd((String)vl), "cusCd");
        setupEpg(_epgMap, et -> ((Customer)et).getName(), (et, vl) -> ((Customer)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((Customer)et).getAddr(), (et, vl) -> ((Customer)et).setAddr((String)vl), "addr");
        setupEpg(_epgMap, et -> ((Customer)et).getBldg(), (et, vl) -> ((Customer)et).setBldg((String)vl), "bldg");
        setupEpg(_epgMap, et -> ((Customer)et).getCusConSec(), (et, vl) -> ((Customer)et).setCusConSec((String)vl), "cusConSec");
        setupEpg(_epgMap, et -> ((Customer)et).getCusConName(), (et, vl) -> ((Customer)et).setCusConName((String)vl), "cusConName");
        setupEpg(_epgMap, et -> ((Customer)et).getTel(), (et, vl) -> ((Customer)et).setTel((String)vl), "tel");
        setupEpg(_epgMap, et -> ((Customer)et).getSalesAmount(), (et, vl) -> ((Customer)et).setSalesAmount(ctl(vl)), "salesAmount");
        setupEpg(_epgMap, et -> ((Customer)et).getVersionNo(), (et, vl) -> ((Customer)et).setVersionNo(cti(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((Customer)et).getDelFlag(), (et, vl) -> ((Customer)et).setDelFlag(cti(vl)), "delFlag");
        setupEpg(_epgMap, et -> ((Customer)et).getRegisterDatetime(), (et, vl) -> ((Customer)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Customer)et).getRegisterUser(), (et, vl) -> ((Customer)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Customer)et).getRegisterProcess(), (et, vl) -> ((Customer)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((Customer)et).getUpdateDatetime(), (et, vl) -> ((Customer)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Customer)et).getUpdateUser(), (et, vl) -> ((Customer)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Customer)et).getUpdateProcess(), (et, vl) -> ((Customer)et).setUpdateProcess((String)vl), "updateProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "customer";
    protected final String _tableDispName = "customer";
    protected final String _tablePropertyName = "customer";
    protected final TableSqlName _tableSqlName = new TableSqlName("customer", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, "nextval('customer_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCusCd = cci("cus_cd", "cus_cd", null, null, String.class, "cusCd", null, false, false, true, "varchar", 40, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddr = cci("addr", "addr", null, null, String.class, "addr", null, false, false, false, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBldg = cci("bldg", "bldg", null, null, String.class, "bldg", null, false, false, false, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCusConSec = cci("cus_con_sec", "cus_con_sec", null, null, String.class, "cusConSec", null, false, false, false, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCusConName = cci("cus_con_name", "cus_con_name", null, null, String.class, "cusConName", null, false, false, false, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTel = cci("tel", "tel", null, null, String.class, "tel", null, false, false, false, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesAmount = cci("sales_amount", "sales_amount", null, null, Long.class, "salesAmount", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null, false);
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
     * cus_cd: {UQ+, NotNull, varchar(40)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCusCd() { return _columnCusCd; }
    /**
     * name: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * addr: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddr() { return _columnAddr; }
    /**
     * bldg: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldg() { return _columnBldg; }
    /**
     * cus_con_sec: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCusConSec() { return _columnCusConSec; }
    /**
     * cus_con_name: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCusConName() { return _columnCusConName; }
    /**
     * tel: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTel() { return _columnTel; }
    /**
     * sales_amount: {int8(19)}
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
        ls.add(columnCusCd());
        ls.add(columnName());
        ls.add(columnAddr());
        ls.add(columnBldg());
        ls.add(columnCusConSec());
        ls.add(columnCusConName());
        ls.add(columnTel());
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
        ls.add(columnCusCd());
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "customer_id_seq"; }
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
    public String getEntityTypeName() { return "dbfexample.dbflute.exentity.Customer"; }
    public String getConditionBeanTypeName() { return "dbfexample.dbflute.cbean.CustomerCB"; }
    public String getBehaviorTypeName() { return "dbfexample.dbflute.exbhv.CustomerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Customer> getEntityType() { return Customer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Customer newEntity() { return new Customer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Customer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Customer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
