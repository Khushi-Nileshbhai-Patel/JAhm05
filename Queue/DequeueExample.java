package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

public class DequeueExample {
	public static void main(String[] args) {
		Deque <String> dq1 = new ArrayDeque<String>();
		dq1.add("Khushi");
		dq1.add("Shreya");
		dq1.add("Riya");
		dq1.add("Dhamu");
		dq1.add("Avani");
		System.out.println("After :-"+dq1.poll());
		System.out.println(dq1);
		
		
		
		dq1.offerFirst("Vyom");
		dq1.offerLast("Moxit");
		System.out.println(dq1);
		
		dq1.removeFirst();
		System.out.println(dq1);
		
		dq1.removeLast();
		System.out.println(dq1);
	}
}
