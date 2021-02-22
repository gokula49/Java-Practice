package string;

public class NequalParts {

	public static void main(String[] args) {

		 String str = "aaaabbbbcccc";
		 int n=4, temp=0,len = str.length()/n;
		 
		 String arr[] = new String[len];
		 
		 for(int i=0;i<str.length();i=i+n) {
			 String st1 = str.substring(i, i+n);
			 arr[temp] = st1;
			 temp++;
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}

}
