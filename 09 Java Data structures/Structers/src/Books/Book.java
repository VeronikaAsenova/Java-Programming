package Books;

public class Book {
	private String NameOfBook;
	private String Author;
	private int pages;

	public Book() {
		super();
	}

	public Book(String nameOfBook, String author, int pages) {
		super();
		NameOfBook = nameOfBook;
		Author = author;
		this.pages = pages;
	}

	public String getNameOfBook() {
		return NameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		NameOfBook = nameOfBook;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String toString() {
		String result = this.NameOfBook + ", " + this.Author + ", " + this.pages;
		return result;
	}

	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}

		if (!(object instanceof Book)) {
			return false;
		}

		Book book = (Book) object;
		return this.hashCode() == book.hashCode();

	}
}
