package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {

		// compiler : list set map
		// list:integer
		// java.util
		//primitive as well as non primitive
		List<Integer> l1 = new ArrayList<Integer>();

		l1.add(30);
		l1.add(56);
		l1.add(90);
		l1.add(67);

		System.out.println(l1);
		System.out.println(l1.get(3));
		System.out.println(l1.size());
		System.out.println(l1.remove(2));
		System.out.println(l1);
		
		//list:string
		
		List<String> name=new ArrayList<String>();
		
		name.add("nikhil");
		name.add("om");
		name.add("ramdas");
		name.add("abhi");
		
		System.out.println(name);
		System.out.println(name.size());
		name.remove(2);
		System.out.println(name);
		System.out.println(name.contains("nikhil"));
		
		//there are two type of print he list
		//1>>iterator interface
		//2>>for each loop
		
		System.out.println("----Iterator interface____");
		Iterator<String> itr=name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----for each----");
		
		for(String s:name) {
			System.out.println(s);
		}
		
		
	}
}
