package ComparableAndComparator;

public class Student implements Comparable<Student> {

	private int rollno;

	private String name;

	private int mark;
	@Override
	public int compareTo(Student o) {
		
		//desending order
		if(this.rollno > o.rollno) {
			return -1;
		}else if(this.rollno <o.rollno) {
			return 1;
		}
		return 0;
	}
	

	public Student(int rollno, String name, int mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}


	
	

	

	
}
