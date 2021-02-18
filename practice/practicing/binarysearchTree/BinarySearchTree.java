package practicing.binarysearchTree;

public class BinarySearchTree {

	class Node{
		int data;
		Node rightCild;
		Node leftChild;
		
		Node(int data) {
			this.data = data;
		}
		
		public String toString() {
			return "has a key"+data;
		}
	
	}
	
	
	Node root;
	
	public void addNode(int data){
		Node newNode = new Node(data);
		
		if(root == null) {
			root = newNode;
		}
		
		
		else {
			Node parent, focusNode = root;
			
			while(true) {
				parent = focusNode;
				
				if(data < focusNode.data) {
					focusNode = focusNode.leftChild;
				if(focusNode == null) {
					parent.leftChild = newNode;
					return;
				}
				}
				
				else {
					
					focusNode = focusNode.rightCild;
					if(focusNode == null) {
						parent.rightCild = newNode;
						return;
					}
					
				}
				
			}
		}
	}
	
	public Node searchNode(int data) {
		Node focusNode = root;
		while(focusNode.data != data) {
		if(focusNode.data < data) {
			focusNode = focusNode.rightCild;
		}
		else {
			
			focusNode = focusNode.leftChild;
		}
		if(focusNode  == null) {
			return null;
		}
		}
		return focusNode;
	}
	
	
	public static void main(String[] args) {
		
		BinarySearchTree newTree = new BinarySearchTree();
		
		newTree.addNode(12);
		newTree.addNode(21);
		newTree.addNode(33);
		
		System.out.println(newTree.searchNode(33));

	}

}
