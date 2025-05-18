package com.set_framework;

import java.util.HashSet;
import java.util.Set;

public class Contract2 {

	public static void main(String[] args) {
		
		Contrcat1 c=new Contrcat1(201, "om");
		Contrcat1 c1=new Contrcat1(201, "om");
		
		Set<Contrcat1> list=new HashSet<Contrcat1>();
		
		list.add(c);
		list.add(c1);
		
		System.out.println(list);
		
		
		
		
		
		
	}
}
