// Method overloading with differen order of paremeters and within different classes


import java.lang.*;

class A{
	void show(boolean a, int b){
		System.out.println("int and booelan parametrs");
	}
}

class B extends A{
	void show(int c, boolean a){
		System.out.println("booelan and int parametrs");
	}
}

class Polymorphism2{
	public static void main(String args[]){
		B b = new B();
		b.show(10,true);
		b.show(true,10);
	}
}