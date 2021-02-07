package practice.heap;

public class Heap {
	
	private int[] heap;
	private int size;
	
	public Heap(int capacity) {
		heap = new int[capacity];
	}
	public void insert(int value) {
		if(isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}
		
		heap[size] = value ;
		fixHeapAbove(size);
		size++;
	}
	private void fixHeapAbove(int index) {
		int newValue = heap[index];
		while(index>0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
		    index = getParent(index);
		}
		heap[index] = newValue;
	}

	
	public void printHeap() {
		for(int i = 0 ; i<size; i++) {
			System.out.print(heap[i]);
			System.out.print(", ");
		}
		
		System.out.println();
	}
	
	public int getParent(int index) {
		return (index-1)/2;
	}
	public boolean isFull() {
		return size == heap.length;
	}
}
