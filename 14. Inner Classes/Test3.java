// Anonymous inner class Demo

import java.lang.*;

abstract class Animal{
	abstract void eat();
};

class Test3{
	Animal a = new Animal(){ //Anonymous inner class
		void eat(){
			System.out.println("Animal Eating");
		}
	};
	
	public static void main(String args[]){
		Test3 t = new Test3();
		t.a.eat();
	}
}