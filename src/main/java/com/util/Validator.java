package com.util;

public class Validator {

	public static boolean isBlank(String data) {
		
		if(data == null || data.trim().length() == 0) {
			return true; 
		}else {
			return false;
		}
	}
}
