package Map;

import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {

		// Sorting on the basis of key-then key is homoginious and comparable
		java.util.TreeMap<Integer, String> map = new java.util.TreeMap<Integer, String>();

		map.put(3, "t");
		map.put(1, "A");
		map.put(2, "B");
		map.put(9, "c");
		map.put(99, "A");
		map.put(77, "B");

		System.out.println(map);

	}
}
