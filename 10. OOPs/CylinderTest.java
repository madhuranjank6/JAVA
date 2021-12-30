import java.lang.*;

//Cylinder Class
class Cylinder{
	public double radius;
	public double height;
	
	public double lidArea(){
		return Math.PI*radius*radius;
	}
	
	public double totalSurfaceArea(){
		return 2*Math.PI*radius*(height + radius);
	}
	
	public double volume(){
		return Math.PI*radius*radius*height;
	}
}

//Class To test Cylinder class
class CylinderTest{
	public static void main(String args[]){
		Cylinder c1 = new Cylinder(); //Object of Cylinder class
		c1.radius = 4.5;
		c1.height = 3;
		
		System.out.println(c1.lidArea());
		System.out.println(c1.totalSurfaceArea());
		System.out.println(c1.volume());
	}
}