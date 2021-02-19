package patternPrograms;

public class pattern4 {

	public static void main(String[] args) {
    int k=0;
		for(int i =1; i<=10;i++) {
			for(int j=1; j<=i; j++) {
				k++;
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
