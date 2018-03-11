//Created By: Tirupati Rao	Medepalli
//Real World Object. Date: 11-Mar-18
public class Book {
	//variables
	private String author;
	private String name;
	private double price;
	private int publishYear;
	
	//methods
	public Book(String author, String name) {
		this.author = author;
		this.name= name;
	}
	
	public Book(String author, String name, double price) {
		this.author = author;
		this.name = name;
		this.price = price;
	}
	
	public Book(String author, String name, double price,int publishYear) {
		this.author = author;
		this.name = name;
		this.price = price;
		this.publishYear = publishYear;
	}
	
	//getters and setters
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", name=" + name + ", price=" + price + ", publishYear=" + publishYear + "]";
	}
	
		
}
