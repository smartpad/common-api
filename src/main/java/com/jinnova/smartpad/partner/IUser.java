package com.jinnova.smartpad.partner;

public interface IUser {
	
	boolean isPrimary();

	String getLogin();

	String getPasshash();

	void setPasshash(String passhash);

	String getBranchId();

}