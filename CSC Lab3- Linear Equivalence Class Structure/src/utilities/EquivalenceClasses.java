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

	public EquivalenceClasses(Comparator<T> comparator) {

		_comparator = comparator;
		_rest = new ArrayList<LinkedEquivalenceClass<T>>();
	}

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

	public boolean contains(T target) {
		//TODO test
		//check if target is null
		if (target == null) return false;
		//check if contains target equivalence class
		for (int i = 0; i < _rest.size(); i++) {
			//check if target is equal to current item
			if (_rest.get(i).equals(target)) return true;
		}
		//target not contained
		return false;
	}


	public int size() {
		//TODO test
		//check the size of the arraylist
		return _rest.size();
	}

	public int numClasses() {
		//TODO fix if cannot have duplicates? same as size then?
		//check for number of equivalence classes (excluding duplicates)
		/*
		//create a set
		Set<LinkedEquivalenceClass<T>> classSet = new HashSet<LinkedEquivalenceClass<T>>();
		//loop through array list and add all items to set
		for (int i = 0; i < _rest.size(); i++) {
			classSet.add(_rest.get(i));
		}
		//return set size
		return classSet.size();
		*/
		//return size of list, list should not have duplicates
		return _rest.size();
	}

	protected int indexOfClass(T element) {
		//TODO
		//index value that element class is located at in arraylist
		return -1;
	}

	public String toString() {
		//TODO
		//String representation of all the classes in arrayList 
		return "ERROR";
	}
}
