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
		//clear the list
		l.clear();
		
		//check that the canonical is null
		assertEquals(null , l.canonical());
		
		//test with a canonical that is null
		l.demoteAndSetCanonical(null);
		
		//test that the canonical is empty
		assertEquals(null , l.canonical());
		
		//test on an empty canonical
		//TODO- change this once demote and set is finalized
		assertEquals(true , l.demoteAndSetCanonical(1));
		
		//check that the canonical is 1
		assertEquals(1, l.canonical());
		
		//test on a canonical element
		l.demoteAndSetCanonical(2);
		
		//check that the new canonical is 2
		assertEquals(2 , l.canonical());
		
		
	}
	
	
	@Test
	void testisEmpty() {
		//clear the list
		l.clear();
		
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
		//clear the list
		l.clear();
		
		
		//test that the list is empty
		assertTrue(l.isEmpty());
		
		//add elements to the list
		l.demoteAndSetCanonical(1);
		l.demoteAndSetCanonical(2);
		l.demoteAndSetCanonical(3);
		l.demoteAndSetCanonical(4);
		
		//test that the list is not empty
		assertFalse(l.isEmpty());
		
		//clear the list 
		l.clear();
		
		//test that the canonical is null
		assertEquals(null, l.canonical());
		
		//check that the list is now empty
		assertTrue(l.isEmpty());
	
		
	}
	
	
	@Test
	public void testClearNonCanonical() {
		l.clear();
		l.demoteAndSetCanonical(2);
		l.clearNonCanonical();
		assertEquals(1, l.size());
	}
	
	@Test
	public void testSize() {
		//add canonical, should be 1 item in linked list
		l.clear();
		l.demoteAndSetCanonical(3);
		//test size of linked equivalence class 
		assertEquals(1, l.size());
	}
	
	@Test
	public void testDemoteAndSetCanonical() {
		
		
		
		
		
	}

}

