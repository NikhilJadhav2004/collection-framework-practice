package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_FastConcept extends CopyOnWriteArrayList<Integer> {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(29);
		l.add(90);
		
		l.add(65);
		
		System.out.println(Collections.min(l));
		
		Collections.addAll(l, 2,3,4);
		System.out.println(l);
		
		Set<Integer> s=new TreeSet<Integer>();
		

		
		
	}
}
