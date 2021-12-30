// Interface Example 2

import java.lang.*;

interface Shape{
	double PI = 3.14;
	void area();
}


class Circle implements Shape{
	int r;
	Circle(int r){
		this.r = r;
	}
	
	public void area(){
		System.out.println("Area of Circle = "+PI*r*r);
	}
}

class Sphere implements Shape{
	int r;
	Sphere(int r){
		this.r = r;
	}
	
	public void area(){
		System.out.println("Volume of Sphere = "+4/3.0*PI*r*r*r);
	}
}

class InterfaceExample2{
	public static void main(String args[]){
		Shape s;
		s = new Circle(5);
		s.area();
		
		s = new Sphere(4);
		s.area();
		
		System.out.println(Shape.PI);
	}
}