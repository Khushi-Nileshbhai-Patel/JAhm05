package employeeinfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class DemoEmployee {
	public static void main(String[] arg) {
		try {
		Employee e2 = new Employee();
		System.out.println(e2);
		
		Employee e1 = new Employee();
		e1.setName("Khushi");
		e1.setEmail("khushi123@gmail.com");
		System.out.println(e1.getName() +" "+e1.getEmail() );
		
		Employee e3 = new Employee("Dhamuu","dhamu@gmail.com");
		System.out.println(e3);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		//SCANNER :-
		//USER INPUT:-
	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Name:-");
		String Name = sc.next();
		System.out.println("Enter Your Email:-");
		String Email = sc.next();
	*/	
			}
		catch(Exception e) {
			
		}
	}
		
}
 