package practice.heap;

public class App {

	public static void main(String[] args) {

		Heap heap = new Heap(5);
		heap.insert(70);
		heap.insert(20);
		heap.insert(55);
		heap.insert(33);
		heap.insert(88);
		heap.printHeap();
	}

}
