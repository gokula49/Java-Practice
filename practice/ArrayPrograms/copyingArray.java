package ArrayPrograms;

import java.util.*;

public class copyingArray {

	public static void main(String[] args) {

		int arr[] = new int[7];
		int brr[] = new int[arr.length];
		int freq[]= new int[arr.length];
				int Dcount=0;

				int s;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Getting the array from the user");
		for(int i =0; i<arr.length;i++) {
			s=scan.nextInt();
			arr[i]=s;
		}
		
		System.out.println("Printing the Element of ARR variable");
		for(int i = 0;i<arr.length;i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Printing the Element of BRR variable");
		for(int i = 0;i<arr.length;i++) {
			
			brr[i]=arr[i];
			System.out.print(brr[i] + " ");
		}
		System.out.println();
		System.out.println("Frequency of each element in the array");
		
		for(int i=0;i<arr.length;i++) {
			int repeat = -1, count = 1;

		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				arr[j]=repeat;
			}
		//	freq[i] = count;
			
		}
		freq[i] = count;

		if(arr[i] != repeat) {
            Dcount++;

			System.out.println(arr[i]+" " + freq[i]);
		}
		

		
		}
        System.out.println();
        System.out.print("Left Rotation Of the Array");
		int n=2;
        for(int i = 0; i<n;i++) {
        	int  first= brr[0];
        	int j;
        	for(j=0 ; j<brr.length-1;j++) {
        		
        		brr[j]=brr[j+1];
        	}
        	brr[j]=first;
        }
    	System.out.println();
		for(int i = 0;i<arr.length;i++) {
			
         System.out.print(brr[i] + " ");
		}
		
		 System.out.println();
	        System.out.print("Right Rotation Of the Array");
			int m=2;
	        for(int i = 0; i<m;i++) {
	        	int  last= brr[brr.length-1];
	        	int j;
	        	for(j=brr.length-1 ; j>0;j--) {
	        		
	        		brr[j]=brr[j-1];
	        	}
	        	brr[j]=last;
	        }
	    	System.out.println();
			for(int i = 0;i<arr.length;i++) {
				
	         System.out.print(brr[i] + " ");
			}
			System.out.println();
			System.out.println("Duplicate Element in the array");

			for(int k=0;k<arr.length;k++) {
				if(freq[k]>1 && arr[k]!=-1) {
					System.out.print(arr[k]+" ");
				}
				}
			
			System.out.println();
			System.out.println("Reversing arr");
			for(int i = arr.length-1;i>=0;i--) {
				
				System.out.print(brr[i] + " ");
			}

			System.out.println();
             int j=0;
            int Darray[] = new int[Dcount];
			for(int i=0;i<arr.length;i++) {
			if(arr[i] != -1) {
                Darray[j] = arr[i];j++;
			}
			
			
		
        
			}
			System.out.println();
			System.out.println("removed dupilcate");
			for(int i1 = 0;i1<Darray.length;i1++) {
				
				System.out.print(Darray[i1] + " ");
			}
	}

}