package day_13.org.mapinterfacecollection;
import java.util.*;

public class Dictionary {

	public static void main(String[] args) {
		// create a map interface with Hashmap 
		Map<Integer,Integer> dict = new HashMap<>();
		//Map<Integer,Integer> dict = new LinkedHashMap<>();
		//Map<Integer,Integer> dict = new HashTable<>();
		////Map<Integer,Integer> dict = new TreeMap<>();
		

		dict.put(1,10 );
		dict.put(2, 25);
		dict.put(3, 18);
		dict.put(3, 18);//duplication not allowed
		dict.put(2, 20);//for same key it update the value.
		
		System.out.println(dict);
		System.out.println("Keys : "+dict.keySet());
		System.out.println("Values: "+dict.values());
		
		System.out.println(dict.remove(1, 10));//remove or delete it.
		System.out.println(dict);

	}

}
