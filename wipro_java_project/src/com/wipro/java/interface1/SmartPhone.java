package com.wipro.java.interface1;

public class SmartPhone implements Phone, Camera  {

	public static void main(String[] args) {
		 SmartPhone myPhone = new SmartPhone();  // Creating an instance of SmartPhone
	        
	        
	        myPhone.makeCall("123-456-7890");
	        myPhone.receiveCall();
	        
	        
	        myPhone.takePhoto();
	        myPhone.recordVideo();
		// TODO Auto-generated method stub

	}

	@Override
	public void takePhoto() {
		System.out.println("Taking a photo...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recordVideo() {
		System.out.println("Recording a video...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeCall(String number) {
		System.out.println("Calling " + number + "...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCall() {
		System.out.println("Receiving a call...");
		// TODO Auto-generated method stub
		
	}

}
