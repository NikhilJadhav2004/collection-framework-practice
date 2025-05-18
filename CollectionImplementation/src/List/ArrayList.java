package List;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		List<Integer> list=new java.util.ArrayList<Integer>();
		
		list.add(122);

		list.add(100);
		
		list.add(12);
		list.add(22);
		list.add(90);
		list.add(89);
		list.add(566);
		list.add(144);
		

		System.out.println(list);
		// insertion order preserved

		System.out.println(list.get(0));

		list.add(0, 88);
		System.out.println(list);

		list.remove(0);
		
		list.get(0);
		list.set(2, 900);
		
		System.out.println(list);
		
		System.out.println(list.contains(88));
		
		//doublicate are allowed
		//multiple null value we can insert
		//dsa-growable and resizeble array
		
		//iteration 3 ways
		
		System.out.println("_________________________________________");
		for(int i=0;i<list.size();i++) {
			System.out.println("using for loop"+1);
		}
		
		System.out.println("---------------------------------------");
		for(Integer l:list) {
			System.out.println(l);
		}
		System.out.println("____________________________________");
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
    List<Integer> list1=new java.util.ArrayList<Integer>();
		
		list1.add(122);

		list1.add(100);
		
		list1.add(12);
		
		list.addAll(list1);
		
		System.out.println(list);
		
		
	    List l=new java.util.ArrayList();
	    l.add("aaa");
	    l.add(null);
	    l.add(9090);
	    
	    System.out.println(l);
	}
}
