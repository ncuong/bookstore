package vn.taibt.db.dao;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Post;

public interface PostDAO {
	public List<Post> findAll() throws ClassNotFoundException, SQLException;
	public void add(Post post) throws ClassNotFoundException, SQLException;
	public void update(Post post) throws ClassNotFoundException, SQLException;
	public void delete(Integer postId) throws ClassNotFoundException, SQLException;
	public Post findById(Integer postId) throws ClassNotFoundException, SQLException;
}
