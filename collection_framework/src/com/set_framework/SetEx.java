package com.set_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public interface SetEx {

	public static void main(String[] args) {
		
		Set a=new HashSet();
		a.add(10);
		a.add("om");
		a.add("om");
		a.add(20);
		a.add(20);
		a.add(null);
		
		System.out.println(a);
		//-----Hashset()_________-
		//insertion order not preserved
		//doublicate is not allowed-add doublicate it does not give error
		//only one null insertion
		//homogenous as well as hetrogenious data we  can insert
		//add is a method of collection
		//Intrnally Dsa-Hashtable
		//default initial capacity-16
		//loadfactor 0.75
		//5 constructor-use-default and size constructor
		Set<Integer> r=new HashSet<Integer>();
		
		r.add(10);
		r.add(20);
		r.add(null);
		r.add(50);
		
		r.remove(10);
		
		System.out.println(r.isEmpty());
		for(Integer i:r) {
			
			System.out.println(i);
		}
		
		Set< String > t=new HashSet<String>();
		t.add("om");
		t.add("nikhil");
		t.add("raj");
		t.add("om");
		
		System.out.println(t);
		System.out.println(t.size());
		//----------------Linked Hashset--------------
		//insertion order preserved
		//doublicate not allowed
		//only one null insert
		
		Set<Integer> c=new LinkedHashSet<Integer>();
		c.add(10);
		c.add(30);
		c.add(60);
		c.add(30);
		c.add(null);
		
		System.out.println(c);
		for(Integer s:c) {
			System.out.println(s);
		}
		
		//=============TreeSet=============
		
		//homogenous and comparable data
		//insertion order not preserved
		//douplicate not allowed
		//natural order sorting
		//no null value insert otherwise it gives nullponter exception
		Set<Integer> p=new TreeSet<Integer>();
		p.add(23);
		p.add(20);
		//p.add(null); 
		//p.add(null);
		p.add(40);
		p.add(40);
		
		
		System.out.println(p);
		
		
		
	}
	
	
	
}
