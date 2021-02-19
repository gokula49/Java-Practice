package BasicPrograms;
import java.lang.*;
public class RandomNumber {

	public static void main(String[] args) {
        int min = 500, max = 1000;
		System.out.println("Random Number between 500 to 1000");
		int i = (int) (Math.random()*(max-min+1)+min);
		int j = (int) (Math.random()*(max-min+1)+min);

		System.out.println(i);
		System.out.println(j);
	

	}

}
