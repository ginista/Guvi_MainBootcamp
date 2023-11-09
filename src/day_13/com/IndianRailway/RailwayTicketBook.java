package day_13.com.IndianRailway;
import java.util.*;

//class
public class RailwayTicketBook {

	//method for user to add to queue
	private static void joinqueue(Queue<String> ticketqueue,String personName) {
		ticketqueue.add(personName);
		System.out.println(personName+" is added to ticket booking queue.");
	}
	
	//book the ticket for person who is standing in a queue at the front
	private static void bookTicket(Queue<String> ticketqueue) {
		//check if queue is empyty or not
		if(!ticketqueue.isEmpty()) {
			String person = ticketqueue.poll();//return from front end
			System.out.println(person+" has booked the ticket");
		}
		else {
			System.out.println("No one is added in queue to book tickets");
		}
	}
	private static void display(Queue<String> ticketqueue) {
		System.out.println("Current status :"+ticketqueue);
	}
	//main method
	public static void main(String[] args) {
		//Create a queue for managing the booking
		Queue<String> ticketqueue = new LinkedList<String>();
		joinqueue(ticketqueue, "Ginista");
		joinqueue(ticketqueue, "Antanin");
		joinqueue(ticketqueue, "Garry");
		display(ticketqueue);
		joinqueue(ticketqueue, "Sheela");
		joinqueue(ticketqueue, "Dominic");
		bookTicket(ticketqueue);
		display(ticketqueue);

	}

}
