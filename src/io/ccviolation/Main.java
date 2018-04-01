package io.ccviolation;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String,String> ccvMap1 = new HashMap<>();
		ccvMap1.put("one", "hello");
		ccvMap1.put("two", "world");
		
		Map<String,String> ccvMap2 = new HashMap<>();
		ccvMap2.put("one", "hello");
		ccvMap2.put("two", "world");
		
		
		String key = "one";
		int entry = 0;
		
		if(ccvMap1.get(key).equals(ccvMap2.get(key)) && ccvMap2.get(key).equals(ccvMap1.get(key))) {
			entry = 5;
		}
		else {
			entry = 10;
		}
		
		if(entry >= 5) {
			System.out.println("five");
		} else if (entry <= 10) {
			System.out.println("ten");
		}
		
		//fail
	}
}
