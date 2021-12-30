// Interface Example 3

import java.lang.*;

class Phone{
	public void call(){
		System.out.println("Phone Call");
	}
	
	public void sms(){
		System.out.println("Phone sending sms");
	}
}

interface ICamera{
	void click();
	void record();
}

interface IMusicPlayer{
	void play();
	void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer{
	public void videoCall(){
		System.out.println("SmartPhone Video Calling");
	}
	
	public void click(){
		System.out.println("SmartPhone Clicking Photo");
	}
	
	public void record(){
		System.out.println("SmartPhone recording video");
	}
	
	public void play(){
		System.out.println("SmartPhone Playing music");
	}
	
	public void stop(){
		System.out.println("SmartPhone stopped music");
	}
}

class InterfaceExample3{
	public static void main(String args[]){
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.click();
		sp.play();
	}
}
