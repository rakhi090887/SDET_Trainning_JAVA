package javaActivity1_1;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car() {
		tyres=4;
		doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color Value: "+color);
		System.out.println("Transmission Value: "+transmission);
		System.out.println("Make Value: "+make);
		System.out.println("Tyres Value: "+tyres);
		System.out.println("Doors value: "+doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}
	

}
