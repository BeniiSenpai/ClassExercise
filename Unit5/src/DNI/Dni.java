package DNI;

public class Dni {

	public static final char[] LETTERS = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
			'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };


	private int number;
	private char letter;

	public Dni() {
		number = 0;
		letter = LETTERS[0];

	}

	public Dni(int number, char letter) {
		this.letter = letter;
		this.number = number;
		checkLetter();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		checkLetter();
	}

	public char getLetter() {
		return letter;
	}

	public Dni(int number) {
		this.number = number;
		letter = LETTERS[number % 23];
	}

	@Override
	public String toString() {
		return "" + number + letter;
		// String.valueOf(number) Convertir numero en string !!!
	}

	public Dni(String s) {
		letter = s.charAt(s.length() - 1);
		number = Integer.parseInt(s.replaceAll("[^\\d]", ""));
		checkLetter();
	}

	private void checkLetter() {
		if (number >= 0) {
			if (LETTERS[number % 23] != letter) {
				number = -number;
			}
		} else {
			if (LETTERS[-number % 23] == letter) {
				number = -number;
			}
		}

	}
	/*
	 * public String toFormattedString() { String i = "" + number; String last3 =
	 * i.substring(i.length() - 4); String strMiddle = i.substring(i.length() - 6,
	 * i.length() - 3); return strMiddle + "." + last3 + "-" + letter;
	 * 
	 * }
	 */

	public String toFormattedString() {
		StringBuilder s = new StringBuilder(String.valueOf(number));
		if (number > 999) {
			s.insert(s.length() - 3, '.');
		}
		if (number > 999999) {
			s.insert(s.length() - 7, '.');
		}
		if (number > 999999999) {
			s.insert(s.length() - 11, '.');
		}
		return s.toString() + "-" + letter;
	}

	public static char letterForDni(int number) {
		return LETTERS[number % 23];
	}

	public static String nifForDni(int number) {
		return "" + number + "-" + letterForDni(number);
		//Otra forma de hacerlo --> return new Dni(number).toString();
	}

	public boolean isCorrectDni() {
		if (number % 23 >= 0) {
			return true;
		} else {
			return false;
		}
	}

}
