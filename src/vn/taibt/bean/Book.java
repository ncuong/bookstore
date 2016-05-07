package vn.taibt.bean;

public class Book {
	private Integer bookId;
	private String bookName;
	private String auther;
	private Category category;

	public Book() {

	}

	public Book(Integer bookId, String bookName, String auther,
			Category category) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.auther = auther;
		this.category = category;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
