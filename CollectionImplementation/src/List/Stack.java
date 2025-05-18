package List;


public class Stack {
 
	public static void main(String[] args) {
		
		//function-fILO
		
	java.util.Stack<String> animal=new java.util.Stack<String>();
	
	animal.push("nikhi");
	
	animal.push("rama");
	
	animal.push("abhi");
	
	animal.push("abhipp");
	
	System.out.println(animal);
	
	//peak-top element
	System.out.println(animal.peek());
	
	//remove top element
	
	System.out.println(animal.pop());
	System.out.println(animal);
		
		
	}
}
