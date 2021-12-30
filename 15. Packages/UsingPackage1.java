// Java Program to demonstrate Packages

import maths.Addition;
import maths.Subtration;
import maths.Multiplication;
import maths.Division;

class UsingPackage1{
	public static void main(String args[]){
		Addition a = new Addition(10,20);
		Subtration s = new Subtration(30,10);
		Multiplication m = new Multiplication(2,5);
		Division d = new Division(80,4);
		
		a.add();
		s.sub();
		m.mul();
		d.div();
	}
}