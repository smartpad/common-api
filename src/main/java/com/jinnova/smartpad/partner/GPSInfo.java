package com.jinnova.smartpad.partner;

public class GPSInfo {

	private float lontitue;
	
	private float latitude;
	
	private boolean inherited = false;

	public float getLontitue() {
		return lontitue;
	}

	public void setLontitue(float lontitue) {
		this.lontitue = lontitue;
		inherited = false;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
		inherited = false;
	}

	public boolean isInherited() {
		return inherited;
	}

	public void setInherited(boolean inherited) {
		this.inherited = inherited;
	}
}
