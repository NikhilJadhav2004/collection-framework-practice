package Set;

import java.util.Set;

public class HashSet {

	//-----Hashset()_________-
			//insertion order not preserved
			//doublicate is not allowed-add doublicate it does not give error
			//only one null insertion
			//homogenous as well as hetrogenious data we  can insert
			//add is a method of collection
			//Intrnally Dsa-Hashtable
			//default initial capacity-16
			//loadfactor 0.75
	
	
	public static void main(String[] args) {
		
		Set<Integer> set=new java.util.HashSet<Integer>();
		
		set.add(455);
		
		set.add(34);
		
		set.add(78);
		

		set.add(78);
		set.add(78);
		set.add(78);

		set.add(null);
		
		set.add(null);
		set.add(null);
		System.out.println(set);
		
        
		System.out.println(set);
				
	}
}
