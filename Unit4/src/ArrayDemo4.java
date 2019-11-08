public class ArrayDemo4 {
	
	public static void main(String[] args) {
		int[] anArray = {101, 200, 305, 400, 500, 600, 700, 800, 908, 1000};	
		//We dont neew to do in the same line {101, 200, 305, 400, 500, 600, 700, 800, 908, 1000}
			
		System.out.print(anArray[0]);
		for (int i=1; i < anArray.length; i++) {
			System.out.print("," + anArray[i]);
		}
	}
}