package collections;

import java.util.HashSet;

import org.testng.annotations.Test;

public class HashSetTest {
	
	@Test
	public void hashSetTest() {
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		hset.add(5);
		hset.add(7);
		hset.add(12);
		hset.add(9);
		hset.add(35);
		hset.add(7);
		hset.add(null);		
				
		System.out.println(hset);
	}
	
}
