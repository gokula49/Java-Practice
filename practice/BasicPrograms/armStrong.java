package BasicPrograms;

public class armStrong {

	public static void main(String[] args) {

		int number=153 , temp;int duplecate = number;
		int sum = 0;
		
		

		while(number>0) {
			
			temp = number % 10;
			number = number/10;	
			sum = sum + (temp * temp * temp); 

					
		}
		if(duplecate==sum) {
			
			System.out.println("It is ArmStrong Number");
		}
		else {
			System.out.println("not a armstrong number");
		}

	
	}

}


