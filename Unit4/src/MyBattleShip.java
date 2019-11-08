import java.util.Scanner;

public class MyBattleShip {

	// This is a comment

	public static final int SHIP_SYMBOL = 'S';
	public static final int WATER_SYMBOL = ' ';
	public static final int SUNK_SHIP_SYMBOL = 'X';
	public static final int EMPTY_SYMBOL = '.';

	public static final int MAX_SHOTS = 25;
	public static final int NUM_SHIPS = 10;
	public static final int DIMENSION = 8;
	static char[][] matrix = new char[DIMENSION][DIMENSION];
	static boolean gameOver;

	static int remainingShips; // Cuantos barcos quedan
	static int reamiangWater; // Cuantos fallos tiene

	static char letter;
	static int number;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		gameOver = false;
		reamiangWater = Board.MAX_SHOTS;
        remainingShips = NUM_SHIPS;
			     	     	
		
	    board = new Board (9,10);
	    addShipsToMatrix();
	    
        // Principal message
        System.out.println("Welcome to my BATTLE SHIP !!!  ARE YOU READY FOR THE WAR ? ");
        System.out.println();
        System.out.println("                             |`-:_\n" + 
        					"   ,----....____            |    `+.\n" + 
        					"  (             ````----....|___   |\n" + 
        					"   \\     _                      ````----....____\n" + 
        					"    \\ <--_)                                     ```---.._\n" + 
        					"     \\                                                   \\\n" + 
        					"   )`.\\  )`.   )`.   )`.   )`.   )`.   )`.   )`.   )`.   )`.   )`.\n" + 
        					" -'   `-'   `-'   `-'   `-'   `-'   `-'   `-'   `-'   `-'   `-'   `");
        
        System.out.println("Write a Letter from the left Side from A to H, and a number from 1 to 8.");
        System.out.println();
        System.out.println("If you hit a ship appears a 'X' ");
        System.out.println();
        System.out.println("If you have 25 fails you lose the game, try to do your Best...");
        System.out.println();
        System.out.println();
        
        // Aqui me realiza las instrucciones Principales
	    while(!gameOver) {
	    	printMatrix(true);
	    	askCoordinates(input);
	    	shoot(letter, number);
            winn();
            lose();
            System.out.println();
            System.out.println("The Remaining Ships are " + remainingShips + "");
            System.out.println();
	    }
	     
	}

	private static void askCoordinates(Scanner input) {
		letter = 'º';
		boolean firstValue = true;
		while (!letterInGoodRange(firstValue)) {
			System.out.println("Enter row (Letter)");
			letter = input.next().toUpperCase().charAt(0);
			firstValue = false;
		}
		number = -1;
		firstValue = true;
		while (!numberInGoodRange(firstValue)) {
			System.out.println("Enter column (Number): ");
			number = input.nextInt();
			firstValue = false;
		}

	}

	private static boolean numberInGoodRange(boolean first) {
		if (number < 1 || number > DIMENSION) {
			 if (!first) {
				 System.err.println("Number not valid");
				 System.out.println();
			 }
			 return false;
		} else {
			return true;
		}
	}

	private static boolean letterInGoodRange(boolean first) {
		if (letter < 'A' || letter > 'A' + DIMENSION - 1) {
			if (!first) {
				System.err.println("Letter not valid");
				System.out.println();
			}
			return false;
		} else {
			return true;
		}
	}

	private static void shoot(char letter, int number) {

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

	private static void addShipsToMatrix() {

		long shipCounter = 0;
		int randomRow, randomCol;

		while (shipCounter < NUM_SHIPS) {
			randomRow = (int) (Math.random() * DIMENSION);
			randomCol = (int) (Math.random() * DIMENSION);

			if (matrix[randomRow][randomCol] != SHIP_SYMBOL) {
				matrix[randomRow][randomCol] = SHIP_SYMBOL;
				shipCounter++;
			}
		}

	}

	private static void winn() {

		if (remainingShips == 0) {
			gameOver = true;
			System.out.println("You WINNNN");
		}
	}

	private static void lose() {

		if (reamiangWater == 0) {
			gameOver = true;
			System.out.println("");
			System.out.println("");
			System.out.println("You LOSEEE, YOU NOOB !!");
			System.out.println(" σ_σ ");
		}
	}

	public static void initMatrix() {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = EMPTY_SYMBOL;
			}
		}
	}

	public static void printMatrix(boolean debug) {
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

	private static void printHeader() {
		System.out.print("  ");
		for (int i = 1; i <= matrix[0].length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
