package com.jinnova.smartpad.partner;

public interface ICatalogSpec {
	
	String getSpecId(); //table name
	
	void setSpecId(String specId);
	
	ICatalogField createField();

	ICatalogField[] getAllFields();
	
	String[] getSectionNames();
	
	String[] getGroupNames();
}
