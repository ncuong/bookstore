package vn.taibt.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.taibt.bean.PostCategory;
import vn.taibt.db.ConnectionUtil;
import vn.taibt.db.DatabaseHelper;

public class PostCategoryDAOImpl implements PostCategoryDAO{

	@Override
	public List<PostCategory> findAll() throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			String sql = new StringBuilder().append("SELECT * FROM post_categories").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql);
			List<PostCategory> postCategories = new ArrayList<PostCategory>();
			while(rs.next()) {
				PostCategory postCategory = new PostCategory();
				Integer postCategoryId = rs.getInt("POST_CATEGORY_ID");
				String postCategoryName = rs.getString("POST_CATEGORY_NAME");
				
				postCategory.setPostCategoryId(postCategoryId);
				postCategory.setPostCategoryName(postCategoryName);
				
				postCategories.add(postCategory);
			}
			return postCategories;
		} finally {
			ConnectionUtil.closeConnection(con);
		}	
	}
	
	@Override
	public void add(PostCategory postCategory) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append("INSERT INTO post_categories(POST_CATEGORY_NAME) VALUES(?)").toString();
		Connection con = ConnectionUtil.getConnection();
		try{
			DatabaseHelper.executeUpdate(con, sql, new Object[] {postCategory.getPostCategoryName()});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public void update(PostCategory postCategory) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append("UPDATE post_categories SET POST_CATEGORY_NAME = ? WHERE POST_CATEGORY_ID = ?").toString();
		Connection con = ConnectionUtil.getConnection();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {postCategory.getPostCategoryName(), postCategory.getPostCategoryId()});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public void delete(Integer postCategoryId) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		String sql = new StringBuilder().append("DELETE FROM post_categories WHERE POST_CATEGORY_ID = ?").toString();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {postCategoryId});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public PostCategory findById(Integer id) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			String sql = new StringBuilder().append("SELECT * FROM post_categories WHERE POST_CATEGORY_ID = ?").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql, new Object[] {id});
			List<PostCategory> postCategories = new ArrayList<PostCategory>();
			while(rs.next()) {
				PostCategory postCategory = new PostCategory();
				Integer postCategoryId = rs.getInt("POST_CATEGORY_ID");
				String postCategoryName = rs.getString("POST_CATEGORY_NAME");
				
				postCategory.setPostCategoryId(postCategoryId);
				postCategory.setPostCategoryName(postCategoryName);
				
				postCategories.add(postCategory);
			}
			if(postCategories.size() > 0) {
				return postCategories.get(0);
			} else {
				return null;
			}
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public List<PostCategory> findByPostCategoryName(String postCategorySearchName)
			throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			String sql = new StringBuilder().append("SELECT * FROM post_categories INNER JOIN posts ON post_categories.POST_CATEGORY_ID = post.POST_CATEGORY_ID WHERE POST_CATEGORY_NAME LIKE ?").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql, new Object[] {"%"+postCategorySearchName+"%"});
			List<PostCategory> postCategories = new ArrayList<PostCategory>();
			while(rs.next()) {
				PostCategory postCategory = new PostCategory();
				Integer postCategoryId = rs.getInt("POST_CATEGORY_ID");
				String postCategoryName = rs.getString("POST_CATEGORY_NAME");
				
				postCategory.setPostCategoryId(postCategoryId);
				postCategory.setPostCategoryName(postCategoryName);
				
				postCategories.add(postCategory);
			}
			return postCategories;
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

}
