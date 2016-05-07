package vn.taibt.bean;

public class Book {
	private Integer bookId;
	private String bookName;
	private String auther;
	private String sortDescription;
	private String fullDescription;
	private String imagePath;
	private Integer price;
	private Category category;

	public Book() {

	}

	public Book(Integer bookId, String bookName, String auther,
			String sortDescription, String fullDescription, String imagePath,
			Integer price, Category category) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.auther = auther;
		this.sortDescription = sortDescription;
		this.fullDescription = fullDescription;
		this.imagePath = imagePath;
		this.price = price;
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

	public String getSortDescription() {
		return sortDescription;
	}

	public void setSortDescription(String sortDescription) {
		this.sortDescription = sortDescription;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
