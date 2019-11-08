
public class MainClassPoint3 {


	public static void main(String[] args) {
		
		Segment s = new Segment(new Point(4,5), new Point(6,8));
		System.out.println(s.toString());
		s.setOffset(4,4);
		System.out.println(s.toString());
		System.out.println(s.module());
		
		

	}
}