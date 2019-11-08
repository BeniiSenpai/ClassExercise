

import java.util.Scanner;

public class ArrayDemo3 {
	
	public static final int NUM_ELEMENTS = 10;
	public static void main(String[] args) {
		// Declaration
		int[] anArray;		
		// Instantation
		anArray = new int[NUM_ELEMENTS];
		// Initialization
		for (int i=0; i < anArray.length; i++)
			anArray[i] = (i + i) * 100;
			
		for (int i=0; i < anArray.length; i++)
			System.out.println("Element at index" + i + ":" + anArray[i]);
	}
}