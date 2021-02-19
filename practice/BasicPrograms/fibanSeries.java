package BasicPrograms;
import java.util.*;
public class fibanSeries {

	public static void main(String[] args) {
       
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();
		
		int a = 0 , b=1,temp=0;
		System.out.print(a + " " +b);
		while(temp <= limit) {
			temp = a+b;
          if(temp <= limit) {
			System.out.print(" "+temp);

			a=b;
			b=temp;
		}
	}

}
}
