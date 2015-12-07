import java.util.Scanner;

public class Task07ReversedString {

	public static void main(String[] args) {
Scanner input=new Scanner (System.in);

System.out.println("Enter your word: ");
String word= input.nextLine();
System.out.println(word + " reversed is: " + reverse(word));


	}
public static String  reverse(String word){
	
	return new StringBuilder(word).reverse().toString();
	
}
}

