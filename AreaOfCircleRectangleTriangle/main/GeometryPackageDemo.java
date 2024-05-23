package main;
import Geometry.Circle;
import Geometry.Rectangle;
import Geometry.Triangle;

public class GeometryPackageDemo {
	public static void main(String[] args) {
       
        Circle circle = new Circle(5);
        circle.getArea();
        System.out.println(circle);
        
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.getArea();
        System.out.println(rectangle);
        
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.getarea();
        System.out.println(triangle);		
	}
}
