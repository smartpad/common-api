package com.jinnova.smartpad.partner;

import com.jinnova.smartpad.IName;
import com.jinnova.smartpad.IPagingList;
import com.jinnova.smartpad.member.IMember;

public interface IOperation extends IRecordInfoHolder {
	
	String getId();

	IName getName();
	
	IRecordInfo getRecordInfo();
	
	ICatalog getRootCatalog();
	
	//String getSystemCatalogId();
	
	//void setSystemCatalogId(String systemCatalogId);
	
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
	
	IPagingList<IMember, IMemberSort> getMemberPagingList();

	/*Boolean isMemberNameRequired();

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

	void setMemberOfferedSurveyLevel(int memberOfferedSurveyLevel);*/

}
