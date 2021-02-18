package practice.DoublyLinkedList;

public class DoublyLinkedList {
	
	class Node {
		int data;
		Node next;
		Node previous;
	}
	public int size;

	private Node first;
	private Node last;
	
	public void addNode(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(first==null) {
			first = last = newNode;
			first.previous = null;
			last.next =null;size++;
		}
		
		else {
			last.next = newNode;
			newNode.previous = last;
			last = newNode;
			last.next =null;
		    size++;
		}
	}
	
	public void addFirst(int data) {
		Node newNode = new Node();
		newNode.data =data;
		if(first==null) {
			first = last = newNode;
			first.previous = null;
			last.next =null;size++;
		}
		else {
			first.previous = newNode;
			newNode.next = first;
			first = newNode;size++;
			first.previous = null;
		}
		
		
	}
	
	public void reverseList(Node current) {
		
		if(current.next==null) {
			System.out.println(current.data);
			return;
		}
		
		reverseList(current.next);
		System.out.println(current.data);
		
	}
	
	public void displayCount() {
		System.out.println("Count in the List is "+size);
	}
	
	public void displayNode() {
		
		Node current = first;
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void deleteFirst() {
		first=first.next;
		first.previous =null;size--;
	}
	
	public void deleteLast() {
		
		last = last.previous;
		last.next = null;size--;
		
	}
	
	public void insertMid(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		Node current = first,temp;
		
		int count = (size%2 == 0)?(size/2):((size+1)/2);
		
		for(int i=1;i<count;i++) {
			
			current = current.next;
			
			
		}
	    temp = current.next;  
        temp.previous = current;  

        //newNode will be added between current and temp  
        current.next = newNode;  
        newNode.previous = current;  
        newNode.next = temp;  
        temp.previous = newNode;  
        size++;
	}
	public void deleteMid() {
		
		
		Node current = null ,temp = first;
		
		int count = (size%2 == 0)?(size/2):((size+1)/2);
		
		for(int i=0;i<count;i++) {
			
			current = temp;
			temp = temp.next;
			
			
		}
		current.next = temp.next;
		temp =null;
		
	    
	}
	
	public void deleteDuplicate() {
		
		Node current = first ;
		
		while(current.next != null) {
			Node temp = current;
			Node index = current.next;
			
			while(index!=null) {
				if(current.data==index.data) {
					temp = current;
				}
				else {
					temp.next = current.next;
				}
				index=index.next;
			}
			current =current.next;
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		DoublyLinkedList thisList = new DoublyLinkedList();
		
		thisList.addNode(12);
		thisList.addNode(32);
		thisList.addNode(43);
		thisList.addNode(32);
		thisList.addFirst(123);
		thisList.displayCount();
		thisList.displayNode();
		System.out.println();

		thisList.reverseList(thisList.first);
		System.out.println();
		
		//thisList.deleteFirst(); 
		thisList.displayNode();
         thisList.insertMid(222);
		
		System.out.println();
		//thisList.deleteLast();
		//thisList.displayNode();
		System.out.println();
        thisList.deleteMid();

		thisList.displayNode();
		System.out.println();
        thisList.deleteDuplicate();
		thisList.displayNode();


	}

}
