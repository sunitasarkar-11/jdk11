package com.webproj.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("home")
	
	public String home(HttpServletRequest req) {
	//public void home() {
		HttpSession session = req.getSession();
		
		String name = req.getParameter("name");
		System.out.println("Hello Servlet name:: "+ name);
		//req.setAttribute("name", name);
		session.setAttribute("name", name);
		return "home";
		
	}

}
