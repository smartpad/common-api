package com.jinnova.smartpad;

public interface IPage<T> {

	int getTotalCount();
	
	int getPageCount();
	
	int getPageNumber();
	
	int getOffset();
	
	T[] getMembers();
}
