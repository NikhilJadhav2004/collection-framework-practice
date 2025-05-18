package com.itreble;

import java.util.Iterator;
import java.util.List;

public class Controller {

	public static void main(String[] args) {

		Country c = new Country();

		List<List<String>> india = c.setcountry();

		System.out.println(india);// indea

		System.out.println("state wise");
		Iterator<List<String>> itr = india.iterator();
		while (itr.hasNext()) {
			List<String> statelist = itr.next();
			System.out.println(statelist);

			// city wise

			Iterator<String> itr2 = statelist.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}

		}
		System.out.println("for each loop");
		
		for(List<String> i:india) {
			for(String a:i) {
				System.out.println(a);
			}
		}

	}
}
