package patternPrograms;

public class pattern3 {

	public static void main(String[] args) {

		int size =5,i,j;
		for(i = 0 ; i<size+1 ;i++) {
			for(j=size; j>i; j--) {
				System.out.print(" ");
			}
		for(int k = 0; k<i*2-1; k++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
	}

}
