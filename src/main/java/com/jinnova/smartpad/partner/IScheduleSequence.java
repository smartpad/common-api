package com.jinnova.smartpad.partner;

public interface IScheduleSequence {
	
	int[] getMinutes();

	int[] getHours();

	int[] getDaysOfWeek();

	int[] getDaysOfMonth();

	int[] getMonths();

	int[] getYears();
	
	void setMinutes(int[] numbers);

	void setHours(int[] numbers);

	void setDaysOfWeek(int[] numbers);

	void setDaysOfMonth(int[] numbers);

	void setMonths(int[] numbers);

	void setYears(int[] numbers);

}
