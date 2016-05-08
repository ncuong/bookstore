package vn.taibt.bean;

import java.util.List;

public class Category {
	private Integer categoryId;
	private String categoryName;
	private List<Book> books;

	public Category() {

	}

	public Category(Integer categoryId, String categoryName, List<Book> books) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.books = books;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
