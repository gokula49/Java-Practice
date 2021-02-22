package string;

public class charCount {

	public static void main(String[] args) {
int count = 0;
		String src = "hai this is gokul";
		for(int i = 0 ; i<src.length();i++) {
		
			if(src.charAt(i)!=' ') {
				
			count++;	
				
			}
			}
		System.out.println(count);
	}

}
