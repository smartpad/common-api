package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface IDetailManager {

	static final String FIELD_VERSION = "V";
	static final String FIELD_TYPE = "T";
	static final String FIELD_ARRAY = "A";
	static final String FIELD_PAGE = "P";
	static final String FIELD_SIZE = "S";
	static final String FIELD_ACTION_LOADNEXT = "ALN";
	
	static String SYSTEM_BRANCH_ID = "z";

	//static int TYPE_NO = 0;
	static int TYPE_BRANCH = 1;
	static int TYPE_STORE = 2;
	static int TYPE_CAT = 3;
	static int TYPE_CATITEM = 4;
	static int TYPE_PROMO = 5;
	static int TYPE_SYSCAT = 6;
	static int TYPE_COUNT = 7;

	static String TYPENAME_NO = null;
	static String TYPENAME_BRANCH = "branch";
	static String TYPENAME_STORE = "store";
	static String TYPENAME_CAT = "cat";
	static String TYPENAME_CATITEM = "citem";
	static String TYPENAME_PROMO = "pro";
	static String TYPENAME_POST = "post";
	static String TYPENAME_SYSCAT = "syscat";
	
	//static String[] TYPENAMES = new String[] {TYPENAME_NO, TYPENAME_BRANCH, TYPENAME_STORE, TYPENAME_CAT, TYPENAME_CATITEM, TYPENAME_PROMO};

	static String TYPENAME_COMPOUND = "com.branch";
	static String TYPENAME_COMPOUND_BRANCHSTORE = "com.branch";
	static String TYPENAME_COMPOUND_CAT = "com.cat";
	static String TYPENAME_COMPOUND_CITEM = "com.citem";
	static String TYPENAME_COMPOUND_PROMOS = "com.promo";

	String drill(String clusterId, String targetType, String targetId, String gpsLon, String gpsLat/*, int page, int size*/) throws SQLException;

	String more(String clusterId, String targetType, String anchorType, String anchorId, String relation,
			String branchId, String storeId, String catId, String syscatId, String excludeId,
			String gpsLon, String gpsLat, int offset, int size) throws SQLException;
	
}
