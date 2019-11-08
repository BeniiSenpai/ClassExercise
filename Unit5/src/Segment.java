

public class Segment {
	
	private Point startPoint;
	private Point endPoint;

	public Segment() {
		startPoint = new Point();
		endPoint = new Point();
	}
	
	public Segment(Point startP, Point endP) {
		startPoint = startP;
		endPoint = endP;
				
	}
	
	public void setStartPoint (Point p) {
		startPoint = p;
	}
	
	public void setendPoint (Point p) {
		endPoint = p;
	}
	
	
	public Point getEndPoint() {
		return endPoint;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public double module() {
		int c1 = endPoint.getX() - startPoint.getX();
		int c2 = endPoint.getY() - startPoint.getY();
		double distance = Math.sqrt(c1 * c1 + c2 * c2);
		return distance;
	}
	
	@Override
	public String toString() {
		return "(" + startPoint.getX() + "," + startPoint.getY() +") - (" + endPoint.getX() + "," + endPoint.getY() +")" ;
	}
	
	public void setOffset (int offX, int offY) {
		startPoint.setOffset(offX, offY);
		endPoint.setOffset(offX, offY);
		
	}

	

	
}

