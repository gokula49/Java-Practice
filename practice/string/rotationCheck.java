package string;

public class rotationCheck {

	public static void main(String[] args) {
String str1 = "gokula";
String str2 = "ujjjjk";

String str4= str1+str2;
boolean Stry = str4.contains(str2)==false;
if(Stry) {
	System.out.println("It is a Rataton String");
}
else {
	System.out.println("It is not a Rotation string");
}
		
	}

}
