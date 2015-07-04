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
 * The entity of product as TABLE. <br>
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, prd_cd, prd_cat, name, cost, price, per_qty, unit, pur_qty, pur_amount, sales_qty, sales_amount, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 * 
 * [sequence]
 *     product_id_seq
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
 *     sales_slip, stock
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     salesSlipList, stockList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String prdCd = entity.getPrdCd();
 * String prdCat = entity.getPrdCat();
 * String name = entity.getName();
 * Integer cost = entity.getCost();
 * Integer price = entity.getPrice();
 * Integer perQty = entity.getPerQty();
 * String unit = entity.getUnit();
 * Integer purQty = entity.getPurQty();
 * Long purAmount = entity.getPurAmount();
 * Integer salesQty = entity.getSalesQty();
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
 * entity.setPrdCd(prdCd);
 * entity.setPrdCat(prdCat);
 * entity.setName(name);
 * entity.setCost(cost);
 * entity.setPrice(price);
 * entity.setPerQty(perQty);
 * entity.setUnit(unit);
 * entity.setPurQty(purQty);
 * entity.setPurAmount(purAmount);
 * entity.setSalesQty(salesQty);
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
public abstract class BsProduct extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** prd_cd: {UQ+, NotNull, varchar(40)} */
    protected String _prdCd;

    /** prd_cat: {NotNull, varchar(40)} */
    protected String _prdCat;

    /** name: {NotNull, varchar(100)} */
    protected String _name;

    /** cost: {NotNull, int4(10)} */
    protected Integer _cost;

    /** price: {NotNull, int4(10)} */
    protected Integer _price;

    /** per_qty: {NotNull, int4(10)} */
    protected Integer _perQty;

    /** unit: {NotNull, varchar(100)} */
    protected String _unit;

    /** pur_qty: {NotNull, int4(10)} */
    protected Integer _purQty;

    /** pur_amount: {NotNull, int8(19)} */
    protected Long _purAmount;

    /** sales_qty: {NotNull, int4(10)} */
    protected Integer _salesQty;

    /** sales_amount: {NotNull, int8(19)} */
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
        return "product";
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
     * @param prdCd : UQ+, NotNull, varchar(40). (NotNull)
     * @param delFlag : +UQ, NotNull, int4(10), default=[0]. (NotNull)
     */
    public void uniqueBy(String prdCd, Integer delFlag) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("prdCd");
        __uniqueDrivenProperties.addPropertyName("delFlag");
        setPrdCd(prdCd);setDelFlag(delFlag);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** sales_slip by prd_id, named 'salesSlipList'. */
    protected List<SalesSlip> _salesSlipList;

    /**
     * [get] sales_slip by prd_id, named 'salesSlipList'.
     * @return The entity list of referrer property 'salesSlipList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SalesSlip> getSalesSlipList() {
        if (_salesSlipList == null) { _salesSlipList = newReferrerList(); }
        return _salesSlipList;
    }

    /**
     * [set] sales_slip by prd_id, named 'salesSlipList'.
     * @param salesSlipList The entity list of referrer property 'salesSlipList'. (NullAllowed)
     */
    public void setSalesSlipList(List<SalesSlip> salesSlipList) {
        _salesSlipList = salesSlipList;
    }

    /** stock by prd_id, named 'stockList'. */
    protected List<Stock> _stockList;

    /**
     * [get] stock by prd_id, named 'stockList'.
     * @return The entity list of referrer property 'stockList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Stock> getStockList() {
        if (_stockList == null) { _stockList = newReferrerList(); }
        return _stockList;
    }

    /**
     * [set] stock by prd_id, named 'stockList'.
     * @param stockList The entity list of referrer property 'stockList'. (NullAllowed)
     */
    public void setStockList(List<Stock> stockList) {
        _stockList = stockList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsProduct) {
            BsProduct other = (BsProduct)obj;
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
        if (_salesSlipList != null) { for (SalesSlip et : _salesSlipList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "salesSlipList")); } } }
        if (_stockList != null) { for (Stock et : _stockList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "stockList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_prdCd));
        sb.append(dm).append(xfND(_prdCat));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_cost));
        sb.append(dm).append(xfND(_price));
        sb.append(dm).append(xfND(_perQty));
        sb.append(dm).append(xfND(_unit));
        sb.append(dm).append(xfND(_purQty));
        sb.append(dm).append(xfND(_purAmount));
        sb.append(dm).append(xfND(_salesQty));
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
        StringBuilder sb = new StringBuilder();
        if (_salesSlipList != null && !_salesSlipList.isEmpty())
        { sb.append(dm).append("salesSlipList"); }
        if (_stockList != null && !_stockList.isEmpty())
        { sb.append(dm).append("stockList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Product clone() {
        return (Product)super.clone();
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
     * [get] prd_cd: {UQ+, NotNull, varchar(40)} <br>
     * @return The value of the column 'prd_cd'. (basically NotNull if selected: for the constraint)
     */
    public String getPrdCd() {
        checkSpecifiedProperty("prdCd");
        return _prdCd;
    }

    /**
     * [set] prd_cd: {UQ+, NotNull, varchar(40)} <br>
     * @param prdCd The value of the column 'prd_cd'. (basically NotNull if update: for the constraint)
     */
    public void setPrdCd(String prdCd) {
        registerModifiedProperty("prdCd");
        _prdCd = prdCd;
    }

    /**
     * [get] prd_cat: {NotNull, varchar(40)} <br>
     * @return The value of the column 'prd_cat'. (basically NotNull if selected: for the constraint)
     */
    public String getPrdCat() {
        checkSpecifiedProperty("prdCat");
        return _prdCat;
    }

    /**
     * [set] prd_cat: {NotNull, varchar(40)} <br>
     * @param prdCat The value of the column 'prd_cat'. (basically NotNull if update: for the constraint)
     */
    public void setPrdCat(String prdCat) {
        registerModifiedProperty("prdCat");
        _prdCat = prdCat;
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
     * [get] per_qty: {NotNull, int4(10)} <br>
     * @return The value of the column 'per_qty'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPerQty() {
        checkSpecifiedProperty("perQty");
        return _perQty;
    }

    /**
     * [set] per_qty: {NotNull, int4(10)} <br>
     * @param perQty The value of the column 'per_qty'. (basically NotNull if update: for the constraint)
     */
    public void setPerQty(Integer perQty) {
        registerModifiedProperty("perQty");
        _perQty = perQty;
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
     * [get] pur_amount: {NotNull, int8(19)} <br>
     * @return The value of the column 'pur_amount'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurAmount() {
        checkSpecifiedProperty("purAmount");
        return _purAmount;
    }

    /**
     * [set] pur_amount: {NotNull, int8(19)} <br>
     * @param purAmount The value of the column 'pur_amount'. (basically NotNull if update: for the constraint)
     */
    public void setPurAmount(Long purAmount) {
        registerModifiedProperty("purAmount");
        _purAmount = purAmount;
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
