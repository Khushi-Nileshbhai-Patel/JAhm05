package anonymousexample;

import java.util.Arrays;
import java.util.List;

public class StringConvert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> strings = Arrays.asList("Hello", "World", "Java", "Lambda");
		 
		 UpperLowerConvert upper = new UpperLowerConvert()
				 {
			 		@Override
			 		public String convert(String s)
			 		{
			 			return s.toUpperCase();
			 		}
			 
			 };
			 
			 UpperLowerConvert lower = new UpperLowerConvert() {
		            @Override
		            public String convert(String s) {
		                return s.toLowerCase();
		            }
		        };
		        
		     System.out.println("Original List: " + strings);
		     
		     System.out.println("Uppercase List:");
		     for (String s : strings) {
		            System.out.println(upper.convert(s));
		        }
		     
		     System.out.println("Lowercase List:");
		        for (String s : strings) {
		            System.out.println(lower.convert(s));
		        }
		        }
}

