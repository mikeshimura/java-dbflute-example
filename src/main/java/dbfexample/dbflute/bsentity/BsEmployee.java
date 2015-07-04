package dbfexample.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import dbfexample.dbflute.allcommon.EntityDefinedCommonColumn;
import dbfexample.dbflute.allcommon.DBMetaInstanceHandler;
import dbfexample.dbflute.exentity.*;

/**
 * The entity of employee as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, emp_cd, sec_id, name, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 * 
 * [sequence]
 *     employee_id_seq
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     version_no
 * 
 * [foreign table]
 *     user_table
 * 
 * [referrer table]
 *     sales_slip
 * 
 * [foreign property]
 *     userTable
 * 
 * [referrer property]
 *     salesSlipList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String empCd = entity.getEmpCd();
 * Integer secId = entity.getSecId();
 * String name = entity.getName();
 * Integer versionNo = entity.getVersionNo();
 * Integer delFlag = entity.getDelFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * String registerProcess = entity.getRegisterProcess();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * String updateProcess = entity.getUpdateProcess();
 * entity.setId(id);
 * entity.setEmpCd(empCd);
 * entity.setSecId(secId);
 * entity.setName(name);
 * entity.setVersionNo(versionNo);
 * entity.setDelFlag(delFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setRegisterProcess(registerProcess);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setUpdateProcess(updateProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEmployee extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, serial(10)} */
    protected Integer _id;

    /** emp_cd: {UQ+, NotNull, varchar(40)} */
    protected String _empCd;

    /** sec_id: {IX, NotNull, int4(10), FK to user_table} */
    protected Integer _secId;

    /** name: {NotNull, varchar(100)} */
    protected String _name;

    /** version_no: {NotNull, int4(10)} */
    protected Integer _versionNo;

    /** del_flag: {+UQ, NotNull, int4(10), default=[0]} */
    protected Integer _delFlag;

    /** register_datetime: {NotNull, timestamp(29, 6)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_user: {NotNull, varchar(30)} */
    protected String _registerUser;

    /** register_process: {NotNull, varchar(30)} */
    protected String _registerProcess;

    /** update_datetime: {NotNull, timestamp(29, 6)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_user: {NotNull, varchar(30)} */
    protected String _updateUser;

    /** update_process: {NotNull, varchar(30)} */
    protected String _updateProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "employee";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param empCd : UQ+, NotNull, varchar(40). (NotNull)
     * @param delFlag : +UQ, NotNull, int4(10), default=[0]. (NotNull)
     */
    public void uniqueBy(String empCd, Integer delFlag) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("empCd");
        __uniqueDrivenProperties.addPropertyName("delFlag");
        setEmpCd(empCd);setDelFlag(delFlag);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** user_table by my sec_id, named 'userTable'. */
    protected OptionalEntity<UserTable> _userTable;

    /**
     * [get] user_table by my sec_id, named 'userTable'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userTable'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<UserTable> getUserTable() {
        if (_userTable == null) { _userTable = OptionalEntity.relationEmpty(this, "userTable"); }
        return _userTable;
    }

    /**
     * [set] user_table by my sec_id, named 'userTable'.
     * @param userTable The entity of foreign property 'userTable'. (NullAllowed)
     */
    public void setUserTable(OptionalEntity<UserTable> userTable) {
        _userTable = userTable;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** sales_slip by sales_id, named 'salesSlipList'. */
    protected List<SalesSlip> _salesSlipList;

    /**
     * [get] sales_slip by sales_id, named 'salesSlipList'.
     * @return The entity list of referrer property 'salesSlipList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SalesSlip> getSalesSlipList() {
        if (_salesSlipList == null) { _salesSlipList = newReferrerList(); }
        return _salesSlipList;
    }

    /**
     * [set] sales_slip by sales_id, named 'salesSlipList'.
     * @param salesSlipList The entity list of referrer property 'salesSlipList'. (NullAllowed)
     */
    public void setSalesSlipList(List<SalesSlip> salesSlipList) {
        _salesSlipList = salesSlipList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsEmployee) {
            BsEmployee other = (BsEmployee)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userTable != null && _userTable.isPresent())
        { sb.append(li).append(xbRDS(_userTable, "userTable")); }
        if (_salesSlipList != null) { for (SalesSlip et : _salesSlipList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "salesSlipList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_empCd));
        sb.append(dm).append(xfND(_secId));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_delFlag));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_updateProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userTable != null && _userTable.isPresent())
        { sb.append(dm).append("userTable"); }
        if (_salesSlipList != null && !_salesSlipList.isEmpty())
        { sb.append(dm).append("salesSlipList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Employee clone() {
        return (Employee)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, serial(10)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] emp_cd: {UQ+, NotNull, varchar(40)} <br>
     * @return The value of the column 'emp_cd'. (basically NotNull if selected: for the constraint)
     */
    public String getEmpCd() {
        checkSpecifiedProperty("empCd");
        return _empCd;
    }

    /**
     * [set] emp_cd: {UQ+, NotNull, varchar(40)} <br>
     * @param empCd The value of the column 'emp_cd'. (basically NotNull if update: for the constraint)
     */
    public void setEmpCd(String empCd) {
        registerModifiedProperty("empCd");
        _empCd = empCd;
    }

    /**
     * [get] sec_id: {IX, NotNull, int4(10), FK to user_table} <br>
     * @return The value of the column 'sec_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSecId() {
        checkSpecifiedProperty("secId");
        return _secId;
    }

    /**
     * [set] sec_id: {IX, NotNull, int4(10), FK to user_table} <br>
     * @param secId The value of the column 'sec_id'. (basically NotNull if update: for the constraint)
     */
    public void setSecId(Integer secId) {
        registerModifiedProperty("secId");
        _secId = secId;
    }

    /**
     * [get] name: {NotNull, varchar(100)} <br>
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {NotNull, varchar(100)} <br>
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] version_no: {NotNull, int4(10)} <br>
     * @return The value of the column 'version_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] version_no: {NotNull, int4(10)} <br>
     * @param versionNo The value of the column 'version_no'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] del_flag: {+UQ, NotNull, int4(10), default=[0]} <br>
     * @return The value of the column 'del_flag'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDelFlag() {
        checkSpecifiedProperty("delFlag");
        return _delFlag;
    }

    /**
     * [set] del_flag: {+UQ, NotNull, int4(10), default=[0]} <br>
     * @param delFlag The value of the column 'del_flag'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlag(Integer delFlag) {
        registerModifiedProperty("delFlag");
        _delFlag = delFlag;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(29, 6)} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(29, 6)} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_user: {NotNull, varchar(30)} <br>
     * @return The value of the column 'register_user'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] register_user: {NotNull, varchar(30)} <br>
     * @param registerUser The value of the column 'register_user'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] register_process: {NotNull, varchar(30)} <br>
     * @return The value of the column 'register_process'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] register_process: {NotNull, varchar(30)} <br>
     * @param registerProcess The value of the column 'register_process'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        registerModifiedProperty("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] update_datetime: {NotNull, timestamp(29, 6)} <br>
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, timestamp(29, 6)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_user: {NotNull, varchar(30)} <br>
     * @return The value of the column 'update_user'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] update_user: {NotNull, varchar(30)} <br>
     * @param updateUser The value of the column 'update_user'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] update_process: {NotNull, varchar(30)} <br>
     * @return The value of the column 'update_process'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] update_process: {NotNull, varchar(30)} <br>
     * @param updateProcess The value of the column 'update_process'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        registerModifiedProperty("updateProcess");
        _updateProcess = updateProcess;
    }
}
