package javaActivity2_2;

public class EncapsulationActivity {
	
	public static void main(String[] args) {
		
		try {
			Plane plane = new Plane(10);
			plane.onboard("Ram");
			plane.onboard("Shyam");
			plane.onboard("Bharat");
			plane.onboard("Shatrughan");
			plane.onboard("Dashrath");
			
			System.out.println("Take Off time : "+plane.takeOff());
			
			System.out.println("Lis of passengers: "+plane.getPassengers());
			Thread.sleep(5000);
			
			plane.land();
			System.out.println("Landed Time: "+plane.getLastTimeLanded());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
