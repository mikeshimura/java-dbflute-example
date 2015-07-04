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
 * The entity of sales_slip as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, slip_no, line, sales_date, sales_id, cus_id, prd_id, qty, unit, unit_price, sales_amount, slip_amount, slip_cons, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 * 
 * [sequence]
 *     sales_slip_id_seq
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     version_no
 * 
 * [foreign table]
 *     product, employee
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     product, employee
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * Integer slipNo = entity.getSlipNo();
 * Integer line = entity.getLine();
 * java.time.LocalDate salesDate = entity.getSalesDate();
 * Integer salesId = entity.getSalesId();
 * Integer cusId = entity.getCusId();
 * Integer prdId = entity.getPrdId();
 * Integer qty = entity.getQty();
 * String unit = entity.getUnit();
 * Integer unitPrice = entity.getUnitPrice();
 * Long salesAmount = entity.getSalesAmount();
 * Long slipAmount = entity.getSlipAmount();
 * Long slipCons = entity.getSlipCons();
 * Integer versionNo = entity.getVersionNo();
 * Integer delFlag = entity.getDelFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * String registerProcess = entity.getRegisterProcess();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * String updateProcess = entity.getUpdateProcess();
 * entity.setId(id);
 * entity.setSlipNo(slipNo);
 * entity.setLine(line);
 * entity.setSalesDate(salesDate);
 * entity.setSalesId(salesId);
 * entity.setCusId(cusId);
 * entity.setPrdId(prdId);
 * entity.setQty(qty);
 * entity.setUnit(unit);
 * entity.setUnitPrice(unitPrice);
 * entity.setSalesAmount(salesAmount);
 * entity.setSlipAmount(slipAmount);
 * entity.setSlipCons(slipCons);
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
public abstract class BsSalesSlip extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** slip_no: {UQ+, NotNull, int4(10)} */
    protected Integer _slipNo;

    /** line: {+UQ, NotNull, int4(10)} */
    protected Integer _line;

    /** sales_date: {NotNull, date(13)} */
    protected java.time.LocalDate _salesDate;

    /** sales_id: {IX, NotNull, int4(10), FK to employee} */
    protected Integer _salesId;

    /** cus_id: {IX, NotNull, int4(10)} */
    protected Integer _cusId;

    /** prd_id: {IX, NotNull, int4(10), FK to product} */
    protected Integer _prdId;

    /** qty: {NotNull, int4(10)} */
    protected Integer _qty;

    /** unit: {NotNull, varchar(30)} */
    protected String _unit;

    /** unit_price: {NotNull, int4(10)} */
    protected Integer _unitPrice;

    /** sales_amount: {NotNull, int8(19)} */
    protected Long _salesAmount;

    /** slip_amount: {NotNull, int8(19)} */
    protected Long _slipAmount;

    /** slip_cons: {NotNull, int8(19)} */
    protected Long _slipCons;

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
        return "sales_slip";
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
     * @param slipNo : UQ+, NotNull, int4(10). (NotNull)
     * @param line : +UQ, NotNull, int4(10). (NotNull)
     * @param delFlag : +UQ, NotNull, int4(10), default=[0]. (NotNull)
     */
    public void uniqueBy(Integer slipNo, Integer line, Integer delFlag) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("slipNo");
        __uniqueDrivenProperties.addPropertyName("line");
        __uniqueDrivenProperties.addPropertyName("delFlag");
        setSlipNo(slipNo);setLine(line);setDelFlag(delFlag);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** product by my prd_id, named 'product'. */
    protected OptionalEntity<Product> _product;

    /**
     * [get] product by my prd_id, named 'product'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'product'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Product> getProduct() {
        if (_product == null) { _product = OptionalEntity.relationEmpty(this, "product"); }
        return _product;
    }

    /**
     * [set] product by my prd_id, named 'product'.
     * @param product The entity of foreign property 'product'. (NullAllowed)
     */
    public void setProduct(OptionalEntity<Product> product) {
        _product = product;
    }

    /** employee by my sales_id, named 'employee'. */
    protected OptionalEntity<Employee> _employee;

    /**
     * [get] employee by my sales_id, named 'employee'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'employee'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Employee> getEmployee() {
        if (_employee == null) { _employee = OptionalEntity.relationEmpty(this, "employee"); }
        return _employee;
    }

    /**
     * [set] employee by my sales_id, named 'employee'.
     * @param employee The entity of foreign property 'employee'. (NullAllowed)
     */
    public void setEmployee(OptionalEntity<Employee> employee) {
        _employee = employee;
    }

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
        if (obj instanceof BsSalesSlip) {
            BsSalesSlip other = (BsSalesSlip)obj;
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
        if (_product != null && _product.isPresent())
        { sb.append(li).append(xbRDS(_product, "product")); }
        if (_employee != null && _employee.isPresent())
        { sb.append(li).append(xbRDS(_employee, "employee")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_slipNo));
        sb.append(dm).append(xfND(_line));
        sb.append(dm).append(xfND(_salesDate));
        sb.append(dm).append(xfND(_salesId));
        sb.append(dm).append(xfND(_cusId));
        sb.append(dm).append(xfND(_prdId));
        sb.append(dm).append(xfND(_qty));
        sb.append(dm).append(xfND(_unit));
        sb.append(dm).append(xfND(_unitPrice));
        sb.append(dm).append(xfND(_salesAmount));
        sb.append(dm).append(xfND(_slipAmount));
        sb.append(dm).append(xfND(_slipCons));
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
        if (_product != null && _product.isPresent())
        { sb.append(dm).append("product"); }
        if (_employee != null && _employee.isPresent())
        { sb.append(dm).append("employee"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public SalesSlip clone() {
        return (SalesSlip)super.clone();
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
     * [get] slip_no: {UQ+, NotNull, int4(10)} <br>
     * @return The value of the column 'slip_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSlipNo() {
        checkSpecifiedProperty("slipNo");
        return _slipNo;
    }

    /**
     * [set] slip_no: {UQ+, NotNull, int4(10)} <br>
     * @param slipNo The value of the column 'slip_no'. (basically NotNull if update: for the constraint)
     */
    public void setSlipNo(Integer slipNo) {
        registerModifiedProperty("slipNo");
        _slipNo = slipNo;
    }

    /**
     * [get] line: {+UQ, NotNull, int4(10)} <br>
     * @return The value of the column 'line'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLine() {
        checkSpecifiedProperty("line");
        return _line;
    }

    /**
     * [set] line: {+UQ, NotNull, int4(10)} <br>
     * @param line The value of the column 'line'. (basically NotNull if update: for the constraint)
     */
    public void setLine(Integer line) {
        registerModifiedProperty("line");
        _line = line;
    }

    /**
     * [get] sales_date: {NotNull, date(13)} <br>
     * @return The value of the column 'sales_date'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getSalesDate() {
        checkSpecifiedProperty("salesDate");
        return _salesDate;
    }

    /**
     * [set] sales_date: {NotNull, date(13)} <br>
     * @param salesDate The value of the column 'sales_date'. (basically NotNull if update: for the constraint)
     */
    public void setSalesDate(java.time.LocalDate salesDate) {
        registerModifiedProperty("salesDate");
        _salesDate = salesDate;
    }

    /**
     * [get] sales_id: {IX, NotNull, int4(10), FK to employee} <br>
     * @return The value of the column 'sales_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSalesId() {
        checkSpecifiedProperty("salesId");
        return _salesId;
    }

    /**
     * [set] sales_id: {IX, NotNull, int4(10), FK to employee} <br>
     * @param salesId The value of the column 'sales_id'. (basically NotNull if update: for the constraint)
     */
    public void setSalesId(Integer salesId) {
        registerModifiedProperty("salesId");
        _salesId = salesId;
    }

    /**
     * [get] cus_id: {IX, NotNull, int4(10)} <br>
     * @return The value of the column 'cus_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCusId() {
        checkSpecifiedProperty("cusId");
        return _cusId;
    }

    /**
     * [set] cus_id: {IX, NotNull, int4(10)} <br>
     * @param cusId The value of the column 'cus_id'. (basically NotNull if update: for the constraint)
     */
    public void setCusId(Integer cusId) {
        registerModifiedProperty("cusId");
        _cusId = cusId;
    }

    /**
     * [get] prd_id: {IX, NotNull, int4(10), FK to product} <br>
     * @return The value of the column 'prd_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPrdId() {
        checkSpecifiedProperty("prdId");
        return _prdId;
    }

    /**
     * [set] prd_id: {IX, NotNull, int4(10), FK to product} <br>
     * @param prdId The value of the column 'prd_id'. (basically NotNull if update: for the constraint)
     */
    public void setPrdId(Integer prdId) {
        registerModifiedProperty("prdId");
        _prdId = prdId;
    }

    /**
     * [get] qty: {NotNull, int4(10)} <br>
     * @return The value of the column 'qty'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQty() {
        checkSpecifiedProperty("qty");
        return _qty;
    }

    /**
     * [set] qty: {NotNull, int4(10)} <br>
     * @param qty The value of the column 'qty'. (basically NotNull if update: for the constraint)
     */
    public void setQty(Integer qty) {
        registerModifiedProperty("qty");
        _qty = qty;
    }

    /**
     * [get] unit: {NotNull, varchar(30)} <br>
     * @return The value of the column 'unit'. (basically NotNull if selected: for the constraint)
     */
    public String getUnit() {
        checkSpecifiedProperty("unit");
        return _unit;
    }

    /**
     * [set] unit: {NotNull, varchar(30)} <br>
     * @param unit The value of the column 'unit'. (basically NotNull if update: for the constraint)
     */
    public void setUnit(String unit) {
        registerModifiedProperty("unit");
        _unit = unit;
    }

    /**
     * [get] unit_price: {NotNull, int4(10)} <br>
     * @return The value of the column 'unit_price'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return _unitPrice;
    }

    /**
     * [set] unit_price: {NotNull, int4(10)} <br>
     * @param unitPrice The value of the column 'unit_price'. (basically NotNull if update: for the constraint)
     */
    public void setUnitPrice(Integer unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
    }

    /**
     * [get] sales_amount: {NotNull, int8(19)} <br>
     * @return The value of the column 'sales_amount'. (basically NotNull if selected: for the constraint)
     */
    public Long getSalesAmount() {
        checkSpecifiedProperty("salesAmount");
        return _salesAmount;
    }

    /**
     * [set] sales_amount: {NotNull, int8(19)} <br>
     * @param salesAmount The value of the column 'sales_amount'. (basically NotNull if update: for the constraint)
     */
    public void setSalesAmount(Long salesAmount) {
        registerModifiedProperty("salesAmount");
        _salesAmount = salesAmount;
    }

    /**
     * [get] slip_amount: {NotNull, int8(19)} <br>
     * @return The value of the column 'slip_amount'. (basically NotNull if selected: for the constraint)
     */
    public Long getSlipAmount() {
        checkSpecifiedProperty("slipAmount");
        return _slipAmount;
    }

    /**
     * [set] slip_amount: {NotNull, int8(19)} <br>
     * @param slipAmount The value of the column 'slip_amount'. (basically NotNull if update: for the constraint)
     */
    public void setSlipAmount(Long slipAmount) {
        registerModifiedProperty("slipAmount");
        _slipAmount = slipAmount;
    }

    /**
     * [get] slip_cons: {NotNull, int8(19)} <br>
     * @return The value of the column 'slip_cons'. (basically NotNull if selected: for the constraint)
     */
    public Long getSlipCons() {
        checkSpecifiedProperty("slipCons");
        return _slipCons;
    }

    /**
     * [set] slip_cons: {NotNull, int8(19)} <br>
     * @param slipCons The value of the column 'slip_cons'. (basically NotNull if update: for the constraint)
     */
    public void setSlipCons(Long slipCons) {
        registerModifiedProperty("slipCons");
        _slipCons = slipCons;
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
