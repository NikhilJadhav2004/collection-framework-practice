package Set;

import java.util.HashSet;
import java.util.Set;

public class ContractBetweenEqalsAndHashCode {

	public static void main(String[] args) {
		Set<Student> set=new HashSet<Student>();
		
		set.add(new Student("om",2010));
		
		set.add(new Student("om",2010));
		
		set.add(new Student("om",2010));
		System.out.println(set);
		
		//property of set doublicate are not allowed
		
		//contract between the equlas and hashcode method
		
		System.out.println("________contract between the equlas and hashcode method___________");
		System.out.println(set);

		System.out.println("equlas method");
		
		


	}
}
