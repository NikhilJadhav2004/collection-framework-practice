package Queue;

import java.util.Queue;



public class ArrayDeque {

	public static void main(String[] args) {
		
	java.util.ArrayDeque<Integer> ad=new java.util.ArrayDeque<Integer>();
	
	ad.offer(89);
	 
	ad.offerFirst(18);
	
	ad.offerLast(455);
	
	ad.offer(79);
	
	System.out.println(ad);
	
	System.out.println(ad.poll());
	
	System.out.println(ad.pollLast());
	System.out.println(ad);
	
	}
}
