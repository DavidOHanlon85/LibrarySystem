package math.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBook {
	
	// Test Data
	
	int validRatingLow, validRatingMid, validRatingHigh;
	int invalidRatingLow, invalidRatingHigh;
	
	String validIBSNLow, validISBNHigh;
	String invalidISBNLow, invalidIBSNMid, invalidIBSNHigh;
	
	String validAuthorLow, validAuthorMid, validAuthorHigh;
	String invalidAuthor;
	
	String validTitleLow, validTitleMid, validTitleHigh;
	String invalidTitle;
	
	Book b;

	@BeforeEach
	void setUp() throws Exception {
		
		validRatingLow = 1;
		validRatingMid = 3;
		validRatingHigh = 5;
		
		invalidRatingLow = -2;
		invalidRatingHigh = 7;
		
		validIBSNLow = "1234567890";
		validISBNHigh = "1234567890123";
		
		invalidISBNLow = "123";
		invalidIBSNMid = "12345678901";
		invalidIBSNHigh = "12345678901234567890";
		
		validAuthorLow = "x".repeat(5);
		validAuthorMid = "x".repeat(10);
		validAuthorHigh = "x".repeat(20);
		
		invalidAuthor = "";
		
		validTitleLow = "x".repeat(5);
		validTitleMid = "x".repeat(10);
		validTitleHigh = "x".repeat(20);
		
		invalidTitle = "";
		
		b = new Book();
	}

	@Test
	void testSetGetRatingValid() {
		b.setRating(validRatingLow);
		assertEquals(validRatingLow, b.getRating());
		
		b.setRating(validRatingMid);
		assertEquals(validRatingMid, b.getRating());
		
		b.setRating(validRatingHigh);
		assertEquals(validRatingHigh, b.getRating());
	}
	
	@Test
	void testSetGetRatingInvalid() {
		
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setRating(invalidRatingLow);
		});
		
		assertEquals("Invalid rating", exp.getMessage());
		
		 exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setRating(invalidRatingHigh);
		});
		
		assertEquals("Invalid rating", exp.getMessage());
		
	}

	@Test
	void testSetGetISBNValid() {
		b.setISBN(validIBSNLow);
		assertEquals(validIBSNLow, b.getISBN());
		
		b.setISBN(validISBNHigh);
		assertEquals(validISBNHigh, b.getISBN());
	}
	
	@Test
	void testSetGetISBNInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setISBN(invalidISBNLow);
		});
		
		assertEquals("Invalid IBSN", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setISBN(invalidIBSNMid);
		});
		
		assertEquals("Invalid IBSN", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setISBN(invalidIBSNHigh);
		});
		
		assertEquals("Invalid IBSN", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setISBN(null);
		});
		
		assertEquals("Null IBSN", exp.getMessage());
		
	}
	
	@Test
	void testSetGetAuthorValid() {
		b.setAuthor(validAuthorLow);
		assertEquals(validAuthorLow, b.getAuthor());
		
		b.setAuthor(validAuthorMid);
		assertEquals(validAuthorMid, b.getAuthor());
		
		b.setAuthor(validAuthorHigh);
		assertEquals(validAuthorHigh, b.getAuthor());
	}
	
	@Test
	void testSetGetAuthorinValid() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setAuthor(invalidAuthor);
		});
		
		assertEquals("Invalid Author", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setAuthor(null);
		});
		
		assertEquals("Null Author", exp.getMessage());
	}
		
	@Test
	void testSetGetTitleValid() {
		b.setTitle(validTitleLow);
		assertEquals(validTitleLow, b.getTitle());
		
		b.setTitle(validTitleMid);
		assertEquals(validTitleMid, b.getTitle());
		
		b.setTitle(validTitleHigh);
		assertEquals(validTitleHigh, b.getTitle());
	}
	
	@Test
	void testSetGetTitleInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setTitle(invalidTitle);
		});
		
		assertEquals("Invalid Title", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			b.setTitle(null);
		});
		
		assertEquals("Null Title", exp.getMessage());
	}
	
	@Test
	void testConstructorValid() {
		Book b1 = new Book(validISBNHigh, validAuthorHigh, validTitleHigh, validRatingHigh);
		
		assertEquals(validISBNHigh, b1.getISBN());
		assertEquals(validAuthorHigh, b1.getAuthor());
		assertEquals(validTitleHigh, b1.getTitle());
		assertEquals(validRatingHigh, b1.getRating());
	}

	@Test
	void testConstructorInvalid() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book b1 = new Book(invalidIBSNHigh, validAuthorHigh, validTitleHigh, validRatingHigh);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book b1 = new Book(validIBSNLow, invalidAuthor, validTitleHigh, validRatingHigh);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book b1 = new Book(validIBSNLow, validAuthorHigh, invalidTitle, validRatingHigh);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book b1 = new Book(validIBSNLow, validAuthorHigh, validTitleHigh, invalidRatingHigh);
		});
		
	}

}
