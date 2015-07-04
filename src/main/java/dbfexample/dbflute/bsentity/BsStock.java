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
 * The entity of stock as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, yyyymm, prd_id, name, cost, price, unit, before_qty, pur_qty, rcv_qty, sales_qty, out_qty, stock_qty, stock_amount, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 * 
 * [sequence]
 *     stock_id_seq
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     version_no
 * 
 * [foreign table]
 *     product
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     product
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String yyyymm = entity.getYyyymm();
 * Integer prdId = entity.getPrdId();
 * String name = entity.getName();
 * Integer cost = entity.getCost();
 * Integer price = entity.getPrice();
 * String unit = entity.getUnit();
 * Integer beforeQty = entity.getBeforeQty();
 * Integer purQty = entity.getPurQty();
 * Integer rcvQty = entity.getRcvQty();
 * Integer salesQty = entity.getSalesQty();
 * Integer outQty = entity.getOutQty();
 * Integer stockQty = entity.getStockQty();
 * Long stockAmount = entity.getStockAmount();
 * Integer versionNo = entity.getVersionNo();
 * Integer delFlag = entity.getDelFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * String registerProcess = entity.getRegisterProcess();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * String updateProcess = entity.getUpdateProcess();
 * entity.setId(id);
 * entity.setYyyymm(yyyymm);
 * entity.setPrdId(prdId);
 * entity.setName(name);
 * entity.setCost(cost);
 * entity.setPrice(price);
 * entity.setUnit(unit);
 * entity.setBeforeQty(beforeQty);
 * entity.setPurQty(purQty);
 * entity.setRcvQty(rcvQty);
 * entity.setSalesQty(salesQty);
 * entity.setOutQty(outQty);
 * entity.setStockQty(stockQty);
 * entity.setStockAmount(stockAmount);
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
public abstract class BsStock extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** yyyymm: {UQ+, NotNull, varchar(6)} */
    protected String _yyyymm;

    /** prd_id: {+UQ, IX, NotNull, int4(10), FK to product} */
    protected Integer _prdId;

    /** name: {NotNull, varchar(100)} */
    protected String _name;

    /** cost: {NotNull, int4(10)} */
    protected Integer _cost;

    /** price: {NotNull, int4(10)} */
    protected Integer _price;

    /** unit: {NotNull, varchar(100)} */
    protected String _unit;

    /** before_qty: {NotNull, int4(10)} */
    protected Integer _beforeQty;

    /** pur_qty: {NotNull, int4(10)} */
    protected Integer _purQty;

    /** rcv_qty: {NotNull, int4(10)} */
    protected Integer _rcvQty;

    /** sales_qty: {NotNull, int4(10)} */
    protected Integer _salesQty;

    /** out_qty: {NotNull, int4(10)} */
    protected Integer _outQty;

    /** stock_qty: {NotNull, int4(10)} */
    protected Integer _stockQty;

    /** stock_amount: {NotNull, int8(19)} */
    protected Long _stockAmount;

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
        return "stock";
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
     * @param yyyymm : UQ+, NotNull, varchar(6). (NotNull)
     * @param prdId : +UQ, IX, NotNull, int4(10), FK to product. (NotNull)
     * @param delFlag : +UQ, NotNull, int4(10), default=[0]. (NotNull)
     */
    public void uniqueBy(String yyyymm, Integer prdId, Integer delFlag) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("yyyymm");
        __uniqueDrivenProperties.addPropertyName("prdId");
        __uniqueDrivenProperties.addPropertyName("delFlag");
        setYyyymm(yyyymm);setPrdId(prdId);setDelFlag(delFlag);
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
        if (obj instanceof BsStock) {
            BsStock other = (BsStock)obj;
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
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_yyyymm));
        sb.append(dm).append(xfND(_prdId));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_cost));
        sb.append(dm).append(xfND(_price));
        sb.append(dm).append(xfND(_unit));
        sb.append(dm).append(xfND(_beforeQty));
        sb.append(dm).append(xfND(_purQty));
        sb.append(dm).append(xfND(_rcvQty));
        sb.append(dm).append(xfND(_salesQty));
        sb.append(dm).append(xfND(_outQty));
        sb.append(dm).append(xfND(_stockQty));
        sb.append(dm).append(xfND(_stockAmount));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Stock clone() {
        return (Stock)super.clone();
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
     * [get] yyyymm: {UQ+, NotNull, varchar(6)} <br>
     * @return The value of the column 'yyyymm'. (basically NotNull if selected: for the constraint)
     */
    public String getYyyymm() {
        checkSpecifiedProperty("yyyymm");
        return _yyyymm;
    }

    /**
     * [set] yyyymm: {UQ+, NotNull, varchar(6)} <br>
     * @param yyyymm The value of the column 'yyyymm'. (basically NotNull if update: for the constraint)
     */
    public void setYyyymm(String yyyymm) {
        registerModifiedProperty("yyyymm");
        _yyyymm = yyyymm;
    }

    /**
     * [get] prd_id: {+UQ, IX, NotNull, int4(10), FK to product} <br>
     * @return The value of the column 'prd_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPrdId() {
        checkSpecifiedProperty("prdId");
        return _prdId;
    }

    /**
     * [set] prd_id: {+UQ, IX, NotNull, int4(10), FK to product} <br>
     * @param prdId The value of the column 'prd_id'. (basically NotNull if update: for the constraint)
     */
    public void setPrdId(Integer prdId) {
        registerModifiedProperty("prdId");
        _prdId = prdId;
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
     * [get] cost: {NotNull, int4(10)} <br>
     * @return The value of the column 'cost'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCost() {
        checkSpecifiedProperty("cost");
        return _cost;
    }

    /**
     * [set] cost: {NotNull, int4(10)} <br>
     * @param cost The value of the column 'cost'. (basically NotNull if update: for the constraint)
     */
    public void setCost(Integer cost) {
        registerModifiedProperty("cost");
        _cost = cost;
    }

    /**
     * [get] price: {NotNull, int4(10)} <br>
     * @return The value of the column 'price'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPrice() {
        checkSpecifiedProperty("price");
        return _price;
    }

    /**
     * [set] price: {NotNull, int4(10)} <br>
     * @param price The value of the column 'price'. (basically NotNull if update: for the constraint)
     */
    public void setPrice(Integer price) {
        registerModifiedProperty("price");
        _price = price;
    }

    /**
     * [get] unit: {NotNull, varchar(100)} <br>
     * @return The value of the column 'unit'. (basically NotNull if selected: for the constraint)
     */
    public String getUnit() {
        checkSpecifiedProperty("unit");
        return _unit;
    }

    /**
     * [set] unit: {NotNull, varchar(100)} <br>
     * @param unit The value of the column 'unit'. (basically NotNull if update: for the constraint)
     */
    public void setUnit(String unit) {
        registerModifiedProperty("unit");
        _unit = unit;
    }

    /**
     * [get] before_qty: {NotNull, int4(10)} <br>
     * @return The value of the column 'before_qty'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBeforeQty() {
        checkSpecifiedProperty("beforeQty");
        return _beforeQty;
    }

    /**
     * [set] before_qty: {NotNull, int4(10)} <br>
     * @param beforeQty The value of the column 'before_qty'. (basically NotNull if update: for the constraint)
     */
    public void setBeforeQty(Integer beforeQty) {
        registerModifiedProperty("beforeQty");
        _beforeQty = beforeQty;
    }

    /**
     * [get] pur_qty: {NotNull, int4(10)} <br>
     * @return The value of the column 'pur_qty'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurQty() {
        checkSpecifiedProperty("purQty");
        return _purQty;
    }

    /**
     * [set] pur_qty: {NotNull, int4(10)} <br>
     * @param purQty The value of the column 'pur_qty'. (basically NotNull if update: for the constraint)
     */
    public void setPurQty(Integer purQty) {
        registerModifiedProperty("purQty");
        _purQty = purQty;
    }

    /**
     * [get] rcv_qty: {NotNull, int4(10)} <br>
     * @return The value of the column 'rcv_qty'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRcvQty() {
        checkSpecifiedProperty("rcvQty");
        return _rcvQty;
    }

    /**
     * [set] rcv_qty: {NotNull, int4(10)} <br>
     * @param rcvQty The value of the column 'rcv_qty'. (basically NotNull if update: for the constraint)
     */
    public void setRcvQty(Integer rcvQty) {
        registerModifiedProperty("rcvQty");
        _rcvQty = rcvQty;
    }

    /**
     * [get] sales_qty: {NotNull, int4(10)} <br>
     * @return The value of the column 'sales_qty'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSalesQty() {
        checkSpecifiedProperty("salesQty");
        return _salesQty;
    }

    /**
     * [set] sales_qty: {NotNull, int4(10)} <br>
     * @param salesQty The value of the column 'sales_qty'. (basically NotNull if update: for the constraint)
     */
    public void setSalesQty(Integer salesQty) {
        registerModifiedProperty("salesQty");
        _salesQty = salesQty;
    }

    /**
     * [get] out_qty: {NotNull, int4(10)} <br>
     * @return The value of the column 'out_qty'. (basically NotNull if selected: for the constraint)
     */
    public Integer getOutQty() {
        checkSpecifiedProperty("outQty");
        return _outQty;
    }

    /**
     * [set] out_qty: {NotNull, int4(10)} <br>
     * @param outQty The value of the column 'out_qty'. (basically NotNull if update: for the constraint)
     */
    public void setOutQty(Integer outQty) {
        registerModifiedProperty("outQty");
        _outQty = outQty;
    }

    /**
     * [get] stock_qty: {NotNull, int4(10)} <br>
     * @return The value of the column 'stock_qty'. (basically NotNull if selected: for the constraint)
     */
    public Integer getStockQty() {
        checkSpecifiedProperty("stockQty");
        return _stockQty;
    }

    /**
     * [set] stock_qty: {NotNull, int4(10)} <br>
     * @param stockQty The value of the column 'stock_qty'. (basically NotNull if update: for the constraint)
     */
    public void setStockQty(Integer stockQty) {
        registerModifiedProperty("stockQty");
        _stockQty = stockQty;
    }

    /**
     * [get] stock_amount: {NotNull, int8(19)} <br>
     * @return The value of the column 'stock_amount'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockAmount() {
        checkSpecifiedProperty("stockAmount");
        return _stockAmount;
    }

    /**
     * [set] stock_amount: {NotNull, int8(19)} <br>
     * @param stockAmount The value of the column 'stock_amount'. (basically NotNull if update: for the constraint)
     */
    public void setStockAmount(Long stockAmount) {
        registerModifiedProperty("stockAmount");
        _stockAmount = stockAmount;
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
