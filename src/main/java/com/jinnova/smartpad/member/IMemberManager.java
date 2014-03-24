package com.jinnova.smartpad.member;

public interface IMemberManager {
	
	/**
	 * Used for after installation
	 * @return new generated login, a an existing login retrieved by playStoreId
	 */
	String provision(String playStoreId);

	/**
	 * @param login
	 * @param passhash may be null
	 * @return
	 */
	IMember login(String login, String passhash);
}
