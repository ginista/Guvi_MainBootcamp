package day_12_Collection;
import java.util.*;

public class EmployeeManagement {

	public static void main(String[] args) {
		//Create an array list to store the data of the employees
		ArrayList<String> empname = new ArrayList<>();
        
		//add the employee name to the list
		empname.add("Lavish");
		empname.add("Satish");
		empname.add("swapil");
		empname.add("Ginista");
		empname.add("Antanin");
		empname.add("Rajesh");
		
		//display the data of the all employee
		System.out.println("Employee list : "+empname);
		
		//update the employee name
		empname.set(1,"Antanin Ginista");

		//display the data of the all employee
		System.out.println("Updated list : "+empname);
		
		//Retrieve the data of employee.
		System.out.println("Name at index 1 : "+empname.get(1));
		
		//Remove the employee in database
		empname.remove(2);//using index.
		empname.remove("Rajesh");//using name.
		System.out.println("Updated list : "+empname);
		
		//Search some employee working in company or not
		boolean checkEmployee = empname.contains("Antanin Ginista");
		if(checkEmployee) {
			System.out.println("Antanin Ginista is present.");
		}
		else {
			System.out.println("Antanin Ginista is not present.");
		}
		
		empname.clear();
		System.out.println(empname.isEmpty());
		
				
		
	}

}
