package vn.taibt.web.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		return "category/index";
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
		return "category/indexAdmin";
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
		return "redirect:/admin/category/index.html";
	}

	@RequestMapping(value="/admin/category/edit/{id}", method = RequestMethod.GET)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		categoryService = new CategoryServiceImpl();
		try {
			Category category = categoryService.findById(id);
			model.addAttribute("category", category);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "category/edit";
	}
	
	@RequestMapping(value="/admin/category/edit/{id}", method = RequestMethod.POST)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id, @ModelAttribute Category category) {
		categoryService = new CategoryServiceImpl();
		try {
			categoryService.update(category);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/category/index.html";
	}

	@RequestMapping(value="/admin/category/add")
	public String add(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "category/add";
	}

	@RequestMapping(value="/admin/category/add")
	public String add(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute Category category) {
		categoryService = new CategoryServiceImpl();

		return "redirect:/admin/category/index.html";
	}
}
