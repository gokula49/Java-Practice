package BasicPrograms;

import java.util.*;
public class factorial {

	
	public static void main(String[] args) {
		int total=1;
		System.out.println("Enter the value...");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i =1 ;i<=num;i++) {
		 	total = total*i ;
		}
		System.out.println(total);

		
	}

}
