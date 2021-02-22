package string;

public class changeOppositeCase {

	public static void main(String[] args) {

		String s = "GokulaKannanK";
		StringBuffer newone = new StringBuffer(s);
		for(int i =0;i<s.length();i++) {
		if(Character.isLowerCase(s.charAt(i))) {
			newone.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			
		}
		else if(Character.isUpperCase(s.charAt(i))) {
			newone.setCharAt(i, Character.toLowerCase(s.charAt(i)));

		}
	}
		System.out.println(newone);

}
}