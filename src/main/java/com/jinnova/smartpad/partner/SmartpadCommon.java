package com.jinnova.smartpad.partner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.StringTokenizer;

public class SmartpadCommon {
	
	public static final String SUBSTITUTION_SEP = "#";

	public static String[] clothFields;
	
	public static String[] washerFields;

	public static String[] mattressFields;

	public static String[] drapFields;

	public static String[] pillowFields;
	
	public static IPartnerManager partnerManager;
	
	//public static IDetailManager detailManager;
	
	public static void initialize(String dbhost, String dbport, String dbname, String dblogin, String dbpass,
			String imageInQueuePath, String imageOutRoot) {
		try {
			Class<?> c = Class.forName("com.jinnova.smartpad.partner.PartnerManager");
			Method m = c.getMethod("initialize", String.class, String.class, String.class, String.class, String.class, String.class, String.class);
			m.invoke(null, dbhost, dbport, dbname, dblogin, dbpass, imageInQueuePath, imageOutRoot);
			//detailManager = (IDetailManager) Class.forName("com.jinnova.smartpad.drilling.DetailManager").newInstance();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		} /*catch (InstantiationException e) {
			throw new RuntimeException(e);
		}*/
		
		partnerManager = getStaticField("com.jinnova.smartpad.partner.PartnerManager", "instance");
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

	/*public static IPartnerManager getPartnerManager() {
		return getStaticField("com.jinnova.smartpad.partner.PartnerManager", "instance");
	}*/
	
	public static void main(String[] args) {
		//System.out.println(md5("abc123"));
		System.out.println(distance(59.3293371, 13.4877472, 59.3225525,13.4619422));
	}
	
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
	
	public static String bytesToHex(byte[] bytes) {
	    char[] hexChars = new char[bytes.length * 2];
	    for ( int j = 0; j < bytes.length; j++ ) {
	        int v = bytes[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}
	
	public static String md5(String s) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte[] bytes = md5.digest(s.getBytes());
			return bytesToHex(bytes);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void reduceByWidth() {
		
	}

	public static double distance(double lat1, double lon1, double lat2, double lon2) {
		long R = 6371; // Radius of the earth in km
		double dLat = deg2rad(lat2 - lat1); // deg2rad below
		double dLon = deg2rad(lon2 - lon1);
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
				+ Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2))
				* Math.sin(dLon / 2) * Math.sin(dLon / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double d = R * c; // Distance in km
		return d;
	}
	
	private static double deg2rad(double deg) {
		  return deg * (Math.PI/180);
	}

	public static String standarizeIdentity(String id) {
		id = id.trim();
		id = id.toUpperCase();
		id = id.replaceAll(" ", "_");
		while (id.contains("__")) {
			id = id.replaceAll("__", "_");
		}
		return id;
	}
	
	public static String replace(String s, ReplaceSupport support) {
		
		StringBuffer buffer = new StringBuffer();
		StringTokenizer tokens = new StringTokenizer(s, SUBSTITUTION_SEP, false);
		while (tokens.hasMoreTokens()) {
			String one = replaceOne(tokens.nextToken(), support);
			if (one != null) {
				buffer.append(one);
			}
		}
		return buffer.toString();
	}
	
	private static String replaceOne(String s, ReplaceSupport support) {	
		StringBuffer result = new StringBuffer();
		StringBuffer term = null;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{') {
				term = new StringBuffer();
				continue;
			}
			if (c == '}') {
				String replacedText = support.getTerm(term.toString());
				if (replacedText == null) {
					return null;
				}
				result.append(replacedText);
				term = null;
				continue;
			}
			
			if (term == null) {
				result.append(c);
			} else {
				term.append(c);
			}
		}
		return result.toString();
	}
}
