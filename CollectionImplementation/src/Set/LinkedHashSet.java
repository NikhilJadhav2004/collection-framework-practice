package Set;

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {

	public static void main(String[] args) {
		//----------------Linked Hashset--------------
				//insertion order preserved
				//doublicate not allowed
				//only one null insert
		//hashtable+dooublylinkedlist
		//all set method usable
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(1);
		
		set.add(1);
		set.add(68);
		
		set.add(868);
		
		System.out.println(set);
	}
}
