package day_5;
import java.util.*;

public class ArraysExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static Approach");
		float numbers[] = {10.1f,10.2f,10.3f,10.4f,10.5f};
		for(int i=0;i<numbers.length;i++) {
			System.out.printf(numbers[i]+" ");
		}
		System.out.println();
		System.out.println("Dynamic Approach");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		float numbers1[] = new float[size];
		for(int i=0;i<size;i++) {
			numbers1[i] = scan.nextFloat();
		}
		scan.close(); //bestpractice not mandatory
		for(float value :numbers1) {
			System.out.printf(value+" ");
		}
		
		

	}

}
