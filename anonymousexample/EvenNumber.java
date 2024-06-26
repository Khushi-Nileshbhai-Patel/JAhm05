package anonymousexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumber {
public static void main(String[] args) {
		
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        NumberFilter even = new NumberFilter() {
            @Override
            public boolean filter(int number) {
                return number % 2 == 0;
            }
        };

        List<Integer> evenNumbers = new ArrayList<>();
        
        for (int number : numbers) {
            if (even.filter(number)) {
                evenNumbers.add(number);
            }
        }
        
        System.out.println("Original List: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);


	}

}
