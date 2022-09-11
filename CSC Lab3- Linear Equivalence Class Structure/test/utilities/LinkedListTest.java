package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {
	private LinkedList<String> l;
	private LinkedList<String> emptyList;

	public LinkedListTest() {
		l = new LinkedList<String>();
		emptyList = new LinkedList<String>();
		l.addToFront("1");
		l.addToBack("2");
		//l.addToBack("3");
		//l.addToBack("4");
		//l.addToBack("5");
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
		//assertEquals("5 4 3 2 1 ", l.toString());
		//assertTrue(l.contains("1"));
		//assertTrue(l.contains("2"));
	}
	
	@Test
	public void testContains() {
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
	/*
	@Test
	public void testReverse() {
		System.out.println(l.toString());
		l.reverse();
		System.out.println(l.toString());
		
	}
	*/
}
