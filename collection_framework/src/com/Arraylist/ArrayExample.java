package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {

		List l1 = new ArrayList();

		l1.add(11);
		l1.add("om");
		l1.add(null);
		l1.add(null);

		System.out.println(l1);

		List<Integer> l2 = new ArrayList<Integer>();

		l2.add(23);
		l2.add(440);
		l2.add(40);
		l2.add(23);

		System.out.println(l2);
		System.out.println(l2.size());
		l2.set(0, 100);
		System.out.println(l2);
		
		System.out.println(l2.get(0));
		l2.remove(0);
		System.out.println(l2);
		

		List<String> l3 = new ArrayList<String>();

		l3.add("om");
		l3.add("raj");

		l3.add("nikhil");

		System.out.println(l3);
		
		System.out.println("we have to get the data in 3 ways");
		
		
		System.out.println("using for each loop");
		
		for(Integer list:l2) {
			
			System.out.println(list);
		}
		
		System.out.println("using itreble interface");
		
		Iterator<Integer> itr=l2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("using for loop");
	
		for(int i=0;i<l2.size();i++) {
			System.out.println(l2.get(i));
		}
	}
}
