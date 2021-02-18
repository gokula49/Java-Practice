package practice.doublyLinkedList;

public class doublyLinkedList {
	public int size=0;
	class Node {
		int data;
		Node next;
		
	      public Node(int data) {  
              this.data = data;  
          }  
		
		public void displayNode() {
			System.out.println(data);
		}
	}
	
	Node first;
	Node last;
	
	public boolean isEmpty() {
		return last==null;
	}
	
	public void insertNode(int data) {
		Node newNode = new Node(data);
		newNode.data = data;
		if(isEmpty()) {
		
			
			last= newNode;
			
		}
		
		newNode.next =first;
		first = newNode;
	size++;
	}
	
	
	public void deleteFirst() {
		first=first.next;
		size--;
	}
	
	public void deleteLast() {
		
	}
	
	public void displayNode() {
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
	}
	
	public void insertLast(int data) {
	    Node newNode = new Node(data);
	    newNode.data = data;
	    last.next = newNode;
	    newNode =last;
	    size++;
	}
	
	public void searchNode(int data) {
		Node current = first;
		boolean flag = false;
		while (current!=null) {
			if(current.data == data) {
				flag = true;
				break;
			}
			current = current.next;
		}
		if(flag) {
			System.out.println("Node is here in the List");
		}
		else {
			System.out.println("Node is not there in the List");
		}
	}
	
	public void count() {
		System.out.println(size);
	}
	
	public void findMin() {
		Node current = first;
		int min = first.data;
		while(current != null) {
			if(min>current.data) {
				min = current.data;
			}
			current = current.next;
		}
		
		System.out.println("The minimum number in the "+min);
	}
	
	public void findMax() {
		Node current = first;
		int max = first.data;
		while(current != null) {
			if(max<current.data) {
				max = current.data;
			}
			current = current.next;
		}
		
		System.out.println("The maximum number in the "+max);
	}
	
	public void insertMid(int data) {
		
		Node newNode = new Node(data);
		
		newNode.data = data;
		Node current = null;
		Node temp=first;
		
		int mid = (size%2 == 0)?(size/2):(size+1)/2;
		
		for(int i = 0 ; i<mid ; i++) {
			 
			current = temp;
			
			temp = temp.next;
			
		}
		
		current.next = newNode;
		newNode.next=temp;
		size++;
		
	}
	
	public void deleteMid() {
		
		
		Node current = null;
		Node temp=first;
		
		int mid = (size%2 == 0)?(size/2):(size+1)/2;
		
		for(int i = 0 ; i<mid ; i++) {
			 
			current = temp;
			
			temp = temp.next;
			
		}
		
		current.next = temp.next;
		temp=null;
		size--;
		
	}
	
	  public void reverse(Node current) {  
          //Checks if the next node is head, if yes then prints it.  
          if(current.next == null) {  
              System.out.println(current.data);  
              return;  
          }  
          //Recursively calls the reverse function  
          reverse(current.next);  
          System.out.println(current.data);  
      }  

	  
	  public void sortList() {
		  
		  Node  current=first , index;
		  int temp;
		  
		  while(current.next != null) {
			  
			  index = current.next;
			  
			  while(index !=null) {
				  
				  if(current.data > index.data) {
					  temp = current.data;
					  current.data = index.data;
					  index.data = temp;
				  }
				  index = index.next;
			  }
			current = current.next;  
		  }
		  
		  
	  }
	  
	  
   public void removeDuplicate() {
	   Node current = first, temp , index;
	   
	   while(current.next != null) {
		   
		   temp = current;
		   
		   index = current.next;
		   
		   while(index!=null) {
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
   }
	
	public static void main(String[] args) {
        doublyLinkedList myList = new doublyLinkedList();
        myList.insertNode(32);
        myList.insertNode(21);
        myList.insertNode(34);
        myList.insertNode(32);
        myList.insertNode(21);
        myList.insertLast(322);
        myList.deleteFirst();	
        myList.insertMid(11);
        myList.searchNode(322);
        myList.count();
        myList.findMax();
        myList.findMin();
      //  myList.deleteMid();
        myList.displayNode();
        
        System.out.println("Reverse");
        myList.reverse(myList.first);
        
        myList.sortList();
        System.out.println("Accending order");
        myList.displayNode();
        
        System.out.println("Removed Duplicate");
        myList.removeDuplicate();
        myList.displayNode();
       

        

	}

}
