
public class Book {
	String title;
	String writer;
	String genre;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String writer, String genre) {
		super();
		this.title = title;
		this.writer = writer;
		this.genre = genre;
	}
	
	public void printInfo() {
		System.out.println(title);
		System.out.println(writer);
		System.out.println(genre);
	}
}
