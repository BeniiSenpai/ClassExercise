import java.util.Scanner;

public class BreakDemo {
	public static void main(String[] args) {
		
		boolean prime = true;
		int n;
		
		//Reading the Value 
		System.out.println("Enter a number:");
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		n = inputValue.nextInt();
		inputValue.close();
		
		for (int i=2; i<n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime)
			System.out.println("prime");
		else 
			System.out.println("NOT Prime");
	}
}