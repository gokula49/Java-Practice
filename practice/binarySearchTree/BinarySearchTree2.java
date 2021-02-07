package practice.binarySearchTree;


public  class BinarySearchTree2 {
	
	class Node {
		int key;
		String name;
		
		Node  rightNode;
		Node leftNode;
		
	    Node(int key,String name) {
		this.key = key;
		this.name = name;
	}
	
	    public String toString() {
	    	return name + " has a Key " + key;
	    }
	}
	
	public class BinaryTree{
		Node root;
		public void addNode(int key , String name) {
			Node newNode = new Node(key , name);
			if(root == null) {
				root = newNode;
			}
			else {
				Node focusNode = root;
				Node parentNode;
				while(true) {
					parentNode = focusNode;
					
					if(key<focusNode.key) {
						focusNode = focusNode.leftNode;
			         if(focusNode == null) {
			        	 parentNode.leftNode = newNode;
		                 return;
			         }
					}
					else {
						focusNode = focusNode.rightNode;
				         if(focusNode == null) {
				        	 parentNode.rightNode = newNode;
				        	 return;
				         }
						
					}
					 
					
				}
			}
		}
	
	
	public Node findNode(int key) {
	
		Node focusNode = root ;
		while(focusNode.key != key) {
			
			if(key<focusNode.key) {
				focusNode = focusNode.leftNode;
				
			}
			else {
				focusNode = focusNode.rightNode;
			}
			
			if(focusNode == null) 
				return null;
			
		}
		
		return focusNode;
		
		
	}


	
	}
	
	public void inOrderTreverseTree (Node focusNode) {
		if(focusNode != null) {
			inOrderTreverseTree(focusNode.leftNode);
			System.out.println(focusNode);
			inOrderTreverseTree(focusNode.rightNode);
		}
	}

}
	



