package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Post;

public interface PostService {
	public List<Post> findAll() throws ClassNotFoundException, SQLException;
	public void add(Post post) throws ClassNotFoundException, SQLException;
	public void update(Post post) throws ClassNotFoundException, SQLException;
	public void delete(Integer postId) throws ClassNotFoundException, SQLException;
	public Post findById(Integer postId) throws ClassNotFoundException, SQLException;
	public List<Post> findByPostCategoryName(String postCategorySearchName) throws ClassNotFoundException, SQLException;
}
