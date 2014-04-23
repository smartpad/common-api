package com.jinnova.smartpad.partner;

public interface ICatalogField {
	
	static String ID_NAME = "name";
	static String ID_DESC = "descript";
	
	static String GPS_LON = "gps_lon";
	
	static String GPS_LAT = "gps_lat";

	String getId(); //column name
	
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
