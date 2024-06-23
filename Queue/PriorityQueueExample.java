package Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.JList;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> q = new PriorityQueue<Integer>();
		q.add(21);
		q.add(11);
		q.add(56);
		q.add(1);
		q.add(10);
		System.out.println(q);
		System.out.println("after peek:"+q.poll());
		System.out.println(q);
		
		PriorityQueue <String> q1= new PriorityQueue<String>();
		q1.add("Khushi");
		q1.add("Avani");
		q1.add("Vyom");
		q1.add("Mili");
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
	}

}
