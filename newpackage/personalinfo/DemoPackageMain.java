package tnsif.newpackage.personalinfo;
import tnsif.newpackage.countryinfo.Country.Country;
import tnsif.newpackage.countryinfo.Country.State;
public class DemoPackageMain {
	public static void main(String[] args) {
		Country  c = new Country("India");
		State s = new State("Gujrat");
		Person p = new Person("Khushi");
		System.out.print(c);
		System.out.print(s);
		System.out.println(p);
		
		Country  c1 = new Country();
		c1.setCname("India");
		State s1 = new State();
		s1.setSname("Gujrat");
		Person p1 = new Person();
		p1.setPname("Shreya");
		System.out.print(c1);
		System.out.print(s1);
		System.out.print(p1);
	}

}
