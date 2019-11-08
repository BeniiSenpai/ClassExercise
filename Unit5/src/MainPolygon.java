
public class MainPolygon {

	public static void main(String[] args) {
		
		Point[] p = {new Point (4,5),new Point (4,10),new Point (8,12),new Point (7,3)};
		
		Polygon pol = new Polygon(p);
		System.out.println(pol.toString());
		pol.setOffset(1, 1);
		System.out.println(pol.toString());
		System.out.println(pol.getLength());
	}

}
