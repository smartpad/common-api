package com.jinnova.smartpad.partner;

public interface ICatalogSpec {
	
	public static final String ATT_DISP_DETAIL = "disp";
	
	public static final String ATT_DISP_SEGMENTS_HIDDEN = "disp_sh";
	
	String getSpecId(); //table name
	
	boolean isManaged();
	
	void setSpecId(String specId);
	
	void setReferTo(String referTo);
	
	ICatalogField createField(String fieldId);

	ICatalogField[] getAllFields();

	ICatalogField getField(String fieldId);
	
	String[] getSectionNames();
	
	String[] getGroupNames();
	
	String getAttribute(String attributeId);
	
	void setAttribute(String attributeId, String value);
}
