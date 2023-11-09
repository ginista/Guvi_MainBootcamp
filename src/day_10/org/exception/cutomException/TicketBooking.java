package day_10.org.exception.cutomException;

import java.time.LocalTime;

public class TicketBooking {
	LocalTime userTime = LocalTime.of(0, 0); 
	
	public TicketBooking(LocalTime userTime) throws ServerMaintanenceException {
		this.userTime = userTime;
		
        // Define the start and end times for the range (7:30 PM to 12:00 AM)
        LocalTime startTime = LocalTime.of(19, 30); // 7:30 PM
        LocalTime endTime = LocalTime.MIDNIGHT;      // 12:00 AM (midnight)

        // Check if the user-entered time is within the specified range
        if (userTime.isAfter(endTime) && userTime.isBefore(startTime)) {
            System.out.println("Ticket booked successfully for time: " + userTime);
        } else {
            throw new ServerMaintanenceException("Server is under maintenance. Cannot book a ticket.");
        }

	}
	public LocalTime getuserTime() {
		return userTime;
	}
	
}
