package vn.taibt.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.taibt.bean.Category;
import vn.taibt.db.ConnectionUtil;
import vn.taibt.db.DatabaseHelper;

public class CategoryDAOImpl implements CategoryDAO {

	@Override
	public List<Category> findAll() throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			String sql = new StringBuilder().append("SELECT * FROM CATEGORIES").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql);
			List<Category> categories = new ArrayList<Category>();
			while(rs.next()) {
				Category category = new Category();
				Integer categoryId = rs.getInt("CATEGORY_ID");
				String categoryName = rs.getString("CATEGORY_NAME");
				
				category.setCategoryId(categoryId);
				category.setCategoryName(categoryName);
				
				categories.add(category);
			}
			return categories;
		} finally {
			ConnectionUtil.closeConnection(con);
		}	
	}
	
	@Override
	public void add(Category category) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append("INSERT INTO categories(CATEGORY_NAME) VALUES(?)").toString();
		Connection con = ConnectionUtil.getConnection();
		try{
			DatabaseHelper.executeUpdate(con, sql, new Object[] {category.getCategoryName()});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public void update(Category category) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append("UPDATE categories SET CATEGORY_NAME = ? WHERE CATEGORY_ID = ?").toString();
		Connection con = ConnectionUtil.getConnection();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {category.getCategoryName(), category.getCategoryId()});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public void delete(Integer categoryId) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		String sql = new StringBuilder().append("DELETE FROM categories WHERE CATEGORY_ID = ?").toString();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {categoryId});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public Category findById(Integer categoryId) throws ClassNotFoundException, SQLException {
//		Connection con = ConnectionUtil.getConnection();
		return null;
	}

	public static void main(String[] args) throws SQLException {
		CategoryDAO test = new CategoryDAOImpl();
		
		try {
			Connection con = ConnectionUtil.getConnection();
			List<Category> categories = test.findAll();
			for (Category category : categories) {
				System.out.println(category.getCategoryId());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
