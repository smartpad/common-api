package com.jinnova.smartpad;

import java.sql.SQLException;

import com.jinnova.smartpad.partner.IUser;

public interface IPagingList<T, E> {
	
	void setPageSize(int pageSize);
	
	void setSortField(E e);
	
	void setSortDirection(boolean ascending);
	
	IPage<T> loadPage(int pageNumber) throws SQLException;
	
	T newMemberInstance();
	
	void put(IUser authorizedUser, T member) throws SQLException;
	
	void delete(IUser authorizedUser, T member) throws SQLException;

}
