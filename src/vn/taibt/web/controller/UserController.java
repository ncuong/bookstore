package vn.taibt.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping("/login")
	public ModelAndView login(){
		ModelAndView model = new ModelAndView("user/login");
		return model;
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String indexSite(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "redirect:/j_spring_security_logout";
	}
}
