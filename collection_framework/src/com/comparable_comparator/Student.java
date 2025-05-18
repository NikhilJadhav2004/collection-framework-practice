package com.comparable_comparator;

public class Student implements Comparable<Student> {

	private int id;
	
	private int age;

	private String name;

	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		if(this.id > o.id) {
			return -1;
		}else if(this.id <o.id) {
			return 1;
		}
		
		
		
		return 0;
	}

	
}
