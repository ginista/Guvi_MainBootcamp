package day_9.org.pureabstraction;

public class Samsung implements MobilePhone{

	@Override
	public void makeCall(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Calling from "+phoneNumber+" from the Samsung");
	}

	@Override
	public void sendMessage(String phoneNumber, String message) {
		// TODO Auto-generated method stub
		 System.out.println("Sending a message to "+phoneNumber+" from the Samsung "+message);
		
	}

}
