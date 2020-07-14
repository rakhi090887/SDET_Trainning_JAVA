package javaActivity3_1;

import java.util.ArrayList;

public class Activity3_1 {
	
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
	//Adding Objects to ArrayList at default index
		myList.add("Apple");
		myList.add("Mango");
		myList.add("Banana");
		myList.add("Orange");
		
		//adding at specific index
		myList.add(3, "custurd apple");
		myList.add(4, "Chikko");
		
		System.out.println("print all the Objects: ");
		for(String s : myList) {
			System.out.println(s);
		}
		
		System.out.println("Print 3rd name in he list: "+myList.get(3).toString());
		System.out.println(" return true if name exist in the arrayList: "+myList.contains("Apple"));
		System.out.println("Size of the list: "+myList.size());
		System.out.println("remove the object from thr list: ");
		myList.remove(4);
		System.out.println("Print the objects: ");
		for(String re: myList) {
			System.out.println(re);
		}
		
	}
	

}
