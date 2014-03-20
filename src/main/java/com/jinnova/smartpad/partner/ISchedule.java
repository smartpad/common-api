package com.jinnova.smartpad.partner;

public interface ISchedule {
	
	String getText();
	
	void setText(String text);
	
	IScheduleSequence newScheduleSequenceInstance();
	
	IScheduleSequence[] getScheduleSequences();
	
	void setScheduleSequences(IScheduleSequence[] sequences);

}
