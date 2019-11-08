
public class Sort {

	public static void main(String[] args) {

		String[] a = { "hello", "my", "name", "is", "Beni" };

		String temp;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[i]) < 0) { // "abc.compareTo("cbz") --> -1" or "abz.compareTo("abc") --> 1
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print("" + a[i] + " ");
		}
	}

}
