package vn.taibt.web.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sun.org.apache.bcel.internal.classfile.Field;

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
	private static final String BASE_UPLOAD_FOLDER = "uploads";
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
	public String add(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute Book book, @RequestParam("file") MultipartFile file) {
		bookService = new BookServiceImpl();
		String fileName = null;
		String imagePath = null;
		try {
			if(!file.isEmpty()){
				ServletContext context = request.getSession().getServletContext();
				String uploadRootPath = context.getRealPath(BASE_UPLOAD_FOLDER);
				File uploadRootDir = new File(uploadRootPath);
				if(!uploadRootDir.exists()) {
					uploadRootDir.mkdir();
				}
				fileName = file.getOriginalFilename();
				byte[] bytes = file.getBytes();
				File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + fileName);
				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(serverFile));
				bufferedOutputStream.write(bytes);
				bufferedOutputStream.close();
				imagePath = BASE_UPLOAD_FOLDER+"/"+fileName;
			}
			book.setImagePath(imagePath);
			bookService.add(book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id, @ModelAttribute Book book, @RequestParam("file") MultipartFile file) {
		bookService = new BookServiceImpl();
		String fileName = null;
		String imagePath = null;
		try {
			if(!file.isEmpty()){
				ServletContext context = request.getSession().getServletContext();
				String uploadRootPath = context.getRealPath(BASE_UPLOAD_FOLDER);
				File uploadRootDir = new File(uploadRootPath);
				if(!uploadRootDir.exists()) {
					uploadRootDir.mkdir();
				}
				fileName = file.getOriginalFilename();
				byte[] bytes = file.getBytes();
				File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + fileName);
				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(serverFile));
				bufferedOutputStream.write(bytes);
				bufferedOutputStream.close();
				imagePath = BASE_UPLOAD_FOLDER+"/"+fileName;
			}
			book.setImagePath(imagePath);
			bookService.update(book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
