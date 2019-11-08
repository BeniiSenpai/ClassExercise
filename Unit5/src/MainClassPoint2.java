
public class MainClassPoint2 {

	public static void main(String[] args) {
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(4,5);
		
		p1.setOffset(4,4);
		p2.setOffset(4,4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		Segment s = new Segment(p1,p2);
		System.out.println(s.module());
		System.out.println(s.toString());
		s.setOffset(2, 1);
		System.out.println(s.toString());
	



	}

}
