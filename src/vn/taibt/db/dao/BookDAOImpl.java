package vn.taibt.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.taibt.bean.Book;
import vn.taibt.bean.Category;
import vn.taibt.db.ConnectionUtil;
import vn.taibt.db.DatabaseHelper;

public class BookDAOImpl implements BookDAO {
	
	private CategoryDAO categoryDAO;

	@Override
	public List<Book> findAll() throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		categoryDAO = new CategoryDAOImpl();
		try {
			String sql = new StringBuilder().append("SELECT * FROM books").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql);
			List<Book> books = new ArrayList<Book>();
			while(rs.next()) {
				Book book = new Book();
				Integer bookId = rs.getInt("BOOK_ID");
				String bookName = rs.getString("BOOK_NAME");
				String auther = rs.getString("AUTHER");
				book.setBookId(bookId);
				book.setBookName(bookName);
				book.setAuther(auther);
				
				Integer categoryId = rs.getInt("CATEGORY_ID");
				Category category = categoryDAO.findById(categoryId);
				book.setCategory(category);
				
				
				books.add(book);
			}
			return books;
		} finally {
			ConnectionUtil.closeConnection(con);
		}	
	}

	@Override
	public void add(Book book) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append(
				"INSERT INTO books(BOOK_NAME, AUTHER, CATEGORY_ID) VALUES(?, ?, ?)").toString();
		Connection con = ConnectionUtil.getConnection();
		try {
			DatabaseHelper.executeUpdate(con, sql,
					new Object[] { book.getBookName(), book.getAuther(), book.getCategory().getCategoryId() });
		} finally {
			ConnectionUtil.closeConnection(con);
		}

	}

	@Override
	public void update(Book book) throws ClassNotFoundException, SQLException {
//		String sql = new StringBuilder().append("UPDATE categories SET CATEGORY_NAME = ? WHERE CATEGORY_ID = ?").toString();
//		Connection con = ConnectionUtil.getConnection();
//		try {
//			DatabaseHelper.executeUpdate(con, sql, new Object[] {category.getCategoryName(), category.getCategoryId()});
//		} finally {
//			ConnectionUtil.closeConnection(con);
//		}

	}

	@Override
	public void delete(Integer bookId) throws ClassNotFoundException,
			SQLException {
		Connection con = ConnectionUtil.getConnection();
		String sql = new StringBuilder().append("DELETE FROM books WHERE BOOK_ID = ?").toString();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {bookId});
		} finally {
			ConnectionUtil.closeConnection(con);
		}

	}

	@Override
	public Book findById(Integer id) throws ClassNotFoundException,
			SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			categoryDAO = new CategoryDAOImpl();
			String sql = new StringBuilder().append("SELECT * FROM books WHERE BOOK_ID = ?").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql, new Object[] {id});
			List<Book> books = new ArrayList<Book>();
			while(rs.next()) {
				Book book = new Book();
				Integer bookId = rs.getInt("BOOK_ID");
				String bookName = rs.getString("BOOK_NAME");
				String auther = rs.getString("AUTHER");
				Integer categoryId = rs.getInt("CATEGORY_ID");
				
				book.setBookId(bookId);
				book.setBookName(bookName);
				book.setAuther(auther);
				
				
				Category category = categoryDAO.findById(categoryId);
				book.setCategory(category);
				
				books.add(book);
			}
			if(books.size() > 0) {
				return books.get(0);
			} else {
				return null;
			}
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

}
