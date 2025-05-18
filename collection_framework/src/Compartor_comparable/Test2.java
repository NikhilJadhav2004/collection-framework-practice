package Compartor_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

	
	public static void main(String[] args) {
		
		Company c1=new Company();
		
		c1.setId(108);
		c1.setSalary(23000);
		c1.setName("z");
		
		Company c2=new Company();
		c2.setId(110);
		c2.setSalary(3300000);
		c2.setName("x");
		
		Company c3=new Company();
		c3.setId(109);
		c3.setSalary(900000);
		c3.setName("z");
		
		List<Company> list=new ArrayList<Company>();
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		Collections.sort(list,new SortingonId());
		Collections.sort(list,new SortingOnName());
		
		for(Company a:list) {
			System.out.println(a);
		}
	}
}
