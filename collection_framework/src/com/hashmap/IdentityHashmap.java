package com.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashmap {
	
	//diffrance between hashmap and hash table
	public static void main(String[] args) {
		
	
	Map<Integer, String> map=new HashMap<Integer, String>();
	
	Integer i1=new Integer(10);
	
	Integer i2=new Integer(10);
	
	map.put(i1, "abc");
	map.put(i2, "abc");
	
	System.out.println(map);
	
	//hashmap equals method chek the content on the basis of key
	
	IdentityHashMap<Integer, String> imap=new IdentityHashMap<Integer, String>();
	
    Integer i3=new Integer(10);
	
	Integer i4=new Integer(10);
	
	imap.put(i3, "xyz");
	imap.put(i4, "xyz");
	
	System.out.println(imap);
	
	}	
	//in identityhashmap equlas method check the referances of key-object

}
