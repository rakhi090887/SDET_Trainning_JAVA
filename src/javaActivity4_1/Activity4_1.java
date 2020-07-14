package javaActivity4_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> inputInt = new ArrayList<Integer>();
		Random randomindex = new Random();
		
		System.out.println("Enter the Integers value please: ");
		System.out.println(" EOF or non integers to terminate: \n");
		
		while(scan.hasNextInt()) {
			inputInt.add(scan.nextInt());
		}
		
		Integer nums[] = inputInt.toArray(new Integer[0]);
		int index = randomindex.nextInt(nums.length);
		
		System.out.println("Index value generated: "+index);
		System.out.println("Value in array at generated index: "+nums[index]);
		
		scan.close();
		
		
	}

}
