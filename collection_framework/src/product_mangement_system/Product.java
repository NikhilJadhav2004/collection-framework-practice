package product_mangement_system;

public class Product {

	private String pname;
	private int id;
	private double pprice;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", id=" + id + ", pprice=" + pprice + "]";
	}
	
	
}
