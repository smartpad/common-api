package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface IDetailManager {
	
	static final String FIELD_TYPE = "type";
	static final String FIELD_ARRAY = "arr";
	
	static int TYPE_BRANCH = 0;
	
	static int TYPE_STORE = 1;
	
	static int TYPE_COUNT = 2;
	
	static String TYPENAME_BRANCH = "branch";
	
	static String TYPENAME_STORE = "store";
	
	static String TYPENAME_CAT = "cat";
	
	static String TYPENAME_CATITEM = "ci";
	
	static String TYPENAME_PROMO = "pro";
	
	static String TYPENAME_POST = "post";
	
	static String TYPENAME_COMPOUND_BRANCHSTORE = "com.branch";
	static String TYPENAME_COMPOUND_CAT = "com.cat";
	static String TYPENAME_COMPOUND_CITEM = "com.citem";
	static String TYPENAME_COMPOUND_PROMOS = "com.promo";

	String getDetail(int targetType, String targetId, String gpsLon, String gpsLat, int page) throws SQLException;
	
}
