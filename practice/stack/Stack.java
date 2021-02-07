package practice.stack;

public class Stack {

	private int top;
	private int maxSize;
	private int arr[];
	
	public Stack(int size) {
		this.maxSize = size;
	    this.top = -1;
	    this.arr = new int[maxSize]; 
	}
	
	public void push(int j) {
		top++;
		arr[top] = j;
		
	}
	public int pop() {
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
 
		Stack thisStack = new Stack(4);
		thisStack.push(90);
		thisStack.push(7);
		thisStack.push(90);
		thisStack.push(47);
	
	
	

        while(!(thisStack.isEmpty())) {
        	int val = thisStack.pop();
        	System.out.println(val);
        }
        thisStack.view();
       
	}

}
