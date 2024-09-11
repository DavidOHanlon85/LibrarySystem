package math.examples;

import java.util.ArrayList;

public class LibraryDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> allBooks = new ArrayList<Book>();
		
		Book b1 = new Book("1234567890", "John", "Peter's Story", 3);
		Book b2 = new Book("1234567890", "John", "Peter's Story", 1);
		allBooks.add(b1);
		allBooks.add(b2);
		
		LibrarySearch l = new LibrarySearch();
		
		
		
		System.out.println(LibrarySearch.searchByRating(allBooks, 3));
		
		System.out.println(l.searchByISBN(allBooks, "1234567890"));
		

	}

}
