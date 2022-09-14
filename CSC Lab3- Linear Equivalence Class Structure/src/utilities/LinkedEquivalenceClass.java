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
	
<<<<<<< Updated upstream
	protected T _canoncial;
=======
	
	protected T _canonical;
	
	
>>>>>>> Stashed changes
	protected Comparator<T> _comparator;
	protected LinkedList<T> _rest;
	
<<<<<<< Updated upstream
	public LinkedEquivalenceClass(Comparator<T> comparator) {
		//TODO how to initialize generic value if not given in constructor
		//_canoncial = 
		_comparator = comparator;
		_rest = new LinkedList<T>();
	}
	
	public T canonical() {
		//TODO
		return null;
	}
	
	public void isEmpty() {
		//TODO
	}
	
	public void clear() {
		//TODO
=======
	
	
	
	
	public LinkedEquivalenceClass(Comparator<T> comparator) {
		
		_canonical = null;
		
		_comparator = comparator;
		
		
		
	}
	
	public T canonical() 
	{
		return _canonical;
		
	}
	
	public boolean isEmpty() {
		if(_rest.size()==0) {
			return true;
		}
		return false;
		
	}
	
	public void clear() {
		_canonical = null;
		_rest.clear();
		
>>>>>>> Stashed changes
	}
	
	
	
	public void clearNonCanonical() {
<<<<<<< Updated upstream
		//TODO
	}
	
	public int size() {
		//TODO
		return -1;
=======
		_rest.clear();
		
	}
	
	public int size() {
		//return the size of the rest of the linked list
		return _rest.size();
		
>>>>>>> Stashed changes
	}

	public boolean add(T element) {
<<<<<<< Updated upstream
		//TODO
		return false;
=======
		if(_rest.contains(element)) {
			_rest.addToBack(element);
			return true;
		}
		
		return false;
		
		
>>>>>>> Stashed changes
	}
	
	public boolean contains(T target) {
<<<<<<< Updated upstream
		//TODO
		return false;
=======
		
		
		
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
		//TODO
		return false;
=======
		
		//remove the canonical and add to the front of list
		
		//test 1 
		
		
>>>>>>> Stashed changes
	}
	
	
	
}








