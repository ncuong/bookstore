package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Post;
import vn.taibt.db.dao.PostDAO;
import vn.taibt.db.dao.PostDAOImpl;

public class PostServiceImpl implements PostService {
	
	private PostDAO postDAO;

	@Override
	public List<Post> findAll() throws ClassNotFoundException, SQLException {
		postDAO = new PostDAOImpl();
		List<Post> posts = postDAO.findAll();
		return posts;
	}

	@Override
	public void add(Post post) throws ClassNotFoundException, SQLException {
		postDAO = new PostDAOImpl();
		postDAO.add(post);

	}

	@Override
	public void update(Post post) throws ClassNotFoundException, SQLException {
		postDAO = new PostDAOImpl();
		postDAO.update(post);

	}

	@Override
	public void delete(Integer postId) throws ClassNotFoundException,
			SQLException {
		postDAO = new PostDAOImpl();
		postDAO.delete(postId);

	}

	@Override
	public Post findById(Integer postId) throws ClassNotFoundException,
			SQLException {
		postDAO = new PostDAOImpl();
		Post post = postDAO.findById(postId);
		return post;
	}

	@Override
	public List<Post> findByPostCategoryName(String postCategorySearchName)
			throws ClassNotFoundException, SQLException {
		postDAO = new PostDAOImpl();
		List<Post> posts = postDAO.findByPostCategoryName(postCategorySearchName);
		return posts;
	}

}
