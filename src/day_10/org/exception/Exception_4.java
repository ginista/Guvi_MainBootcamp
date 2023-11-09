package day_10.org.exception;

import java.io.*;

public class Exception_4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Create a file that doen't exist
		File file = new File("file.txt");
		FileReader fr = new FileReader(file);

	}

}
