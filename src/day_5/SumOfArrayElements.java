package day_5;
import java.util.*;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of an array : ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		for(int value:arr) {
			sum += value;
		}
		System.out.println("SUM "+sum);
		int largest = arr[0];
		for(int value:arr) {
			if(largest<value) {
				largest = value;
			}
		}
		System.out.println(largest);
		scan.close();

	}

}
