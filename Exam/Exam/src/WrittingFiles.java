import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingFiles {

	public static void WrittinThaArray(String path, int[][] matrix) throws Exception {
		FileWriter fileWriter = new FileWriter(path);
		BufferedWriter writer = new BufferedWriter(fileWriter);

		for (int i = 0; i < matrix.length; i++) {
			writer.write(matrix.toString());
			writer.newLine();
		}

		System.out.println("The saving of array is succesful! ");
		writer.close();
	}

	public static void WrittinTheArray(int matrix) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("matrix.txt");
			writer.write(matrix);
		} catch (IOException ioe) {
			System.out.println("Error writing in file!");
			ioe.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	public static void WrittinThaArray(String path, Matrix matrix) {
		// TODO Auto-generated method stub
		
	}
}
