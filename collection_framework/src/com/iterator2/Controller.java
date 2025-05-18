package com.iterator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Controller {

	
	public static void main(String[] args) {
		Education e=new Education();
		List<List<String>> maharashtra=e.setinfo();
		System.out.println(maharashtra);
		Iterator<List<String>> itr=maharashtra.iterator();
		
		while(itr.hasNext()) {
			List<String> city=itr.next();
			System.out.println(city);
			
			Iterator<String> itr2=city.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());

			}
		}
		
	}
}
