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
	
	protected T _canoncial;
	protected Comparator<T> _comparator;
	protected LinkedList<T> _rest;
	
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
	}
	
	public void clearNonCanonical() {
		//TODO
	}
	
	public int size() {
		//TODO
		return -1;
	}

	public boolean add(T element) {
		//TODO
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
	
	
	
}








