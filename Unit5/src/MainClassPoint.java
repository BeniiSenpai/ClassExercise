
public class MainClassPoint {

	public static void main(String[] args) {
		
		Point p;
		
		p = new Point(2,5);
		p.moveTo(100, 200);
		p.setOffset(5,20);
		p.setX(15);
		System.out.println(p);
	
		//p.x = 5; no nos dejaria ya que la x esta en private.
	

	}

}
