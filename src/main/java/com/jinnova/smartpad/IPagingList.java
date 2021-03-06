package com.jinnova.smartpad;

import java.sql.SQLException;

import com.jinnova.smartpad.partner.IUser;

public interface IPagingList<T, E> {
	
	IPagingList<T, E> setPageSize(int pageSize);
	
	IPagingList<T, E> setSortField(E e);
	
	IPagingList<T, E> setSortDirection(boolean ascending);
	
	T newEntryInstance(IUser authorizedUser);
	
	IPage<T> loadPage(IUser authorizedUser, int pageNumber) throws SQLException;
	
	void put(IUser authorizedUser, T member) throws SQLException;
	
	void delete(IUser authorizedUser, T member) throws SQLException;

}
