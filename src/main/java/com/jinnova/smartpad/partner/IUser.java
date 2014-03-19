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

	IBranch loadBranch() throws SQLException;

}