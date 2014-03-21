package com.jinnova.smartpad.partner;

import com.jinnova.smartpad.IPagingList;

public interface IOperation {
	
	void setName(String name);

	String getName();
	
	ICatalog getRootCatalog();
	
	void setPromotionPageSize(int pageSize);
	
	IPagingList<IPromotion> getPromotionPagingList();
	
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
