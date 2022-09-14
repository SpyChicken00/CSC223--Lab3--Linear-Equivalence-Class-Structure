package utilities;
import java.util.Comparator;
/**
 * FIX ME
 * @author Jace
 *
 * @param <T>
 */
public class LinkedEquivalenceClass<T> {

	protected T _canonical;
	protected Comparator<T> _comparator;
	protected LinkedList<T> _rest;
	
	public LinkedEquivalenceClass(Comparator<T> comparator) {
		//TODO what to do for canonical initial value
		_canonical = null;
		_comparator = comparator;
		_rest = new LinkedList<T>();
	}
	
	public T canonical() {
		//TODO test
		//establish canonical
		return _canonical;
	}
	
	public boolean isEmpty() {
		//TODO test
		//check that list is empty AND that canonical is null;
		if (_canonical == null && _rest.isEmpty()) return true;
		//if not empty
		return false;
	}
	
	public void clear() {
		//TODO test
		//clear list AND clear canonical;
		_canonical = null;
		_rest.clear();
		
	}
	
	public void clearNonCanonical() {
		//TODO test
		//clear list but NOT canonical
		_rest.clear();
	}
	
	public int size() {
		//TODO test
		//if canonical is not null size = linked list size + 1
		if (!(_canonical == null)) return _rest._size + 1;
		//return the size of the rest of the linked list 
		return _rest.size();
	}

	public boolean add(T element) {
		//TODO WIP
		if(_rest.contains(element)) {
			_rest.addToBack(element);
			return true;
		}
		return false;
	}
	
	public boolean contains(T target) {
		//TODO
		return false;
	}
	
	public boolean belongs(T target) {
		//TODO
		return false;
	}
	
	public boolean remove(T target) {
		//TODO 
		return false;
	}
	
	public boolean removeCanonical() {
		//TODO
		return false;
	}
	
	public boolean demoteAndSetCanonical(T element) {
		//TODO test
		//TODO what order?
		//add canonical to front of list if its not null
		if (!(_canonical == null)) _rest.addToFront(_canonical);
		//set input value to canonical
		_canonical = element;
		
		
		//TODO question?
		//what is true false supposed to represent?
		//successfully adding? if canonical is null or not? 
		return false;
	}
	
	public String toString() {
		//TODO
		return "FINISH ME";
	}
}








