import java.util.Scanner;

public class Task09Permutacii {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter your a num: ");
		String str = input.nextLine();
		int num = input.nextInt();
		
		for (int i = 1; i <= num; str += i++ + "");
		
		perm("", str);
	}
	
	private static void perm(String prefix, String str) {
		int n = str.length();
		
		if (n == 0) {
			System.out.println(prefix);
			return;
		}
		
		for (int i = 0; i < n; i++) {
            perm(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
		}
	}
	}


