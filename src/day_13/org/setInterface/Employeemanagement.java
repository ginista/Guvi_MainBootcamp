package day_13.org.setInterface;
import java.util.*;

public class Employeemanagement {

	public static void main(String[] args) {
		
		HashSet<Integer> empid = new HashSet<>();//stores in table
		//LinkedHashSet<Integer> empid = new LinkedHashSet<>();//stores in linkedlist
		//using parent class --> instance of child class.
		//Set<Integer> empid = new LinkedHashSet<>();
		
		//Storing unique elements.
		empid.add(12101);
		empid.add(12102);
		empid.add(12103);
		empid.add(12104);
        empid.add(12103);
        //order is not preserved differs from machine to machine.
        System.out.println("Employee in company with unique: "+empid);
        
        

		
		
		

	}

}
