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
import org.springframework.web.servlet.ModelAndView;

import vn.taibt.bean.User;
import vn.taibt.bean.Role;
import vn.taibt.service.RoleServiceImpl;
import vn.taibt.service.UserServiceImpl;
import vn.taibt.service.RoleService;
import vn.taibt.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	private RoleService roleService;
	
	@RequestMapping("/login")
	public ModelAndView login(){
		ModelAndView model = new ModelAndView("user/login");
		return model;
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String indexSite(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "redirect:/j_spring_security_logout";
	}
	
	@RequestMapping(value="/admin/user/index", method = RequestMethod.GET)
	public String indexAdmin(HttpServletRequest request, HttpServletResponse response, Model model) {
		userService = new UserServiceImpl();
		try {
			List<User> users = userService.findAll();
			model.addAttribute("users", users);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "user/indexAdmin";
	}
	
	@RequestMapping(value="/admin/user/add", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model) {
		roleService = new RoleServiceImpl();
		try {
			List<Role> roles = roleService.findAll();
			model.addAttribute("roles", roles);
			model.addAttribute("user", new User());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "user/add";
	}

	@RequestMapping(value="/admin/user/add", method = RequestMethod.POST)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute User user) {
		userService = new UserServiceImpl();
		try {
			userService.add(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/user/index.html";
	}

	@RequestMapping(value="/admin/user/delete/{id}", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		userService = new UserServiceImpl();
		try {
			userService.delete(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/user/index.html";
	}

	@RequestMapping(value="/admin/user/edit/{id}", method = RequestMethod.GET)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		userService = new UserServiceImpl();
		roleService = new RoleServiceImpl();
		try {
			List<Role> roles = roleService.findAll();
			model.addAttribute("roles", roles);
			User user = userService.findById(id);
			model.addAttribute("user", user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "user/edit";
	}
	
	@RequestMapping(value="/admin/user/edit/{id}", method = RequestMethod.POST)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id, @ModelAttribute User user) {
		userService = new UserServiceImpl();
		try {
			userService.update(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/user/index.html";
	}
}
