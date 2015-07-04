package dbfexample.module;

import javax.sql.DataSource;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.google.inject.AbstractModule;

public class TransactionModule extends AbstractModule {

	protected DataSource dataSource;

	public TransactionModule(DataSource dataSource) {
		if (dataSource == null) {
			String msg = "The argument 'dataSource' should not be null!";
			throw new IllegalArgumentException(msg);
		}
		this.dataSource = dataSource;
	}

	@Override
	protected void configure() {
		try {
			UserTransactionImp userTransactionImp = new UserTransactionImp();
			userTransactionImp.setTransactionTimeout(300);
			UserTransactionManager userTransactionManager = new UserTransactionManager();
			userTransactionManager.setForceShutdown(true);
			userTransactionManager.init();
			bind(UserTransaction.class).toInstance(userTransactionImp);
			bind(TransactionManager.class).toInstance(
					userTransactionManager);

			bind(DataSource.class).toInstance(dataSource);
		} catch (SystemException e) {
			throw new IllegalStateException(e);
		}
	}
}