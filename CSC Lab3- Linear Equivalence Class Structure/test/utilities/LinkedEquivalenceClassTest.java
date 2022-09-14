package utilities;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class LinkedEquivalenceClassTest {
	

	LinkedEquivalenceClass<Integer> l; 

			
			
	public LinkedEquivalenceClassTest() {
		
		
		Comparator<Integer> c = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent'
			public int compare(Integer x, Integer y) { return x % 2 == y % 2 ? 0 : 1; }
			};
			
			l = new LinkedEquivalenceClass<Integer>(c);	
	}

	@Test
	void testCanonical() {
		
		assertEquals(null , l.canonical());
		
		//test with a canonical that is null
		l.demoteAndSetCanonical(null);
		
		//test that the canonical is empty
		assertEquals(null , l.canonical());
		
		//test on an empty canonical
		//TODO- change this once demote and set is finalized
		assertEquals(false , l.demoteAndSetCanonical(1));
		
		//check that the canonical is 1
		assertEquals(1, l.canonical());
		
		//test on a canonical element
		l.demoteAndSetCanonical(2);
		
		//check that the new canonical is 2
		assertEquals(2 , l.canonical());
		
		
	}
	
	
	@Test
	void testisEmpty() {
		
		//test on an empty canonical and empty rest
		assertTrue(l.isEmpty());
		
		//add a canonical 
		l.demoteAndSetCanonical(1);
		
		//check that the canonical and rest are not empty
		assertFalse(l.isEmpty());
		
		//add element to canonical and have an element in the rest
		l.demoteAndSetCanonical(2);
		
		//check that it is still containing elements
		assertFalse(l.isEmpty());
		
		//clear the list
		l.clearNonCanonical();
		
		//check that there is still an element in canonical
		assertFalse(l.isEmpty());
		
		//clear the whole thing
		l.clear();
		
		//check that everything is empty
		assertTrue(l.isEmpty());
		
		
		
		
		
	}
	
	@Test
	public void testClear() {
		
	}
	
	@Test
	public void testClearNonCanonical() {
		l.clear();
		//check that size is 1 after clearing list but not canonical
		l.demoteAndSetCanonical(2);
		l.clearNonCanonical();
		assertEquals(1, l.size());
	}
	
	@Test
	public void testSize() {
		//add canonical, should be 1 item in linked list
		l.clear();
		//test size of linked equivalence class 
		assertEquals(1, l.size());
	}
	
	@Test
	public void testDemoteAndSetCanonical() {
		//check that asserts false if not possible
		
		
		//check that true 
		assertTrue(l.demoteAndSetCanonical(3));
		assertEquals(3, l.canonical());
	}

}

