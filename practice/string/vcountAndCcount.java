package string;

public class vcountAndCcount {

	public static void main(String[] args) {
    
		String str = "hii gokul this is uvan shankar raja";
		str = str.toLowerCase();
		int vCount=0,cCount=0;
		for(int i=0;i<str.length();i++) {
		
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				cCount++;
			}
			
		}
		System.out.println("Voweles are "+vCount);
		System.out.println("Consonents are "+cCount);
		
		
		
	}

}
