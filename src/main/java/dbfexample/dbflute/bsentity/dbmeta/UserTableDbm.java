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
 * The DB meta of user_table. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserTableDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserTableDbm _instance = new UserTableDbm();
    private UserTableDbm() {}
    public static UserTableDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((UserTable)et).getId(), (et, vl) -> ((UserTable)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((UserTable)et).getTableName(), (et, vl) -> ((UserTable)et).setTableName((String)vl), "tableName");
        setupEpg(_epgMap, et -> ((UserTable)et).getKey1(), (et, vl) -> ((UserTable)et).setKey1((String)vl), "key1");
        setupEpg(_epgMap, et -> ((UserTable)et).getKey2(), (et, vl) -> ((UserTable)et).setKey2((String)vl), "key2");
        setupEpg(_epgMap, et -> ((UserTable)et).getS1Data(), (et, vl) -> ((UserTable)et).setS1Data((String)vl), "s1Data");
        setupEpg(_epgMap, et -> ((UserTable)et).getS2Data(), (et, vl) -> ((UserTable)et).setS2Data((String)vl), "s2Data");
        setupEpg(_epgMap, et -> ((UserTable)et).getS3Data(), (et, vl) -> ((UserTable)et).setS3Data((String)vl), "s3Data");
        setupEpg(_epgMap, et -> ((UserTable)et).getN1Data(), (et, vl) -> ((UserTable)et).setN1Data(ctb(vl)), "n1Data");
        setupEpg(_epgMap, et -> ((UserTable)et).getN2Data(), (et, vl) -> ((UserTable)et).setN2Data(ctb(vl)), "n2Data");
        setupEpg(_epgMap, et -> ((UserTable)et).getN3Data(), (et, vl) -> ((UserTable)et).setN3Data(ctb(vl)), "n3Data");
        setupEpg(_epgMap, et -> ((UserTable)et).getVersionNo(), (et, vl) -> ((UserTable)et).setVersionNo(cti(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((UserTable)et).getDelFlag(), (et, vl) -> ((UserTable)et).setDelFlag(cti(vl)), "delFlag");
        setupEpg(_epgMap, et -> ((UserTable)et).getRegisterDatetime(), (et, vl) -> ((UserTable)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((UserTable)et).getRegisterUser(), (et, vl) -> ((UserTable)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((UserTable)et).getRegisterProcess(), (et, vl) -> ((UserTable)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((UserTable)et).getUpdateDatetime(), (et, vl) -> ((UserTable)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((UserTable)et).getUpdateUser(), (et, vl) -> ((UserTable)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((UserTable)et).getUpdateProcess(), (et, vl) -> ((UserTable)et).setUpdateProcess((String)vl), "updateProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user_table";
    protected final String _tableDispName = "user_table";
    protected final String _tablePropertyName = "userTable";
    protected final TableSqlName _tableSqlName = new TableSqlName("user_table", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, "nextval('user_table_id_seq'::regclass)", false, null, null, null, "employeeList", null, false);
    protected final ColumnInfo _columnTableName = cci("table_name", "table_name", null, null, String.class, "tableName", null, false, false, true, "varchar", 40, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKey1 = cci("key_1", "key_1", null, null, String.class, "key1", null, false, false, true, "varchar", 40, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKey2 = cci("key_2", "key_2", null, null, String.class, "key2", null, false, false, true, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnS1Data = cci("s1_data", "s1_data", null, null, String.class, "s1Data", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnS2Data = cci("s2_data", "s2_data", null, null, String.class, "s2Data", null, false, false, false, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnS3Data = cci("s3_data", "s3_data", null, null, String.class, "s3Data", null, false, false, false, "varchar", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnN1Data = cci("n1_data", "n1_data", null, null, java.math.BigDecimal.class, "n1Data", null, false, false, false, "numeric", 20, 2, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnN2Data = cci("n2_data", "n2_data", null, null, java.math.BigDecimal.class, "n2Data", null, false, false, false, "numeric", 20, 2, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnN3Data = cci("n3_data", "n3_data", null, null, java.math.BigDecimal.class, "n3Data", null, false, false, false, "numeric", 20, 2, null, false, null, null, null, null, null, false);
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
     * table_name: {UQ+, NotNull, varchar(40)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTableName() { return _columnTableName; }
    /**
     * key_1: {+UQ, NotNull, varchar(40)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKey1() { return _columnKey1; }
    /**
     * key_2: {+UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKey2() { return _columnKey2; }
    /**
     * s1_data: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnS1Data() { return _columnS1Data; }
    /**
     * s2_data: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnS2Data() { return _columnS2Data; }
    /**
     * s3_data: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnS3Data() { return _columnS3Data; }
    /**
     * n1_data: {numeric(20, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnN1Data() { return _columnN1Data; }
    /**
     * n2_data: {numeric(20, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnN2Data() { return _columnN2Data; }
    /**
     * n3_data: {numeric(20, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnN3Data() { return _columnN3Data; }
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
        ls.add(columnTableName());
        ls.add(columnKey1());
        ls.add(columnKey2());
        ls.add(columnS1Data());
        ls.add(columnS2Data());
        ls.add(columnS3Data());
        ls.add(columnN1Data());
        ls.add(columnN2Data());
        ls.add(columnN3Data());
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
        ls.add(columnTableName());
        ls.add(columnKey1());
        ls.add(columnKey2());
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
     * employee by sec_id, named 'employeeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerEmployeeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), EmployeeDbm.getInstance().columnSecId());
        return cri("employee_sec_id_fkey", "employeeList", this, EmployeeDbm.getInstance(), mp, false, "userTable");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "user_table_id_seq"; }
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
    public String getEntityTypeName() { return "dbfexample.dbflute.exentity.UserTable"; }
    public String getConditionBeanTypeName() { return "dbfexample.dbflute.cbean.UserTableCB"; }
    public String getBehaviorTypeName() { return "dbfexample.dbflute.exbhv.UserTableBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserTable> getEntityType() { return UserTable.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserTable newEntity() { return new UserTable(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserTable)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserTable)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
