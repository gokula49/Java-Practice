package practice.linkedList;



public class circularLinkedList {
	
	public class Node {
		public int data;
		public Node next;
		public void displayNode() {
			System.out.println("{ "+ data + " }");
		}
	}
	
	private Node first;
	private Node last;
	
	public circularLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data =data;
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			first = newNode;
		}
		else {
			last.next = newNode;
			last = newNode;
			
		}
}
			
			
			
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		
		return temp;
		
	}
	
	public void displayList() {
		System.out.println("List( First-----> Last ) ");
		Node current = first;
		while(current!=null) {
			current.displayNode();
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		circularLinkedList thisList = new circularLinkedList();
		thisList.insertFirst(100);
		thisList.insertFirst(534);
		thisList.insertFirst(399);
		thisList.insertLast(122);
		thisList.displayList();
		
	}

}
