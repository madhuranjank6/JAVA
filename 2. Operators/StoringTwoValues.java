import java.lang.*;
class StoringTwoValues{
	public static void main(String args[]){
		byte a = 9,b=12;
		byte c;
		
		c = (byte)(a<<4);  //Storing 12 in rightmost 4 bits
		c = (byte)(c|b);   //Storing 9 in leftmost 4 bits
		
		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111));
	}
}