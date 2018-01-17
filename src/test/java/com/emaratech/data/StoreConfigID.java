package com.emaratech.data;

import java.util.HashMap;
import java.util.Map;

public class StoreConfigID {

	
	public static final Map<String,String> values = new HashMap<String,String>();
	
	public static String getValue(String key){
		return values.get(key);
	}
	
	public static void setValue(String key, String value){
		values.put(key,value);
	}
	
}
