package com.jinnova.smartpad.partner;

public interface ICatalogField {
	
	static String F_NAME = "name";
	static String F_DESC = "descript";
	
	public static final int SEGMENT_NONE = 0;
	public static final int SEGMENT_DISTINCT = 1;
	public static final int SEGMENT_RANGE = 2;
	
	public static final char SEGMENT_PARAM_SEP = ':';
	
	public static final String SEGMENT_POSTFIX = "_id";
	
	//public static final String GROUPING_SUBSTITUTE_ESCAPE = "_";

	//static String F_BRAN_ID = "bran_id";
	//static String F_BRAN_N = "bran_n";
	//static String F_BRAN_DESC = "bran_desc";
	//static String F_BRAN_IMG = "bran_img";
	//static String F_BRAN_LOGO = "bran_logo";
	
	static String F_GLON = "glon";
	static String F_GLAT = "glat";

	String getId(); //column name
	
	void setId(String id);
	
	String getName();
	
	void setName(String name);
	
	boolean isMultivalue();
	
	void setMultivalue(boolean b);
	
	void setGroupingType(int groupingType);
	
	int getSectionNumber();
	
	void setSectionNumber(int n);
	
	int getGroupNumber();
	
	void setGroupNumber(int n);
	
	ICatalogFieldType getFieldType();
	
	void setFieldType(ICatalogFieldType ft);
	
	String getAttribute(String attributeId);
	
	void setAttribute(String attributeId, String value);
}
