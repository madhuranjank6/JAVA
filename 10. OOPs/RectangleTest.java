import java.lang.*;

//Rectangle Class
class Rectangle{
	public double length;
	public double breadth;
	
	public double area(){
		return length*breadth;
	}
	
	public double perimeter(){
		return 2*(length+breadth);
	}
}

//Class To test Rectangle class
class RectangleTest{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle(); //Object of Recatngle class
		r1.length = 4.2;
		r1.breadth = 5;
		
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
	}
}