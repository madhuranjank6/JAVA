// Example 4

import java.lang.*;

abstract class Shape{
	int l;
	int b;
	
	Shape(int l, int b){
		this.l = l;
		this.b = b;
	}
	
	abstract void area();
	abstract void perimeter();
}

class Square extends Shape{
	Square(int side){
		super(side,side);
	}
	
	@Override
	void area(){
		System.out.println("Square area = "+l*b);
	}
	
	@Override
	void perimeter(){
		System.out.println("Square Perimeter = "+4*l);
	}
}

class Rectangle extends Shape{
	Rectangle(int l, int b){
		super(l,b);
	}
	
	@Override
	void area(){
		System.out.println("Rectangle area = " + l*b);
	}
	
	@Override
	void perimeter(){
		System.out.println("Rectangle Perimeter = "+2*(l+b));
	}
}	

class AbstractExample4{
	public static void main(String args[]){
		Square s = new Square(5);
		s.area();
		s.perimeter();
		
		Rectangle r = new Rectangle(4,5);
		r.area();
		r.perimeter();
	}
}