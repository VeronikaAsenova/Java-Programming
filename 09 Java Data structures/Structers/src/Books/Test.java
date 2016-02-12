package Books;

import java.util.ArrayList;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		Book aCuteLoveStory = new Book("A cute love story", " Nidhi Agrawal", 287);
		Book ultimatePleasure = new Book("Ultimate Pleasure", "Rachel Gd", 390);
		Book dragonGirl = new Book("Dragon Girl", "Melissa Nichols", 250);
		Book romeoAndJuliet = new Book("Romeo and Juliet", " William Shakespeare", 470);
		Book vampireAcademy = new Book("Vampire Academy", " Richelle Mead", 500);
		Book foreverYours = new Book(" Forever Yours", " The Storyteller", 700);
		
		ArrayList<Book> firstCollection = new ArrayList<>();
		firstCollection.add(aCuteLoveStory);
		firstCollection.add(ultimatePleasure);
		
		ArrayList<Book> secondCollection = new ArrayList<>();
		secondCollection.add(dragonGirl);
		secondCollection.add(romeoAndJuliet);
		
		ArrayList<Book> thirdCollection = new ArrayList<>();
		thirdCollection.add(vampireAcademy);
		thirdCollection.add(foreverYours);
		
		TreeMap<String, ArrayList<Book>> books = new TreeMap<>();
		books.put("A cute love story", firstCollection);
		books.put("Ultimate Pleasure", firstCollection);
		books.put("Dragon Girl", secondCollection);
		books.put("Romeo and Juliet", secondCollection);
		books.put("Richelle Mead", thirdCollection);
		books.put(" Forever Yours", thirdCollection);
		
		Library library = new Library("Children's Library", "Sofia", books);
		System.out.println(library);
		
		library.addCopy("A cute love story");
		library.addCopy("Vampire Academy");
		library.addCopy("Forever Yours");
		library.addCopy("Vampire Academy");
		library.addCopy("Romeo and Juliet");
		library.addCopy("A cute love story");
		library.removeCopy("Ultimate Pleasure");
		library.removeCopy("Forever Yours");
		library.addCopy("Forever Yours");
		library.addCopy("Ultimate Pleasure");
		library.removeCopy("Romeo and Juliet");
		library.removeCopy(" Forever Yours");
		
		System.out.println(library);
	}

}
