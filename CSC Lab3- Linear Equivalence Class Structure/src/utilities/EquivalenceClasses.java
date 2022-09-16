package utilities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * A collection of Equivalence Classes stored in an arrayList
 * 
 * <p>Bugs: ???
 * 
 * @author Jace Rettig and Sally Stahl
 * @Date 9-12-22
 * @param <T>
 */
public class EquivalenceClasses<T> {
	protected Comparator<T> _comparator;

	protected List<LinkedEquivalenceClass<T>> _rest;

	/**
	 * Creates a new arraylist to store equivalence classes
	 * @param comparator
	 */
	public EquivalenceClasses(Comparator<T> comparator) {
		_comparator = comparator;
		_rest = new ArrayList<LinkedEquivalenceClass<T>>();
	}

	/**
	 * Adds a new class to the arrayList,
	 * Will not allow duplicate or null classes
	 * @param element
	 * @return true if addition was successful
	 */
	public boolean add(T element) {
		//TODO
		//check if element null
		if (element == null) return false;
		//check if class already contained
		if (_rest.contains(element)) return false;
		
		//add element equivalence class to the arrayList
		//TODO how to add/cast type?
		_rest.add((LinkedEquivalenceClass<T>) element);
		return true;
	}

	/**
	 * Checks if the arrayList contains the input target
	 * @param target
	 * @return True if containment
	 */
	public boolean contains(T target) {
		//TODO test
		//check if target is null
		if (target == null) return false;
		//check if contains target equivalence class
		return _rest.contains(target);
	}
	
	/**
	 * Returns the number of equivalence classes contained in the list
	 * @return and integer 
	 */
	public int size() {
		//TODO test
		//check the size of the arraylist
		return _rest.size();
	}

	/**
	 * Returns the number of classes contained in the list
	 * @return
	 */
	public int numClasses() {
		//TODO same as size then?
		
		//return size of list, list should not have duplicates
		return _rest.size();
	}

	/**
	 * Returns the index a particular class is located at; Returns -1 if
	 * the input is null or the class is not contained in the list
	 * @param element
	 * @return index of particular class
	 */
	protected int indexOfClass(T element) {
		//check if element is null
		if (element == null) return -1;
		//index location of element
		for (int i = 0; i < _rest.size(); i++) {
			//check if target is equal to current item
			if (_rest.get(i).equals(element)) return i;
		}
		//not contained
		return -1;
	}

	/**
	 * Returns a String representation of the contents of
	 * each Linked Equivalence Class the arrayList
	 * @return String 
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < _rest.size(); i++) {
			//add each item in arrayList to string on a new line
			s.append(_rest.get(i).toString() + "\n");
		}
		//String representation of all the classes in arrayList 
		return s.toString();
	}
	

}
