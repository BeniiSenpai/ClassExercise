package Ahorcado;

import java.util.Scanner;

public class WordGuess {

	static String letter;
	static int count = 1;
	static int countForPrint = 0;
	static boolean gameOver = false;

	public static void main(String[] args) {
		MagicWord MW = new MagicWord();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to my GuessWord !! ");
		System.out.println("Do you dare to play? --- If you hang yourself, you lose.");
		System.out.println();
		System.out.print("  +---+\n" +
					     "  |   |\n" + 
					     "      |\n" + 
					     "      |\n" +
					     "      |\n" +
					     "      |\n" +
					     "=========");
		
		System.out.println();

		while (!gameOver) {

			System.out.println("");
			System.out.println("Enter one character or your guess word: ");
			System.out.print("Attempt " + count + ":  " + MW.hiddenWord());
			count++;
			System.out.println();
			letter = input.next();
			MW.checkLetterWord(letter);
			MW.checkWord(letter);
			if (MW.areAllTrue()) {
				gameOver = true;
				System.out.println();
				System.out.println("CONGRATULATION --> You WINNN !!!");
				System.out.println("You got it in " + (count - 1) + " attempts");
			}
			MW.printBody();
			MW.lose();

		}
		input.close();
	}
}
