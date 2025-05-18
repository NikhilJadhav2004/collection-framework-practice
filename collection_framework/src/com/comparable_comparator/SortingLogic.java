package com.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingLogic {

	public static  void sort() {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(10);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("after sorting"+list);
		
	}
	public static void main(String[] args) {
		
		sort();
		sortStudent();
		
	}
	
	public static void sortStudent() {

		Student s1 = new Student(2, 20, "om");
		Student s2 = new Student(21, 30, "omkar");
		Student s3 = new Student(27, 24, "raj");

		Student s4 = new Student(24, 25, "abc");

		List<Student> a = new ArrayList<Student>();

		Collections.addAll(a,s1,s2,s3,s4);
		
		Collections.sort(a);
		System.out.println(a);
		
		
		
	}
	
	public static void employeSorting() {
		
		EmployeSortingBySalary e1=new EmployeSortingBySalary();
		e1.setId(12);
		e1.setAge(31);
		e1.setName("om");
		
		EmployeSortingBySalary e2=new EmployeSortingBySalary();
		e1.setId(3);
		e1.setAge(34);
		e1.setName("omkar");
		
		EmployeSortingBySalary e3=new EmployeSortingBySalary();
		e1.setId(1);
		e1.setAge(37);
		e1.setName("raj");
		
		EmployeSortingBySalary e4=new EmployeSortingBySalary();
		e1.setId(18);
		e1.setAge(30);
		e1.setName("nikhil");
		
	List<EmployeSortingBySalary> e=new ArrayList<EmployeSortingBySalary>();
	
	Collections.addAll(e, e1,e2,e3,e4);
	
	
	}

}
