package BasicPrograms;

public class palindrome {

	public static void main(String[] args) {
     int number = 455434,n,sum=0;
     int temp = number;
     while(number>0) {
    	 n = number%10;
    	 sum = (sum*10) + n;
    	 number = number/10;
     }
     
     if(temp == sum) {
    	 System.out.println("pallindrome");
     }
     else {
    	 System.out.print("Not a Palindrome");
     }
     
	}

}
