/**
 * 
 */
package math.examples;

/**
 * 
 */
public class Book {
	
	public static final int MAX_RATING = 5;
	public static final int MIN_RATING = 1;
	
	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The autor of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;
	
	/**
	 * This is the rating of the book
	 */
	private int Rating;
	
	
	// Constructor
	
	
	
	/**
	 * @return the rating
	 */
	public int getRating() {
		return Rating;
	}

	/**
	 * Constructor with args
	 * @param iSBN
	 * @param author
	 * @param title
	 * @param rating
	 */
	public Book(String iSBN, String author, String title, int rating) {
		this.setISBN(iSBN);
		this.setAuthor(author);
		this.setTitle(title);
		this.setRating(rating);
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) throws IllegalArgumentException {
		if (rating >= MIN_RATING && rating <= MAX_RATING) {
			this.Rating = rating;
		} else {
			throw new IllegalArgumentException("Invalid rating");
		}
	}

	/**
	 * Gets the ISBN number
	 * 
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN number
	 * 
	 * @param iSBN
	 *            10 or 13 chars
	 * @throws Exception 
	 */
	public void setISBN(String iSBN) throws IllegalArgumentException {
		
		if (iSBN == null) {
			throw new IllegalArgumentException("Null IBSN");
		} else if (iSBN.length() == 10 || iSBN.length() == 13) {
			this.ISBN = iSBN;
		} else {
			throw new IllegalArgumentException("Invalid IBSN");
		}		
		
	}

	/**
	 * Get the book's author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author
	 * 
	 * @param author
	 */
	public void setAuthor(String author)  {
		if (author == null) {
			throw new IllegalArgumentException("Null Author");
		} else if(author.length() >= 1) {
			this.author = author;
		} else {
			throw new IllegalArgumentException("Invalid Author");
		}	
		
	}

	/**
	 * Gets the book's title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the books title
	 * 
	 * @param title
	 */
	public void setTitle(String title) throws IllegalArgumentException {
		if (title == null) {
			throw new IllegalArgumentException("Null Title");
		}else if(title.length() >= 1) {
			this.title = title;
		} else {
			throw new IllegalArgumentException("Invalid Title");
		}
		
	}
	
	
	/**
	 * Default constructor
	 */
	public Book() {

	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", author=" + author + ", title=" + title + ", Rating=" + Rating + "]";
	}
	
	

}
