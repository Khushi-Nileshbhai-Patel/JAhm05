package employeeinfo;

public class Employee {
	private String name,email;
	
	
	public Employee() {
		name = "Default";
		email = "Default";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + "]";
	}
	 
}
