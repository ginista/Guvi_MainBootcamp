package day_9.org.pureabstraction;

public class Iphone implements MobilePhone {

	//implementation of interface method
	@Override
	public void makeCall(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Calling from "+phoneNumber+" from the iphone");
	}

	@Override
	public void sendMessage(String phoneNumber, String message) {
		// TODO Auto-generated method stub
		
	   System.out.println("Sending a message to "+phoneNumber+" from the iphone "+message);
	}

	
}
