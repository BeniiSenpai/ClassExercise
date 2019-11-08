
public class Polygon {

	private Point[] points;


	public Polygon(Point[] points) {
		this.points = points;
	}

	public Polygon() {
		points = new Point[0];
	}

	@Override
	public String toString() { // Este metodo si no lo ponemos lo heredamos de la super Clase.Sirve para ver si
								// nos hemos equivocado.
		String s = "";
		for (int i = 0; i < points.length; i++) {
			s += points[i].toString() + " - ";
		}
		return s += points[0];

	}

	public void setOffset(int offX, int offY) {
		for (int j = 0; j < points.length; j++) {
			points[j].setOffset(offX, offY);
		}
	}
	/*
	public double perimetro() {
		double distance = 0;
		for (int i = 1; i < points.length; i++) {
			int x1 = points[i].getX();
			int y1 = points[i].getY();
			int x2 = points[i - 1].getX();
			int y2 = points[i - 1].getY();
			int c1 = x2 - x1;
			int c2 = y2 - y1;
			double result = Math.sqrt (c1 * c1) + (c2 *c2);
			distance = distance + result;
		}
		return distance; 
	}
	*/
	// Como lo haria el techer 
	
	public double getLength() {
		double length = 0;
		for (int i = 1; i < points.length; i++) {
			Point p1 = points[i];
			Point p2 = points[i - 1];
			Segment s = new Segment (p1,p2);
			length += s.module();
		}
		Point lastPoint = points[points.length - 1];
		Point firstPoint = points[0];
		Segment s = new Segment(lastPoint, firstPoint);
		length += s.module();
		return length;
	}
	
}
