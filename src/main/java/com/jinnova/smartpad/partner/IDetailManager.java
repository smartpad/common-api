package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface IDetailManager {

	static final String FIELD_VERSION = "V";
	static final String FIELD_TYPE = "T";
	static final String FIELD_ARRAY = "A";
	static final String FIELD_PAGE = "P";
	static final String FIELD_SIZE = "S";
	static final String FIELD_ID = "ID";
	static final String FIELD_SYSCATID = "SC";
	static final String FIELD_NAME = "N";
	static final String FIELD_DESC = "D";
	static final String FIELD_ACTION_LOADNEXT = "ALN";
	
	static String SYSTEM_BRANCH_ID = "smartpad";
	static String SYSTEM_CAT_ALL = "z";
	static String CLUSPRE = "z";

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
	//RULE: Singular type name + s
	static String TYPENAME_COMPOUND = "misc";
	static String TYPENAME_COMPOUND_BRANCHSTORE = "branchstore";
	static String TYPENAME_COMPOUND_CAT = "cats";
	static String TYPENAME_COMPOUND_CITEM = "citems";
	static String TYPENAME_COMPOUND_PROMOS = "pros";

	String drill(String uid, String targetType, String targetId, String targetSyscat, String gpsLon, String gpsLat/*, int page, int size*/) throws SQLException;

	String more(int clusterId, String targetType, String anchorType, String anchorId, String relation,
			String branchId, String storeId, String catId, String syscatId, String excludeId,
			boolean recursive, String gpsLon, String gpsLat, int offset, int size) throws SQLException;
	
}
