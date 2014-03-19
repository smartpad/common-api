package com.jinnova.smartpad.partner;

import java.util.LinkedList;

public interface ISchedule {
	
	String getText();
	
	void setText(String text);
	
	LinkedList<IScheduleSequence> getScheduleSequences();

}
