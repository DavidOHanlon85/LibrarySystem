package math.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLibrarySearch {

	// test data

	Book b1, b2, b3, b4, b5;

	ArrayList<Book> allBooks;

	LibrarySearch ls;

	@BeforeEach
	void setUp() throws Exception {

		allBooks = new ArrayList<Book>();

		ls = new LibrarySearch();

		b1 = new Book("1234567890", "David", "Title1", 5);
		b2 = new Book("2134567890", "David", "Title1", 5);
		b3 = new Book("1234567890", "John", "Title2", 1);
		b4 = new Book("2134567890", "Elvis", "Title2", 2);
		b5 = new Book("3214567890", "Peter", "Title3", 5);

		allBooks.add(b1);
		allBooks.add(b2);
		allBooks.add(b3);
		allBooks.add(b4);
		allBooks.add(b5);

	}

	@Test
	void testSearchByISBNValid() {
		ArrayList<Book> results = ls.searchByISBN(allBooks, "1234567890");

		assertTrue(results.size() == 2);
		assertTrue(results.contains(b1));
		assertTrue(results.contains(b3));

		results = ls.searchByISBN(allBooks, "3214567890");

		assertTrue(results.size() == 1);
		assertTrue(results.contains(b5));

	}

	@Test
	void testSearchByISBNInvalidALNull() {

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByISBN(null, "1234567890");
		});

		assertEquals("AL IS NULL", exp.getMessage());

	}

	@Test
	void testSearchByISBNInvalidALEmpty() {

		allBooks.clear();

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByISBN(allBooks, "1234567890");
		});

		assertEquals("AL IS EMPTY", exp.getMessage());

	}

	@Test
	void testSearchByISBNInvalidISBNNull() {

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByISBN(allBooks, null);
		});

		assertEquals("ISBN IS NULL", exp.getMessage());

	}

	@Test
	void testSearchByRating() {

		ArrayList<Book> results = ls.searchByRating(allBooks, 5);

		assertTrue(results.size() == 3);
		assertTrue(results.contains(b1));
		assertTrue(results.contains(b2));
		assertTrue(results.contains(b5));

		results = ls.searchByRating(allBooks, 1);

		assertTrue(results.size() == 1);
		assertTrue(results.contains(b3));

	}
	
	@Test
	void testSearchByRatingInvalidALNull() {

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByRating(null, 5);
		});

		assertEquals("AL IS NULL", exp.getMessage());
	}
	
	@Test
	void testSearchByRatingInvalidALEMPTY() {
		
		allBooks.clear();

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByRating(allBooks, 5);
		});

		assertEquals("AL IS EMPTY", exp.getMessage());
	}

	@Test
	void testSearchByTitleValid() {
		
		ArrayList<Book> results = ls.searchByTitle(allBooks, "Title1");

		assertTrue(results.size() == 2);
		assertTrue(results.contains(b1));
		assertTrue(results.contains(b2));
		
		results = ls.searchByTitle(allBooks, "Title2");

		assertTrue(results.size() == 2);
		assertTrue(results.contains(b3));
		assertTrue(results.contains(b4));
	
	}
	
	@Test
	void testSearchByTitleInvalidALNull() {
		
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByTitle(null, "Title1");
		});

		assertEquals("AL IS NULL", exp.getMessage());
	
	}
	
	@Test
	void testSearchByTitleInvalidALEmpty() {
		
		allBooks.clear();
		
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByTitle(allBooks, "Title1");
		});

		assertEquals("AL IS EMPTY", exp.getMessage());
	
	}
	
	@Test
	void testSearchByTitleInvalidTitleNull() {
		
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByTitle(allBooks, null);
		});

		assertEquals("TITLE IS NULL", exp.getMessage());
	
	}

	@Test
	void testSearchByAuthorValid() {
		ArrayList<Book> results = ls.searchByAuthor(allBooks, "David");

		assertTrue(results.size() == 2);
		assertTrue(results.contains(b1));
		assertTrue(results.contains(b2));
		
		results = ls.searchByAuthor(allBooks, "Peter");

		assertTrue(results.size() == 1);
		assertTrue(results.contains(b5));
	
	}
	
	@Test
	void testSearchByAuthorInvalidALNull() {

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByAuthor(null, "David");
		});

		assertEquals("AL IS NULL", exp.getMessage());
	
	}
	
	@Test
	void testSearchByAuthorInvalidALIsEmpty() {
		
		allBooks.clear();

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByAuthor(allBooks, "David");
		});

		assertEquals("AL IS EMPTY", exp.getMessage());
	
	}
	
	@Test
	void testSearchByAuthorInvalidAuthorIsNull() {

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			ls.searchByAuthor(allBooks, null);
		});

		assertEquals("AUTHOR IS NULL", exp.getMessage());
	
	}

}
