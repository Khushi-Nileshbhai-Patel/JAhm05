package TreeMap;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeMap <String,Integer> Courses = new TreeMap<String,Integer>();
        Courses.put("Python",1200);
        Courses.put("Java",1000);
        Courses.put("c++", 2000);
        Courses.put("BM",800);
        System.out.println(Courses.firstEntry());
        System.out.println(Courses);
        
        for (String key : Courses.keySet()) {
            Integer value = Courses.get(key);
            System.out.println( key +" " + value);
        }
    }

}