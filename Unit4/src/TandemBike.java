
public class TandemBike	extends Bicycle {
	private int numSeats = 2;	
	
	void applyBrakes(int decrement1, int decrement2) {
		applyBrakes(decrement1);		
		applyBrakes(decrement2);	
	}
	void printStates() {
		super.printStates();
		System.out.println("numseats" + numSeats);
	}
}
