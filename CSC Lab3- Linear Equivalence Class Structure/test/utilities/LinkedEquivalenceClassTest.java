package utilities;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class LinkedEquivalenceClassTest {
	

	LinkedEquivalenceClass<Integer> l; 

			
			
	public LinkedEquivalenceClassTest() {
		
		
		Comparator<Integer> c = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent'
			public int compare(Integer x, Integer y) {
				return x % 2 == y % 2 ? 0 : 1; }
			};
			
			l = new LinkedEquivalenceClass<Integer>(c);	
	}

	@Test
	void testCanonical() {
		//TODO- CHECK THAT THE NEW CANONICAL BELONGS
		
		
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
		assertEquals(0, l.size());
	}
	
	@Test
	public void testAdd() {
		//TODO CHECK WITH ELEMENTS THAT DO NOT BELONG
	}
	
	
	@Test
	public void testContains() {
		
	}
	
	
	@Test public void testBelongs() {
		
	}
	
	
	
	
	
	@Test
	public void testRemove() {
		//clear the list
		l.clear();
		//check that the list is empty
		assertTrue(l.isEmpty());
		
		//test on an empty list
		assertFalse(l.remove(1));
		
		
		
		//add elements to the list
		l.demoteAndSetCanonical(1);
		l.demoteAndSetCanonical(2);
		l.demoteAndSetCanonical(3);
		l.demoteAndSetCanonical(4);
		
		//remove an element
		assertTrue(l.remove(1));
		
		//remove an element that is the canonical
		assertTrue(l.remove(4));
		
		//remove an element
		assertTrue(l.remove(2));
		
		//remove an element that is impossible to remove
		//since it is the last element in the list
		assertFalse(l.remove(3));
		
		assertEquals(3, l.canonical());
		
		//check that the canonical is still there but the list is empty
		assertFalse(l.isEmpty());
		
		//check the size 
		assertEquals(1 , l.size());
		
		//remove an element that is not in the list
		assertFalse(l.remove(1));
		
	}
	
	
	
	
	
	
	@Test
	public void testRemoveCanonical() {
		//clear the list
		l.clear();
		//check that the list is empty
		assertTrue(l.isEmpty());
		
		//add elements to the list
		l.demoteAndSetCanonical(1);
		l.demoteAndSetCanonical(2);
		l.demoteAndSetCanonical(3);
		l.demoteAndSetCanonical(4);
		
		
		//check that the new canonical is 3
		assertEquals(4 , l.canonical());
		
		//remove the canonical
		assertTrue(l.removeCanonical());
		
		//check that the new canonical is 3
		assertEquals(3 , l.canonical());
		
		//remove the canonical again
		assertTrue(l.removeCanonical());
		
		//check that the new canonical is 3
		assertEquals(2 , l.canonical());
		
		
		
	}
	
	
	
	
	@Test
	public void testDemoteAndSetCanonical() {
		//TODO CHECK THAT THE ELEMENT BEING SET TO THE CANONICAL BELONGS
		
		//clear the list
		l.clear();
		
		//check that the canonical is null
		assertFalse(l.demoteAndSetCanonical(null));
		
		//add a canonical to the list
		assertTrue(l.demoteAndSetCanonical(1));
		
		//check that the canonical wis 1
		assertEquals(1 ,l.canonical());
		
		//demote the canonical and add element to the fron
		assertTrue(l.demoteAndSetCanonical(3));
		
		//verify that the canonical is now 3
		assertEquals(3 , l.canonical());
		
		
		//try to add canonical that is of the same value as existing canonical
		assertFalse(l.demoteAndSetCanonical(3));
		
		//try to add a canonical that is null
		assertFalse(l.demoteAndSetCanonical(null));
		
	
		

	}
	
	
	@Test
	public void testToString() {
		//TODO
	}

}

