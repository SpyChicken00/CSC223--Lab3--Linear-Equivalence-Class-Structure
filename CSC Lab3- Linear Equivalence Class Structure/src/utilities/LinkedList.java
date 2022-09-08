package utilities;

public class LinkedList <T> {
	//NODE INNER CLASS
	private class Node<T> {
		//TODO FINISH
		protected T data;
		protected Node <T> next;
	}
	
	protected Node<T> head;
	protected Node<T> tail;
	protected int size;
	
	
	//
	//ALL ALGORITHMS MUST BE LINEAR TIME OR BETTER, USE RECURSION ;n;
	//
	
	public LinkedList() {
		//TODO
	}
	
	public boolean isEmpty() {
		//TODO
		return false;
	}
	
	public void clear() {
		//TODO
	}
	
	public int size() {
		//TODO
		return -1;
	}
	
	public void addToFront(T element) {
		//TODO
	}
	
	public boolean contains(T target) {
		//TODO use recursion
		return false;
	}
	
	private Node<T> previous(T target) {
		//TODO use recursion
		return;
	}
	
	public boolean remove(T target) {
		//TODO
		return false;
	}
	
	private Node<T> last() {
		//TODO
		return;
	}
	
	public void addToBack(T element) {
		//TODO
	}
	
	public String toString( ) {
		//TODO use recursion
		return "FIX ME";
	}
	
	public void reverse() {
		//TODO use recursion, must be linear time AND space 
	}
}
