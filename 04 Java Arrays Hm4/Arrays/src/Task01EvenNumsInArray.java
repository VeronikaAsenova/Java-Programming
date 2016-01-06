
public class Task01EvenNumsInArray {

	public static void main(String[] args) {

		int[] arrays = new int[] { 3, 2, 10, 15, 74, 71, 47, 18 };

		int sum = 0;

		for (int i = 0; i < arrays.length; i++)
		{
			if (i % 2 == 0) {

				sum += arrays[i];
			}
		}
		System.out.println("sum is "+ sum);
	}

}
