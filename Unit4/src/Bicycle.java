public class Bicycle {
	private int cadence = 0;
	private int speed = 0;
	private int gear = 1;
	public static final int MAX_VELOCITY = 100; 

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
