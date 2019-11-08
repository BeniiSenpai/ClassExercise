public class FrequentItem {
	public static final char[] letter = { 'T', 'R', 'W', 'A', 'G', 'T', 'Y', 'F', 'P', 'D', 'X', 'M', 'N', 'J', 'Z',
			'S', 'S', 'S', 'H', 'L' };

	public static void main(String[] args) {

		int countRepeat;
		int frequenceMax = 0;
		char charMax = letter[0];
		char candidate;

		for (int x = 0; x < letter.length; x++) {
			if(letter[x] == '\u00d0') { //Se usa para no volver a comprabar el mismo punto 
				continue;
			}
			candidate = letter[x];
			countRepeat = 1;
			for (int j = x + 1; j < letter.length; j++)
				if (candidate == letter[j]) {
					countRepeat++;
					letter[j] = '\u00D0';//Se usa para no volver a comprabar el mismo punto y hay que darle un valor que no afecte 
				}
			if (countRepeat > frequenceMax) {
				charMax = candidate;
				frequenceMax = countRepeat;
			}
		}
		System.out.println("Mode = " + charMax);
		System.out.println("Max Frequence " + frequenceMax);
	}
}

