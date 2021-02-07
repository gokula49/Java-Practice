package practice.datastructure;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] inputArray = {12,21,32,2,3,43,23};
		quickSort(inputArray , 0 ,inputArray.length-1);
		System.out.println(Arrays.toString(inputArray));		
	}
	
	public static void quickSort(int inputArray[], int start , int end) {
	if(start<end ) {
		int pp = partition(inputArray,start,end);
		quickSort(inputArray,start,pp-1);
		quickSort(inputArray,pp+1 , end);
	}
	}
	public static int partition(int inputArray[] , int start , int end) {
		int i = start -1;
		int pivot = inputArray[end];
		for (int j = start; j<=end-1;j++) {
			if(inputArray[j]<=pivot) {i++;
				int ival = inputArray[i];
				int jval = inputArray[j];
				
				inputArray[i] = jval;
				inputArray[j] = ival;
			}
			
		}
		int ival = inputArray[i+1];
		inputArray[end] = ival;
		inputArray[i+1] = pivot;
		
		return i+1;
	}
}
