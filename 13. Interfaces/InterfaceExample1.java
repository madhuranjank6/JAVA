// Interface Example 1

import java.lang.*;

interface Vehicles{
	void travelling();
}

class Bus implements Vehicles{
	public void travelling(){
		System.out.println("Travelling on Dividers");
	}
}

class TrackBus implements Vehicles{
	public void travelling(){
		System.out.println("Travelling on the roads");
	}
}

class AirBus implements Vehicles{
	public void travelling(){
		System.out.println("Travelling on the rivers");
	}
}

class InterfaceExample1{
	public static void main(String args[]){
		Bus b = new Bus();
		b.travelling();
		
		TrackBus tb = new TrackBus();
		tb.travelling();
		
		AirBus ab = new AirBus();
		ab.travelling();
	}


}