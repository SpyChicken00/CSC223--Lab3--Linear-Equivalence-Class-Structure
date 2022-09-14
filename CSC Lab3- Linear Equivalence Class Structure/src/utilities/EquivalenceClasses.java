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
		return false;
	}

	public boolean contains(T target) {

		//TODO
		return false;
	}


	public int size() {

		//TODO
		return -1;
	}

	public int numClasses() {

		//TODO
		return -1;
	}


	protected int indexOfClass(T element) {

		//TODO
		return -1;
	}

	public String toString() {

		//TODO
		return "ERROR";
	}
}
