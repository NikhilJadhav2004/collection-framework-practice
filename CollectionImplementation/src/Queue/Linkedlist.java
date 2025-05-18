package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist {

	public static void main(String[] args) {
		
		Queue<String> queue=new LinkedList<String>();
		
		queue.offer("abhi");
		
		queue.offer("shu");
		
	
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
		
		queue.poll();
		
		System.out.println(queue);
	}
}
