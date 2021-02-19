package patternPrograms;
import java.util.*;
public class pattern2 {

	public static void main(String[] args) {

		int lines = 10;
		
		for(int i = 1 ; i< lines; i++) {
			for(int j = 1 ; j<=i; j++) {
				System.out.print(i*j + " " );
			}
			System.out.println();
		}
		
	}

}
