package dbfexample.dbflute.allcommon;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.dbflute.hook.CommonColumnAutoSetupper;
import dbfexample.dbflute.exbhv.*;

/**
 * @author DBFlute(AutoGenerator)
 */
public class DBFluteModule extends AbstractModule {

    protected final DataSource dataSource;

    public DBFluteModule(DataSource dataSource) {
        if (dataSource == null) {
            String msg = "The argument 'dataSource' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        this.dataSource = dataSource;
    }

    @Override
    protected void configure() {
        createDBFluteInitializer(); // initialized by only a creation

        // The components of DBFlute Runtime.
        ImplementedBehaviorSelector behaviorSelector = createImplementedBehaviorSelector();
        BehaviorCommandInvoker behaviorCommandInvoker = createBehaviorCommandInvoker();
        ImplementedInvokerAssistant invokerAssistant = createImplementedInvokerAssistant();
        behaviorCommandInvoker.setInvokerAssistant(invokerAssistant);
        ImplementedCommonColumnAutoSetupper commonColumnAutoSetupper = createImplementedCommonColumnAutoSetupper();

        bind(BehaviorSelector.class).toInstance(behaviorSelector);
        bind(BehaviorCommandInvoker.class).toInstance(behaviorCommandInvoker);
        bind(InvokerAssistant.class).toInstance(invokerAssistant);
        bind(CommonColumnAutoSetupper.class).toInstance(commonColumnAutoSetupper);

        // The components of Behavior.
        setupBehavior(behaviorCommandInvoker, behaviorSelector, commonColumnAutoSetupper);
    }

    protected DBFluteInitializer createDBFluteInitializer() {
        return new dbfexample.dbflute.allcommon.DBFluteInitializer();
    }

    protected ImplementedBehaviorSelector createImplementedBehaviorSelector() {
        return new ImplementedBehaviorSelector();
    }

    protected BehaviorCommandInvoker createBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    protected ImplementedInvokerAssistant createImplementedInvokerAssistant() {
        ImplementedInvokerAssistant invokerAssistant = new dbfexample.dbflute.allcommon.ImplementedInvokerAssistant();
        invokerAssistant.setDataSource(dataSource);
        return invokerAssistant;
    }

    protected ImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return new dbfexample.dbflute.allcommon.ImplementedCommonColumnAutoSetupper();
    }

    protected void setupBehavior(BehaviorCommandInvoker ker, BehaviorSelector tor, CommonColumnAutoSetupper per) {
        {
            CustomerBhv bhv = new CustomerBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(CustomerBhv.class).toInstance(bhv);
        }
        {
            EmployeeBhv bhv = new EmployeeBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(EmployeeBhv.class).toInstance(bhv);
        }
        {
            LoginBhv bhv = new LoginBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(LoginBhv.class).toInstance(bhv);
        }
        {
            ProductBhv bhv = new ProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductBhv.class).toInstance(bhv);
        }
        {
            SalesSlipBhv bhv = new SalesSlipBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(SalesSlipBhv.class).toInstance(bhv);
        }
        {
            SessionBhv bhv = new SessionBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(SessionBhv.class).toInstance(bhv);
        }
        {
            StockBhv bhv = new StockBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(StockBhv.class).toInstance(bhv);
        }
        {
            SysTableBhv bhv = new SysTableBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(SysTableBhv.class).toInstance(bhv);
        }
        {
            UserTableBhv bhv = new UserTableBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(UserTableBhv.class).toInstance(bhv);
        }
    }
}
