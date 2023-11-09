package day_13.or.healthManagement;
import java.util.*;

public class Hospital {

	public static void main(String[] args) {
		PriorityQueue<Patient> patient = new PriorityQueue<>();
		
		//add patient ti queue
		patient.add(new Patient("Suresh",2));//Second parameter priority less condition
        patient.add(new Patient("Jay",1));		//critical
        patient.add(new Patient("John",3)); //lesser condition
        patient.add(new Patient("Janny",1));//critical condition
        while(!patient.isEmpty()) {
        	Patient nextpatient = patient.poll();
        	System.out.println("Treating Patient on condition "+nextpatient.getName());
        }
	}

}
