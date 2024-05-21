package area;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Area rectangle = new Area();
        rectangle.setDim(7.0, 2.0);
        double area = rectangle.getArea();
		System.out.println("The area of the rectangle is: " + area );
		
		
		//SCANNER:-
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

       
        rectangle.setDim(length, breadth);

       
        double Area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + Area);
        
        sc.close();
    }
}
