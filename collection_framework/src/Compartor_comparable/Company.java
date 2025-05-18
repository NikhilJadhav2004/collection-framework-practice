package Compartor_comparable;

public class Company  {

	private int id;
	
	private int salary;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	/*
	 * public int getId() { // TODO Auto-generated method stub return 0; }
	 */

	
}
