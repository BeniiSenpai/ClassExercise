import java.util.Scanner;
public class ExerciseDNI {

	public static void main (String[] args) {
		int rest, number;
		char[] copyFrom = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q',
				'V','H','L','C','K','E'};
	
		Scanner inputValue;
		inputValue = new Scanner(System.in);

		// Reading the Value
		System.out.println("Tell me the number of the DNI :");
		number = inputValue.nextInt();
		inputValue.close(); 
		
		rest = number % 23;
		
		System.out.println(number + "-"
				+ "" + copyFrom[rest]);
		}
		
		//Se coloca cuando dejamos de pedir informacion inputValue.nextInt
	
}

		