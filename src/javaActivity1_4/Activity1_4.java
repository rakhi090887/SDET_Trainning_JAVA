package javaActivity1_4;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = {10,80,40,70,20,50,60};
		ascendingsort(number);
		
		

	}
	
   public static void ascendingsort(int[] array) {
	   
	   System.out.println("Array before sorting order: "+Arrays.toString(array));
	   
	   int length = array.length;
	   int temp=0;
	   int first = array[0];
	   
	   for(int i=0;i<length;i++) {
		   for(int j=i+1;j<length;j++) {
			   if(array[j]<array[i]) {
				   temp=array[i];
				   array[i]=array[j];
				   array[j]=temp;
			   }
		   }
		  
	   }
	   System.out.println(Arrays.toString(array));
   }

}
