package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		
		//inserion order is not preserved
		//acording to the hashcode of key bukket is allocate
		//dsa-hashtable
		//default capacity-16
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(3, "t");
		map.put(1, "A");
		map.put(2, "B");
		map.put(9, "c");
		map.put(99, "A");
		map.put(77, "B");
		map.put(33, "c");
		System.out.println(map);
		
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("A"));
		
		map.remove(1);
		System.out.println(map);

		for (Entry<Integer, String> m : map.entrySet()) {

			System.out.println(m);

			System.out.println(m.getKey());

			System.out.println(m.getValue());
		}

		for (Entry<Integer, String> m : map.entrySet()) {

			System.out.println(m.getKey());

		}
		for (Entry<Integer, String> m : map.entrySet()) {

			System.out.println(m.getValue());
		}

	}

}
