import java.lang.*;
class LeftRightShift{
	public static void main(String args[]){
		int x = 10, y,z;
		y = x << 1; //Left Shift, result = 20
		z = x >> 1; //Right Shift, result = 5
		
		System.out.println("Left Shift = " + y);
		System.out.println("Right Shift = " + z);
	}
}