
public class Products {

	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.product(4, 15));
	}

}

class Product {
	static int numCalls = 0;
	public static int product (int a,int b) {
		System.out.println("call number: " + numCalls);
		numCalls++;
		return product (a,b);
	}
}
