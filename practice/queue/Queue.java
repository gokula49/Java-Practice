package practice.queue;

public class Queue {
	
	private int maxSize;
	private int[] arr;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.arr = new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	public void insert(int j) {
		rear++;
		arr[rear] = j;
		nItems++;
	}
	public int remove() {
		int temp = arr[front];
		front++;
		nItems--;
		return temp;
	}
	public int peekFront() {
		return arr[front];
	}
	public void view() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	

	public static void main(String[] args) {

		Queue myQueue = new Queue(4);
		myQueue.insert(4);
		myQueue.insert(44);
		myQueue.insert(32);
		myQueue.insert(31);
		
		System.out.println("Peek of the queue is " + myQueue.peekFront());
		myQueue.view();
				
	}

}
