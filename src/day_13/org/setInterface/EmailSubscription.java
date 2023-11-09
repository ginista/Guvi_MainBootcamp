package day_13.org.setInterface;
import java.util.*;

public class EmailSubscription {

	public static void main(String[] args) {
		// Create a hashset to manage unique email id
		//HashSet is a class
		HashSet<String> emailsubs = new HashSet<>();
		
		//add all this email id to subscription list.
		emailsubs.add("john@gmail.com");
		emailsubs.add("lavish@gmail.com");
		emailsubs.add("jenny@gmail.com");
		emailsubs.add("john@gmail.com"); // attempting a duplicate user.
		emailsubs.add("lavish@gmail.com");
		emailsubs.add("ramesh@gmail.com");
		
		System.out.println(emailsubs);// get only unique subscription
		//insertion order can not be predicted.
		
      //check if the user exist or not in set
		boolean hassubscription = emailsubs.contains("lavish@gmail.com");
		if(hassubscription) {
			System.out.println("User is available in the subscription");
		}
		else {
			System.out.println("User is not subscribed");
		}
	}

}
