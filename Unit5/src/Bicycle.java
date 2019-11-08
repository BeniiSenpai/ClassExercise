public class Bicycle {
	private int cadence;
	private int speed;
	private int gear;
	public static final int MAX_VELOCITY = 100; 
	
	public Bicycle() {
		cadence = 0;
		speed = 0;
		gear = 1;
	}
	
	public Bicycle(int cadence, int speed, int gear) {
		this.cadence = cadence; // This--> significa la instancia de esta clase, ya que se llama igual
		this.speed = speed;
		this.gear = gear;
	}

	void changeCadence(int newValue) {
		cadence = newValue;
	}

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
		if(speed > MAX_VELOCITY) {
			speed = MAX_VELOCITY;
		}
		
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
		if( speed < 0) {
			speed = 0;
		}
	}

	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
	}
}
