package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {
	private LinkedList<String> l;
	private LinkedList<String> emptyList;

	public LinkedListTest() {
		l = new LinkedList<String>();
		emptyList = new LinkedList<String>();
		l.addToBack("1");
		l.addToBack("2");
		l.addToBack("3");
		l.addToBack("4");
		l.addToBack("5");
		l.addToBack("6");
		l.addToFront("0");
	}
	
	/**
	 * Test example- use toString to facilitate testing linkedList
	 */
	
	@Test
	public void testIsEmpty() {
		assertFalse(l.isEmpty());
		assertTrue(emptyList.isEmpty());
	}
	
	@Test
	public void testRemove() {
		//try to remove last node
		//try empty
		//try 1 element
		//try non-existant element
	}
	
	
	@Test
	public void testAddToFront() {
		assertEquals("", emptyList.toString());
		assertEquals("0 1 2 3 4 5 6 ", l.toString());
	}
	
	@Test
	public void testContains() {
		//TODO fix contains method
		//assertTrue(l.contains("1"));
		//assertTrue(l.contains("2"));
		//assertFalse(l.contains("10"));
		
		
		
		
		
		//does not contain target
		//does contain target 
		//list is empty
	}
	
	@Test
	public void testPrevious() {
		//does not contain target
		//does contain target
		//list is empty
	}
	@Test
	public void testReverse() {
		//TODO fix reverse method too
		System.out.println(l.toString());
		l.reverse();
		System.out.println(l.toString());
		
	}
	
}
