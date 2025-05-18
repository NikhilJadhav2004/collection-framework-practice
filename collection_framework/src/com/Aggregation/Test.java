package com.Aggregation;

public class Test {

	public static void main(String[] args) {
		Address add1=new Address(34, "ramTemple", "pune", "415506");
		
		Studant s1=new Studant(78, "nikhil", add1);
		
		Address add2=new Address(47, "jspm", "pune", "413567");
		
		Studant s2=new Studant(90, "om", add2);
		
		System.out.println(s1.sid+" "+s1.name+" "+s1.address.adressid+" "+s1.address.city+" "+s1.address.landmark+" "+s1.address.pincode);

		System.out.println(s2.sid+" "+s2.name+" "+s2.address.adressid+" "+s2.address.city+" "+s2.address.landmark+" "+s2.address.pincode);

		
	}
}
