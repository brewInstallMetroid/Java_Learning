package main.app.library;

public class Book {
	private String title;
	private String author;
	private Integer rating;


	public Book(String bTitle, String bAuthor, Integer bRating) {
		this.title = bTitle;
		this.author = bAuthor;
		this.rating = bRating;
	}

	public String getAuthor() { return author; }
	public String getTitle() { return title; }
	public Integer getRating() { return rating; }

}
