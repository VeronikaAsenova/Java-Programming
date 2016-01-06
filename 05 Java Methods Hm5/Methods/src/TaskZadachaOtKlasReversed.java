import java.util.Arrays;
import java.util.Scanner;

public class TaskZadachaOtKlasReversed {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		printReversed(arr);
		

	}
	public static void printReversed(int []arr){
		for (int i =  arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}