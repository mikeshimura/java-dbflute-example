package com.mssoftech.web.util;

import javax.sql.DataSource;

import org.apache.commons.codec.digest.DigestUtils;

import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean;

public class DbUtil {
	public static DataSource createDataSource() throws Exception {
		String[] dbinfo = System.getenv("DATABASE_URL").split(":");
		String[] split2=dbinfo[2].split("@");
		AtomikosNonXADataSourceBean bean = new AtomikosNonXADataSourceBean();
		bean.setUniqueResourceName("NONXADBMS");
		bean.setDriverClassName("org.postgresql.Driver");
		String url = "jdbc:postgresql://"+split2[1]+":"+dbinfo[3];
		bean.setUrl(url);
		//bean.setUrl("jdbc:postgresql://localhost:5432/godbfexam");
		bean.setUser(dbinfo[1].substring(2));
		bean.setPassword(split2[0]);
		bean.setPoolSize(20);
		bean.setBorrowConnectionTimeout(60);
		return bean;
	}
	public static String createMd5(String data) {
		return DigestUtils.md5Hex(data);
	}

}
