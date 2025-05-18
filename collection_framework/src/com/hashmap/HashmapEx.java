package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapEx {

	//map is interface
	//it is not part collection it is part of framework
	
	public static void main(String[] args) {
		
	
	Map<Integer, String> map1=new HashMap<Integer, String>();
	map1.put(101, "nikhil");
	
	map1.put(102, "raj");
	map1.put(103, "ram");
	map1.put(102, "sham");
	
	System.out.println(map1);
	
	System.out.println(map1 .put(103, "abhi"));//ram
	
	Map<String, String> map=new HashMap<String, String>();
	
	map.put("sub1","java");
	
	map.put("sub2", "oops");
	
	map.put("sub3", null);
	
	System.out.println(map);
	
	map.clear();
	System.out.println(map);
	
	map.isEmpty();
	
	System.out.println(map);
	
	System.out.println(map1.get(102));
	
	//map is iterate using for each loop and iteration
	
	Set setofkey = map1.keySet();

	Iterator<Integer> itr = setofkey.iterator();
	while (itr.hasNext()) {

		Integer i = itr.next();

		String str = map1.get(i);
		System.out.println(i + "  " + str);
	}

	Set<Entry<Integer, String>> set=map1.entrySet();
	
	for(Entry<Integer, String> i:set) {
		System.out.println(i);
		System.out.println(i.getKey()+" "+i.getValue());
	}
	
}
}
