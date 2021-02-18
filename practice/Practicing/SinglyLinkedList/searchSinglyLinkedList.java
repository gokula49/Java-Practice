package Practicing.SinglyLinkedList;


//Searching Element in a Singly Linked List
public class searchSinglyLinkedList {

	public int size;
	class Node{
		int data;
		Node next;
		
	
		
	public Node(int data) {
			this.data = data;
			//this.next = null;
		}
	public void displayNode() {
		System.out.println("[ " +data + " ]");
	}
	
	}
	
	
	Node first;
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		size++;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		size--;
		return temp;
	}
	
	public void displayList() {
		System.out.print("List( First ----> Last)");
		System.out.println();
		Node Current = first;
		while(Current != null) {
			Current.displayNode();
			Current = Current.next;
		}
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			
			current = current.next;
		}
		Node newNode = new Node(data);
		newNode.data= data;
		current.next=newNode;
		size++;
	}
	
	public void searchNode(int data) {
		Node current = first;
		Boolean flag = false;
		while(current != null) {
			if(current.data == data) {
				flag = true;
				break;
			}
			current= current.next;
		}
		
	
			//current= current.next;
	
	if(flag) {
		System.out.println("Yes, Value is here "+ data);
	}
	else {
		System.out.println("No , Value is not there  " +  data);
	}
	}
	
	public void deleteDuplecute() {
		Node current = first , temp = null , index = null;
		
		while(current != null) {
			temp = current ; index = current.next;
			while(index != null) {
				if(current.data == index.data) {
					temp.next = index.next;
				}
				else {
					temp = index;
				}
				index = index.next;
			}
			current = current.next;
		}
		size--;
		
	}
	
	public void insertMid(int data) {
		
		int count = (size%2 == 0)? (size / 2) :( (size+1)/2);
		
		Node temp = first;
		Node current = null;
		
		for(int i =0 ; i < count ; i++) {
			current = temp;
			temp = temp.next;
		}
		Node newNode = new Node(data);
		current.next = newNode;
		newNode.next =temp;
		size++;
		
	}
	
	
	public void findMin() {
		Node current = first;
		
		int min = current.data;
		
		while(current != null) {
			if(current.data < min) {
				min = current.data;
			}
			current = current.next;
		}
		System.out.println("Minimum value in the List is " + min);
	}
	
	public void findMax() {
		Node current = first;
		
		int max = current.data;
		
		while(current != null) {
			if(current.data > max) {
				max = current.data;
			}
		current = current.next;
		}
		System.out.println("Maximum value in the List is " + max);

	}
	
	
	public void deleteMidNode() {
		int count = (size%2 == 0)? (size / 2) :( (size+1)/2);
		
	    Node temp = first , current = null;
	    
	    for(int i = 0 ; i< count-1 ; i++) {
	    	current = temp;
	    	
	    	temp = temp.next;
	    }
	    
	    if(current != null) {
	    	current.next = temp.next;
	    	temp = null;
	    	
	    }
         
	}
	
	public static void main(String[] args) {
		searchSinglyLinkedList thisList = new searchSinglyLinkedList();
		
		thisList.insertFirst(91);
		thisList.insertFirst(2);
		thisList.insertFirst(3);
		thisList.insertFirst(5);
		//thisList.insertFirst(4);
	
	//	thisList.displayList();
		
		thisList.deleteDuplecute();
	  
	    
	    thisList.searchNode(101);
	    thisList.searchNode(11);
          thisList.deleteMidNode();
         thisList.displayList();
        // thisList.insertLast(21);
         //thisList.insertMid(32);
      
         // thisList.insertMid(82);

         //thisList.displayList();
 		
 		thisList.findMin();
 		
 		thisList.findMax();


	}

}
