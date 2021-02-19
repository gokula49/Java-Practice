package BasicPrograms;

import java.util.*;
public class primeNumber {

	public static void main(String[] args) {
		int prime ;
		System.out.println("Enter the number. to check wheater it is a prime or not");
	Scanner scan = new Scanner(System.in);
	 prime = scan.nextInt();
	 
	 if(prime==0 || prime==1) {
		 System.out.print("It is not a prime");
		 
	 }
	 
	 else {
		 
	 
	
	for(int i=2;i<prime;i++) {
		
		if((prime%i)==0) {
			System.out.println("not a prime");
			break;
		}
		else if(prime-1 == i){
			System.out.println("It is a Prime Number");
			break;
		}
	}	
	
	
	
	
	}
	}
	

}
