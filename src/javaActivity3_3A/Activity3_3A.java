package javaActivity3_3A;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		
		System.out.println(q);
		
		System.out.println("Remove the the number from the queue: "+q.remove(4));
		System.out.println("peek the value from the queue: "+q.peek());
		System.out.println("print the size of the queue: "+q.size());
		System.out.println("print the updated queue: ");
		System.out.println(q);
		
		
		
	}

}
