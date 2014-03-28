package com.jinnova.smartpad.partner;

import com.jinnova.smartpad.IName;
import com.jinnova.smartpad.IPagingList;

public interface ICatalog extends IRecordInfoHolder {
	
	IName getName();
	
	IRecordInfo getRecordInfo();
	
	IPagingList<ICatalog, ICatalogSort> getSubCatalogPagingList();
	
	IPagingList<ICatalogItem, ICatalogItemSort> getCatalogItemPagingList();
	
	ICatalog getSystemParent();
}
