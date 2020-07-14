package javaActivity2_3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MountainBike mountain = new MountainBike(3,0, 25);
		System.out.println(mountain.bicycleDesc());
		
		mountain.speedup(20);
		mountain.applyBrake(5);
		
		

	}

}
