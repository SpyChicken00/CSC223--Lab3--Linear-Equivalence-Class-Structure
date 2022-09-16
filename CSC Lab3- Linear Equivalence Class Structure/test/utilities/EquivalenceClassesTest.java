package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class EquivalenceClassesTest {
	
	EquivalenceClasses<LinkedEquivalenceClass<Integer>> _ec;
	
	
	public EquivalenceClassesTest(){

	Comparator<LinkedEquivalenceClass<Integer>> c = new Comparator<LinkedEquivalenceClass<Integer>>() {
		// All even integers are 'equivalent' // All odd integers are 'equivalent'
		public int compare(LinkedEquivalenceClass<Integer> x, LinkedEquivalenceClass<Integer> y) {
			return x.equals(y) ? 0 : 1; }
		};
		
		_ec = new EquivalenceClasses<LinkedEquivalenceClass<Integer>>(c);
		
		
		
	}
		
	
	
	@Test
	void testAdd() {
		//create the comparator for the linked equivalence classes
		Comparator<Integer> c1 = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent'
			public int compare(Integer x, Integer y) {
				return x % 2 == y % 2 ? 0 : 1; }
			};
		
		//create a test linker equivalence class to use for testing purposes
		LinkedEquivalenceClass<Integer>test1 = new LinkedEquivalenceClass<Integer>(c1);
		LinkedEquivalenceClass<Integer>test2 = new LinkedEquivalenceClass<Integer>(c1);
		
		
		//test with a null element
		assertFalse(_ec.add(null));
		
		//add an element
		assertTrue(_ec.add(test1));
		
		//check that it is contains within that
		//assertTrue(_ec.contains(test1));
		
		//add another element
		assertTrue(_ec.add(test2));
		
		//check that new element is contains
		//assertTrue(_ec.contains(test2));
	
		
		
		
	}
	
	
	@Test
	void testContains() {
		
		//test with a null element
		
		//add elements to the list
		
		//test contains with an element in the lsit
		
		//test with an element that is not in the list
		
		//test with a null element again
		
		
	}
	
	
	@Test
	void testSize() {
	
		//check on an array with no elements
		
		//add elements
		
		//check the size again
		
		//add more elements
		
		//check the size again
		
	}
	
	
	
	@Test
	void testNumClasses() {
		
	}
	
	
	@Test
	void testIndexOfClasses() {
		
	}
	
	@Test
	void testToString() {
		
	}
	
}
