import java.util.Arrays;

public class Task01QuickSort {
	public static void main(String[] args) {
		int[] array = {125,34,25,745,-3,5,-285,250};
		System.out.println(Arrays.toString(array));
		int lowest = 0;
		int hightest = array.length - 1;
		quickSort(array, lowest, hightest);
		System.out.println(Arrays.toString(array));
	}
	public static void quickSort(int[] array,int lowest,int hightest){
		if (array == null || array.length == 0) {
			return;
		}
		if (lowest >= hightest) {
			return;
		}
		int middle = lowest + (hightest - lowest)/2;
		int pivot = array[middle];
		int i = lowest;
		int j = hightest;
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while(array[j] > pivot){
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		if (lowest < j) {
			quickSort(array, lowest, j);
		}
		if (hightest > i) {
			quickSort(array, i, hightest);
		}
	}

}

