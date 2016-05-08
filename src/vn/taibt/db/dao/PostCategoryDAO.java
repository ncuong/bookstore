package vn.taibt.db.dao;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.PostCategory;

public interface PostCategoryDAO {
	public List<PostCategory> findAll() throws ClassNotFoundException, SQLException;
	public void add(PostCategory postCategory) throws ClassNotFoundException, SQLException;
	public void update(PostCategory postCategory) throws ClassNotFoundException, SQLException;
	public void delete(Integer postCategoryId) throws ClassNotFoundException, SQLException;
	public PostCategory findById(Integer postCategoryId) throws ClassNotFoundException, SQLException;
	public List<PostCategory> findByPostCategoryName(String postCategorySearchName) throws ClassNotFoundException, SQLException;
}
