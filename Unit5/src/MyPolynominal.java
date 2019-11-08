import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MyPolynominal {
	private double[] coeffs;

	public MyPolynominal(double... coeffs) { // varargs
		this.coeffs = coeffs; // varargs is treated as array
	}

	public MyPolynominal(String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename)); // open file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int degree = in.nextInt(); // read the degree
		coeffs = new double[degree + 1]; // allocate the array
		for (int i = 0; i < coeffs.length; ++i) {
			coeffs[i] = in.nextDouble();
		}
	}

	public int getDegree() {
		return coeffs.length - 1;
	}

	@Override
	public String toString() {
		String s = "";
		String term;
		for (int i = 0; i < coeffs.length; i++) {
			if (coeffs[i] != 0) {
				if (i == 0) {
					term = "" + coeffs[i];
				} else {
					if (i == 1) {
						term = coeffs[i] + "X";
					} else {
						term = coeffs[i] + "X^" + i;
					}
				}
				if (s.length() != 0) {
					s = term + " + " + s;
				} else {
					s = term + s;
				}
			}
		}
		return s;
	}

	public double evaluate(double x) {
		double suma = 0;
		for (int i = 0; i < coeffs.length; i++) {
			double result = coeffs[i] * Math.pow(x, i);
			suma += result;
		}
		return suma;
	}

	
	 public MyPolynominal add(MyPolynominal p) {
		 double[] addPoly;
		 for (int i = 0; i < coeffs.length; i++) {
			 double operation = coeffs[i] + p.coeffs[i];
			 addPoly[i] = operation;
		 }
		 return 
	 }


	/*
	public double multiply() {
		for(int i=0; i<coeffs.length; i++) {
			double result = 
		}
	}
	*/
}

// • A method toString() that returns "cnx^n+cn-1x^(n-1)+...+c1x+c0"

/*
 * • A method evaluate(double x) that evaluate the polynomial for the given x,
 * by substituting the given x into the polynomial expression.• Methods add()
 * and multiply() that adds and multiplies this polynomial with the given
 * MyPolynomial instance another, and returns a new MyPolynomial instance that
 * contains the result.
 */
