package employeeinfo;
import java.util.Scanner;
import java.io.BufferedReader;
public class DemoEmployee {
	public static void main(String[] arg) {
		Employee e2 = new Employee();
		System.out.println(e2);
		
		Employee e1 = new Employee();
		e1.setName("Khushi");
		e1.setEmail("khushi123@gmail.com");
		System.out.println(e1.getName() +" "+e1.getEmail() );
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String Name = br.readLine();
		
		//SCANNER :-
		//USER INPUT:-
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Name:-");
		String Name = sc.next();
		System.out.println("Enter Your Email:-");
		String Email = sc.next();
		
	}
}
 
