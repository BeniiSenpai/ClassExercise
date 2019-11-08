import java.util.*;
public class ReverseNumbers {

	public static void main(String[] args) {
		
		//Reading the Value 
		System.out.println("Enter ten numbers:");
		Scanner inputValue;
		inputValue = new Scanner(System.in);

		int[] array;
		array = new int[10];
		
		for (int i=0; i<array.length; i++) {
			array[i] = inputValue.nextInt();
		}
		inputValue.close();
		for (int i = array.length -1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

}
