package javaActivity2_3;

public class MountainBike extends Bicycle{
	int seatHeight;
	
	public  MountainBike(int drivedgears, int derivedcurrentSpeed, int seathgt) {
		super.gears=drivedgears;
		super.currentspeed=derivedcurrentSpeed;
		this.seatHeight=seathgt;
		
	}
	
	public void setHeight(int newValue) {
		seatHeight= newValue;
	}
	
	public String bicycleDesc() {
		return ("No of gears are "+gears+" \nSpeed of bicycle is "+currentspeed+" seatHeight is: "+seatHeight);
	}

}
