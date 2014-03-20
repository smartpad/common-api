package com.jinnova.smartpad.partner;

import java.math.BigDecimal;

public interface ICatalogItem {
	
	IName getName();
	
	String getUnit();
	
	void setUnit(String unit);
	
	BigDecimal getUnitPrice();
	
	void setUnitPrice(BigDecimal price);

}
