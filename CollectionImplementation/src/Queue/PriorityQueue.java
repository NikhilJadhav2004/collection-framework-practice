package Queue;

import java.util.Comparator;
import java.util.Queue;
public class PriorityQueue {

	public static void main(String[] args) {
		
		Queue<Integer> pq=new java.util.PriorityQueue<Integer>(Comparator.reverseOrder());
		
		pq.offer(34);
		pq.offer(90);
		pq.offer(89);
		pq.offer(8888);
		
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
	}
}
