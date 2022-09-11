package utilities;

public class LinkedList <Item> {
	//NODE INNER CLASS
	private class Node<Item> {
		//TODO FINISH
		protected Item data;
		protected Node <Item> next;
	}
	
	protected Node<Item> head;
	protected Node<Item> tail;
	protected int size;
	
	//testing jace branch
	
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
	
	public void addToFront(Item element) {
		//TODO
	}
	
	public boolean contains(Item target) {
		//TODO use recursion
		return false;
	}
	
	private Node<Item> previous(Item target) {
		//TODO use recursion
		return;
	}
	
	public boolean remove(Item target) {
		//TODO
		return false;
	}
	
	private Node<Item> last() {
		//TODO
		return;
	}
	
	public void addToBack(Item element) {
		//TODO
	}
	
	public String toString( ) {
		//TODO use recursion
		return "FIX ME";
	}
	
	public void reverse() {
		//TODO use recursion, must be linear time AND space 
		//recursively break linked list into head value and tail list
		//once broken down at final node to the beginning of new list
		//on way back will add items in reverse
		
		//will work for linear space?
	}
}
