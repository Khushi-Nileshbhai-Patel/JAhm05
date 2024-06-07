package SimpleException;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
		//a=12;
		//b=0;
		int result = a / b;
		System.out.println(result);
		}
		catch(ArithmeticException ar) {
			System.out.println(ar.getMessage());
		}
		catch(Exception e) {
		System.out.println("No Can not be devide"+ e.getMessage());
		}
	}

}
