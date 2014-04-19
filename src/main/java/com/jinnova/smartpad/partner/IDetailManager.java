package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface IDetailManager {

	static final String FIELD_VERSION = "V";
	static final String FIELD_TYPE = "T";
	static final String FIELD_ARRAY = "A";
	static final String FIELD_PAGE = "P";
	static final String FIELD_SIZE = "S";
	static final String FIELD_ACTION_LOADNEXT = "ALN";
	
	static int TYPE_BRANCH = 0;
	static int TYPE_STORE = 1;
	static int TYPE_COUNT = 2;
	
	static String TYPENAME_BRANCH = "branch";
	static String TYPENAME_STORE = "store";
	static String TYPENAME_CAT = "cat";
	static String TYPENAME_CATITEM = "citem";
	static String TYPENAME_PROMO = "pro";
	static String TYPENAME_POST = "post";
	static String TYPENAME_SYSCAT = "syscat";
	
	static String TYPENAME_COMPOUND_BRANCHSTORE = "com.branch";
	static String TYPENAME_COMPOUND_CAT = "com.cat";
	static String TYPENAME_COMPOUND_CITEM = "com.citem";
	static String TYPENAME_COMPOUND_PROMOS = "com.promo";

	String getDetail(int targetType, String targetId, String gpsLon, String gpsLat, int page, int size) throws SQLException;
	
}
