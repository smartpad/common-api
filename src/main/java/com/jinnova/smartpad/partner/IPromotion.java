package com.jinnova.smartpad.partner;

import com.jinnova.smartpad.IName;

public interface IPromotion extends IRecordInfoHolder {
	
	String getId();

	IName getName();
	
	IGPSInfo getGps();
}
