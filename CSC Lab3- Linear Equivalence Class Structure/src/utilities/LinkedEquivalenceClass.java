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
		_canonical = null;
		_comparator = comparator;
		_rest = new LinkedList<T>();
	}
	
	public T canonical() {
		return null;
	}
	
	public void isEmpty() {
		//TODO
	}
	
	public void clear() {
		//TODO
	}
	
	public void clearNonCanonical() {
		//TODO
	}
	
	public int size() {
		//TODO
		//return the size of the rest of the linked list
		return _rest.size();
	}

	public boolean add(T element) {
		//TODO
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
		//TODO
		return false;
	}
	
	public String toString() {
		//TODO
		return "FINISH ME";
	}
}








