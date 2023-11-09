package day_9.org.abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create and object and accessing method
		Iphone iphone = new Iphone("Apple","iphone 15","black",true);
	    iphone.makeCall("7598049725");
	    //Create an object for samsung
	    Samsung samsung = new Samsung("Samsung"," Galaxy M30","Black",false);
        samsung.sendMessage("9443421725", "Hello...");
	}

}
