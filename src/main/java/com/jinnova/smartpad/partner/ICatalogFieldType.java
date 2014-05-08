package com.jinnova.smartpad.partner;

public enum ICatalogFieldType {
	
	Boolean("tinyint"),
	Int("int"),
	Decimal("decimal(12, 2)"),
	Text_ID("varchar(32)"), //32 charater
	Text_Name("mediumtext"), //sql medium text
	Text_Desc("text"), //sql text
	Text_URL("text"); //sql text
	
	public final String sqlType;
	
	private ICatalogFieldType(String sqlType) {
		this.sqlType = sqlType;
	}
}
