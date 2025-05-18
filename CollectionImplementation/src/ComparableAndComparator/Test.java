package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Student> s=new ArrayList<Student>();
		
		s.add(new Student(101, "om", 90));
		s.add(new Student(104, "ram", 100));
		s.add(new Student(102, "abhi", 96));
		s.add(new Student(109, "raju", 91));
		
		System.out.println(s);
		
		Collections.sort(s);
		System.out.println(s);
		
		Collections.sort(s, new StudentNmaeSorting());
		System.out.println(s);

	}
}
