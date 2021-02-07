package practice.datastructure;

public class insertion {

	public static void main(String[] args) {
		int arr[] = {45,23,22,32,44};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("Insertion Sort...");
		
		insetion(arr);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
				
	}
	




static void insetion(int[] arr) {
    for(int i = 0; i<arr.length;i++) {
		int element = arr[i];
		int j = i-1;
		
		while(j>= 0 && arr[j]>element) {
			arr[j+1] = arr[j];
			j--;
			
		}
		arr[j+1] = element;
    }}
}