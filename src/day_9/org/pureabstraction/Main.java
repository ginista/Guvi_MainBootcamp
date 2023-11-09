package day_9.org.pureabstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MobilePhone mob = new MobilePhone Object creation not possible for interface. 
		Iphone iphone = new Iphone();
		iphone.sendMessage("7598049725", "Hi...How are you?");
		Samsung samsung = new Samsung();
		samsung.makeCall("9442251725");

	}

}
