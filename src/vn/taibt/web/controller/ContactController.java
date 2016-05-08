package vn.taibt.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public String indexAdmin(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "contact";
	}
}
