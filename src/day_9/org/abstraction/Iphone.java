package day_9.org.abstraction;

public class Iphone extends MobilePhone {
//all the abstract method in parent class should be implemented
	private boolean faceIdEnabled;
	
	//Constructor
	public Iphone(String brand,String model,String color,boolean faceIdEnabled) {
		super(brand,model,color);
		this.faceIdEnabled = faceIdEnabled;
	}
	
	//provide the implementation of the abstract methods
	@Override
	public void makeCall(String phoneNumber) {
		System.out.println("Calling "+phoneNumber+" from "+getBrand());
	}
	@Override
	public void sendMessage(String phoneNumber, String message) {
		System.out.println("Sending message to "+phoneNumber+" from "+getBrand()+getModel()+" : "+message);
		
	}
	
}
