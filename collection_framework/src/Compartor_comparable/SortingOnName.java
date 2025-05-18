package Compartor_comparable;

import java.util.Comparator;

public class SortingOnName implements Comparator<Company>{

	@Override
	public int compare(Company o1, Company o2) {
		
		if(o1.getSalary() >  o2.getSalary()) {
			return 1;
		}else if(o1.getSalary() <  o2.getSalary()) {
			return -1;
		}
			
		return 0;
	}
	
	

}
