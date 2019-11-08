
public class examn {

	public static void main(String[] args) {
		int x = 0;
		int n = 20;
		while (n > 0 || x >-10) {
			x = x + n;
			n = n - (x * 2);
			System.out.println("La x vale " + x);
		}
	}

}
