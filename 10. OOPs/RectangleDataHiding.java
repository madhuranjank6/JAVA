import java.lang.*;

class Rectangle1{
	private double length;
	private double breadth;
	
	//Getter Methods
	public double getLength(){
		return length;
	}
	
	public double getBreadth(){
		return breadth;
	}
	
	//Setter methods
	public void setLength(double l){
		length = l;
	}
	
	public void setBreadth(double b){
		breadth = b;
	}
	
	//General Methods
	public double area(){
		return length*breadth;
	}
	
	public double perimeter(){
		return 2*(length+breadth);
	}
}

class RectangleDataHiding{
	public static void main(String args[]){
		Rectangle1 r = new Rectangle1();
		
		r.setLength(10.5);
		r.setBreadth(5.5);
		
		System.out.println("Area = " + r.area());
		System.out.println("Perimeter = " + r.perimeter());
		
		System.out.println("Length = "+r.getLength());
		System.out.println("Breadth = "+r.getBreadth());
	}
}