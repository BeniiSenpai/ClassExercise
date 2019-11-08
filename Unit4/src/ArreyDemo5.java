
public class ArreyDemo5 {


	public static void main(String[] args) {
	
		int [][] array = new int[4][7];
		
		int count = 1;
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				array[row][col] = count;
				count++;
			}
		}
		printMatrix(array);
	}
	public static void printMatrix(int[][] m) {
		for (int row = 0; row < m.length; row++) {
			System.out.print(m[row][0]);
			for (int col = 1; col < m[0].length; col++) {
				System.out.print("," + m[row][col]);
			}
			System.out.println();
		}
	}
}
