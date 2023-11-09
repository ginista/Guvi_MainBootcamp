package day_12_Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Collection_1 {

	public static void main(String[] args) {
		// array - mechanisms
		int[] array = new int[3];//size is fixed
		array[0]=5;
		array[1]=8;
		array[2]=7;
		System.out.println(Arrays.toString(array));
       
		//Array List -- dynamic array(growable array)
		List<Integer> list = new ArrayList<>();
		//store and add data using add method.
		//store object level data.
		list.add(98);
		list.add(87);
		list.add(30);
		list.add(90);
		list.add(67);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.contains(30));
		System.out.println(list.remove(1));//index value
		System.out.println(list);
		
		//shop -> collection of data
		ArrayList<String> shop = new ArrayList<>();
		shop.add("Clothes");
		shop.add("Chappels");
		shop.add("Slippers");
		shop.add("Milk");
		shop.add("Bread");
		shop.add("Sugar");
		System.out.println(shop);
		
		
	}

}
