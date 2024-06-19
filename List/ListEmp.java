package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> lste = new ArrayList<Employee>();
		lste.add(new Employee("Khushi"));
		lste.add(new Employee("Darshil"));
		lste.add(new Employee("Khushil"));
		lste.add(new Employee("Vyom"));
		lste.add(new Employee("Shreya"));
		lste.add(new Employee("Dhamu"));
		lste.add(new Employee("Avani"));
		lste.add(new Employee("Jahanvi"));
		System.out.println(lste);
		//Print One By One NAmes:-
		lste.forEach(obj1 -> System.out.println(obj1.getEname()));
		
		//Sorting:-
		Collections.sort(lste);
		lste.forEach(obj1 -> System.out.println(obj1.getEname()));
	}

}
