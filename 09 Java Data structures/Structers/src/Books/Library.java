package Books;

import java.util.ArrayList;
import java.util.TreeMap;

public class Library {

	private String NameOfLibrary;
	private String address;
	private TreeMap<String, ArrayList<Book>> bookCollection = new TreeMap<String, ArrayList<Book>>();

	public Library() {
		super();
	}

	public Library(String nameOfLibrary, String address, TreeMap<String, ArrayList<Book>> bookCollection) {
		super();
		NameOfLibrary = nameOfLibrary;
		this.address = address;
		this.bookCollection = bookCollection;
	}

	public String getNameOfLibrary() {
		return NameOfLibrary;
	}

	public void setNameOfLibrary(String nameOfLibrary) {
		NameOfLibrary = nameOfLibrary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TreeMap<String, ArrayList<Book>> getBookCollection() {
		return bookCollection;
	}

	public void setBookCollection(TreeMap<String, ArrayList<Book>> bookCollection) {
		this.bookCollection = bookCollection;
	}

	public void addCopy(String name) {
		if (bookCollection.containsKey(name)) {
			ArrayList<Book> list = bookCollection.get(name);
			if (list.size() != 0) {
				Book book = list.get(0);
				Book newBook = book;
				list.add(newBook);
				System.out.println("One copy was added!");
			} else {
				System.out.println("The list is empty!");
			}
		} else {
			System.out.println("There is no book with this name!");
		}
	}

	public void removeCopy(String name) {
		if (bookCollection.containsKey(name)) {
			ArrayList<Book> list = bookCollection.get(name);
			if (list.size() != 1) {
				list.remove(list.size() - 1);
				System.out.println("One copy was removed!");
			} else {
				System.out.println("There is no copy or list is empty!");
			}
		} else {
			System.out.println("There is no book with this name!");
		}

	}
}
