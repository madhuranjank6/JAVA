//Break Statement inside of for loop

import java.lang.*;
class BreakInsideFor{
	public static void main(String args[]){
		for(int i = 1; i<10;i++){
			System.out.println(i+" ");
			if(i==5){
				break;
			}
		}
	}
}