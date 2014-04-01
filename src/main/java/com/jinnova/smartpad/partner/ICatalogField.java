package com.jinnova.smartpad.partner;

public interface ICatalogField {
	
	static String ID_NAME = "name";

	String getId();
	
	void setId(String id);
	
	String getName();
	
	void setName(String name);
	
	boolean isMultivalue();
	
	void setMultivalue(boolean b);
	
	int getSectionNumber();
	
	void setSectionNumber(int n);
	
	int getGroupNumber();
	
	void setGroupNumber(int n);
	
	ICatalogFieldType getFieldType();
	
	void setFieldType(ICatalogFieldType ft);
	
	String getAttribute(String attributeId);
	
	void setAttribute(String attributeId, String value);
}
