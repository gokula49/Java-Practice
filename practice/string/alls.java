package string;

public class alls {

	public static void main(String args[]) {
		String str = "FUN";
		int temp=0;
		int len = str.length();
		
		String arr[] = new String[len*(len+1)/2];
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				arr[temp] = str.substring(i,j+1);
				temp++;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
