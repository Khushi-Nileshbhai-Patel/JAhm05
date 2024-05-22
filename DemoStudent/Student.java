package DemoStudent;

public class Student {
	private String Sname;
	public Student () {
		Sname = "Unknown";
	}
	public Student(String sname) {
		this.Sname = sname;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	@Override
	public String toString() {
		return "Student [Sname=" + Sname + "]";
	} 
	
}
