package practice.datastructure;

public class Bubble {

	public static void main(String[] args) {
		
		int arr[] = {45,23,22,32,44};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		bubble(arr);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	
			
		}
		



	
static void bubble(int[] arr) {
	int n = arr.length;
	int temp = 0;
	for(int i = 0; i< n ;i++) {
		for(int j = 1; j<(n-i); j++) {
			if(arr[j-1]>arr[j]) {
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
	
			}}

	
}
