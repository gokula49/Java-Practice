package string;

public class removeWhiteSpaces {

	public static void main(String[] args) {

		String str = "Remove while space";
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
	}

}
