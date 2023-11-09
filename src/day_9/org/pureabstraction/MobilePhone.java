package day_9.org.pureabstraction;

//pure abstraction in java -- by default it is 100% pure abstraction.
public interface MobilePhone {
	//abstract -> interface have method definition not implementation
	void makeCall(String phoneNumber);
	void sendMessage(String phoneNumber,String message);

}
