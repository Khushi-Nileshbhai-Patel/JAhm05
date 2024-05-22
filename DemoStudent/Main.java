package DemoStudent;

public class Main {
	public static void main(String[] arg) {
		Student s1 = new Student();
		Student s2 = new Student("Khushi");
		System.out.println(s1.getSname());
		System.out.println(s2.getSname());
	}
}
