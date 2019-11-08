package Ahorcado;

import java.util.Scanner;

public class MagicWord {

	public static final String[] WORDS = {
			"azul", "amarillo", "negro", "blanco", "rojo", "rosa", "verde", "marron" };

	private String word;
	private boolean[] guessed;
	private int fails;
	
	public MagicWord() {
		fails = 0;
		int x = (int) (Math.random() * WORDS.length);
		word = WORDS[x];
		guessed = new boolean[word.length()];
		for (int i = 0; i < guessed.length; i++) {
			guessed[i] = false;
		}

	}

	public String hiddenWord() {
		String s = "";
		for (int i = 0; i < guessed.length; i++) {
			if (guessed[i] == false) {
				// System.out.print("_ ");
				s = s + "_ ";

			} else {

				s = s + word.charAt(i);
				// System.out.print(word.charAt(i));
			}
		}
		System.out.println();
		return s;
	}

	public void checkLetterWord(String letter) {
		char l = letter.charAt(0);
		boolean correct = false;
		for (int i = 0; i < guessed.length; i++) {
			if (l == word.charAt(i)) {
				guessed[i] = true;
				correct = true;
			}
		}
		if (!correct) {
			fails++;
		}
	}

	public boolean areAllTrue() {
		for (boolean b : guessed)
			if (!b)
				return false;
		return true;
	}

	public void checkWord(String letter) {
		if (letter.equals(word)) {
			WordGuess.gameOver = true;
			System.out.println("CONGRATULATION --> You WINNN !!!");
			System.out.println("You got it in " + (WordGuess.count - 1) + " attempts");
		}
	}
	
	public void lose() {
		if (fails == 6) {
			WordGuess.gameOver = true;
			System.out.println("Yoou Lose !!");
			System.out.println("Try Agan.");
		}
	}

	public void printBody() {
		if (fails == 1) {
			System.out.println(	"  +---+\n" + 
								"  |   |\n" + 
								"  O   |\n" + 
								"      |\n" + 
								"      |\n" + 
								"      |\n" + 
								"=========");
		} else {
			if (fails == 2) {
				System.out.println(	"  +---+\n" + 
									"  |   |\n" + 
									"  O   |\n" + 
									"  |   |\n" + 
									"      |\n" + 
									"      |\n" + 
									"=========");
			} else {
				if (fails == 3) {
					System.out.println(	"  +---+\n" + 
										"  |   |\n" + 
										"  O   |\n" + 
										" /|   |\n" + 
										"      |\n" + 
										"      |\n" + 
										"=========");
				} else {
					if (fails == 4) {
					System.out.println(	"  +---+\n" + 
										"  |   |\n" + 
										"  O   |\n" + 
										" /|\\  |\n" + 
										"      |\n" + 
										"      |\n" + 
										"=========");
					} else {
						if (fails == 5) {
							System.out.println(	"  +---+\n" + 
												"  |   |\n" + 
												"  O   |\n" + 
												" /|\\  |\n" + 
												" /    |\n" + 
												"      |\n" + 
												"=========");
						} else {
							if (fails == 6) {
							System.out.println(	"  +---+\n" + 
												"  |   |\n" + 
												"  O   |\n" + 
												" /|\\  |\n" + 
												" / \\  |\n" + 
												"      |\n" + 
												"=========" +
												"YOU DIE !!");
							}
						}
					}
				}
			}
		}
	}

}




