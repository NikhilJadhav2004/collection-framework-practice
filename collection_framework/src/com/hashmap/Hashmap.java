package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	
	public static void main(String[] args) {
		//java.util
		//1.2 version
		//hash map store the data in the form of key and value this is nothing but entry-it is inner interface of map
		//
		Map<Integer, String> a=new HashMap<Integer, String>();
		a.put(1, null);
		a.put(12, "om");
		a.put(200, "nikhil");
		a.put(null, null);
		a.put(null, "raj");
		a.put(12, "sahil");
		System.out.println(a);
		System.out.println(a.put(121,"ar"));
		
		//iteration on the basis of key
		//1st method map-keyset() and map-get(key)
		
		
		//using iterator
		Set<Integer>keys=a.keySet();
		
		/*
		 * Iterator<Integer> itr=keys.iterator(); while(itr.hasNext()) {
		 * 
		 * Integer key=itr.next(); String value=a.get(key);
		 * System.out.println(key+" "+value); }
		 */
		
		//using for each loop
		/*
		 * for(Integer i:keys) { String value=a.get(i); System.out.println(i+" "+value);
		 * 
		 * }
		 */
		//using map-entryset()
		
		Set<Entry<Integer, String>> entryset=a.entrySet();
		for(Entry<Integer, String> i: entryset) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		
		
		
	}
}
