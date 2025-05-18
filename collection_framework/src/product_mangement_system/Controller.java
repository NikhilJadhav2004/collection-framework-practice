package product_mangement_system;

import java.util.Iterator;
import java.util.List;

public class Controller {

	public static void main(String[] args) {
		
		productinfo p=new productinfo();
		List<Product> pinfo=p.display();
		System.out.println("by using iterator interface");
		Iterator<Product> itr=pinfo.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("for each loop");
		
		for(Product p1:pinfo)
		{
			System.out.println(p1);
		}
	}
}
