package com.jinnova.smartpad.partner;

import java.sql.SQLException;

import com.jinnova.smartpad.IPagingList;

public interface IUser extends IRecordInfoHolder {
	
	boolean isPrimary();

	String getLogin();

	void setLogin(String login);

	void setPassword(String password);

	IRecordInfo getRecordInfo();

	/*
	 * Branch APIs
	 * 
	 * */
	void updateBranch() throws SQLException;

	IOperation getBranch();

	IPagingList<IOperation, IOperationSort> getStorePagingList() throws SQLException;

}