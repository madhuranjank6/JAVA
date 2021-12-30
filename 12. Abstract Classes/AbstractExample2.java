// Example 2

import java.lang.*;

abstract class Hospital{
	abstract void emergency();
	abstract void appointement();
	abstract void admit();
	abstract void billing();
}

class MyHospital extends Hospital{
	@Override
	void emergency(){
		System.out.println("Emergency Ward");
	}
	
	@Override
	void appointement(){
		System.out.println("Appointement desk");
	}
	
	@Override
	void admit(){
		System.out.println("Admission Ward");
	}
	
	@Override
	void billing(){
		System.out.println("Billing Desk");
	}
}

class AbstractExample2{
	public static void main(String args[]){
		Hospital h = new MyHospital();
		h.emergency();
		h.appointement();
		h.admit();
		h.billing();
		
		MyHospital mh = new MyHospital();
		mh.emergency();
		mh.appointement();
		mh.admit();
		mh.billing();
	}
}