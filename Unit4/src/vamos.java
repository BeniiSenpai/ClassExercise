
public class vamos {
	
	public static final int NUM_LINES = 8;
	public static final char[] letter = { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
	
	
	public static void main(String[] args) {
		
 		int[][] map;
		map = new int[NUM_LINES][NUM_LINES];
		//System.out.print("  ");
		System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 " + "6 " + "7 " + "8 ");

		for (int i = 1; i < NUM_LINES; i++) {		
			// Escribe lo de dentro
			for (int j = 0; j < NUM_LINES; j++) {
				map[i][j] = 0;

			}
		}
		for (int i = 1; i < NUM_LINES; i++) {
			// Las letras del lado
			System.out.print(letter[i] + " ");
			for (int j = 0; j < NUM_LINES; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}

}
