package practice.datastructure;

public class selectionsort {

	public static void main(String[] args) {

		int arr[] = {45,23,22,32,44};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Selection Sorting...");
		
		selection(arr);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	
			
		}
	
	static void selection(int[] arr) {
		int i,j;
		for(i=0;i<arr.length;i++) {
			int minimum = i;
			for(j=i+1; j<arr.length;j++) {
				if(arr[j]<arr[minimum]) {
					minimum = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
			
		}
		
		
	}
	
	}
	


