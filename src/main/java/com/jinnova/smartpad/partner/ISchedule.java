package com.jinnova.smartpad.partner;

public interface ISchedule {
	
	String getText();
	
	void setText(String text);
	
	IScheduleSequence[] getScheduleSequences();

}
