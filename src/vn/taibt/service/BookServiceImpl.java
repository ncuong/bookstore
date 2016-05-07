package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Book;
import vn.taibt.db.dao.BookDAO;
import vn.taibt.db.dao.BookDAOImpl;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;

	@Override
	public List<Book> findAll() throws ClassNotFoundException, SQLException {
		bookDAO = new BookDAOImpl();
		List<Book> books = bookDAO.findAll();
		return books;
	}

	@Override
	public void add(Book book) throws ClassNotFoundException, SQLException {
		bookDAO = new BookDAOImpl();
		bookDAO.add(book);
	}

	@Override
	public void update(Book book) throws ClassNotFoundException, SQLException {
		bookDAO = new BookDAOImpl();
		bookDAO.update(book);
	}

	@Override
	public void delete(Integer bookId) throws ClassNotFoundException,
			SQLException {
		bookDAO = new BookDAOImpl();
		bookDAO.delete(bookId);

	}

	@Override
	public Book findById(Integer bookId) throws ClassNotFoundException,
			SQLException {
		bookDAO = new BookDAOImpl();
		Book book = bookDAO.findById(bookId);
		return book;
	}

}
