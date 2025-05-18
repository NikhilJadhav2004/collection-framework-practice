package com.iterator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Education {

	public List<List<String>> setinfo() {
		
		List<String> pune=new ArrayList<String>();
		pune.add("engg");
		pune.add("BCA");
		pune.add("B-Com");
		
		List<String> mumbai=new ArrayList<String>();
		mumbai.add("BA");
		mumbai.add("BSC");
		
		List<String> kolhapure=new ArrayList<String>();
		kolhapure.add("diploma");
		kolhapure.add("Hotel-manegment");
		
		List<List<String>> univercity=new ArrayList<List<String>>();
		univercity.add(pune);
		univercity.add(kolhapure);
		univercity.add(mumbai);
		
		return univercity;
	}
	
}
