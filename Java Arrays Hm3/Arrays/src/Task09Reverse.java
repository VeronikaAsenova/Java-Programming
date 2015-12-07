import java.util.Arrays;

public class Task09Reverse {

	public static void main(String[] args) {
		int[] array = new int[] { 17, 16, 15, 14, 13 };
		
		int length = array.length;
		int[] obyrnat = new int[length];
		
		for (int index = 0; index < length; index++) {
		obyrnat[length - index - 1] = array[index];
		}
		
		System.out.println (Arrays.toString(obyrnat));
	}

}
