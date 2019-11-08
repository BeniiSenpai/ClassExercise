
public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		x = 0;
		y = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//@Override
	public String toString() { // Este metodo si no lo ponemos lo heredamos de la super Clase.Sirve para ver si nos hemos equivocado.
		return"(" + x + "," + y + ")";
	}

	public void moveTo(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	public void setOffset(int offX, int offY) {
		x += offX;
		y += offY;
	}
	
	public static double distance(Point p1, Point p2) {
		int c1 = p2.getX() - p1.getX();
		int c2 = p2.getY() - p1.getY();
		double h = Math.sqrt(c1 * c1 + c2 * c2);
		return h;
	}
	
}
