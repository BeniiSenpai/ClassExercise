
public class TestAuthor {

	public static void main(String[] args) {
		Author a = new Author("Richard Rothfuss","richardfuss@gmail.com",'M');
		System.out.println(a.toString());
		a.setEmail("Richa.1900@gmail.com");
		System.out.println();
		System.out.println(a.toString());

	}
	

}
