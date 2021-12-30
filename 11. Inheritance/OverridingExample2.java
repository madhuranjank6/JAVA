// Overriding Example 2

import java.lang.*;

class Car{
	public void start(){
		System.out.println("Car Started");
	}
	
	public void accelerate(){
		System.out.println("Car accelerated");
	}
	
	public void changeGear(){
		System.out.println("Gear Changed");
	}
}

class LuxuryCar extends Car{
	@Override
	public void changeGear(){
		System.out.println("Automated Gear");
	}
	
	public void openRoof(){
		System.out.println("Sun roof is opened");
	}
}


class OverridingExample2{
	public static void main(String args[]){
		Car c = new Car();
		c.start();
		c.accelerate();
		c.changeGear();
		
		LuxuryCar lc = new LuxuryCar();
		lc.start();
		lc.accelerate();
		lc.changeGear();
		lc.openRoof();
		
		//Dynamic method Dispatch
		Car dc = new LuxuryCar();
		dc.start();
		dc.accelerate();
		dc.changeGear();
		//dc.openRoof(); //Invalid as openRoof() is not present in Car class
	}
}