public class matrix1 {

	public static final int NUM_LINES = 10; 
	public static void main (String[] args) {

		int[][] matrix;
		matrix=new int[NUM_LINES][NUM_LINES];
				
		for (int i = 0; i<NUM_LINES; i++) {
			for (int j = 0; j < NUM_LINES; j++) {
				matrix[i][j] = 0;
			}
		}
		matrix[0][4] = 1;
		matrix[2][3] = 1;
		matrix[3][1] = 1;
		matrix[8][6] = 1;
		
		for (int i = 0; i<NUM_LINES; i++) {
			for (int j = 0; j < NUM_LINES; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

		
