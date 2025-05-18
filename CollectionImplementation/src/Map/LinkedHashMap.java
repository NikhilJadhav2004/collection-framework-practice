package Map;

import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap {

	public static void main(String[] args) {
		
		//only diff insertion order is preserved
		Map<Integer, String> map=new java.util.LinkedHashMap<Integer, String>();

		map.put(3, "t");
		map.put(1, "A");
		map.put(2, "B");
		map.put(9, "c");
		map.put(99, "A");
		map.put(77, "B");
		map.put(33, "c");
		System.out.println(map);
		
    for(Entry<Integer, String> m:map.entrySet()) {
			
			System.out.println(m);
			
//			System.out.println(m.getKey());
//			
//			System.out.println(m.getValue());
		}
    
    //
		
	}
}
