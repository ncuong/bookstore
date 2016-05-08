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

import vn.taibt.bean.Post;
import vn.taibt.bean.PostCategory;
import vn.taibt.bean.Post;
import vn.taibt.bean.PostCategory;
import vn.taibt.service.BookServiceImpl;
import vn.taibt.service.CategoryServiceImpl;
import vn.taibt.service.PostCategoryService;
import vn.taibt.service.PostCategoryServiceImpl;
import vn.taibt.service.PostService;
import vn.taibt.service.PostServiceImpl;

@Controller
public class PostController {
	PostService postService;
	PostCategoryService postCategoryService;
	
	@RequestMapping(value="/admin/post/index", method = RequestMethod.GET)
	public String indexAdmin(HttpServletRequest request, HttpServletResponse response, Model model) {
		postService = new PostServiceImpl();
		try {
			List<Post> posts = postService.findAll();
			model.addAttribute("posts", posts);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "post/indexAdmin";
	}
	
	@RequestMapping(value="/admin/post/add", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model) {
		postCategoryService = new PostCategoryServiceImpl();
		try {
			List<PostCategory> postCategories = postCategoryService.findAll();
			model.addAttribute("postCategories", postCategories);
			model.addAttribute("post", new Post());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "post/add";
	}

	@RequestMapping(value="/admin/post/add", method = RequestMethod.POST)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute Post post) {
		postService = new PostServiceImpl();
		try {
			postService.add(post);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/post/index.html";
	}

	@RequestMapping(value="/admin/post/delete/{id}", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		postService = new PostServiceImpl();
		try {
			postService.delete(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/post/index.html";
	}

	@RequestMapping(value="/admin/post/edit/{id}", method = RequestMethod.GET)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		postService = new PostServiceImpl();
		postCategoryService = new PostCategoryServiceImpl();
		try {
			List<PostCategory> postCategories = postCategoryService.findAll();
			model.addAttribute("postCategories", postCategories);
			Post post = postService.findById(id);
			model.addAttribute("post", post);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "post/edit";
	}
	
	@RequestMapping(value="/admin/post/edit/{id}", method = RequestMethod.POST)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id, @ModelAttribute Post post) {
		postService = new PostServiceImpl();
		try {
			postService.update(post);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/post/index.html";
	}
}
