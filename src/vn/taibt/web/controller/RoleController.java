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

import vn.taibt.bean.Role;
import vn.taibt.bean.Role;
import vn.taibt.service.CategoryService;
import vn.taibt.service.CategoryServiceImpl;
import vn.taibt.service.RoleService;
import vn.taibt.service.RoleServiceImpl;

@Controller
public class RoleController {
private RoleService roleService;
	
	@RequestMapping(value="/admin/role/index", method = RequestMethod.GET)
	public String indexAdmin(HttpServletRequest request, HttpServletResponse response, Model model) {
		roleService = new RoleServiceImpl();
		try {
			List<Role> roles = roleService.findAll();
			model.addAttribute("roles", roles);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "role/indexAdmin";
	}

	@RequestMapping(value="/admin/role/delete/{id}", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		roleService = new RoleServiceImpl();
		try {
			roleService.delete(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/role/index.html";
	}

	@RequestMapping(value="/admin/role/edit/{id}", method = RequestMethod.GET)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id) {
		roleService = new RoleServiceImpl();
		try {
			Role role = roleService.findById(id);
			model.addAttribute("role", role);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "role/edit";
	}
	
	@RequestMapping(value="/admin/role/edit/{id}", method = RequestMethod.POST)
	public String edit(HttpServletRequest request, HttpServletResponse response, Model model, @PathVariable Integer id, @ModelAttribute Role role) {
		roleService = new RoleServiceImpl();
		try {
			roleService.update(role);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/role/index.html";
	}

	@RequestMapping(value="/admin/role/add", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("role", new Role());
		return "role/add";
	}

	@RequestMapping(value="/admin/role/add", method = RequestMethod.POST)
	public String add(HttpServletRequest request, HttpServletResponse response, Model model, @ModelAttribute Role role) {
		roleService = new RoleServiceImpl();
		try {
			roleService.add(role);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/role/index.html";
	}

}
