package Set;

import java.util.Set;

public class TreeSet {

	public static void main(String[] args) {
		
		//default asending order
		//homogenous and comparaable data we can insert
		
		//null-gives null pointer exception
		
		Set<Integer> set=new java.util.TreeSet<Integer>();
		
		set.add(11);
		set.add(900);
		set.add(1);
		set.add(88);
		set.add(1);
		set.add(null);//null pointer exception
		System.out.println(set);
	}
}
