package com.jinnova.smartpad.partner;

import java.sql.SQLException;
import java.util.LinkedList;

public interface IPartnerManager {

	/*
	 * User APIs
	 * */
	IUser createPrimaryUser(String login, String password) throws SQLException;

	IUser login(String login, String password) throws SQLException;

	IUser createUser(IUser authorizedUser, String login, String passhash) throws SQLException;

	void updateUser(IUser authorizedUser, IUser u) throws SQLException;

	void deleteUser(IUser authorizedUser, IUser u) throws SQLException;
	
	LinkedList<IUser> listUsers(IUser authorizedUser) throws SQLException;
}
