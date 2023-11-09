package day_10.org.exception.cutomException;
import java.util.*;
import java.time.*;

import java.time.format.DateTimeFormatter;

 

public class Main1 {

	public static void main(String[] args) {
		// During 7:45 to 12:00 PM Cannot access Indian Railways (server maintanance) cannot book a ticket at that time.
		//Exception -- under maintanance
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a time
        System.out.print("Enter a time (hh:mm a): ");
        String userInput = scanner.nextLine();

        // Parse the user input into a LocalTime object
        LocalTime userTime = LocalTime.parse(userInput, DateTimeFormatter.ofPattern("hh:mm a", Locale.US));
        
        try {
			TicketBooking obj = new TicketBooking(userTime);
			System.out.println("Time: "+obj.getuserTime());
		} catch (ServerMaintanenceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}


	}

}
