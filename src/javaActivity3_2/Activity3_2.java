package javaActivity3_2;

import java.util.HashSet;

public class Activity3_2 {
	
	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
		hs.add("M");
		hs.add("R");
		hs.add("P");
		hs.add("Q");
		hs.add("N");
		hs.add("M");
		
		System.out.println("print the size of hashset: "+hs.size());
		
		System.out.println("remoe the element: "+hs.remove("N"));
		System.out.println("remove the element not present in the list: "+hs.remove("E"));
		System.out.println("Return true if element present in the set: "+hs.contains("M"));
		System.out.println("print the updated set: ");
		Object[] s = hs.toArray();
		for(Object sb:s) {
			System.out.println(sb);
		}
		
		
	}

}
