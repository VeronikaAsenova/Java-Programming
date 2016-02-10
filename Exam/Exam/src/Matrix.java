

public class Matrix {
	
	private int LengthOfMatrix;
	private int[][] matrix = new int[LengthOfMatrix][LengthOfMatrix];

	public Matrix() {
		super();
	}

	public Matrix(int lengthOfMatrix) {
		super();
		LengthOfMatrix = lengthOfMatrix;
	}

	public int getLengthOfMatrix() {
		return LengthOfMatrix;
	}

	public void setLengthOfMatrix(int lengthOfMatrix) {
		if (LengthOfMatrix < 2 && LengthOfMatrix > 9) {
		}
		LengthOfMatrix = lengthOfMatrix;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {

		this.matrix = matrix;
	}

	public int[][] fillMatrix(int[][] matrix) {

	this.matrix=matrix;

		return matrix;

	}

	public String toString() {
		String str="";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				str+= String.format("%d ", this.matrix[i][j]);
			}
			str+="\n";
			
		}
		return str;
		
	}
}
