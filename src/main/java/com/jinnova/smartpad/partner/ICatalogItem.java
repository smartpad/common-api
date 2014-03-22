package com.jinnova.smartpad.partner;

import java.math.BigDecimal;

import com.jinnova.smartpad.IName;

public interface ICatalogItem extends IRecordInfoHolder {
	
	IName getName();
	
	String getUnit();
	
	void setUnit(String unit);
	
	BigDecimal getUnitPrice();
	
	void setUnitPrice(BigDecimal price);

}
