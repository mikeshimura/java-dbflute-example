package dbfexample.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import dbfexample.dbflute.allcommon.EntityDefinedCommonColumn;
import dbfexample.dbflute.allcommon.DBMetaInstanceHandler;
import dbfexample.dbflute.exentity.*;

/**
 * The entity of customer as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, cus_cd, name, addr, bldg, cus_con_sec, cus_con_name, tel, sales_amount, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 * 
 * [sequence]
 *     customer_id_seq
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
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String cusCd = entity.getCusCd();
 * String name = entity.getName();
 * String addr = entity.getAddr();
 * String bldg = entity.getBldg();
 * String cusConSec = entity.getCusConSec();
 * String cusConName = entity.getCusConName();
 * String tel = entity.getTel();
 * Long salesAmount = entity.getSalesAmount();
 * Integer versionNo = entity.getVersionNo();
 * Integer delFlag = entity.getDelFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * String registerProcess = entity.getRegisterProcess();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * String updateProcess = entity.getUpdateProcess();
 * entity.setId(id);
 * entity.setCusCd(cusCd);
 * entity.setName(name);
 * entity.setAddr(addr);
 * entity.setBldg(bldg);
 * entity.setCusConSec(cusConSec);
 * entity.setCusConName(cusConName);
 * entity.setTel(tel);
 * entity.setSalesAmount(salesAmount);
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
public abstract class BsCustomer extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** cus_cd: {UQ+, NotNull, varchar(40)} */
    protected String _cusCd;

    /** name: {NotNull, varchar(100)} */
    protected String _name;

    /** addr: {varchar(100)} */
    protected String _addr;

    /** bldg: {varchar(100)} */
    protected String _bldg;

    /** cus_con_sec: {varchar(100)} */
    protected String _cusConSec;

    /** cus_con_name: {varchar(100)} */
    protected String _cusConName;

    /** tel: {varchar(100)} */
    protected String _tel;

    /** sales_amount: {int8(19)} */
    protected Long _salesAmount;

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
        return "customer";
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
     * @param cusCd : UQ+, NotNull, varchar(40). (NotNull)
     * @param delFlag : +UQ, NotNull, int4(10), default=[0]. (NotNull)
     */
    public void uniqueBy(String cusCd, Integer delFlag) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("cusCd");
        __uniqueDrivenProperties.addPropertyName("delFlag");
        setCusCd(cusCd);setDelFlag(delFlag);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCustomer) {
            BsCustomer other = (BsCustomer)obj;
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
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_cusCd));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_addr));
        sb.append(dm).append(xfND(_bldg));
        sb.append(dm).append(xfND(_cusConSec));
        sb.append(dm).append(xfND(_cusConName));
        sb.append(dm).append(xfND(_tel));
        sb.append(dm).append(xfND(_salesAmount));
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
        return "";
    }

    @Override
    public Customer clone() {
        return (Customer)super.clone();
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
     * [get] cus_cd: {UQ+, NotNull, varchar(40)} <br>
     * @return The value of the column 'cus_cd'. (basically NotNull if selected: for the constraint)
     */
    public String getCusCd() {
        checkSpecifiedProperty("cusCd");
        return _cusCd;
    }

    /**
     * [set] cus_cd: {UQ+, NotNull, varchar(40)} <br>
     * @param cusCd The value of the column 'cus_cd'. (basically NotNull if update: for the constraint)
     */
    public void setCusCd(String cusCd) {
        registerModifiedProperty("cusCd");
        _cusCd = cusCd;
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
     * [get] addr: {varchar(100)} <br>
     * @return The value of the column 'addr'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddr() {
        checkSpecifiedProperty("addr");
        return _addr;
    }

    /**
     * [set] addr: {varchar(100)} <br>
     * @param addr The value of the column 'addr'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddr(String addr) {
        registerModifiedProperty("addr");
        _addr = addr;
    }

    /**
     * [get] bldg: {varchar(100)} <br>
     * @return The value of the column 'bldg'. (NullAllowed even if selected: for no constraint)
     */
    public String getBldg() {
        checkSpecifiedProperty("bldg");
        return _bldg;
    }

    /**
     * [set] bldg: {varchar(100)} <br>
     * @param bldg The value of the column 'bldg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBldg(String bldg) {
        registerModifiedProperty("bldg");
        _bldg = bldg;
    }

    /**
     * [get] cus_con_sec: {varchar(100)} <br>
     * @return The value of the column 'cus_con_sec'. (NullAllowed even if selected: for no constraint)
     */
    public String getCusConSec() {
        checkSpecifiedProperty("cusConSec");
        return _cusConSec;
    }

    /**
     * [set] cus_con_sec: {varchar(100)} <br>
     * @param cusConSec The value of the column 'cus_con_sec'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCusConSec(String cusConSec) {
        registerModifiedProperty("cusConSec");
        _cusConSec = cusConSec;
    }

    /**
     * [get] cus_con_name: {varchar(100)} <br>
     * @return The value of the column 'cus_con_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getCusConName() {
        checkSpecifiedProperty("cusConName");
        return _cusConName;
    }

    /**
     * [set] cus_con_name: {varchar(100)} <br>
     * @param cusConName The value of the column 'cus_con_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCusConName(String cusConName) {
        registerModifiedProperty("cusConName");
        _cusConName = cusConName;
    }

    /**
     * [get] tel: {varchar(100)} <br>
     * @return The value of the column 'tel'. (NullAllowed even if selected: for no constraint)
     */
    public String getTel() {
        checkSpecifiedProperty("tel");
        return _tel;
    }

    /**
     * [set] tel: {varchar(100)} <br>
     * @param tel The value of the column 'tel'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTel(String tel) {
        registerModifiedProperty("tel");
        _tel = tel;
    }

    /**
     * [get] sales_amount: {int8(19)} <br>
     * @return The value of the column 'sales_amount'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSalesAmount() {
        checkSpecifiedProperty("salesAmount");
        return _salesAmount;
    }

    /**
     * [set] sales_amount: {int8(19)} <br>
     * @param salesAmount The value of the column 'sales_amount'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesAmount(Long salesAmount) {
        registerModifiedProperty("salesAmount");
        _salesAmount = salesAmount;
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
