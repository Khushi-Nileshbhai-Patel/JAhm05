package linkedList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedList {
	public static void main(String[] args) {
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		l.add(44);
		l.add(22);
		l.add(11);
		System.out.println(l);
		
		l.remove(22);
		System.out.println(l);
	
		
		LinkedHashSet<String> li = new LinkedHashSet<String>();
		li.add("Khushi");
		li.add("Shreya");
		li.add("Riya");
		System.out.println(li);
	
		li.removeLast();
		System.out.println(li);
		
		li.forEach(ll -> System.out.println(ll));
		
		
	}
}
