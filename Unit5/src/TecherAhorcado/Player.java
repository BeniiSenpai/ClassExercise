package TecherAhorcado;

public class Player {

	private String name;
	private int turn;
	private MagicWord2 magic;
	private int attempts;

	public Player(String name, int turn) {
		this.name = name;
		this.turn = turn;
		magic = new MagicWord2();
		attempts = 0;
	}

	public String getName() {
		return name;
	}

	public int getTurn() {
		return turn;
	}

	public String getMagicString() {
		return magic.toString();
	}

	public int getAttempts() {
		return attempts;
	}

	public void checkAnswer(String answer) {
		magic.checkAnswer(answer);
		attempts++;

	}

	public boolean wins() {
		return magic.isWinner();
	}

}
