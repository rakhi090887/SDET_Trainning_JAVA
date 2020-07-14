package javaActivity2_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private int maxPassengers;
	private List<String> passengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane(int maxPass) {
		this.maxPassengers=maxPass;
		passengers=new ArrayList<String>();
		
	}
	
	public void onboard(String Passengers) {
		this.passengers.add(Passengers);
		
	}
	
	public Date takeOff() {
		lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}
	
	public void land() {
		lastTimeLanded = new Date();//new Date(0)
		passengers.clear();
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
	public List<String> getPassengers() {
		return passengers;
	}
	
	

}
