package day_9.org.abstraction;

//abstract class with keyword
abstract public class MobilePhone {
	
	//data member
	private String  brand;
	private String model;
	private String color;
	
	//constructor
	public MobilePhone(String brand, String model,String color) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		
	}
	
	//abstract method -> declaration -> no implementation
	 public abstract void makeCall(String phoneNumber);//defining
	 public abstract void sendMessage(String phoneNumber, String message);
	  
	 //non abstract or concrete method
	 public void playingSong(String song) {
		 System.out.println("Playing song with song name "+song);
	 }
	 //Getter method
	 public String getBrand() {
		 return brand;
	 }
	 public String getModel() {
		 return model;
	 }
	 public String getColor() {
		 return color;
	 }

}
