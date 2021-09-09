import java.lang.*;
class UnsignedRightShift{
	public static void main(String args[]){
		int x = -0b1010;
		int y;
		
		y = x >>> 1; //Unsigned Right Shift
		
		System.out.println(Integer.toBinaryString(y));
	}
}