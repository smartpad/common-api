package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface ICatalog {
	
	IName getName();

	ICatalog[] getSubCatalogs();
	
	ICatalogItem[] getItems();
	
	void loadChildren() throws SQLException;
	
	ICatalog newSubCatalogInstance();
	
	ICatalogItem newCatalogItemInstance();
	
	void putSubCatalog(ICatalog cat) throws SQLException;
	
	void putCatalogItem(ICatalogItem item) throws SQLException;
	
	void delete(ICatalog cat);
	
	void delete(ICatalogItem item);
}
