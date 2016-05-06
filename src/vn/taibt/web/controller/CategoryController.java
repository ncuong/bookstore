package vn.taibt.web.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.taibt.bean.Category;
import vn.taibt.service.CategoryService;
import vn.taibt.service.CategoryServiceImpl;

@Controller
public class CategoryController {
	private CategoryService categoryService;
	
	@RequestMapping(value="/category/index", method = RequestMethod.GET)
	public String indexSite(HttpServletRequest request, HttpServletResponse response, Model model) {
		categoryService = new CategoryServiceImpl();
		try {
			List<Category> categories = categoryService.findAll();
			model.addAttribute("categories", categories);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "site/category/index";
	}
	
	@RequestMapping(value="/admin/category/index", method = RequestMethod.GET)
	public String indexAdmin(HttpServletRequest request, HttpServletResponse response, Model model) {
		categoryService = new CategoryServiceImpl();
		try {
			List<Category> categories = categoryService.findAll();
			model.addAttribute("categories", categories);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "site/category/indexAdmin";
	}

	@RequestMapping(value="/admin/category/delete/{id}", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		categoryService = new CategoryServiceImpl();
		try {
			categoryService.delete(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "admin/category/index.html";
	}
}
