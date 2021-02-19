package patternPrograms;
import java.util.*;
public class covertingProgram {

	
	public static void main(String[] args) {
	
		for(int i = 1 ; i <= 5;i++) {
			for(int j=5;j>=1;j--) {
				if(i==j) {
					System.out.print("*"+"\t");
				}
				if(i!=j) {
					System.out.print(j+"\t");
				}
			}
			System.out.println();
		}
		
	}
	
}

