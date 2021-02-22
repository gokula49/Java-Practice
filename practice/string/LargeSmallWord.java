package string;

public class LargeSmallWord {

	public static void main(String[] args) {

		String str= "hai this is gokula kannan";
		String small= "", large = "", word="";int length=0;
		String[] words = new String[100];
        str = str+" ";	
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				
				word = word + str.charAt(i);
				
			}
			
			else {
				words[length] = word;
				length++;
				word="";
			}
		}
		small =large= words[0];

		for(int i = 0; i<length;i++) {

		if(small.length()>words[i].length()) {
			
			small = words[i]; 
		}
		if(large.length()<words[i].length()) {
			large = words[i]; 
		}
		
		
		}
	System.out.println("Minimum word in a string is - "+small);	
	System.out.println("Maximum word in a string is - "+large);	

	}
}
