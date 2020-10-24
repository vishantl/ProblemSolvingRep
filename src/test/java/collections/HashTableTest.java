package collections;

import java.util.ArrayList;
import java.util.Hashtable;

import org.testng.annotations.Test;

public class HashTableTest {
	
	@Test
	public void hashtableTest() {
		
		ArrayList<String> data = new ArrayList<String>();
		
		Hashtable<Integer,String> table = new Hashtable<Integer,String>();
		table.put(1,  "Vishant");
		table.put(2,  "Vishant1");
		table.put(3,  "Vishant2");
		table.put(4,  "Vishant3");
		
		int size = table.size();
		System.out.println(size);
		
		for(int i = 0; i<=size; i++) {
		
			data.add(table.get(i));
			System.out.println(data.get(i));
		}
		
		
	}
	
}
