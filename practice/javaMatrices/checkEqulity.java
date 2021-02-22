package javaMatrices;

public class checkEqulity {

	public static void main(String[] args) {

		int arr[][] = {{1,1,4},{2,2,2},{3,3,3}};
		int brr[][] = {{1,1,1},{2,2,2},{3,3,3}};
		boolean flag = true;
		for(int i =0 ; i<3;i++) {
			for(int j=0;j<3;j++) {
			if(arr[i][j]!=brr[i][j]) {
				flag = false;
		  }
		}
	
			
		}
		
		if(flag) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
	}

}
