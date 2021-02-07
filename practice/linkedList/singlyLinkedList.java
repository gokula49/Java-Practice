package practice.linkedList;

public class singlyLinkedList {
	
	
	
	private Node first;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		
		return temp;
		
	}
	public void displayList() {
		System.out.println("First -----> Last");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
		 
	}
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data= data;
		current.next=newNode;
		
		 
	}
	

	public static void main(String[] args) {

		singlyLinkedList single = new singlyLinkedList();

		single.insertFirst(23);
		single.insertFirst(20);
		single.insertFirst(83);
		single.insertFirst(29);
		single.insertFirst(53);
		single.insertFirst(93);
		single.insertFirst(03);
	   
	    single.insertLast(67);
	    single.displayList();
	}
	public class Node {
		public int data;
		public Node next;
		public void displayNode() {
			System.out.println("{ "+ data + " }");
		}
	}
}




