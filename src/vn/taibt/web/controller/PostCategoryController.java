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

import vn.taibt.bean.PostCategory;
import vn.taibt.service.PostCategoryService;
import vn.taibt.service.PostCategoryServiceImpl;

@Controller
public class PostCategoryController {
private PostCategoryService postCategoryService;
	
	@RequestMapping(value="/post_category/index", method = RequestMethod.GET)
	public String indexSite(HttpServletRequest request, HttpServletResponse response, Model model) {
		postCategoryService = new PostCategoryServiceImpl();
		try {
			List<PostCategory> postCategories = postCategoryService.findAll();
			model.addAttribute("postCategories", postCategories);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "post_category/index";
	}
	
	@RequestMapping(value="/admin/post_category/index", method = RequestMethod.GET)
	public String indexAdmin(HttpServletRequest request, HttpServletResponse response, Model model) {
		postCategoryService = new PostCategoryServiceImpl();
		try {
			List<PostCategory> postCategories = postCategoryService.findAll();
			model.addAttribute("postCategories", postCategories);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "post_category/indexAdmin";
	}

	@RequestMapping(value="/admin/post_category/delete/{id}", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		postCategoryService = new PostCategoryServiceImpl();
		try {
			postCategoryService.delete(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/post_category/index.html";
	}

	@RequestMapping(value="/admin/post_category/edit/{id}", method = RequestMethod.GET)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		postCategoryService = new PostCategoryServiceImpl();
		try {
			PostCategory postCategory = postCategoryService.findById(id);
			model.addAttribute("postCategory", postCategory);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "post_category/edit";
	}
	
	@RequestMapping(value="/admin/post_category/edit/{id}", method = RequestMethod.POST)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id, @ModelAttribute PostCategory postCategory) {
		postCategoryService = new PostCategoryServiceImpl();
		try {
			postCategoryService.update(postCategory);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/post_category/index.html";
	}

	@RequestMapping(value="/admin/post_category/add", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("postCategory", new PostCategory());
		return "post_category/add";
	}

	@RequestMapping(value="/admin/post_category/add", method = RequestMethod.POST)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute PostCategory postCategory) {
		postCategoryService = new PostCategoryServiceImpl();
		try {
			postCategoryService.add(postCategory);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/post_category/index.html";
	}
}
