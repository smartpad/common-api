package com.jinnova.smartpad.partner;

import java.sql.SQLException;

import com.jinnova.smartpad.IPagingList;

public interface IPartnerManager {

	void clearDatabaseForTests() throws SQLException;
	
	IUser getSystemUser();

	/*
	 * User APIs
	 * */
	IUser createPrimaryUser(String login, String password) throws SQLException;

	IUser login(String login, String password) throws SQLException;

	IPagingList<IUser, IUserSort> getUserPagingList() throws SQLException;
	
	ICatalog getSystemRootCatalog();
	
	ICatalog getSystemCatalog(String systemCatId);
	
	ICatalogSpec getCatalogSpec(String specId);
}
