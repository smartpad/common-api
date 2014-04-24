package com.jinnova.smartpad.partner;

import java.math.BigDecimal;

public interface IGPSInfo {
	
	BigDecimal getLongitude();
	
	void setLongitude(BigDecimal f);
	
	BigDecimal getLatitude();
	
	void setLatitude(BigDecimal f);
}
