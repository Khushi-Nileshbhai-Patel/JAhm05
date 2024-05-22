package tnsif.newpackage.personalinfo;

import tnsif.newpackage.countryinfo.Country.Country;
import tnsif.newpackage.countryinfo.Country.State;

public class Person {
	private String Pname;
	private Country c1;
	private State s1;
	public Person() {
		
		this.Pname="";
	}
	public Person(String pname) {
		Pname = pname;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	@Override
	public String toString() {
		return "Person [Pname=" + Pname + "]";
	}
	
}
