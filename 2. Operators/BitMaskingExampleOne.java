import java.lang.*;
class BitMaskingExampleOne{
	public static void main(String args[]){
		byte a = 0b00001000;
		//We will check if the 3rd index bit is off or on
		a = (byte)(a&0b00001000);
		if(a>0){
			System.out.println("Bit is ON");
		}else{
			System.out.println("Bit is OFF");
		}
	}
}