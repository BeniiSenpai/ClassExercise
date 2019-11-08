import java.util.Scanner;

public class MyBattleShip {

	static boolean gameOver;

	static char letter;
	static int number;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		gameOver = false;
		Board board = new Board (9,10); // Dimension 9 y 10 barcos 

		
	    
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
	    	board.printMatrix(true);
	    	askCoordinates(board, input);
	    	board.shoot(letter, number);
            board.winn();
            board.lose();
            System.out.println();
            System.out.println("The Remaining Ships are " + board.getRemainingShips() + "");
            System.out.println();
	    }
	}

	private static void askCoordinates(Board board, Scanner input) {
		letter = 'º';
		boolean firstValue = true;
		while (!board.letterInGoodRange(letter, firstValue)) {
			System.out.println("Enter row (Letter)");
			letter = input.next().toUpperCase().charAt(0);
			firstValue = false;
		}
		number = -1;
		firstValue = true;
		while (!board.numberInGoodRange(number, firstValue)) {
			System.out.println("Enter column (Number): ");
			number = input.nextInt();
			firstValue = false;
		}

	}




	
}
