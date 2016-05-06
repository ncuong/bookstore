package vn.taibt.db.dao;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Category;

public interface CategoryDAO {
	public List<Category> findAll() throws ClassNotFoundException, SQLException;
}
