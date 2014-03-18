package com.jinnova.smartpad.db;

import java.sql.SQLException;

import com.jinnova.smartpad.partner.IUser;

public interface IUserDao {

	IUser createPrimaryUser(String string, String string2) throws SQLException;

	IUser loadUser(String login) throws SQLException;

	IUser createUser(IUser primaryUser, String login, String passhash) throws SQLException;

	void updateUser(IUser u) throws SQLException;

	void deleteUser(IUser u) throws SQLException;

}
