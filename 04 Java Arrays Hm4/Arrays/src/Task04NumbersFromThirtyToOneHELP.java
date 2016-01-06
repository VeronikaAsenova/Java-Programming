import java.util.Arrays;

public class Task04NumbersFromThirtyToOneHELP {

	public static void main(String[] args) {

		int[][] matrix = new int[5][6];

		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 6; cols++) {
				System.out.print(matrix[rows][cols] + "\t");

			}
			System.out.println();
			for (int i = matrix.length - 1; i >= 0; i--) {
				for (int j = matrix[i].length - 1; j >= 0; j--) {
					System.out.println("matrix [%d, %d]=%d" + i, j);
				}
			}

		}
	}
}
