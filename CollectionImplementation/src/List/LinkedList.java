package List;

import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		
		List<Integer> list=new java.util.LinkedList<Integer>();
		
		list.add(100);
		
		list.add(1882);
		
		list.add(909);
		
		list.add(67);
		
		list.add(45);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.remove(0);
		
		System.out.println(list);
		
		list.set(0, null);
		
		System.out.println(list);
		
	}
}
