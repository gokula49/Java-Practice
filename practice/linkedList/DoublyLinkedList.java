package practice.linkedList;

public class DoublyLinkedList {

	class Node {
		public int data;
		public Node next;
		public Node previous;
		
		public void displayList() {
			System.out.println(data);
		}
	}
	
	private Node first;
	private Node last;
	
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	public boolean isEmpty() {
		
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			last = newNode;
		}
		else {
			first.previous = newNode;
		}
		newNode.next = first;
		this.first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			first = newNode;
		}
		else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}
	public Node deleteFirst() {
		Node temp = first;
		if(isEmpty()) {
			last=null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}
	
	public Node deleteLast() {
		Node temp = last;
		if(isEmpty()) {
			first = null;
		}else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}
	
	public boolean insertAfter(int key,int data) {
		Node current = first;
		Node newNode = new Node();
		newNode.data =data;
		while(current.data != key) {
			current= current.next;
			if(current == null) {
				return false;
			}
			
		}
		if(current == last) {
			current.next=null; last = newNode;
		}
		else {
		newNode.next = current.next;
	    current.next.previous = newNode;
	}
		newNode.previous = current;
		current.next = newNode;
		return true;
	
	}
	
	public boolean deleteKey(int key) {
		Node current = first;
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		if(current == first) {
			first = current.next;
		}
		else {
			current.previous.next = current.next;
		}
		if(current == last) {
			last.previous.next =null;
		}
		else {
			current.next.previous = current.previous;
		}
		return true;
	}
	
	public void displayFarword() {
		Node current = first;
		while(current != null ) {
			current.displayList();
			current = current.next;
		}
	}
	public void displayBackword() {
		Node current = last;
		while(current != null ) {
			current.displayList();
			current= current.previous;
		}
	}
 	public static void main(String[] args) {
       
 		DoublyLinkedList thisList = new DoublyLinkedList();
 		thisList.insertFirst(50);
 		thisList.insertFirst(20);
 		thisList.insertLast(22);
 		thisList.insertAfter(20, 99);
 		System.out.println("Backword");
 		thisList.displayBackword();
 		System.out.println();
 		System.out.println("Farword");
 		thisList.displayFarword();

 		
	}

}























