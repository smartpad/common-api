package com.jinnova.smartpad.partner;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import com.jinnova.smartpad.IPagingList;

public interface IPartnerManager {

	//void clearDatabaseForTests() throws SQLException, FileNotFoundException, IOException;
	
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
	
	void setImage(String typeName, String subTypeName, String entityId, String imageId, InputStream image) throws IOException;
	
	BufferedImage getImage(String typeName, String subTypeName, String entityId, String imageId, int size) throws IOException;
}
