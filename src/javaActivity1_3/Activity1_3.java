package javaActivity1_3;

public class Activity1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Seconds=1000000000;
		double EarthSeconds=31557600;
		double MercuraySeconds=0.2408467;
		double VenusSeconds=0.61519726;
		double MarsSeconds=1.8808158;
		double JupitarSeconds=11.862615;
		double saturnSeconds=29.447498;
		double uranusSeconds=84.016846;
		double neptuneSeconds=164.79132;
		
		System.out.println("Age on Mercury :" + Seconds/EarthSeconds/MercuraySeconds);
		System.out.println("Age on Venus :" + Seconds/EarthSeconds/VenusSeconds);
		System.out.println("Age on Mars :" + Seconds/EarthSeconds/MarsSeconds);
		System.out.println("Age on Jupitar :" + Seconds/EarthSeconds/JupitarSeconds);
		System.out.println("Age on Saturn :" + Seconds/EarthSeconds/saturnSeconds);
		System.out.println("Age on Uranus :" + Seconds/EarthSeconds/uranusSeconds);
		System.out.println("Age on Neptune :" + Seconds/EarthSeconds/neptuneSeconds);
		

	}

}
