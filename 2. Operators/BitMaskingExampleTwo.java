import java.lang.*;
class BitMaskingExampleTwo{
	public static void main(String args[]){
		byte b = 0b01001000;
		//We will check if the 4th index bit is off or on
		b = (byte)(b&0b00010000);
		if(b>0){
			System.out.println("Bit is ON");
		}else{
			System.out.println("Bit is OFF");***
		}
	}
}