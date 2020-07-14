package javaActivity3_3B;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Activity3_3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Object> dq = new LinkedList<>();
		
		dq.add("Lion");
		dq.add("Tiger");
		dq.add("Girraf");
		dq.add("Elephant");
		dq.add("rhino");
		dq.add("Zebra");
		
		Iterator it = dq.iterator();
		while(it.hasNext()) {			
			System.out.println(it.next());
		}
		
		
		
		
		

	}

}
