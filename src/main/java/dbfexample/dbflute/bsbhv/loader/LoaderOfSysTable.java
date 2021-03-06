package dbfexample.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import dbfexample.dbflute.exbhv.*;
import dbfexample.dbflute.exentity.*;

/**
 * The referrer loader of sys_table as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, table_name, key_1, key_2, s1_data, s2_data, s3_data, n1_data, n2_data, n3_data, version_no, del_flag, register_datetime, register_user, register_process, update_datetime, update_user, update_process
 *
 * [sequence]
 *     sys_table_id_seq
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSysTable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SysTable> _selectedList;
    protected BehaviorSelector _selector;
    protected SysTableBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSysTable ready(List<SysTable> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SysTableBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SysTableBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SysTable> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
