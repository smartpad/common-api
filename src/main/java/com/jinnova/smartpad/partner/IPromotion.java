package com.jinnova.smartpad.partner;

import com.jinnova.smartpad.IName;

public interface IPromotion extends IRecordInfoHolder {
	
	String getId();

	IName getDesc();
	
	String getName();
	
	void setName(String name);
	
	ISchedule getSchedule();
	
	IGPSInfo getGps();
}
