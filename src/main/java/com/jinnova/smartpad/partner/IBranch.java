package com.jinnova.smartpad.partner;

import java.sql.SQLException;

public interface IBranch {
	
	void setName(String name);

	String getName();

	String getId();

	IOperation loadOperation() throws SQLException;
	
	void updateOperation(IOperation operation) throws SQLException;
}
