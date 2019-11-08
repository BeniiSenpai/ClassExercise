
public class matrix2 {

	public static final int NUM_LINES = 10;

	public static void main(String[] args) {

		int colZeros = 0;
		int rowZeros = 0;
		boolean zeros = false;

		int[][] matrix;
		matrix = new int[NUM_LINES][NUM_LINES];

		for (int i = 0; i < NUM_LINES; i++) {
			for (int j = 0; j < NUM_LINES; j++) {
				matrix[i][j] = 0;

			}
		}
		matrix[0][4] = 1;
		matrix[2][6] = 1;
		matrix[3][1] = 1;
		matrix[8][6] = 1;

		for (int i = 0; i < NUM_LINES; i++) {
			for (int j = 0; j < NUM_LINES; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		for (int row = 0; row < NUM_LINES; row++) {
			zeros = true;
			for (int col = 0; col < NUM_LINES; col++) {
				if (matrix[row][col] == 1) {
					zeros = false;
				}

			}
			if (zeros) {
				rowZeros++;
			}
		}
		for (int col = 0; col < NUM_LINES; col++) {
			zeros = true;
			for (int row = 0; row < NUM_LINES; row++) {
				if (matrix[row][col] == 1) {
					zeros = false;
				}
			}
			if (zeros) {
				colZeros++;
			}
		}
		System.out.println("Las filas sin 0 son " + rowZeros);
		System.out.println("Las columnas sin 0 son " + colZeros);
	}
}
