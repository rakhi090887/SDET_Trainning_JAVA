package javaActivity1_2;

public class Activity2 {

          	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize array of 6 number
		int[] array = {10,77,10,54,-11,10};
		int flag=0;
		//length
		int length = array.length;
		for(int i=0;i<length;i++) {
			if(array[i]==10) {
				flag+=array[i];
			}
			
		}
		System.out.println("flag:"+flag);

	}

}
