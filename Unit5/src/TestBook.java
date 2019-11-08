
public class TestBook {

	public static void main(String[] args) {
		Author a = new Author("Richard Rothfuss","RicharD:@gmail.com",'M');
		Book b = new Book("The name of the wind", a, 30.9, 10);
		Book b2 = new Book("The notebook", new Author("Nicolas Spark", "ppp@gmail.com", 'm'), 25.9);
		Book b3 = new Book("The fear of wise man", a, 35.9,8);
		System.out.println(b.toString());
		
		Book[] books;
		books = new Book[5];
		books[0] = b;
		books[1] = b2;
		books[2] = b3;
		books[3] = new Book ("Don Quijote de la Mancha", new Author("Miguel de Cervantes", "", 'M'), 45.3,50);
		books[4] = new Book ("It", new Author("Sthepen King" , "Sthepink@gmail.com", 'M'), 23.99,10);
		
		System.out.println("---------------------");
		
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].toString());
		}
		
		System.out.println("---------------------");
		
		for (Book bvar : books) {
			System.out.println(bvar);
		}
	}

}
