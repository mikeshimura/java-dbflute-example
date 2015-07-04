package dbfexample.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import dbfexample.dbflute.allcommon.*;
import dbfexample.dbflute.cbean.*;
import dbfexample.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of stock.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsStockCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsStockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "stock";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as equal. (NullAllowed: if null, no condition)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as notEqual. (NullAllowed: if null, no condition)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as lessThan. (NullAllowed: if null, no condition)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of id. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of id. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param idList The collection of id as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param idList The collection of id as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymm The value of yyyymm as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setYyyymm_Equal(String yyyymm) {
        doSetYyyymm_Equal(fRES(yyyymm));
    }

    protected void doSetYyyymm_Equal(String yyyymm) {
        regYyyymm(CK_EQ, yyyymm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymm The value of yyyymm as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setYyyymm_NotEqual(String yyyymm) {
        doSetYyyymm_NotEqual(fRES(yyyymm));
    }

    protected void doSetYyyymm_NotEqual(String yyyymm) {
        regYyyymm(CK_NES, yyyymm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymm The value of yyyymm as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setYyyymm_GreaterThan(String yyyymm) {
        regYyyymm(CK_GT, fRES(yyyymm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymm The value of yyyymm as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setYyyymm_LessThan(String yyyymm) {
        regYyyymm(CK_LT, fRES(yyyymm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymm The value of yyyymm as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setYyyymm_GreaterEqual(String yyyymm) {
        regYyyymm(CK_GE, fRES(yyyymm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymm The value of yyyymm as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setYyyymm_LessEqual(String yyyymm) {
        regYyyymm(CK_LE, fRES(yyyymm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymmList The collection of yyyymm as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setYyyymm_InScope(Collection<String> yyyymmList) {
        doSetYyyymm_InScope(yyyymmList);
    }

    protected void doSetYyyymm_InScope(Collection<String> yyyymmList) {
        regINS(CK_INS, cTL(yyyymmList), xgetCValueYyyymm(), "yyyymm");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymmList The collection of yyyymm as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setYyyymm_NotInScope(Collection<String> yyyymmList) {
        doSetYyyymm_NotInScope(yyyymmList);
    }

    protected void doSetYyyymm_NotInScope(Collection<String> yyyymmList) {
        regINS(CK_NINS, cTL(yyyymmList), xgetCValueYyyymm(), "yyyymm");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)} <br>
     * <pre>e.g. setYyyymm_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param yyyymm The value of yyyymm as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setYyyymm_LikeSearch(String yyyymm, ConditionOptionCall<LikeSearchOption> opLambda) {
        setYyyymm_LikeSearch(yyyymm, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)} <br>
     * <pre>e.g. setYyyymm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param yyyymm The value of yyyymm as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setYyyymm_LikeSearch(String yyyymm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(yyyymm), xgetCValueYyyymm(), "yyyymm", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymm The value of yyyymm as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setYyyymm_NotLikeSearch(String yyyymm, ConditionOptionCall<LikeSearchOption> opLambda) {
        setYyyymm_NotLikeSearch(yyyymm, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * yyyymm: {UQ+, NotNull, varchar(6)}
     * @param yyyymm The value of yyyymm as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setYyyymm_NotLikeSearch(String yyyymm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(yyyymm), xgetCValueYyyymm(), "yyyymm", likeSearchOption);
    }

    protected void regYyyymm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYyyymm(), "yyyymm"); }
    protected abstract ConditionValue xgetCValueYyyymm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as equal. (NullAllowed: if null, no condition)
     */
    public void setPrdId_Equal(Integer prdId) {
        doSetPrdId_Equal(prdId);
    }

    protected void doSetPrdId_Equal(Integer prdId) {
        regPrdId(CK_EQ, prdId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPrdId_NotEqual(Integer prdId) {
        doSetPrdId_NotEqual(prdId);
    }

    protected void doSetPrdId_NotEqual(Integer prdId) {
        regPrdId(CK_NES, prdId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPrdId_GreaterThan(Integer prdId) {
        regPrdId(CK_GT, prdId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPrdId_LessThan(Integer prdId) {
        regPrdId(CK_LT, prdId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPrdId_GreaterEqual(Integer prdId) {
        regPrdId(CK_GE, prdId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPrdId_LessEqual(Integer prdId) {
        regPrdId(CK_LE, prdId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param minNumber The min number of prdId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of prdId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPrdId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPrdId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param minNumber The min number of prdId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of prdId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPrdId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrdId(), "prd_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param prdIdList The collection of prdId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrdId_InScope(Collection<Integer> prdIdList) {
        doSetPrdId_InScope(prdIdList);
    }

    protected void doSetPrdId_InScope(Collection<Integer> prdIdList) {
        regINS(CK_INS, cTL(prdIdList), xgetCValuePrdId(), "prd_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * prd_id: {+UQ, IX, NotNull, int4(10), FK to product}
     * @param prdIdList The collection of prdId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrdId_NotInScope(Collection<Integer> prdIdList) {
        doSetPrdId_NotInScope(prdIdList);
    }

    protected void doSetPrdId_NotInScope(Collection<Integer> prdIdList) {
        regINS(CK_NINS, cTL(prdIdList), xgetCValuePrdId(), "prd_id");
    }

    protected void regPrdId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrdId(), "prd_id"); }
    protected abstract ConditionValue xgetCValuePrdId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param name The value of name as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param name The value of name as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param name The value of name as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param name The value of name as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param name The value of name as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param name The value of name as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param nameList The collection of name as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param nameList The collection of name as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(100)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(100)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param name The value of name as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(100)}
     * @param name The value of name as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "name"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param cost The value of cost as equal. (NullAllowed: if null, no condition)
     */
    public void setCost_Equal(Integer cost) {
        doSetCost_Equal(cost);
    }

    protected void doSetCost_Equal(Integer cost) {
        regCost(CK_EQ, cost);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param cost The value of cost as notEqual. (NullAllowed: if null, no condition)
     */
    public void setCost_NotEqual(Integer cost) {
        doSetCost_NotEqual(cost);
    }

    protected void doSetCost_NotEqual(Integer cost) {
        regCost(CK_NES, cost);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param cost The value of cost as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCost_GreaterThan(Integer cost) {
        regCost(CK_GT, cost);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param cost The value of cost as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCost_LessThan(Integer cost) {
        regCost(CK_LT, cost);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param cost The value of cost as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCost_GreaterEqual(Integer cost) {
        regCost(CK_GE, cost);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param cost The value of cost as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCost_LessEqual(Integer cost) {
        regCost(CK_LE, cost);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param minNumber The min number of cost. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cost. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCost_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCost_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param minNumber The min number of cost. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cost. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCost_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCost(), "cost", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param costList The collection of cost as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCost_InScope(Collection<Integer> costList) {
        doSetCost_InScope(costList);
    }

    protected void doSetCost_InScope(Collection<Integer> costList) {
        regINS(CK_INS, cTL(costList), xgetCValueCost(), "cost");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * cost: {NotNull, int4(10)}
     * @param costList The collection of cost as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCost_NotInScope(Collection<Integer> costList) {
        doSetCost_NotInScope(costList);
    }

    protected void doSetCost_NotInScope(Collection<Integer> costList) {
        regINS(CK_NINS, cTL(costList), xgetCValueCost(), "cost");
    }

    protected void regCost(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCost(), "cost"); }
    protected abstract ConditionValue xgetCValueCost();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param price The value of price as equal. (NullAllowed: if null, no condition)
     */
    public void setPrice_Equal(Integer price) {
        doSetPrice_Equal(price);
    }

    protected void doSetPrice_Equal(Integer price) {
        regPrice(CK_EQ, price);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param price The value of price as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPrice_NotEqual(Integer price) {
        doSetPrice_NotEqual(price);
    }

    protected void doSetPrice_NotEqual(Integer price) {
        regPrice(CK_NES, price);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param price The value of price as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPrice_GreaterThan(Integer price) {
        regPrice(CK_GT, price);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param price The value of price as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPrice_LessThan(Integer price) {
        regPrice(CK_LT, price);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param price The value of price as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPrice_GreaterEqual(Integer price) {
        regPrice(CK_GE, price);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param price The value of price as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPrice_LessEqual(Integer price) {
        regPrice(CK_LE, price);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param minNumber The min number of price. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of price. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPrice_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPrice_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param minNumber The min number of price. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of price. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrice(), "price", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param priceList The collection of price as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrice_InScope(Collection<Integer> priceList) {
        doSetPrice_InScope(priceList);
    }

    protected void doSetPrice_InScope(Collection<Integer> priceList) {
        regINS(CK_INS, cTL(priceList), xgetCValuePrice(), "price");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * price: {NotNull, int4(10)}
     * @param priceList The collection of price as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrice_NotInScope(Collection<Integer> priceList) {
        doSetPrice_NotInScope(priceList);
    }

    protected void doSetPrice_NotInScope(Collection<Integer> priceList) {
        regINS(CK_NINS, cTL(priceList), xgetCValuePrice(), "price");
    }

    protected void regPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrice(), "price"); }
    protected abstract ConditionValue xgetCValuePrice();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unit The value of unit as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_Equal(String unit) {
        doSetUnit_Equal(fRES(unit));
    }

    protected void doSetUnit_Equal(String unit) {
        regUnit(CK_EQ, unit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unit The value of unit as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_NotEqual(String unit) {
        doSetUnit_NotEqual(fRES(unit));
    }

    protected void doSetUnit_NotEqual(String unit) {
        regUnit(CK_NES, unit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unit The value of unit as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_GreaterThan(String unit) {
        regUnit(CK_GT, fRES(unit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unit The value of unit as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_LessThan(String unit) {
        regUnit(CK_LT, fRES(unit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unit The value of unit as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_GreaterEqual(String unit) {
        regUnit(CK_GE, fRES(unit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unit The value of unit as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_LessEqual(String unit) {
        regUnit(CK_LE, fRES(unit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unitList The collection of unit as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_InScope(Collection<String> unitList) {
        doSetUnit_InScope(unitList);
    }

    protected void doSetUnit_InScope(Collection<String> unitList) {
        regINS(CK_INS, cTL(unitList), xgetCValueUnit(), "unit");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unitList The collection of unit as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_NotInScope(Collection<String> unitList) {
        doSetUnit_NotInScope(unitList);
    }

    protected void doSetUnit_NotInScope(Collection<String> unitList) {
        regINS(CK_NINS, cTL(unitList), xgetCValueUnit(), "unit");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unit: {NotNull, varchar(100)} <br>
     * <pre>e.g. setUnit_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param unit The value of unit as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUnit_LikeSearch(String unit, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUnit_LikeSearch(unit, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unit: {NotNull, varchar(100)} <br>
     * <pre>e.g. setUnit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit The value of unit as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUnit_LikeSearch(String unit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit), xgetCValueUnit(), "unit", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unit The value of unit as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUnit_NotLikeSearch(String unit, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUnit_NotLikeSearch(unit, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unit: {NotNull, varchar(100)}
     * @param unit The value of unit as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUnit_NotLikeSearch(String unit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit), xgetCValueUnit(), "unit", likeSearchOption);
    }

    protected void regUnit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit(), "unit"); }
    protected abstract ConditionValue xgetCValueUnit();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param beforeQty The value of beforeQty as equal. (NullAllowed: if null, no condition)
     */
    public void setBeforeQty_Equal(Integer beforeQty) {
        doSetBeforeQty_Equal(beforeQty);
    }

    protected void doSetBeforeQty_Equal(Integer beforeQty) {
        regBeforeQty(CK_EQ, beforeQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param beforeQty The value of beforeQty as notEqual. (NullAllowed: if null, no condition)
     */
    public void setBeforeQty_NotEqual(Integer beforeQty) {
        doSetBeforeQty_NotEqual(beforeQty);
    }

    protected void doSetBeforeQty_NotEqual(Integer beforeQty) {
        regBeforeQty(CK_NES, beforeQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param beforeQty The value of beforeQty as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBeforeQty_GreaterThan(Integer beforeQty) {
        regBeforeQty(CK_GT, beforeQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param beforeQty The value of beforeQty as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBeforeQty_LessThan(Integer beforeQty) {
        regBeforeQty(CK_LT, beforeQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param beforeQty The value of beforeQty as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBeforeQty_GreaterEqual(Integer beforeQty) {
        regBeforeQty(CK_GE, beforeQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param beforeQty The value of beforeQty as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBeforeQty_LessEqual(Integer beforeQty) {
        regBeforeQty(CK_LE, beforeQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param minNumber The min number of beforeQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of beforeQty. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBeforeQty_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBeforeQty_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param minNumber The min number of beforeQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of beforeQty. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBeforeQty_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBeforeQty(), "before_qty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param beforeQtyList The collection of beforeQty as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBeforeQty_InScope(Collection<Integer> beforeQtyList) {
        doSetBeforeQty_InScope(beforeQtyList);
    }

    protected void doSetBeforeQty_InScope(Collection<Integer> beforeQtyList) {
        regINS(CK_INS, cTL(beforeQtyList), xgetCValueBeforeQty(), "before_qty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * before_qty: {NotNull, int4(10)}
     * @param beforeQtyList The collection of beforeQty as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBeforeQty_NotInScope(Collection<Integer> beforeQtyList) {
        doSetBeforeQty_NotInScope(beforeQtyList);
    }

    protected void doSetBeforeQty_NotInScope(Collection<Integer> beforeQtyList) {
        regINS(CK_NINS, cTL(beforeQtyList), xgetCValueBeforeQty(), "before_qty");
    }

    protected void regBeforeQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBeforeQty(), "before_qty"); }
    protected abstract ConditionValue xgetCValueBeforeQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param purQty The value of purQty as equal. (NullAllowed: if null, no condition)
     */
    public void setPurQty_Equal(Integer purQty) {
        doSetPurQty_Equal(purQty);
    }

    protected void doSetPurQty_Equal(Integer purQty) {
        regPurQty(CK_EQ, purQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param purQty The value of purQty as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPurQty_NotEqual(Integer purQty) {
        doSetPurQty_NotEqual(purQty);
    }

    protected void doSetPurQty_NotEqual(Integer purQty) {
        regPurQty(CK_NES, purQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param purQty The value of purQty as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurQty_GreaterThan(Integer purQty) {
        regPurQty(CK_GT, purQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param purQty The value of purQty as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurQty_LessThan(Integer purQty) {
        regPurQty(CK_LT, purQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param purQty The value of purQty as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurQty_GreaterEqual(Integer purQty) {
        regPurQty(CK_GE, purQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param purQty The value of purQty as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurQty_LessEqual(Integer purQty) {
        regPurQty(CK_LE, purQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param minNumber The min number of purQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purQty. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurQty_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurQty_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param minNumber The min number of purQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purQty. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPurQty_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurQty(), "pur_qty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param purQtyList The collection of purQty as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurQty_InScope(Collection<Integer> purQtyList) {
        doSetPurQty_InScope(purQtyList);
    }

    protected void doSetPurQty_InScope(Collection<Integer> purQtyList) {
        regINS(CK_INS, cTL(purQtyList), xgetCValuePurQty(), "pur_qty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * pur_qty: {NotNull, int4(10)}
     * @param purQtyList The collection of purQty as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurQty_NotInScope(Collection<Integer> purQtyList) {
        doSetPurQty_NotInScope(purQtyList);
    }

    protected void doSetPurQty_NotInScope(Collection<Integer> purQtyList) {
        regINS(CK_NINS, cTL(purQtyList), xgetCValuePurQty(), "pur_qty");
    }

    protected void regPurQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurQty(), "pur_qty"); }
    protected abstract ConditionValue xgetCValuePurQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param rcvQty The value of rcvQty as equal. (NullAllowed: if null, no condition)
     */
    public void setRcvQty_Equal(Integer rcvQty) {
        doSetRcvQty_Equal(rcvQty);
    }

    protected void doSetRcvQty_Equal(Integer rcvQty) {
        regRcvQty(CK_EQ, rcvQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param rcvQty The value of rcvQty as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRcvQty_NotEqual(Integer rcvQty) {
        doSetRcvQty_NotEqual(rcvQty);
    }

    protected void doSetRcvQty_NotEqual(Integer rcvQty) {
        regRcvQty(CK_NES, rcvQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param rcvQty The value of rcvQty as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRcvQty_GreaterThan(Integer rcvQty) {
        regRcvQty(CK_GT, rcvQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param rcvQty The value of rcvQty as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRcvQty_LessThan(Integer rcvQty) {
        regRcvQty(CK_LT, rcvQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param rcvQty The value of rcvQty as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRcvQty_GreaterEqual(Integer rcvQty) {
        regRcvQty(CK_GE, rcvQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param rcvQty The value of rcvQty as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRcvQty_LessEqual(Integer rcvQty) {
        regRcvQty(CK_LE, rcvQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param minNumber The min number of rcvQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of rcvQty. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRcvQty_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRcvQty_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param minNumber The min number of rcvQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of rcvQty. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRcvQty_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvQty(), "rcv_qty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param rcvQtyList The collection of rcvQty as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRcvQty_InScope(Collection<Integer> rcvQtyList) {
        doSetRcvQty_InScope(rcvQtyList);
    }

    protected void doSetRcvQty_InScope(Collection<Integer> rcvQtyList) {
        regINS(CK_INS, cTL(rcvQtyList), xgetCValueRcvQty(), "rcv_qty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * rcv_qty: {NotNull, int4(10)}
     * @param rcvQtyList The collection of rcvQty as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRcvQty_NotInScope(Collection<Integer> rcvQtyList) {
        doSetRcvQty_NotInScope(rcvQtyList);
    }

    protected void doSetRcvQty_NotInScope(Collection<Integer> rcvQtyList) {
        regINS(CK_NINS, cTL(rcvQtyList), xgetCValueRcvQty(), "rcv_qty");
    }

    protected void regRcvQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvQty(), "rcv_qty"); }
    protected abstract ConditionValue xgetCValueRcvQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param salesQty The value of salesQty as equal. (NullAllowed: if null, no condition)
     */
    public void setSalesQty_Equal(Integer salesQty) {
        doSetSalesQty_Equal(salesQty);
    }

    protected void doSetSalesQty_Equal(Integer salesQty) {
        regSalesQty(CK_EQ, salesQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param salesQty The value of salesQty as notEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesQty_NotEqual(Integer salesQty) {
        doSetSalesQty_NotEqual(salesQty);
    }

    protected void doSetSalesQty_NotEqual(Integer salesQty) {
        regSalesQty(CK_NES, salesQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param salesQty The value of salesQty as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSalesQty_GreaterThan(Integer salesQty) {
        regSalesQty(CK_GT, salesQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param salesQty The value of salesQty as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSalesQty_LessThan(Integer salesQty) {
        regSalesQty(CK_LT, salesQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param salesQty The value of salesQty as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesQty_GreaterEqual(Integer salesQty) {
        regSalesQty(CK_GE, salesQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param salesQty The value of salesQty as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesQty_LessEqual(Integer salesQty) {
        regSalesQty(CK_LE, salesQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param minNumber The min number of salesQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of salesQty. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSalesQty_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSalesQty_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param minNumber The min number of salesQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of salesQty. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSalesQty_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSalesQty(), "sales_qty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param salesQtyList The collection of salesQty as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSalesQty_InScope(Collection<Integer> salesQtyList) {
        doSetSalesQty_InScope(salesQtyList);
    }

    protected void doSetSalesQty_InScope(Collection<Integer> salesQtyList) {
        regINS(CK_INS, cTL(salesQtyList), xgetCValueSalesQty(), "sales_qty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * sales_qty: {NotNull, int4(10)}
     * @param salesQtyList The collection of salesQty as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSalesQty_NotInScope(Collection<Integer> salesQtyList) {
        doSetSalesQty_NotInScope(salesQtyList);
    }

    protected void doSetSalesQty_NotInScope(Collection<Integer> salesQtyList) {
        regINS(CK_NINS, cTL(salesQtyList), xgetCValueSalesQty(), "sales_qty");
    }

    protected void regSalesQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesQty(), "sales_qty"); }
    protected abstract ConditionValue xgetCValueSalesQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param outQty The value of outQty as equal. (NullAllowed: if null, no condition)
     */
    public void setOutQty_Equal(Integer outQty) {
        doSetOutQty_Equal(outQty);
    }

    protected void doSetOutQty_Equal(Integer outQty) {
        regOutQty(CK_EQ, outQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param outQty The value of outQty as notEqual. (NullAllowed: if null, no condition)
     */
    public void setOutQty_NotEqual(Integer outQty) {
        doSetOutQty_NotEqual(outQty);
    }

    protected void doSetOutQty_NotEqual(Integer outQty) {
        regOutQty(CK_NES, outQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param outQty The value of outQty as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setOutQty_GreaterThan(Integer outQty) {
        regOutQty(CK_GT, outQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param outQty The value of outQty as lessThan. (NullAllowed: if null, no condition)
     */
    public void setOutQty_LessThan(Integer outQty) {
        regOutQty(CK_LT, outQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param outQty The value of outQty as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setOutQty_GreaterEqual(Integer outQty) {
        regOutQty(CK_GE, outQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param outQty The value of outQty as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setOutQty_LessEqual(Integer outQty) {
        regOutQty(CK_LE, outQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param minNumber The min number of outQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of outQty. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOutQty_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOutQty_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param minNumber The min number of outQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of outQty. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOutQty_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOutQty(), "out_qty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param outQtyList The collection of outQty as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutQty_InScope(Collection<Integer> outQtyList) {
        doSetOutQty_InScope(outQtyList);
    }

    protected void doSetOutQty_InScope(Collection<Integer> outQtyList) {
        regINS(CK_INS, cTL(outQtyList), xgetCValueOutQty(), "out_qty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * out_qty: {NotNull, int4(10)}
     * @param outQtyList The collection of outQty as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOutQty_NotInScope(Collection<Integer> outQtyList) {
        doSetOutQty_NotInScope(outQtyList);
    }

    protected void doSetOutQty_NotInScope(Collection<Integer> outQtyList) {
        regINS(CK_NINS, cTL(outQtyList), xgetCValueOutQty(), "out_qty");
    }

    protected void regOutQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOutQty(), "out_qty"); }
    protected abstract ConditionValue xgetCValueOutQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param stockQty The value of stockQty as equal. (NullAllowed: if null, no condition)
     */
    public void setStockQty_Equal(Integer stockQty) {
        doSetStockQty_Equal(stockQty);
    }

    protected void doSetStockQty_Equal(Integer stockQty) {
        regStockQty(CK_EQ, stockQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param stockQty The value of stockQty as notEqual. (NullAllowed: if null, no condition)
     */
    public void setStockQty_NotEqual(Integer stockQty) {
        doSetStockQty_NotEqual(stockQty);
    }

    protected void doSetStockQty_NotEqual(Integer stockQty) {
        regStockQty(CK_NES, stockQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param stockQty The value of stockQty as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setStockQty_GreaterThan(Integer stockQty) {
        regStockQty(CK_GT, stockQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param stockQty The value of stockQty as lessThan. (NullAllowed: if null, no condition)
     */
    public void setStockQty_LessThan(Integer stockQty) {
        regStockQty(CK_LT, stockQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param stockQty The value of stockQty as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setStockQty_GreaterEqual(Integer stockQty) {
        regStockQty(CK_GE, stockQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param stockQty The value of stockQty as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setStockQty_LessEqual(Integer stockQty) {
        regStockQty(CK_LE, stockQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param minNumber The min number of stockQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stockQty. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStockQty_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStockQty_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param minNumber The min number of stockQty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stockQty. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStockQty_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockQty(), "stock_qty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param stockQtyList The collection of stockQty as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStockQty_InScope(Collection<Integer> stockQtyList) {
        doSetStockQty_InScope(stockQtyList);
    }

    protected void doSetStockQty_InScope(Collection<Integer> stockQtyList) {
        regINS(CK_INS, cTL(stockQtyList), xgetCValueStockQty(), "stock_qty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * stock_qty: {NotNull, int4(10)}
     * @param stockQtyList The collection of stockQty as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStockQty_NotInScope(Collection<Integer> stockQtyList) {
        doSetStockQty_NotInScope(stockQtyList);
    }

    protected void doSetStockQty_NotInScope(Collection<Integer> stockQtyList) {
        regINS(CK_NINS, cTL(stockQtyList), xgetCValueStockQty(), "stock_qty");
    }

    protected void regStockQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockQty(), "stock_qty"); }
    protected abstract ConditionValue xgetCValueStockQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param stockAmount The value of stockAmount as equal. (NullAllowed: if null, no condition)
     */
    public void setStockAmount_Equal(Long stockAmount) {
        doSetStockAmount_Equal(stockAmount);
    }

    protected void doSetStockAmount_Equal(Long stockAmount) {
        regStockAmount(CK_EQ, stockAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param stockAmount The value of stockAmount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setStockAmount_NotEqual(Long stockAmount) {
        doSetStockAmount_NotEqual(stockAmount);
    }

    protected void doSetStockAmount_NotEqual(Long stockAmount) {
        regStockAmount(CK_NES, stockAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param stockAmount The value of stockAmount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setStockAmount_GreaterThan(Long stockAmount) {
        regStockAmount(CK_GT, stockAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param stockAmount The value of stockAmount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setStockAmount_LessThan(Long stockAmount) {
        regStockAmount(CK_LT, stockAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param stockAmount The value of stockAmount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setStockAmount_GreaterEqual(Long stockAmount) {
        regStockAmount(CK_GE, stockAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param stockAmount The value of stockAmount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setStockAmount_LessEqual(Long stockAmount) {
        regStockAmount(CK_LE, stockAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param minNumber The min number of stockAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stockAmount. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStockAmount_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStockAmount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param minNumber The min number of stockAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of stockAmount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStockAmount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockAmount(), "stock_amount", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param stockAmountList The collection of stockAmount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStockAmount_InScope(Collection<Long> stockAmountList) {
        doSetStockAmount_InScope(stockAmountList);
    }

    protected void doSetStockAmount_InScope(Collection<Long> stockAmountList) {
        regINS(CK_INS, cTL(stockAmountList), xgetCValueStockAmount(), "stock_amount");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * stock_amount: {NotNull, int8(19)}
     * @param stockAmountList The collection of stockAmount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStockAmount_NotInScope(Collection<Long> stockAmountList) {
        doSetStockAmount_NotInScope(stockAmountList);
    }

    protected void doSetStockAmount_NotInScope(Collection<Long> stockAmountList) {
        regINS(CK_NINS, cTL(stockAmountList), xgetCValueStockAmount(), "stock_amount");
    }

    protected void regStockAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockAmount(), "stock_amount"); }
    protected abstract ConditionValue xgetCValueStockAmount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param versionNo The value of versionNo as notEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_NotEqual(Integer versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Integer versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "version_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "version_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * version_no: {NotNull, int4(10)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "version_no");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "version_no"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param delFlag The value of delFlag as equal. (NullAllowed: if null, no condition)
     */
    public void setDelFlag_Equal(Integer delFlag) {
        doSetDelFlag_Equal(delFlag);
    }

    protected void doSetDelFlag_Equal(Integer delFlag) {
        regDelFlag(CK_EQ, delFlag);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param delFlag The value of delFlag as notEqual. (NullAllowed: if null, no condition)
     */
    public void setDelFlag_NotEqual(Integer delFlag) {
        doSetDelFlag_NotEqual(delFlag);
    }

    protected void doSetDelFlag_NotEqual(Integer delFlag) {
        regDelFlag(CK_NES, delFlag);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param delFlag The value of delFlag as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDelFlag_GreaterThan(Integer delFlag) {
        regDelFlag(CK_GT, delFlag);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param delFlag The value of delFlag as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDelFlag_LessThan(Integer delFlag) {
        regDelFlag(CK_LT, delFlag);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param delFlag The value of delFlag as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDelFlag_GreaterEqual(Integer delFlag) {
        regDelFlag(CK_GE, delFlag);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param delFlag The value of delFlag as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDelFlag_LessEqual(Integer delFlag) {
        regDelFlag(CK_LE, delFlag);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param minNumber The min number of delFlag. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of delFlag. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDelFlag_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDelFlag_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param minNumber The min number of delFlag. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of delFlag. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDelFlag_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelFlag(), "del_flag", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param delFlagList The collection of delFlag as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDelFlag_InScope(Collection<Integer> delFlagList) {
        doSetDelFlag_InScope(delFlagList);
    }

    protected void doSetDelFlag_InScope(Collection<Integer> delFlagList) {
        regINS(CK_INS, cTL(delFlagList), xgetCValueDelFlag(), "del_flag");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * del_flag: {+UQ, NotNull, int4(10), default=[0]}
     * @param delFlagList The collection of delFlag as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDelFlag_NotInScope(Collection<Integer> delFlagList) {
        doSetDelFlag_NotInScope(delFlagList);
    }

    protected void doSetDelFlag_NotInScope(Collection<Integer> delFlagList) {
        regINS(CK_NINS, cTL(delFlagList), xgetCValueDelFlag(), "del_flag");
    }

    protected void regDelFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlag(), "del_flag"); }
    protected abstract ConditionValue xgetCValueDelFlag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @param registerDatetime The value of registerDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(29, 6)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUser The value of registerUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUser The value of registerUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterThan(String registerUser) {
        regRegisterUser(CK_GT, fRES(registerUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUser The value of registerUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessThan(String registerUser) {
        regRegisterUser(CK_LT, fRES(registerUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUser The value of registerUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterEqual(String registerUser) {
        regRegisterUser(CK_GE, fRES(registerUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUser The value of registerUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessEqual(String registerUser) {
        regRegisterUser(CK_LE, fRES(registerUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUserList The collection of registerUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    protected void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUserList The collection of registerUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    protected void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_LikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_NotLikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(30)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "register_user"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcess The value of registerProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcess The value of registerProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotEqual(String registerProcess) {
        doSetRegisterProcess_NotEqual(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_NotEqual(String registerProcess) {
        regRegisterProcess(CK_NES, registerProcess);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcess The value of registerProcess as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_GreaterThan(String registerProcess) {
        regRegisterProcess(CK_GT, fRES(registerProcess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcess The value of registerProcess as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_LessThan(String registerProcess) {
        regRegisterProcess(CK_LT, fRES(registerProcess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcess The value of registerProcess as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_GreaterEqual(String registerProcess) {
        regRegisterProcess(CK_GE, fRES(registerProcess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcess The value of registerProcess as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_LessEqual(String registerProcess) {
        regRegisterProcess(CK_LE, fRES(registerProcess));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcessList The collection of registerProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_InScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_InScope(registerProcessList);
    }

    protected void doSetRegisterProcess_InScope(Collection<String> registerProcessList) {
        regINS(CK_INS, cTL(registerProcessList), xgetCValueRegisterProcess(), "register_process");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcessList The collection of registerProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_NotInScope(registerProcessList);
    }

    protected void doSetRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        regINS(CK_NINS, cTL(registerProcessList), xgetCValueRegisterProcess(), "register_process");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRegisterProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerProcess The value of registerProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterProcess_LikeSearch(String registerProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterProcess_LikeSearch(registerProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRegisterProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerProcess The value of registerProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterProcess_LikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerProcess), xgetCValueRegisterProcess(), "register_process", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcess The value of registerProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterProcess_NotLikeSearch(String registerProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterProcess_NotLikeSearch(registerProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(30)}
     * @param registerProcess The value of registerProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterProcess_NotLikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerProcess), xgetCValueRegisterProcess(), "register_process", likeSearchOption);
    }

    protected void regRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterProcess(), "register_process"); }
    protected abstract ConditionValue xgetCValueRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @param updateDatetime The value of updateDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(29, 6)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUser The value of updateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUser The value of updateUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterThan(String updateUser) {
        regUpdateUser(CK_GT, fRES(updateUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUser The value of updateUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessThan(String updateUser) {
        regUpdateUser(CK_LT, fRES(updateUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUser The value of updateUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterEqual(String updateUser) {
        regUpdateUser(CK_GE, fRES(updateUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUser The value of updateUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessEqual(String updateUser) {
        regUpdateUser(CK_LE, fRES(updateUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUserList The collection of updateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    protected void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUserList The collection of updateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    protected void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_LikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_NotLikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(30)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "update_user"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcess The value of updateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcess The value of updateProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotEqual(String updateProcess) {
        doSetUpdateProcess_NotEqual(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_NotEqual(String updateProcess) {
        regUpdateProcess(CK_NES, updateProcess);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcess The value of updateProcess as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_GreaterThan(String updateProcess) {
        regUpdateProcess(CK_GT, fRES(updateProcess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcess The value of updateProcess as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_LessThan(String updateProcess) {
        regUpdateProcess(CK_LT, fRES(updateProcess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcess The value of updateProcess as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_GreaterEqual(String updateProcess) {
        regUpdateProcess(CK_GE, fRES(updateProcess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcess The value of updateProcess as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_LessEqual(String updateProcess) {
        regUpdateProcess(CK_LE, fRES(updateProcess));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcessList The collection of updateProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_InScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_InScope(updateProcessList);
    }

    protected void doSetUpdateProcess_InScope(Collection<String> updateProcessList) {
        regINS(CK_INS, cTL(updateProcessList), xgetCValueUpdateProcess(), "update_process");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcessList The collection of updateProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_NotInScope(updateProcessList);
    }

    protected void doSetUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        regINS(CK_NINS, cTL(updateProcessList), xgetCValueUpdateProcess(), "update_process");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUpdateProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateProcess The value of updateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateProcess_LikeSearch(String updateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateProcess_LikeSearch(updateProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUpdateProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateProcess The value of updateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateProcess_LikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateProcess), xgetCValueUpdateProcess(), "update_process", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcess The value of updateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateProcess_NotLikeSearch(String updateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateProcess_NotLikeSearch(updateProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(30)}
     * @param updateProcess The value of updateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateProcess_NotLikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateProcess), xgetCValueUpdateProcess(), "update_process", likeSearchOption);
    }

    protected void regUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateProcess(), "update_process"); }
    protected abstract ConditionValue xgetCValueUpdateProcess();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StockCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, StockCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StockCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, StockCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StockCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, StockCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StockCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, StockCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StockCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, StockCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;StockCB&gt;() {
     *     public void query(StockCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StockCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, StockCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        StockCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(StockCQ sq);

    protected StockCB xcreateScalarConditionCB() {
        StockCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected StockCB xcreateScalarConditionPartitionByCB() {
        StockCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<StockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StockCB cb = new StockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(StockCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<StockCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(StockCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StockCB cb = new StockCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(StockCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<StockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        StockCB cb = new StockCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(StockCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected StockCB newMyCB() {
        return new StockCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return StockCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
