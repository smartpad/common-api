package com.jinnova.smartpad.partner;

import java.util.LinkedList;

public interface IOperation {
	
	void setName(String name);

	String getName();
	
	LinkedList<String> getMemberLevels();

	IAddress getAddress();
	
	ISchedule getOpeningHours();

	String getPhone();

	void setPhone(String phone);

	String getEmail();

	void setEmail(String email);

	Boolean isMemberNameRequired();

	void setMemberNameRequired(boolean memberNameRequired);

	Boolean isMemberAddressRequired();

	void setMemberAddressRequired(boolean memberAddressRequired);

	Boolean isMemberPhoneRequired();

	void setMemberPhoneRequired(boolean memberPhoneRequired);

	Boolean isMemberEmailRequired();

	void setMemberEmailRequired(boolean memberEmailRequired);

	Boolean isMemberOfferedFree();

	void setMemberOfferedFree(boolean memberOfferedFree);

	Integer getMemberOfferedFreeLevel();

	void setMemberOfferedFreeLevel(int memberOfferedFreeLevel);

	String getMemberOfferedSurvey();

	void setMemberOfferedSurvey(String memberOfferedSurvey);

	Integer getMemberOfferedSurveyLevel();

	void setMemberOfferedSurveyLevel(int memberOfferedSurveyLevel);

}
