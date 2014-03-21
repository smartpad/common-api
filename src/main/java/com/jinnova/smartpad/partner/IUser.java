package com.jinnova.smartpad.partner;

import java.sql.SQLException;

import com.jinnova.smartpad.IPagingList;

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

	IPagingList<IOperation, IOperationSort> getStorePagingList() throws SQLException;

}