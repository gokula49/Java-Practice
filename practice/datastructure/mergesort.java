package practice.datastructure;

public class mergesort {
  
	public static void sorter(int inputArray[]) {
		sorter(inputArray , 0 , inputArray.length -1);
	}
	
	
	public static void sorter(int[] inputArray, int start , int end) {
		if(end<=start) {
			return ;
		}
		int mid = (start+end)/2;
		
		sorter(inputArray ,start , mid);
		sorter(inputArray, mid+1 , end);
		merge(inputArray , start , mid , end);
	}
	public static void merge(int inputArray[] , int start , int mid , int end) {
		int tempArray[] = new int[end - start + 1];
		int leftSlot = start;
		int rightSlot = mid + 1 ;
		int k = 0;
		
		while(leftSlot<=mid && rightSlot<=end) {
			if(inputArray[leftSlot]<inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot = leftSlot +1;
			}
			else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot = rightSlot + 1;
			}
			
			k=k+1;
		}
		
	
	if(leftSlot<=mid) {
		
		while(leftSlot <= mid) {
			tempArray[k] = inputArray[leftSlot];
			leftSlot = leftSlot +1;
            k=k+1;
		}
	}else if(rightSlot<=end) {
		while(rightSlot <= end) {
			tempArray[k] = inputArray[rightSlot];
			rightSlot = rightSlot +1;
            k=k+1;
		}
	}
	
	for(int i = 0 ; i< tempArray.length;i++) {
		inputArray[start + i] = tempArray[i];
	}
	}
	
	
	public static void main(String[] args) {
		int inputArray[] = {11,32,44,1,21,33,32,31};
        sorter(inputArray);
        for(int i = 0 ; i<inputArray.length ; i++) {
        	System.out.println(inputArray[i]);
        }
	}

}
