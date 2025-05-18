package studant_mangement_system;

public class Studant {

	private int id;
	private String name;
	private double mark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Studant [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
}
