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

import vn.taibt.bean.Book;
import vn.taibt.bean.Category;
import vn.taibt.bean.Book;
import vn.taibt.service.BookService;
import vn.taibt.service.BookServiceImpl;
import vn.taibt.service.CategoryService;
import vn.taibt.service.CategoryServiceImpl;
import vn.taibt.service.PostServiceImpl;

@Controller
public class BookController {
	
	BookService bookService;
	CategoryService categoryService;
	
	@RequestMapping(value="/admin/book/index", method = RequestMethod.GET)
	public String indexAdmin(HttpServletRequest request, HttpServletResponse response, Model model) {
		bookService = new BookServiceImpl();
		try {
			List<Book> books = bookService.findAll();
			model.addAttribute("books", books);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "book/indexAdmin";
	}
	
	@RequestMapping(value="/admin/book/add", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model) {
		categoryService = new CategoryServiceImpl();
		try {
			List<Category> categories = categoryService.findAll();
			model.addAttribute("categories", categories);
			model.addAttribute("book", new Book());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "book/add";
	}

	@RequestMapping(value="/admin/book/add", method = RequestMethod.POST)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute Book book) {
		bookService = new BookServiceImpl();
		try {
			bookService.add(book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/book/index.html";
	}

	@RequestMapping(value="/admin/book/delete/{id}", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		bookService = new BookServiceImpl();
		try {
			bookService.delete(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/book/index.html";
	}

	@RequestMapping(value="/admin/book/edit/{id}", method = RequestMethod.GET)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		bookService = new BookServiceImpl();
		categoryService = new CategoryServiceImpl();
		try {
			List<Category> categories = categoryService.findAll();
			model.addAttribute("categories", categories);
			Book book = bookService.findById(id);
			model.addAttribute("book", book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "book/edit";
	}
	
	@RequestMapping(value="/admin/book/edit/{id}", method = RequestMethod.POST)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id, @ModelAttribute Book book) {
		bookService = new BookServiceImpl();
		try {
			bookService.update(book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/book/index.html";
	}
	
	@RequestMapping(value="/book/{categoryName}", method = RequestMethod.GET)
	public String viewByPostCategoryName(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable String categoryName) {
		bookService = new BookServiceImpl();
		try {
			List<Book> books = bookService.findByCategoryName(categoryName);
			model.addAttribute("books", books);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "book/book_in_category";
	}
}
