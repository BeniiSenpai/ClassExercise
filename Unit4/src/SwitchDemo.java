import java.util.Scanner;
public class SwitchDemo {
	public static void main(String[] args) {
		int month;
		System.out.println("Enter the month:");
		//Reading the Value 
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		month = inputValue.nextInt();
		inputValue.close();
		
		String monthString;
		switch (month) {
			case 1: 
				monthString = "January";
				break;
			case 2: 
				monthString = "February";
				break;
			case 3: 
				monthString = "March";
				break;
			case 4: 
				monthString = "April";
				break;
			case 5: 
				monthString = "May";
				break;
			case 6: 
				monthString = "Juny";
				break;
			case 7: 
				monthString = "July";
				break;
			case 8: 
				monthString = "Agost";
				break;
			case 9: 
				monthString = "September";
				break;
			case 10: 
				monthString = "October";
				break;
			case 11: 
				monthString = "November";
				break;
			case 12: 
				monthString = "December";
				break;
			default:
				monthString = "Invalid month";
				break;
			
		}
		System.out.println(monthString);
	}
}
