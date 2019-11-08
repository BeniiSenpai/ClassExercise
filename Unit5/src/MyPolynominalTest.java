
public class MyPolynominalTest {

	public static void main(String[] args) {
		MyPolynominal p1 = new MyPolynominal(1.1, 2.2, 3.3);
		MyPolynominal p2 = new MyPolynominal(1.1, 2.2, 3.3, 4.4, 5.5);
		// Can also invoke with an array
		double[] coeffs = { 3.0, 6.0, 2.0, 3.0, 0.0, 5.0 };
		MyPolynominal p3 = new MyPolynominal(coeffs);
		MyPolynominal p4 = new MyPolynominal("Poly");
		System.out.println(p3);
		System.out.println();
		System.out.println(p3.evaluate(1));
		MyPolynominal p5 = p3.add(p2);
	}

}
