package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		
		List list=new ArrayList();
		
		list.add(10);
		list.add(56);
		list.add(null);
		list.add("nikhil");
		list.add(10);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains(null));
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(0));
		
		
		
	}
}
