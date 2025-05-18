package product_mangement_system;

import java.util.ArrayList;
import java.util.List;

public record productinfo() {

	public List<Product> display() {
		Product p1=new Product();
		p1.setId(20);
		p1.setPname("mobile");
		p1.setPprice(5688.99);
		
		Product p2=new Product();
		p2.setId(89);
		p2.setPname("tv");
		p2.setPprice(90000.456);
		
		List<Product> product=new ArrayList<Product>();
		product.add(p1);
		product.add(p2);
		
		return product;
	}
}
