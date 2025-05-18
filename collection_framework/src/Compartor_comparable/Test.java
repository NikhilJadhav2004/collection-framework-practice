package Compartor_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
		Student s=new Student();
		
		s.setId(30);
		s.setName("om");
		Student s1 =new Student();
		
		s1.setId(2);
		s1.setName("raj");
		
		List<Student> list=new ArrayList<Student>();
		
		list.add(s);
		list.add(s1);
		
		Collections.sort(list);
		
		for(Student a:list) {
			System.out.println(a);
		}
		
	}
}
