package string;


import java.util.*;

public class anagramOrNot {

	public static void main(String[] args) {

		String str1 = "grab";
		String str2 = "barg";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)==true) {
			System.out.println("The Strings are Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
		
		
	}

}
