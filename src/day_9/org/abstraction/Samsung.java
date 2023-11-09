package day_9.org.abstraction;

public class Samsung extends MobilePhone{

	//declared
	private boolean isWaterProof;
	
	//Constructor
	public Samsung(String brand,String model,String color,boolean isWaterProof) {
		super(brand, model, color);
		this.isWaterProof = isWaterProof;
	}
	
	//implementation of abstraction
	@Override
	public void makeCall(String phoneNumber) {
		System.out.println("Calling "+phoneNumber+" from "+getBrand());
	}
	@Override
	public void sendMessage(String phoneNumber,String message) {
		System.out.println("Sending message to "+phoneNumber+" from "+getBrand()+getModel()+" : "+message);
		
	}
}
