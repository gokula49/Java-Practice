package practice.stack;

public class StackChar {

	private int top;
	private int maxSize;
	private char arr[];
	
	public StackChar(int size) {
		this.maxSize = size;
	    this.top = -1;
	    this.arr = new char[maxSize]; 
	}
	
	public void push(char j) {
		top++;
		arr[top] = j;
		
	}
	public char pop() {
		int oldTop = top;
		top--;
		return arr[oldTop];
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public void view() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
 
		StackChar thisStack = new StackChar(4);
		thisStack.push('u');
		thisStack.push('j');
		thisStack.push('p');
		thisStack.push('h');
	
	
	

        while(!(thisStack.isEmpty())) {
        	char val = thisStack.pop();
        	System.out.println(val);
        }
        thisStack.view();
       
	}

}
