package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface IUser {
	
	boolean isPrimary();

	String getLogin();

	//String getPasshash();

	void setPassword(String password);

	//String getBranchId();

	/*
	 * Branch APIs
	 * 
	 * */
	void updateBranch() throws SQLException;

	IOperation loadBranch() throws SQLException;

	IOperation[] loadStores() throws SQLException;
	
	IOperation newStoreInstance();
	
	void putStore(IOperation store) throws SQLException;
	
	void deleteStore(IOperation store) throws SQLException;

}