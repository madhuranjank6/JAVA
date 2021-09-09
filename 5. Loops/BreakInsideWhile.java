// Break inside While loop

import java.lang.*;
class BreakInsideWhile{
	public static void main(String args[]){
		int i = 1;
		while(i<=10){
			System.out.print(i+" ");
			if(i==5){
				break;
			}
			i++;
		}
	}
}