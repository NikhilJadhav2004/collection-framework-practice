package com.set_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.Aggregation.Studant;

public class Example {

	public static void main(String[] args) {

		Set<Integer> st = new HashSet<Integer>();

		// set-interface
		// insertion order not prserved
		// doupliction not allowed
		// default capacity 16
		// load factor -0.75

		st.add(12);
		st.add(20);
		st.add(80);
		st.add(null);

		// douplicate not insert in set -not give error
		st.add(12);
		System.out.println(st);

		Set<Integer> tst = new LinkedHashSet();

		// insertion order preserved
		// without genaric we have to add non homogenious data-like srting store in the
		// form of object
		tst.add(12);
		tst.add(45);
		tst.add(null);

		tst.add(12);
		System.out.println(tst);

		Set<Integer> a = new TreeSet<Integer>();

		// ascending order
		// insertion order not presrved
		a.add(12);
		a.add(23);
		a.add(2);
		a.add(8);
		a.add(2);

		System.out.println(a);

		Student sc = new Student();

		sc.setId(1);
		sc.setName("om");

		Student sc1 = new Student();

		sc1.setId(1);
		sc1.setName("om");

		Set<Student> ss = new HashSet<Student>();

		ss.add(sc);
		ss.add(sc1);

		System.out.println(ss);

		// override the hashcode and equals method
		// hashcode same -print single time

		//
		// Collection methods-

		List list = new ArrayList();

		list.add(12);

		list.add(23);

		list.add(89);

		System.out.println(list);

		Collections.addAll(list, 1, 2, 3, 4, "om");

		System.out.println(list);

		List<Integer> t = new ArrayList<Integer>();

		t.add(5);
		t.add(40);
		t.add(2);
		t.add(5);

		System.out.println(Collections.frequency(t, 5));

	}
}
