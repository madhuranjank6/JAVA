import java.lang.*;
class BitMerging{
	public static void main(String args[]){
		byte a = 0b00000000;
		System.out.println("Before bit Merging, a = " + a);
		a = (byte)(a|0b00001000);  //Performing bit merging to make 3rd index bit 1
		System.out.println("After bit Merging, a = " + a);
	}
}