package com.jinnova.smartpad.partner;

public interface IUser {

	public abstract String getLogin();

	public abstract String getPasshash();

	public abstract void setPasshash(String passhash);

	public abstract String getBranchId();

}