package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.PostCategory;
import vn.taibt.db.dao.PostCategoryDAO;
import vn.taibt.db.dao.PostCategoryDAOImpl;

public class PostCategoryServiceImpl implements PostCategoryService {
	private PostCategoryDAO postCategoryDAO;

	@Override
	public List<PostCategory> findAll() throws ClassNotFoundException,
			SQLException {
		postCategoryDAO = new PostCategoryDAOImpl();
		List<PostCategory> categories = postCategoryDAO.findAll();
		return categories;
	}

	@Override
	public void add(PostCategory postCategory) throws ClassNotFoundException,
			SQLException {
		postCategoryDAO = new PostCategoryDAOImpl();
		postCategoryDAO.add(postCategory);

	}

	@Override
	public void update(PostCategory postCategory)
			throws ClassNotFoundException, SQLException {
		postCategoryDAO = new PostCategoryDAOImpl();
		postCategoryDAO.update(postCategory);

	}

	@Override
	public void delete(Integer postCategoryId) throws ClassNotFoundException,
			SQLException {
		postCategoryDAO = new PostCategoryDAOImpl();
		postCategoryDAO.delete(postCategoryId);

	}

	@Override
	public PostCategory findById(Integer postCategoryId)
			throws ClassNotFoundException, SQLException {
		postCategoryDAO = new PostCategoryDAOImpl();
		PostCategory postCategory = postCategoryDAO.findById(postCategoryId);
		return postCategory;
	}

	@Override
	public List<PostCategory> findByPostCategoryName(
			String postCategorySearchName) throws ClassNotFoundException,
			SQLException {
		postCategoryDAO = new PostCategoryDAOImpl();
		List<PostCategory> categories = postCategoryDAO.findByPostCategoryName(postCategorySearchName);
		return categories;
	}

}
