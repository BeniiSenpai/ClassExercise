import java.util.Scanner;
public class Ejercicio1java {
	public static void main (String[] args) {
	
		int [] array = new int[10];
	
		Scanner inputValue;
		inputValue = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			// Reading the Value
			System.out.println("Tell me a number :");
			array[i] = inputValue.nextInt();
		}
		
		inputValue.close(); //Se coloca cuando dejamos de pedir informacion inputValue.nextInt
		
			System.out.print(array[9]);
		for (int i = array.length - 2; i >=0 ; i--) {
			System.out.print("," + array[i]);
		}
		
	}
}
		