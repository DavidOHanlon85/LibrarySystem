/**
 * 
 */
package math.examples;

import java.util.ArrayList;

/**
 * 
 */
public class LibrarySearch {
	
	/**
	 * This method searches books in allBooks and returns those with a matching ISBN number.
	 * 
	 * IllegalArgumentException with appropriate messages thrown for null AL, empty AL or null ISBN input
	 * @param allBooks
	 * @param ISBN
	 * @return
	 * @throws IllegalArgumentException
	 */
	
	public static ArrayList<Book> searchByISBN(ArrayList<Book> allBooks, String ISBN) throws IllegalArgumentException{
		if (allBooks == null) {
			throw new IllegalArgumentException("AL IS NULL");
		}
		
		if (allBooks.size() == 0) {
			throw new IllegalArgumentException("AL IS EMPTY");
		}
		
		if (ISBN == null) {
			throw new IllegalArgumentException("ISBN IS NULL");
		}
		
		ArrayList<Book> results = new ArrayList<Book>();
		
		for (int i = 0; i < allBooks.size(); i++) {
			if (allBooks.get(i).getISBN().equals(ISBN)) {
				results.add(allBooks.get(i));
			}
		}
		return results;
	}
	
	/**
	 * This method searches books in allBooks and returns those with a matching rating.
	 * 
	 * IllegalArgumentException with appropriate messages thrown for null AL or empty AL
	 * @param allBooks
	 * @param rating
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static ArrayList<Book> searchByRating(ArrayList<Book> allBooks, int rating) throws IllegalArgumentException{
		if (allBooks == null) {
			throw new IllegalArgumentException("AL IS NULL");
		}
		
		if (allBooks.size() == 0) {
			throw new IllegalArgumentException("AL IS EMPTY");
		}
		
		ArrayList<Book> results = new ArrayList<Book>();
		for (Book b : allBooks) {
			if (b.getRating() == rating) {
				results.add(b);
			}
		}
		return results;
	}

	
	/**
	 * This method searches books in allBooks and returns those with a matching titles.
	 * 
	 * IllegalArgumentException with appropriate messages thrown for null AL or empty AL and for null title
	 * @param allBooks
	 * @param title
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static ArrayList<Book> searchByTitle(ArrayList<Book> allBooks, String title)throws IllegalArgumentException {
		
		if (allBooks == null) {
			throw new IllegalArgumentException("AL IS NULL");
		}
		
		if (allBooks.size() == 0) {
			throw new IllegalArgumentException("AL IS EMPTY");
		}
		
		if (title == null) {
			throw new IllegalArgumentException("TITLE IS NULL");
		}
		
		ArrayList<Book> results = new ArrayList<Book>();
		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getTitle().equals(title)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}

	/**
	 * This method searches books in allBooks and returns those with a matching titles.
	 * 
	 * IllegalArgumentException with appropriate messages thrown for null AL or empty AL and for null author
	 * @param allBooks
	 * @param author
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static ArrayList<Book> searchByAuthor(ArrayList<Book> allBooks, String author) throws IllegalArgumentException {
		
		if (allBooks == null) {
			throw new IllegalArgumentException("AL IS NULL");
		}
		
		if (allBooks.size() == 0) {
			throw new IllegalArgumentException("AL IS EMPTY");
		}
		
		if (author == null) {
			throw new IllegalArgumentException("AUTHOR IS NULL");
		}
		
		ArrayList<Book> results = new ArrayList<Book>();

		for (int loop = 0; loop < allBooks.size(); loop++) {
			if (allBooks.get(loop).getAuthor().equals(author)) {
				// add book to search
				results.add(allBooks.get(loop));
			}
		}
		return results;
	}
	
	
	
	
	
}
