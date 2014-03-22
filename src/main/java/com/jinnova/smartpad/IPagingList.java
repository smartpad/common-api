package com.jinnova.smartpad;

import java.sql.SQLException;

import com.jinnova.smartpad.partner.IUser;

public interface IPagingList<T, E> {
	
	void setPageSize(int pageSize);
	
	void setSortField(E e);
	
	void setSortDirection(boolean ascending);
	
	T newMemberInstance(IUser authorizedUser);
	
	IPage<T> loadPage(IUser authorizedUser, int pageNumber) throws SQLException;
	
	void put(IUser authorizedUser, T member) throws SQLException;
	
	void delete(IUser authorizedUser, T member) throws SQLException;

}
