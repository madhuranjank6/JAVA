import java.lang.*;

class StaticAndInstance{
	int a = 10;
	static int b = 20;
	
	public static void main(String args[]){
	
		// Creating the first object
		StaticAndInstance ob1 = new StaticAndInstance();
		System.out.println("Original Value of instance variable a = " + ob1.a); //10
		System.out.println("Original Value of static variable b = " + ob1.b); //20
		
		// As a is instance variable, below line will modify the value of a for ob1 only and not in other objects of the class
		ob1.a = 100;
		
		// As b is static variable, below line will modify the value of b for all the objects of the class
		ob1.b = 200;
		
		System.out.println("After modification in ob1, Value of a = " + ob1.a); //100
		System.out.println("After modification in ob1, Value of b = " + ob1.b); //200
		
		//Creating the 2nd Object
		StaticAndInstance ob2 = new StaticAndInstance();
		System.out.println("Value of a when new object ob2 is created = " + ob2.a); //10, as instance variable have a new instance for every object
		System.out.println("Value of b when new object ob2 is created = " + ob2.b); //200, as it is static variable and modified in ob1.
	}
}
