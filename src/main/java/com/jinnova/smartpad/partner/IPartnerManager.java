package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface IPartnerManager {

	IUser createPrimaryUser(String login, String password) throws SQLException;

	IUser loadUser(String login) throws SQLException;

	IUser createUser(IUser primaryUser, String login, String passhash) throws SQLException;

	void updateUser(IUser u) throws SQLException;

	void deleteUser(IUser u) throws SQLException;

	void updateBranch(IBranch branch) throws SQLException;

	IBranch loadBranch(String branchId) throws SQLException;
}
