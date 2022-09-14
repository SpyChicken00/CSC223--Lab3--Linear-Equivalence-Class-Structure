package utilities;
import java.util.Comparator;
/**
 * A LinkedEquivalence Class, determines if two objects
 * can be compared based on a specified criteria or something 
 * idk fix this later
 * 
 * <p>Bugs: ???
* 
* @author Jace Rettig and Sally Stahl
* @Date 9-12-22
* @param <T>
*/
public class LinkedEquivalenceClass<T> {

	protected T _canonical;
	protected Comparator<T> _comparator;
	protected LinkedList<T> _rest;
	
	/**
	 * Creates a new LinkedEquivalence Class Object
	 * @param comparator
	 */
	public LinkedEquivalenceClass(Comparator<T> comparator) {
		_canonical = null;
		_comparator = comparator;
		_rest = new LinkedList<T>();
	}
	
	/**
	 * Returns the current canonical for the Linked Equivalence Class
	 * @return the current canonical
	 */
	public T canonical() {
		//establish canonical
		return _canonical;
	}
	
	/**
	 * Checks if the Linked Equivalence Class is empty
	 * @return True if empty
	 */
	public boolean isEmpty() {
		//check that list is empty AND that canonical is null;
		if (_canonical == null && _rest.isEmpty()) return true;
		//if not empty
		return false;
	}
	
	/**
	 * Clears the entire Linked Equivalence Class, including the canonical
	 */
	public void clear() {
		//TODO test
		//clear list AND clear canonical;
		_canonical = null;
		_rest.clear();
	}
	
	/**
	 * Clears the Linked Equivalence Class but the canonical does not change
	 */
	public void clearNonCanonical() {
		//clear list but NOT canonical
		_rest.clear();
	}
	
	/**
	 * Returns the size of the Linked Equivalence Class, including the canonical
	 * @return
	 */
	public int size() {
		//if canonical is not null size = linked list size + 1
		if (!(_canonical == null)) return _rest._size + 1;
		//return the size of the rest of the linked list 
		return _rest.size();
	}

	
	
	
	
	
	public boolean add(T element) {
		//TODO WIP- review
		if(_rest.contains(element)) {
			_rest.addToBack(element);
			return true;
		}
		return false;
	}
	
	public boolean contains(T target) {
		//TODO
		//check if target is canonical or in linked list
		return false;
	}
	
	public boolean belongs(T target) {
		//TODO
		//uhhhhhhhhhhhhhhh
		return false;
	}
	
	public boolean remove(T target) {
		//TODO 
		//remove target from just list? or also remove if its the canonical
		return false;
	}
	
	public boolean removeCanonical() {
		//TODO
		//remove completely or remove and add to rest
		
		return false;
	}
	
	/**
	 * Adds previous Canonical to Linked Equivalence Class and sets input to new canonical
	 * @param element
	 * @return True if element is different than canonical
	 */
	public boolean demoteAndSetCanonical(T element) {
		//add canonical to front of list if its not null
		if (!(_canonical == null)) _rest.addToFront(_canonical);
		//set input value to canonical
		if ((_canonical != element) || (element != null)) {
			_canonical = element;
			return true;
		}
		//if canonical is the same as the element
		return false;
	}
	
	/**
	 * Returns a string representation of the Linked Equivalence Class
	 */
	public String toString() {
		//TODO test
		//Create a string that represents list/canonical EX: {2 | 4, 6, 8, 12}
		StringBuilder s = new StringBuilder();
		s.append("{" + _canonical + " | ");
		s.append(_rest.toString() + "}");
		return s.toString();
	}
}








