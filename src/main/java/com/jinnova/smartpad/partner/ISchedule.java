package com.jinnova.smartpad.partner;

public interface ISchedule {
	
	String getDesc();
	
	void setDesc(String desc);
	
	IScheduleSequence newScheduleSequenceInstance();
	
	IScheduleSequence[] getScheduleSequences();
	
	void setScheduleSequences(IScheduleSequence[] sequences);

}
