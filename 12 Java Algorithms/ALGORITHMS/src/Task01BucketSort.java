import java.util.Arrays;

public class Task01BucketSort {

	public static void sort(int[] a, int maxVal) {
		int[] bucket = new int[maxVal + 1];

		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		for (int i = 0; i < a.length; i++) {
			bucket[a[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				a[outPos++] = i;
			}
		}
	}

	public static void main(String[] args) {
		int maxValue = 8;
		int[] array = { 5, 1, 0, 2, 4, 1, 8, 5, 4, 3, 1, 4 };

		System.out.println("Before: " + Arrays.toString(array));
		sort(array, maxValue);
		System.out.println("After:  " + Arrays.toString(array));
	}

}