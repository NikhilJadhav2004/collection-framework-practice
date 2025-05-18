package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class weakHashmap {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setId(100);
		s1.setName("om");
		s1=null;
		
		Student s2=new Student();
		s2.setId(200);
		s2.setName("abhi");
		
		
		/*
		 * Map<Student, Integer> map=new HashMap<Student, Integer>();
		 * 
		 * map.put(s1, 1000); map.put(s2, 1000);
		 * 
		 * System.out.println(map);
		 */
		//in hash map does not remove unused obj ,beacuse hash map is powrfull
       WeakHashMap<Student, Integer> map=new WeakHashMap<Student, Integer>();
		
		map.put(s1, 1000);
		map.put(s2, 1000);
		
		System.out.println(map);
	}
	//in weak hashmap unused object remove in weakhash map using garbage collection
}
