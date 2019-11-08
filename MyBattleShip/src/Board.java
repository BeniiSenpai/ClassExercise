
public class Board {
	
	
	public static final int SHIP_SYMBOL = 'S';
	public static final int WATER_SYMBOL = ' ';
	public static final int SUNK_SHIP_SYMBOL = 'X';
	public static final int EMPTY_SYMBOL = '.';
	public static final int MAX_SHOTS = 25;
	
	private int num_Ships = 10;
	private int dimension = 8;
	private int remaingShots; 
	private  int remainingShips; // Cuantos barcos quedan
	
	public int getRemainingShips() {
		return remainingShips;
	}

	private int reamiangWater; // Cuantos fallos tiene
	
	private char[][] matrix;
	
	public Board (int size, int numShips) {
		dimension = size ;
		this.num_Ships = numShips;
		matrix = new char [dimension][dimension];
		reamiangWater = MAX_SHOTS;
		remainingShips = 10;
		initMatrix();
		addShipsToMatrix();
		
	}

	private void initMatrix() {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = EMPTY_SYMBOL;
			}
		}
	}
	
	private void addShipsToMatrix() {

		long shipCounter = 0;
		int randomRow, randomCol;

		while (shipCounter < num_Ships) {
			randomRow = (int) (Math.random() * dimension);
			randomCol = (int) (Math.random() * dimension);

			if (matrix[randomRow][randomCol] != SHIP_SYMBOL) {
				matrix[randomRow][randomCol] = SHIP_SYMBOL;
				shipCounter++;
			}
		}

	}
	
	public void printMatrix(boolean debug) {
		printHeader();
		char c = 'A';
		for (int row = 0; row < matrix.length; row++) {
			System.out.print(c + " ");
			c++;
			for (int col = 0; col < matrix[0].length; col++) {
				if (matrix[row][col] == SHIP_SYMBOL) {
					if (debug) {
						System.out.print(matrix[row][col] + " ");
					} else {
						System.out.print(Character.toString(EMPTY_SYMBOL) + " ");
					}
				} else {
					System.out.print(matrix[row][col] + " ");
				}
			}
			System.out.println();
		}
	}

	public boolean numberInGoodRange(int number, boolean first) {
		if (number < 1 || number > dimension) {
			 if (!first) {
				 System.err.println("Number not valid");
				 System.out.println();
			 }
			 return false;
		} else {
			return true;
		}
	}
	
	public  boolean letterInGoodRange(char letter, boolean first) {
		if (letter < 'A' || letter > 'A' + dimension - 1) {
			if (!first) {
				System.err.println("Letter not valid");
				System.out.println();
			}
			return false;
		} else {
			return true;
		}
	}


	private void printHeader() {
		System.out.print("  ");
		for (int i = 1; i <= matrix[0].length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
	
	public void shoot(char letter, int number) {

		int row = letter - 'A';
		int col = number - 1;
		if (matrix[row][col] == SHIP_SYMBOL) {
			matrix[row][col] = SUNK_SHIP_SYMBOL;
			remainingShips--;
		} else {
			matrix[row][col] = WATER_SYMBOL;
			reamiangWater--;
		}

	}
	
	public void winn() {

		if (remainingShips == 0) {
			MyBattleShip.gameOver = true;
			System.out.println("You WINNNN");
		}
	}

	public void lose() {

		if (reamiangWater == 0) {
			MyBattleShip.gameOver = true;
			System.out.println("");
			System.out.println("");
			System.out.println("You LOSEEE, YOU NOOB !!");
			System.out.println(" σ_σ ");
		}
	}
	

}
