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
 * The DB meta of employee. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EmployeeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EmployeeDbm _instance = new EmployeeDbm();
    private EmployeeDbm() {}
    public static EmployeeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Employee)et).getId(), (et, vl) -> ((Employee)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Employee)et).getEmpCd(), (et, vl) -> ((Employee)et).setEmpCd((String)vl), "empCd");
        setupEpg(_epgMap, et -> ((Employee)et).getSecId(), (et, vl) -> ((Employee)et).setSecId(cti(vl)), "secId");
        setupEpg(_epgMap, et -> ((Employee)et).getName(), (et, vl) -> ((Employee)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((Employee)et).getVersionNo(), (et, vl) -> ((Employee)et).setVersionNo(cti(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((Employee)et).getDelFlag(), (et, vl) -> ((Employee)et).setDelFlag(cti(vl)), "delFlag");
        setupEpg(_epgMap, et -> ((Employee)et).getRegisterDatetime(), (et, vl) -> ((Employee)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Employee)et).getRegisterUser(), (et, vl) -> ((Employee)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Employee)et).getRegisterProcess(), (et, vl) -> ((Employee)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((Employee)et).getUpdateDatetime(), (et, vl) -> ((Employee)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Employee)et).getUpdateUser(), (et, vl) -> ((Employee)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Employee)et).getUpdateProcess(), (et, vl) -> ((Employee)et).setUpdateProcess((String)vl), "updateProcess");
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
        setupEfpg(_efpgMap, et -> ((Employee)et).getUserTable(), (et, vl) -> ((Employee)et).setUserTable((OptionalEntity<UserTable>)vl), "userTable");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "employee";
    protected final String _tableDispName = "employee";
    protected final String _tablePropertyName = "employee";
    protected final TableSqlName _tableSqlName = new TableSqlName("employee", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, "nextval('employee_id_seq'::regclass)", false, null, null, null, "salesSlipList", null, false);
    protected final ColumnInfo _columnEmpCd = cci("emp_cd", "emp_cd", null, null, String.class, "empCd", null, false, false, true, "varchar", 40, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSecId = cci("sec_id", "sec_id", null, null, Integer.class, "secId", null, false, false, true, "int4", 10, 0, null, false, null, null, "userTable", null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "varchar", 100, 0, null, false, null, null, null, null, null, false);
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
     * emp_cd: {UQ+, NotNull, varchar(40)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmpCd() { return _columnEmpCd; }
    /**
     * sec_id: {IX, NotNull, int4(10), FK to user_table}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSecId() { return _columnSecId; }
    /**
     * name: {NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
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
        ls.add(columnEmpCd());
        ls.add(columnSecId());
        ls.add(columnName());
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
        ls.add(columnEmpCd());
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
     * user_table by my sec_id, named 'userTable'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserTable() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSecId(), UserTableDbm.getInstance().columnId());
        return cfi("employee_sec_id_fkey", "userTable", this, UserTableDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "employeeList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * sales_slip by sales_id, named 'salesSlipList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSalesSlipList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), SalesSlipDbm.getInstance().columnSalesId());
        return cri("sales_slip_sales_id_fkey", "salesSlipList", this, SalesSlipDbm.getInstance(), mp, false, "employee");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "employee_id_seq"; }
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
    public String getEntityTypeName() { return "dbfexample.dbflute.exentity.Employee"; }
    public String getConditionBeanTypeName() { return "dbfexample.dbflute.cbean.EmployeeCB"; }
    public String getBehaviorTypeName() { return "dbfexample.dbflute.exbhv.EmployeeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Employee> getEntityType() { return Employee.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Employee newEntity() { return new Employee(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Employee)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Employee)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
