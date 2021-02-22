package string;

public class stringPalin {

	public static void main(String[] args) {
        boolean flag = true;
		String str = "Koypk";
		str = str.toLowerCase();
		
		for(int i = 0 ; i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("it is a palindrome string");
		}
		else {
			System.out.println("it is a not a palindrome string");

		}
	}

}
