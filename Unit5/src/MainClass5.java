
public class MainClass5 {

	public static void main(String[] args) {
		Rectangle[] arrayR = new Rectangle[10];
		for (int i = 0; i < arrayR.length; i++) {
			arrayR[i] = new Rectangle(arrayR[i], 1, 1);
		}
		
		for (int i = 0; i< arrayR.length; i++) {
			System.out.println(arrayR[i]);
		}
		
		/*
		for (Rectangle r : arrayR) {
			System.out.println(r);

		}
		*/
	}
}



















	/*
	 * static Point[] array;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * for(Point p: array){
	 * 		Syso (p);
	 * }
	 */
	/*
	public static void main(String[] args) {
		array = new Point[10];
		//array2= new Point[10];
		for (int i = 0; i < array.length; i++) {
			//array[i] = new Point(i,i);
			System.out.println();
			System.out.println("Rectangle = " + i);
			System.out.println();
			System.out.println();
			Rectangle r6 = new Rectangle(new Point(i,i),1 , 1) ;
			System.out.println("Bottom left = " + r6.getBottomLeftPoint() + " ");
			System.out.println("Bottom Right = " + r6.getBottomRightPoint() + " ");
			System.out.println("Top right = " + r6.getTopRightPoint() + " ");
			System.out.println("Top left = " + r6.getTopLeftPoint() + " ");
			
		}
	}
	*/
