package javaMatrices;

public class identityMatrix {

	public static void main(String[] args) {
       int arr[][] = {{91,0,0},{0,1,0},{0,0,1}};
       boolean flag = true;
       
       for(int i=0;i<3;i++) {
    	   for(int j=0;j<3;j++) {
    		   if(i==j && arr[i][j]!=1) {
    			   flag =false;
    		   }
    		   if(i!=j && arr[i][j]!=0) {
    			   flag =false;
    		   }
    	   }
       }
       if(flag) {
    	   System.out.println("identy matrix");
       }
       else {
    	   System.out.println("Not a Identy Matrix");
       }
		
	}

}
