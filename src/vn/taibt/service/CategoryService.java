package vn.taibt.service;

import java.sql.SQLException;
import java.util.List;

import vn.taibt.bean.Category;

public interface CategoryService {
	public List<Category> findAll() throws ClassNotFoundException, SQLException;
}
