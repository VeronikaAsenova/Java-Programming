
public class task06SymetricNumbers {

	public static void main(String[] args) {
for (int i = 9; i <=999; i++) {
	if (isSymmetric(i)) {
		System.out.println(i + " is symmetric");
	}
}
}

private static boolean isSymmetric(int a) {
return (a + "").equals(new StringBuilder(a + "").reverse().toString());
}
}
