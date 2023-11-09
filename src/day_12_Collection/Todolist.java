package day_12_Collection;

import java.util.LinkedList;

public class Todolist {

	public static void main(String[] args) {
		//create a linked list 
		LinkedList<String> todolist = new LinkedList<>();
		todolist.add("Take a session");
		todolist.add("Resolving learner query....");
		todolist.add("Developing content and website");
		todolist.add("Internal team connects");
		todolist.add("Working on creating and adding daily task report");
		
		System.out.println("To do work "+todolist);
		
		//whatever operation can perform in list can perform in linkedlist.
		todolist.set(1, "Taking technical interviews...");
		todolist.remove(2);
		
		System.out.println("Todo list : "+todolist);
		
		//iterate over the data to print this as object
		for(String element:todolist) {
			System.out.println(element);
		}

	}

}
