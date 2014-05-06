package com.jinnova.smartpad.partner;

import com.jinnova.smartpad.IName;
import com.jinnova.smartpad.IPagingList;

public interface ICatalog extends IRecordInfoHolder {
	
	String getId();
	
	IName getDesc();
	
	String getName();
	
	void setName(String name);
	
	IRecordInfo getRecordInfo();
	
	IPagingList<ICatalog, ICatalogSort> getSubCatalogPagingList();
	
	IPagingList<ICatalogItem, ICatalogItemSort> getCatalogItemPagingList();
	
	ICatalog getSystemCatalog();
	
	void setSystemCatalogId(String systemCatalogId);
	
	ICatalogSpec getCatalogSpec();
}
