package javaActivity2_3;

public class Bicycle implements BicycleOperations,BicycleParts{

	int currentspeed;
	int gears;
	public void Bicycle(int gearsNum,int speedNum) {
		this.gears=gearsNum;
		this.currentspeed=speedNum;
		
	}
	
	public void applyBrake(int passNum) {
		
		
	}
	
	public void speedup(int passnum) {
		
	}
	
	public String bicycleDesc() {
		return ("No of gears are "+gears+" \nSpeed of bicycle is "+currentspeed);
	}
	
}
