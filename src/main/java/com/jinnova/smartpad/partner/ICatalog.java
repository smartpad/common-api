package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface ICatalog {
	
	IName getName();

	ICatalog[] getSubCatalogs();
	
	ICatalogItem[] getItems();
	
	void loadChildren() throws SQLException;
	
	ICatalog newSubCatalogInstance();
	
	ICatalogItem newCatalogItemInstance();
	
	void putSubCatalog(IUser authorizedUser, ICatalog cat) throws SQLException;
	
	void putCatalogItem(IUser authorizedUser, ICatalogItem item) throws SQLException;
	
	void delete(IUser authorizedUser, ICatalog cat);
	
	void delete(IUser authorizedUser, ICatalogItem item);
}
