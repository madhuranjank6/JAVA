// Overiding Example 1

import java.lang.*;

class TV{
	public void switchON(){
		System.out.println("TV Switched On");
	}
	
	public void changeChannel(){
		System.out.println("TV Channel is Changed");
	}
}

class SmartTV extends TV{
	@Override
	public void switchON(){
		System.out.println("SmartTV Switched on");
	}
	
	@Override
	public void changeChannel(){
		System.out.println("SmartTV Channel is Changed");
	}
	
	public void browse(){
		System.out.println("SmartTV is browsing");
	}
}

class OveridingExample1{
	public static void main(String args[]){
		TV t = new TV();
		t.switchON();
		t.changeChannel();
		
		SmartTV st = new SmartTV();
		st.switchON();
		st.changeChannel();
		st.browse();
		
		//Dynamic method dispatch
		TV dt = new SmartTV();
		dt.switchON();
		dt.changeChannel();
		//dt.browse(); //Invalid as it is not present in super class
	}
}