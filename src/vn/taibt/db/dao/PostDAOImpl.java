package vn.taibt.db.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vn.taibt.bean.Post;
import vn.taibt.bean.PostCategory;
import vn.taibt.db.ConnectionUtil;
import vn.taibt.db.DatabaseHelper;

public class PostDAOImpl implements PostDAO{
	
	private PostCategoryDAO postCategoryDAO;

	@Override
	public List<Post> findAll() throws ClassNotFoundException, SQLException {
		Connection con = ConnectionUtil.getConnection();
		postCategoryDAO = new PostCategoryDAOImpl();
		try {
			String sql = new StringBuilder().append("SELECT * FROM posts").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql);
			List<Post> posts = new ArrayList<Post>();
			while(rs.next()) {
				Post post = new Post();
				Integer postId = rs.getInt("POST_ID");
				String postTitle = rs.getString("POST_TITLE");
				String postSortContent = rs.getString("POST_SORT_CONTENT");
				String postContent = rs.getString("POST_CONTENT");
				Date dateModified = rs.getDate("DATE_MODIFIED");
				post.setPostId(postId);
				post.setPostTitle(postTitle);
				post.setPostSortContent(postSortContent);
				post.setPostContent(postContent);
				post.setDateModified(dateModified);

				Integer postCategoryId = rs.getInt("POST_CATEGORY_ID");
				PostCategory postCategory = postCategoryDAO.findById(postCategoryId);
				post.setPostCategory(postCategory);

				posts.add(post);
			}
			return posts;
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

	@Override
	public void add(Post post) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append(
				"INSERT INTO posts(POST_TITLE, POST_SORT_CONTENT, POST_CONTENT, DATE_MODIFIED, POST_CATEGORY_ID) VALUES(?, ?, ?, ?, ?)").toString();
		Connection con = ConnectionUtil.getConnection();
		try {
			DatabaseHelper.executeUpdate(con, sql,
					new Object[] { post.getPostTitle(), post.getPostSortContent(),post.getPostContent(), post.getDateModified(), post.getPostCategory().getPostCategoryId() });
		} finally {
			ConnectionUtil.closeConnection(con);
		}
		
	}

	@Override
	public void update(Post post) throws ClassNotFoundException, SQLException {
		String sql = new StringBuilder().append("UPDATE posts SET POST_TITLE = ?, POST_SORT_CONTENT =?, POST_CONTENT = ?, DATE_MODIFIED =?, POST_CATEGORY_ID = ? WHERE POST_ID = ?").toString();
		Connection con = ConnectionUtil.getConnection();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {post.getPostTitle(), post.getPostSortContent(), post.getPostContent(), post.getDateModified(), post.getPostCategory().getPostCategoryId(), post.getPostId()});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
		
	}

	@Override
	public void delete(Integer postId) throws ClassNotFoundException,
			SQLException {
		Connection con = ConnectionUtil.getConnection();
		String sql = new StringBuilder().append("DELETE FROM post WHERE POST_ID = ?").toString();
		try {
			DatabaseHelper.executeUpdate(con, sql, new Object[] {postId});
		} finally {
			ConnectionUtil.closeConnection(con);
		}
		
	}

	@Override
	public Post findById(Integer id) throws ClassNotFoundException,
			SQLException {
		Connection con = ConnectionUtil.getConnection();
		try {
			postCategoryDAO = new PostCategoryDAOImpl();
			String sql = new StringBuilder().append("SELECT * FROM posts WHERE POST_ID = ?").toString();
			ResultSet rs = DatabaseHelper.executePreparedStatement(con, sql, new Object[] {id});
			List<Post> posts = new ArrayList<Post>();
			while(rs.next()) {
				Post post = new Post();
				Integer postId = rs.getInt("POST_ID");
				String postTitle = rs.getString("POST_TITLE");
				String postSortContent = rs.getString("POST_SORT_CONTENT");
				String postContent = rs.getString("POST_CONTENT");
				Date dateModified = rs.getDate("DATE_MODIFIED");
				Integer postCategoryId = rs.getInt("POST_CATEGORY_ID");
				
				post.setPostId(postId);
				post.setPostTitle(postTitle);
				post.setPostSortContent(postSortContent);
				post.setPostContent(postContent);
				post.setDateModified(dateModified);
				
				PostCategory postCategory = postCategoryDAO.findById(postCategoryId);
				post.setPostCategory(postCategory);
				
				posts.add(post);
			}
			if(posts.size() > 0) {
				return posts.get(0);
			} else {
				return null;
			}
		} finally {
			ConnectionUtil.closeConnection(con);
		}
	}

}
