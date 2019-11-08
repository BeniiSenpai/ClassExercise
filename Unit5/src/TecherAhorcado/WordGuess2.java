package TecherAhorcado;

import java.util.*;

public class WordGuess2 {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		boolean gameOver = false;
		String answer;

		Player player1 = readPlayerFromKeyBoard(1);
		Player player2 = readPlayerFromKeyBoard(2);
		Player currentPlayer = player1;

		while (!gameOver) {
			System.out.println(
					currentPlayer.getName() + " " + currentPlayer.getAttempts() + ":" + currentPlayer.getMagicString());
			
			answer = input.nextLine();
			currentPlayer.checkAnswer(answer);
			System.out.println(currentPlayer.getName() + ": " + currentPlayer.getMagicString());
			System.out.println();

			if (currentPlayer.wins()) {
				System.out.println(currentPlayer.getName() + " --> IS THE WINNER !!!");
				gameOver = true;
			}

			if (currentPlayer == player1) {
				currentPlayer = player2;
			} else {
				currentPlayer = player1;
			}
		}
		input.close();

	}

	private static Player readPlayerFromKeyBoard(int turn) {
		System.out.println("Player" + turn + ". Enter your name: ");
		String name = input.nextLine();
		return new Player(name, turn);
	}
}
