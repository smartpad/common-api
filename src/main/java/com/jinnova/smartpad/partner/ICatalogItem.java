package com.jinnova.smartpad.partner;

public interface ICatalogItem extends IRecordInfoHolder {
	
	String getId();
	
	//IName getName();
	
	//String getUnit();
	
	//void setUnit(String unit);
	
	//BigDecimal getUnitPrice();
	
	//void setUnitPrice(BigDecimal price);
	
	IGPSInfo getGps();
	
	String getFieldValue(String fieldId);
	
	String[] getFieldValues(String fieldId);
	
	void setField(String fieldId, String value);
	
	void setField(String fieldId, String[] values);

}
