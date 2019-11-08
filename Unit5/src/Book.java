
public class Book {
	private String tittle;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book (String tittle, Author author, double price){
		this.tittle = tittle;
		this.author = author;
		this.price = price;
		qtyInStock = 0;
	}
	
	public Book (String tittle, Author author, double price, int qtyInStock) {
		this.tittle = tittle;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
		
	}

	public String getTittle() {
		return tittle;
	}


	public Author getAuthor() {
		return author;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	@Override
	public String toString() {
		return tittle + ", by " + author.toString();
	}

}
