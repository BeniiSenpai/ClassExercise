
public class MainClass4 {
	public static void main(String[]args) {
		Rectangle r = new Rectangle();
		System.out.println(r);
		r.moveTo(4, 4);
		System.out.println(r);
		
		System.out.println();
		System.out.println();
		
		
		Rectangle r2 = new Rectangle(new Point(1,1),8 , 6) ;
		System.out.println(r2);

		Rectangle r3 = new Rectangle(new Point(2,2), new Point (4,5));
		System.out.println(r3);
		
		Segment s = new Segment (new Point(4,5), new Point (6,8));
		Rectangle r4 = new Rectangle(s);
		System.out.println(r4);
		System.out.println();
		
		System.out.println(r4.getArea());
		System.out.println();
		
		System.out.println(r4.getBottomLeftPoint());
		System.out.println(r4.getBottomRightPoint());
		System.out.println(r4.getTopRightPoint());
		System.out.println(r4.getTopLeftPoint());
		System.out.println();
		
		
		Rectangle r5 = new Rectangle(new Point(5,6),10 , 8) ;
		System.out.println(r5);
		System.out.println();
		System.out.println("Bottom left = " + r5.getBottomLeftPoint() + " ");
		System.out.println("Bottom Right = " + r5.getBottomRightPoint() + " ");
		System.out.println("Top right = " + r5.getTopRightPoint() + " ");
		System.out.println("Top left = " + r5.getTopLeftPoint() + " ");
		
		/*
		Point p = r4.getPoint();
		System.out.println(p);
		System.out.println(r4.getPoint()); 
		*/
		
	}
	

}
