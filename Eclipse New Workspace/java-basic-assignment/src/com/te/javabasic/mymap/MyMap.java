package com.te.javabasic.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

//		System.out.println(map.put(100, "city"));
//		System.out.println(map);
//		System.out.println(map.put(100, "town"));
//		System.out.println(map+"---------");
//		System.out.println(map.putIfAbsent(100, "district"));
//		System.out.println(map);
//		System.out.println(map.put(400, "country"));
//		
//		
//		
//		System.out.println("--------------");
//		System.out.println(map.keySet());
//		System.out.println(map.values());
		
		map.put(100, "city");
		map.put(200, "town");
		map.put(300, "state");
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			if (entry.getKey()==200) {
				entry.setValue("country");
			}
		}	
		
		System.out.println(map);
		System.out.println(entrySet);
		
	}
	

}
