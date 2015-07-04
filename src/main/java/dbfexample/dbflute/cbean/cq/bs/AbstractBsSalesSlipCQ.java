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
 * The abstract condition-query of sales_slip.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSalesSlipCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSalesSlipCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "sales_slip";
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param slipNo The value of slipNo as equal. (NullAllowed: if null, no condition)
     */
    public void setSlipNo_Equal(Integer slipNo) {
        doSetSlipNo_Equal(slipNo);
    }

    protected void doSetSlipNo_Equal(Integer slipNo) {
        regSlipNo(CK_EQ, slipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param slipNo The value of slipNo as notEqual. (NullAllowed: if null, no condition)
     */
    public void setSlipNo_NotEqual(Integer slipNo) {
        doSetSlipNo_NotEqual(slipNo);
    }

    protected void doSetSlipNo_NotEqual(Integer slipNo) {
        regSlipNo(CK_NES, slipNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param slipNo The value of slipNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSlipNo_GreaterThan(Integer slipNo) {
        regSlipNo(CK_GT, slipNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param slipNo The value of slipNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSlipNo_LessThan(Integer slipNo) {
        regSlipNo(CK_LT, slipNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param slipNo The value of slipNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSlipNo_GreaterEqual(Integer slipNo) {
        regSlipNo(CK_GE, slipNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param slipNo The value of slipNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSlipNo_LessEqual(Integer slipNo) {
        regSlipNo(CK_LE, slipNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param minNumber The min number of slipNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of slipNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSlipNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSlipNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param minNumber The min number of slipNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of slipNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSlipNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlipNo(), "slip_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param slipNoList The collection of slipNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSlipNo_InScope(Collection<Integer> slipNoList) {
        doSetSlipNo_InScope(slipNoList);
    }

    protected void doSetSlipNo_InScope(Collection<Integer> slipNoList) {
        regINS(CK_INS, cTL(slipNoList), xgetCValueSlipNo(), "slip_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * slip_no: {UQ+, NotNull, int4(10)}
     * @param slipNoList The collection of slipNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSlipNo_NotInScope(Collection<Integer> slipNoList) {
        doSetSlipNo_NotInScope(slipNoList);
    }

    protected void doSetSlipNo_NotInScope(Collection<Integer> slipNoList) {
        regINS(CK_NINS, cTL(slipNoList), xgetCValueSlipNo(), "slip_no");
    }

    protected void regSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipNo(), "slip_no"); }
    protected abstract ConditionValue xgetCValueSlipNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param line The value of line as equal. (NullAllowed: if null, no condition)
     */
    public void setLine_Equal(Integer line) {
        doSetLine_Equal(line);
    }

    protected void doSetLine_Equal(Integer line) {
        regLine(CK_EQ, line);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param line The value of line as notEqual. (NullAllowed: if null, no condition)
     */
    public void setLine_NotEqual(Integer line) {
        doSetLine_NotEqual(line);
    }

    protected void doSetLine_NotEqual(Integer line) {
        regLine(CK_NES, line);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param line The value of line as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLine_GreaterThan(Integer line) {
        regLine(CK_GT, line);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param line The value of line as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLine_LessThan(Integer line) {
        regLine(CK_LT, line);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param line The value of line as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLine_GreaterEqual(Integer line) {
        regLine(CK_GE, line);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param line The value of line as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLine_LessEqual(Integer line) {
        regLine(CK_LE, line);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param minNumber The min number of line. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of line. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLine_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLine_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param minNumber The min number of line. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of line. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLine_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLine(), "line", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param lineList The collection of line as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLine_InScope(Collection<Integer> lineList) {
        doSetLine_InScope(lineList);
    }

    protected void doSetLine_InScope(Collection<Integer> lineList) {
        regINS(CK_INS, cTL(lineList), xgetCValueLine(), "line");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * line: {+UQ, NotNull, int4(10)}
     * @param lineList The collection of line as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLine_NotInScope(Collection<Integer> lineList) {
        doSetLine_NotInScope(lineList);
    }

    protected void doSetLine_NotInScope(Collection<Integer> lineList) {
        regINS(CK_NINS, cTL(lineList), xgetCValueLine(), "line");
    }

    protected void regLine(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLine(), "line"); }
    protected abstract ConditionValue xgetCValueLine();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_date: {NotNull, date(13)}
     * @param salesDate The value of salesDate as equal. (NullAllowed: if null, no condition)
     */
    public void setSalesDate_Equal(java.time.LocalDate salesDate) {
        regSalesDate(CK_EQ,  salesDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_date: {NotNull, date(13)}
     * @param salesDate The value of salesDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSalesDate_GreaterThan(java.time.LocalDate salesDate) {
        regSalesDate(CK_GT,  salesDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_date: {NotNull, date(13)}
     * @param salesDate The value of salesDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSalesDate_LessThan(java.time.LocalDate salesDate) {
        regSalesDate(CK_LT,  salesDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_date: {NotNull, date(13)}
     * @param salesDate The value of salesDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesDate_GreaterEqual(java.time.LocalDate salesDate) {
        regSalesDate(CK_GE,  salesDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_date: {NotNull, date(13)}
     * @param salesDate The value of salesDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesDate_LessEqual(java.time.LocalDate salesDate) {
        regSalesDate(CK_LE, salesDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sales_date: {NotNull, date(13)}
     * <pre>e.g. setSalesDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of salesDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of salesDate. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setSalesDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setSalesDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sales_date: {NotNull, date(13)}
     * <pre>e.g. setSalesDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of salesDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of salesDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setSalesDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "sales_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueSalesDate(), nm, op);
    }

    protected void regSalesDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesDate(), "sales_date"); }
    protected abstract ConditionValue xgetCValueSalesDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param salesId The value of salesId as equal. (NullAllowed: if null, no condition)
     */
    public void setSalesId_Equal(Integer salesId) {
        doSetSalesId_Equal(salesId);
    }

    protected void doSetSalesId_Equal(Integer salesId) {
        regSalesId(CK_EQ, salesId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param salesId The value of salesId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesId_NotEqual(Integer salesId) {
        doSetSalesId_NotEqual(salesId);
    }

    protected void doSetSalesId_NotEqual(Integer salesId) {
        regSalesId(CK_NES, salesId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param salesId The value of salesId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSalesId_GreaterThan(Integer salesId) {
        regSalesId(CK_GT, salesId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param salesId The value of salesId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSalesId_LessThan(Integer salesId) {
        regSalesId(CK_LT, salesId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param salesId The value of salesId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesId_GreaterEqual(Integer salesId) {
        regSalesId(CK_GE, salesId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param salesId The value of salesId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesId_LessEqual(Integer salesId) {
        regSalesId(CK_LE, salesId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param minNumber The min number of salesId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of salesId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSalesId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSalesId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param minNumber The min number of salesId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of salesId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSalesId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSalesId(), "sales_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param salesIdList The collection of salesId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSalesId_InScope(Collection<Integer> salesIdList) {
        doSetSalesId_InScope(salesIdList);
    }

    protected void doSetSalesId_InScope(Collection<Integer> salesIdList) {
        regINS(CK_INS, cTL(salesIdList), xgetCValueSalesId(), "sales_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * sales_id: {IX, NotNull, int4(10), FK to employee}
     * @param salesIdList The collection of salesId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSalesId_NotInScope(Collection<Integer> salesIdList) {
        doSetSalesId_NotInScope(salesIdList);
    }

    protected void doSetSalesId_NotInScope(Collection<Integer> salesIdList) {
        regINS(CK_NINS, cTL(salesIdList), xgetCValueSalesId(), "sales_id");
    }

    protected void regSalesId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesId(), "sales_id"); }
    protected abstract ConditionValue xgetCValueSalesId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param cusId The value of cusId as equal. (NullAllowed: if null, no condition)
     */
    public void setCusId_Equal(Integer cusId) {
        doSetCusId_Equal(cusId);
    }

    protected void doSetCusId_Equal(Integer cusId) {
        regCusId(CK_EQ, cusId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param cusId The value of cusId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setCusId_NotEqual(Integer cusId) {
        doSetCusId_NotEqual(cusId);
    }

    protected void doSetCusId_NotEqual(Integer cusId) {
        regCusId(CK_NES, cusId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param cusId The value of cusId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCusId_GreaterThan(Integer cusId) {
        regCusId(CK_GT, cusId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param cusId The value of cusId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCusId_LessThan(Integer cusId) {
        regCusId(CK_LT, cusId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param cusId The value of cusId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCusId_GreaterEqual(Integer cusId) {
        regCusId(CK_GE, cusId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param cusId The value of cusId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCusId_LessEqual(Integer cusId) {
        regCusId(CK_LE, cusId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param minNumber The min number of cusId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cusId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCusId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCusId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param minNumber The min number of cusId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cusId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCusId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCusId(), "cus_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param cusIdList The collection of cusId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCusId_InScope(Collection<Integer> cusIdList) {
        doSetCusId_InScope(cusIdList);
    }

    protected void doSetCusId_InScope(Collection<Integer> cusIdList) {
        regINS(CK_INS, cTL(cusIdList), xgetCValueCusId(), "cus_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * cus_id: {IX, NotNull, int4(10)}
     * @param cusIdList The collection of cusId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCusId_NotInScope(Collection<Integer> cusIdList) {
        doSetCusId_NotInScope(cusIdList);
    }

    protected void doSetCusId_NotInScope(Collection<Integer> cusIdList) {
        regINS(CK_NINS, cTL(cusIdList), xgetCValueCusId(), "cus_id");
    }

    protected void regCusId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCusId(), "cus_id"); }
    protected abstract ConditionValue xgetCValueCusId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {IX, NotNull, int4(10), FK to product}
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
     * prd_id: {IX, NotNull, int4(10), FK to product}
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
     * prd_id: {IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPrdId_GreaterThan(Integer prdId) {
        regPrdId(CK_GT, prdId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPrdId_LessThan(Integer prdId) {
        regPrdId(CK_LT, prdId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPrdId_GreaterEqual(Integer prdId) {
        regPrdId(CK_GE, prdId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {IX, NotNull, int4(10), FK to product}
     * @param prdId The value of prdId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPrdId_LessEqual(Integer prdId) {
        regPrdId(CK_LE, prdId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * prd_id: {IX, NotNull, int4(10), FK to product}
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
     * prd_id: {IX, NotNull, int4(10), FK to product}
     * @param minNumber The min number of prdId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of prdId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPrdId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrdId(), "prd_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * prd_id: {IX, NotNull, int4(10), FK to product}
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
     * prd_id: {IX, NotNull, int4(10), FK to product}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param qty The value of qty as equal. (NullAllowed: if null, no condition)
     */
    public void setQty_Equal(Integer qty) {
        doSetQty_Equal(qty);
    }

    protected void doSetQty_Equal(Integer qty) {
        regQty(CK_EQ, qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param qty The value of qty as notEqual. (NullAllowed: if null, no condition)
     */
    public void setQty_NotEqual(Integer qty) {
        doSetQty_NotEqual(qty);
    }

    protected void doSetQty_NotEqual(Integer qty) {
        regQty(CK_NES, qty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param qty The value of qty as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setQty_GreaterThan(Integer qty) {
        regQty(CK_GT, qty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param qty The value of qty as lessThan. (NullAllowed: if null, no condition)
     */
    public void setQty_LessThan(Integer qty) {
        regQty(CK_LT, qty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param qty The value of qty as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setQty_GreaterEqual(Integer qty) {
        regQty(CK_GE, qty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param qty The value of qty as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setQty_LessEqual(Integer qty) {
        regQty(CK_LE, qty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param minNumber The min number of qty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of qty. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setQty_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setQty_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param minNumber The min number of qty. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of qty. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setQty_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty(), "qty", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param qtyList The collection of qty as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQty_InScope(Collection<Integer> qtyList) {
        doSetQty_InScope(qtyList);
    }

    protected void doSetQty_InScope(Collection<Integer> qtyList) {
        regINS(CK_INS, cTL(qtyList), xgetCValueQty(), "qty");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * qty: {NotNull, int4(10)}
     * @param qtyList The collection of qty as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setQty_NotInScope(Collection<Integer> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<Integer> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "qty");
    }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "qty"); }
    protected abstract ConditionValue xgetCValueQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(30)}
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
     * unit: {NotNull, varchar(30)}
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
     * unit: {NotNull, varchar(30)}
     * @param unit The value of unit as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_GreaterThan(String unit) {
        regUnit(CK_GT, fRES(unit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(30)}
     * @param unit The value of unit as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_LessThan(String unit) {
        regUnit(CK_LT, fRES(unit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(30)}
     * @param unit The value of unit as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_GreaterEqual(String unit) {
        regUnit(CK_GE, fRES(unit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unit: {NotNull, varchar(30)}
     * @param unit The value of unit as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnit_LessEqual(String unit) {
        regUnit(CK_LE, fRES(unit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * unit: {NotNull, varchar(30)}
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
     * unit: {NotNull, varchar(30)}
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
     * unit: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUnit_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param unit The value of unit as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUnit_LikeSearch(String unit, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUnit_LikeSearch(unit, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unit: {NotNull, varchar(30)} <br>
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
     * unit: {NotNull, varchar(30)}
     * @param unit The value of unit as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUnit_NotLikeSearch(String unit, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUnit_NotLikeSearch(unit, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unit: {NotNull, varchar(30)}
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
     * unit_price: {NotNull, int4(10)}
     * @param unitPrice The value of unitPrice as equal. (NullAllowed: if null, no condition)
     */
    public void setUnitPrice_Equal(Integer unitPrice) {
        doSetUnitPrice_Equal(unitPrice);
    }

    protected void doSetUnitPrice_Equal(Integer unitPrice) {
        regUnitPrice(CK_EQ, unitPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * unit_price: {NotNull, int4(10)}
     * @param unitPrice The value of unitPrice as notEqual. (NullAllowed: if null, no condition)
     */
    public void setUnitPrice_NotEqual(Integer unitPrice) {
        doSetUnitPrice_NotEqual(unitPrice);
    }

    protected void doSetUnitPrice_NotEqual(Integer unitPrice) {
        regUnitPrice(CK_NES, unitPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * unit_price: {NotNull, int4(10)}
     * @param unitPrice The value of unitPrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUnitPrice_GreaterThan(Integer unitPrice) {
        regUnitPrice(CK_GT, unitPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * unit_price: {NotNull, int4(10)}
     * @param unitPrice The value of unitPrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUnitPrice_LessThan(Integer unitPrice) {
        regUnitPrice(CK_LT, unitPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * unit_price: {NotNull, int4(10)}
     * @param unitPrice The value of unitPrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUnitPrice_GreaterEqual(Integer unitPrice) {
        regUnitPrice(CK_GE, unitPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * unit_price: {NotNull, int4(10)}
     * @param unitPrice The value of unitPrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUnitPrice_LessEqual(Integer unitPrice) {
        regUnitPrice(CK_LE, unitPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * unit_price: {NotNull, int4(10)}
     * @param minNumber The min number of unitPrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of unitPrice. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUnitPrice_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUnitPrice_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * unit_price: {NotNull, int4(10)}
     * @param minNumber The min number of unitPrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of unitPrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUnitPrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitPrice(), "unit_price", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * unit_price: {NotNull, int4(10)}
     * @param unitPriceList The collection of unitPrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnitPrice_InScope(Collection<Integer> unitPriceList) {
        doSetUnitPrice_InScope(unitPriceList);
    }

    protected void doSetUnitPrice_InScope(Collection<Integer> unitPriceList) {
        regINS(CK_INS, cTL(unitPriceList), xgetCValueUnitPrice(), "unit_price");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * unit_price: {NotNull, int4(10)}
     * @param unitPriceList The collection of unitPrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUnitPrice_NotInScope(Collection<Integer> unitPriceList) {
        doSetUnitPrice_NotInScope(unitPriceList);
    }

    protected void doSetUnitPrice_NotInScope(Collection<Integer> unitPriceList) {
        regINS(CK_NINS, cTL(unitPriceList), xgetCValueUnitPrice(), "unit_price");
    }

    protected void regUnitPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitPrice(), "unit_price"); }
    protected abstract ConditionValue xgetCValueUnitPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param salesAmount The value of salesAmount as equal. (NullAllowed: if null, no condition)
     */
    public void setSalesAmount_Equal(Long salesAmount) {
        doSetSalesAmount_Equal(salesAmount);
    }

    protected void doSetSalesAmount_Equal(Long salesAmount) {
        regSalesAmount(CK_EQ, salesAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param salesAmount The value of salesAmount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesAmount_NotEqual(Long salesAmount) {
        doSetSalesAmount_NotEqual(salesAmount);
    }

    protected void doSetSalesAmount_NotEqual(Long salesAmount) {
        regSalesAmount(CK_NES, salesAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param salesAmount The value of salesAmount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSalesAmount_GreaterThan(Long salesAmount) {
        regSalesAmount(CK_GT, salesAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param salesAmount The value of salesAmount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSalesAmount_LessThan(Long salesAmount) {
        regSalesAmount(CK_LT, salesAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param salesAmount The value of salesAmount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesAmount_GreaterEqual(Long salesAmount) {
        regSalesAmount(CK_GE, salesAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param salesAmount The value of salesAmount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSalesAmount_LessEqual(Long salesAmount) {
        regSalesAmount(CK_LE, salesAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param minNumber The min number of salesAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of salesAmount. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSalesAmount_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSalesAmount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param minNumber The min number of salesAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of salesAmount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSalesAmount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSalesAmount(), "sales_amount", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param salesAmountList The collection of salesAmount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSalesAmount_InScope(Collection<Long> salesAmountList) {
        doSetSalesAmount_InScope(salesAmountList);
    }

    protected void doSetSalesAmount_InScope(Collection<Long> salesAmountList) {
        regINS(CK_INS, cTL(salesAmountList), xgetCValueSalesAmount(), "sales_amount");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * sales_amount: {NotNull, int8(19)}
     * @param salesAmountList The collection of salesAmount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSalesAmount_NotInScope(Collection<Long> salesAmountList) {
        doSetSalesAmount_NotInScope(salesAmountList);
    }

    protected void doSetSalesAmount_NotInScope(Collection<Long> salesAmountList) {
        regINS(CK_NINS, cTL(salesAmountList), xgetCValueSalesAmount(), "sales_amount");
    }

    protected void regSalesAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesAmount(), "sales_amount"); }
    protected abstract ConditionValue xgetCValueSalesAmount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param slipAmount The value of slipAmount as equal. (NullAllowed: if null, no condition)
     */
    public void setSlipAmount_Equal(Long slipAmount) {
        doSetSlipAmount_Equal(slipAmount);
    }

    protected void doSetSlipAmount_Equal(Long slipAmount) {
        regSlipAmount(CK_EQ, slipAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param slipAmount The value of slipAmount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setSlipAmount_NotEqual(Long slipAmount) {
        doSetSlipAmount_NotEqual(slipAmount);
    }

    protected void doSetSlipAmount_NotEqual(Long slipAmount) {
        regSlipAmount(CK_NES, slipAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param slipAmount The value of slipAmount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSlipAmount_GreaterThan(Long slipAmount) {
        regSlipAmount(CK_GT, slipAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param slipAmount The value of slipAmount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSlipAmount_LessThan(Long slipAmount) {
        regSlipAmount(CK_LT, slipAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param slipAmount The value of slipAmount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSlipAmount_GreaterEqual(Long slipAmount) {
        regSlipAmount(CK_GE, slipAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param slipAmount The value of slipAmount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSlipAmount_LessEqual(Long slipAmount) {
        regSlipAmount(CK_LE, slipAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param minNumber The min number of slipAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of slipAmount. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSlipAmount_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSlipAmount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param minNumber The min number of slipAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of slipAmount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSlipAmount_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlipAmount(), "slip_amount", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param slipAmountList The collection of slipAmount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSlipAmount_InScope(Collection<Long> slipAmountList) {
        doSetSlipAmount_InScope(slipAmountList);
    }

    protected void doSetSlipAmount_InScope(Collection<Long> slipAmountList) {
        regINS(CK_INS, cTL(slipAmountList), xgetCValueSlipAmount(), "slip_amount");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * slip_amount: {NotNull, int8(19)}
     * @param slipAmountList The collection of slipAmount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSlipAmount_NotInScope(Collection<Long> slipAmountList) {
        doSetSlipAmount_NotInScope(slipAmountList);
    }

    protected void doSetSlipAmount_NotInScope(Collection<Long> slipAmountList) {
        regINS(CK_NINS, cTL(slipAmountList), xgetCValueSlipAmount(), "slip_amount");
    }

    protected void regSlipAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipAmount(), "slip_amount"); }
    protected abstract ConditionValue xgetCValueSlipAmount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param slipCons The value of slipCons as equal. (NullAllowed: if null, no condition)
     */
    public void setSlipCons_Equal(Long slipCons) {
        doSetSlipCons_Equal(slipCons);
    }

    protected void doSetSlipCons_Equal(Long slipCons) {
        regSlipCons(CK_EQ, slipCons);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param slipCons The value of slipCons as notEqual. (NullAllowed: if null, no condition)
     */
    public void setSlipCons_NotEqual(Long slipCons) {
        doSetSlipCons_NotEqual(slipCons);
    }

    protected void doSetSlipCons_NotEqual(Long slipCons) {
        regSlipCons(CK_NES, slipCons);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param slipCons The value of slipCons as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSlipCons_GreaterThan(Long slipCons) {
        regSlipCons(CK_GT, slipCons);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param slipCons The value of slipCons as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSlipCons_LessThan(Long slipCons) {
        regSlipCons(CK_LT, slipCons);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param slipCons The value of slipCons as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSlipCons_GreaterEqual(Long slipCons) {
        regSlipCons(CK_GE, slipCons);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param slipCons The value of slipCons as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSlipCons_LessEqual(Long slipCons) {
        regSlipCons(CK_LE, slipCons);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param minNumber The min number of slipCons. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of slipCons. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSlipCons_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSlipCons_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param minNumber The min number of slipCons. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of slipCons. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSlipCons_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlipCons(), "slip_cons", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param slipConsList The collection of slipCons as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSlipCons_InScope(Collection<Long> slipConsList) {
        doSetSlipCons_InScope(slipConsList);
    }

    protected void doSetSlipCons_InScope(Collection<Long> slipConsList) {
        regINS(CK_INS, cTL(slipConsList), xgetCValueSlipCons(), "slip_cons");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * slip_cons: {NotNull, int8(19)}
     * @param slipConsList The collection of slipCons as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSlipCons_NotInScope(Collection<Long> slipConsList) {
        doSetSlipCons_NotInScope(slipConsList);
    }

    protected void doSetSlipCons_NotInScope(Collection<Long> slipConsList) {
        regINS(CK_NINS, cTL(slipConsList), xgetCValueSlipCons(), "slip_cons");
    }

    protected void regSlipCons(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipCons(), "slip_cons"); }
    protected abstract ConditionValue xgetCValueSlipCons();

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
    public HpSLCFunction<SalesSlipCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, SalesSlipCB.class);
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
    public HpSLCFunction<SalesSlipCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, SalesSlipCB.class);
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
    public HpSLCFunction<SalesSlipCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, SalesSlipCB.class);
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
    public HpSLCFunction<SalesSlipCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, SalesSlipCB.class);
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
    public HpSLCFunction<SalesSlipCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, SalesSlipCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SalesSlipCB&gt;() {
     *     public void query(SalesSlipCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SalesSlipCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, SalesSlipCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        SalesSlipCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(SalesSlipCQ sq);

    protected SalesSlipCB xcreateScalarConditionCB() {
        SalesSlipCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SalesSlipCB xcreateScalarConditionPartitionByCB() {
        SalesSlipCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SalesSlipCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SalesSlipCB cb = new SalesSlipCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SalesSlipCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SalesSlipCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SalesSlipCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SalesSlipCB cb = new SalesSlipCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SalesSlipCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SalesSlipCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SalesSlipCB cb = new SalesSlipCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SalesSlipCQ sq);

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
    protected SalesSlipCB newMyCB() {
        return new SalesSlipCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SalesSlipCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
