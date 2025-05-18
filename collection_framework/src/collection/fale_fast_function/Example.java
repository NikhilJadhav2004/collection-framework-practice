package collection.fale_fast_function;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example {

	public static void main(String[] args) {
		
		
		Integer i1=new Integer(2);
		
		
		List< Integer> list=new CopyOnWriteArrayList<Integer>();
		
		list.add(40);
		list.add(30);
		list.add(30);
		list.add(i1);
		
		
		for(int i:list)
		{
			list.add(90);
			System.out.println(i);
		}
	}
	
	
}
