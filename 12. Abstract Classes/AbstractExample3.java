// Example 3

import java.lang.*;

abstract class KFC{
	KFC(){
		System.out.println("Welcome to KFC");
	}
	
	void makeItem(){
		System.out.println("Make Item");
	}
	
	abstract void billing();
	abstract void offer();
}


class MyKFC extends KFC{
	MyKFC(){
		System.out.println("Welcome to MyKFC");
	}
	
	@Override
	void billing(){
		System.out.println("Billing Desk");
	}
	
	@Override
	void offer(){
		System.out.println("Offer Desk");
	}
	
	void festiveOffer(){
		System.out.println("No Festive Offer running today");
	}
}

class AbstractExample3{
	public static void main(String args[]){
		KFC k = new MyKFC();
		k.makeItem();
		k.billing();
		k.offer();
		// k.festiveOffer(); //Invalid
		
		MyKFC mk = new MyKFC();
		mk.makeItem();
		mk.billing();
		mk.offer();
		mk.festiveOffer();
	}
}