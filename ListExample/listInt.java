package ListExample;
import java.util.ArrayList;
import java.util.List;
public class listInt {
	  public static void main(String[] args) {
	    List<Integer> l1 = new ArrayList<>();
	    l1.add(100);
		l1.add(140);
		l1.add(452);
		l1.add(122);
		l1.add(222);
		l1.add(31);
		l1.add(617);
		l1.add(178);
		l1.add(920);
	   System.out.println("List of numbers: " + l1);
	    int evenSum = 0;
	    for (int number : l1) {
	      if (number % 2 == 0) { 
	        evenSum += number;
	      }
	    }
	    l1.forEach(v -> System.out.println(v) );
	    System.out.println("Sum of even numbers is: " + evenSum);
	  }
	}
