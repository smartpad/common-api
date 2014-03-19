package com.jinnova.smartpad.partner;

public interface IAddress {
	
	long getGpsLon();

	void setGpsLon(long gpsLon);

	long getGpsLat();

	void setGpsLat(long gpsLat);

	String getAddressLines();

	void setAddressLines(String addressLines);

}
