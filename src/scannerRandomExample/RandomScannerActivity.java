package scannerRandomExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Value: ");
		int i=0;
		/*while(i<10) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Array Value: ");
			int value = scan.nextInt();
			list.add(value);
			i++;
		}
		*/
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		Integer[] ar = list.toArray(new Integer[0]);
		System.out.println("Final Array :"+Arrays.toString(ar));
		int length = ar.length;
		int ranvalue= randomValue(rand,length);
		System.out.println(ar[ranvalue]);
	}
	
	public static int randomValue(Random ran,int length) {
		
		int randomint = ran.nextInt(length);
		System.out.println("Randome Value :" +randomint);
		return randomint;
	}

}
