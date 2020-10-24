package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "Nilima");
		map.put(9, "Vandana");
		map.put(3, "Yograj");
		map.put(1, "Vishant");
		
		System.out.println("The hashmap key and values are : " + map);
		
		
		/*
		 * Unlike other collections, HashMaps need to be stored in a set first to access
		 * its key+value pair. Hence, below line
		 */
		Set set = map.entrySet();
		
		Iterator iterate = set.iterator();
		while(iterate.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterate.next();
			
			System.out.print("Key is : " + mentry.getKey());
			System.out.println("Value is : " + mentry.getValue());
		}
		
		map.remove(3);
		int size = map.size();
		System.out.println("Size after removing one element is " + size);
		
		
		
		
	}

}
