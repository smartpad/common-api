package com.jinnova.smartpad.partner;

import com.jinnova.smartpad.IName;
import com.jinnova.smartpad.IPagingList;

public interface IOperation extends IRecordInfoHolder {

	IName getName();
	
	IRecordInfo getRecordInfo();
	
	ICatalog getRootCatalog();
	
	IPagingList<IPromotion, IPromotionSort> getPromotionPagingList();
	
	ISchedule getOpenHours();
	
	long getGpsLon();

	void setGpsLon(long gpsLon);

	long getGpsLat();

	void setGpsLat(long gpsLat);

	String getAddressLines();

	void setAddressLines(String addressLines);

	String getPhone();

	void setPhone(String phone);

	String getEmail();

	void setEmail(String email);
	
	String[] getMemberLevels();
	
	void setMemberLevels(String[] memberLevels);

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
