package com.jinnova.smartpad.partner;

import java.util.LinkedList;

public interface IScheduleSequence {
	
	LinkedList<Integer> getMinutes();

	LinkedList<Integer> getHours();

	LinkedList<Integer> getDaysOfWeek();

	LinkedList<Integer> getDaysOfMonth();

	LinkedList<Integer> getMonths();

	LinkedList<Integer> getYears();

}
