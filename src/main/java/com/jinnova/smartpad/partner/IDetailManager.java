package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface IDetailManager {
	
	static int TYPE_BRANCH = 0;
	
	static int TYPE_COUNT = 1;

	String getDetail(int targetType, String targetId, String gpsLon, String gpsLat, int page) throws SQLException;
	
}
