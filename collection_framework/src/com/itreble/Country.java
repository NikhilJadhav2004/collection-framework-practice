package com.itreble;

import java.util.ArrayList;
import java.util.List;

public class Country {

	public List<List<String>> setcountry() {
		
		List<String> maharashtra=new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");
		maharashtra.add("nashik");
		
		List<String> madhyPradesh=new ArrayList<String>();
		madhyPradesh.add("bhopal");
		madhyPradesh.add("indor");
		
		List<String> gujarat=new ArrayList<String>();
		gujarat.add("gandhinagar");
		gujarat.add("ahmdhabad");
		
		List<List<String>> india=new ArrayList<List<String>>();
		india.add(maharashtra);
		india.add(gujarat);
		india.add(madhyPradesh);
		
		return india;
	}
	
}
