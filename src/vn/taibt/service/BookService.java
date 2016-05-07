package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Book;

public interface BookService {
	public List<Book> findAll() throws ClassNotFoundException, SQLException;
	public void add(Book book) throws ClassNotFoundException, SQLException;
	public void update(Book book) throws ClassNotFoundException, SQLException;
	public void delete(Integer bookId) throws ClassNotFoundException, SQLException;
	public Book findById(Integer bookId) throws ClassNotFoundException, SQLException;
}
