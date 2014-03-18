package com.jinnova.smartpad.partner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SmartpadCommon {
	
	public static void initialize() {
		try {
			Class<?> c = Class.forName("com.jinnova.smartpad.partner.PartnerManager");
			Method m = c.getMethod("initialize");
			m.invoke(null);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	private static <T> T getStaticField(String className, String fieldName) {
		try {
			Class<?> c = Class.forName(className);
			return (T) c.getDeclaredField(fieldName).get(null);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (IllegalArgumentException e) {
			throw new RuntimeException(e);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} 
	}

	public static IPartnerManager getPartnerManager() {
		return getStaticField("com.jinnova.smartpad.partner.PartnerManager", "instance");
	}

}
