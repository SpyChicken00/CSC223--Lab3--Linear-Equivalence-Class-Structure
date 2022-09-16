package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class EquivalenceClassesTest {

	EquivalenceClasses<LinkedEquivalenceClass<Integer>> _ec;


	LinkedEquivalenceClass<Integer> _test1;
	LinkedEquivalenceClass<Integer> _test2;
	LinkedEquivalenceClass<Integer> _test3;


	public EquivalenceClassesTest(){

		Comparator<LinkedEquivalenceClass<Integer>> c = new Comparator<LinkedEquivalenceClass<Integer>>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent'
			public int compare(LinkedEquivalenceClass<Integer> x, LinkedEquivalenceClass<Integer> y) {
				return x.equals(y) ? 0 : 1; }
		};

		_ec = new EquivalenceClasses<LinkedEquivalenceClass<Integer>>(c);


		//create the test equivalence classes
		Comparator<Integer> c1 = new Comparator<Integer>() {
			// All even integers are 'equivalent' // All odd integers are 'equivalent'
			public int compare(Integer x, Integer y) {
				return x % 2 == y % 2 ? 0 : 1; }
		};



		_test1 = new LinkedEquivalenceClass<Integer>(c1);
		_test2 = new LinkedEquivalenceClass<Integer>(c1);
		_test3 = new LinkedEquivalenceClass<Integer>(c1);
	}




	private void addElements(LinkedEquivalenceClass<Integer> t ,Integer x , Integer y , Integer z) {

		t.demoteAndSetCanonical(x);
		t.add(y);
		t.add(z);
	}



	@Test
	void testAdd() {

		//add elements to the linker equivalence classes
		addElements(_test1 , 2, 4, 6);
		addElements(_test2 , 4, 8, 12);
		addElements(_test3 , 6, 12 , 18);



		//test with a null element
		assertFalse(_ec.add(null));

		//add an element
		assertTrue(_ec.add(_test1));

		//check that it is contains within that
		assertTrue(_ec.contains(_test1));

		//add another element
		assertTrue(_ec.add(_test2));

		//check that new element is contains
		assertTrue(_ec.contains(_test2));




	}


	@Test
	void testContains() {

		//add elements to the linker equivalence classes
		addElements(_test1 , 2, 4, 6);
		addElements(_test2 , 4, 8, 12);
		addElements(_test3 , 6, 12 , 18);

		//test with a null element
		assertFalse(_ec.contains(null));

		//add an element
		assertTrue(_ec.add(_test1));

		//check that it is contains within that
		assertTrue(_ec.contains(_test1));

		//add another element
		assertTrue(_ec.add(_test2));

		//check that new element is contains
		assertTrue(_ec.contains(_test2));

		//test with an element that is not in the list
		assertFalse(_ec.contains(_test3));



	}


	@Test
	void testSize() {

		//add elements to the linker equivalence classes
		addElements(_test1 , 2, 4, 6);
		addElements(_test2 , 4, 8, 12);
		addElements(_test3 , 6, 12 , 18);

		//test with no elements in the set
		assertEquals(0 , _ec.size());

		//add an element
		assertTrue(_ec.add(_test1));

		//check the size of the class
		assertEquals(1 , _ec.size());

		//add another element
		assertTrue(_ec.add(_test2));

		//check the size 
		assertEquals( 2 , _ec.size());

		//add an element that already exists 
		assertFalse(_ec.add(_test2));

		//check that the size is still 2
		assertEquals( 2 , _ec.size());


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
