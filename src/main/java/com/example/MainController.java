package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Service.User;

@Controller
public class MainController {

	@RequestMapping("/add")
	public String add() {
		
		System.out.println("Redirected to Addition Page");
		return "add";
	}

	@RequestMapping("/addAction")
	public ModelAndView addAction(@RequestParam("value1") int i, @RequestParam("value2") int j) {

//		int i = Integer.parseInt(request.getParameter("value1"));
//		int j = Integer.parseInt(request.getParameter("value2"));

		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("answer", i + j);

		return mv;

	}
	
	@RequestMapping("/login")
	public String login() {
		
		System.out.println("Redirected to Login page");
		
		return "login";
	}
	
	@RequestMapping("/loginAction")
	public ModelAndView performLogin(ModelAndView mv, HttpServletRequest request) {
		User user = new User();
		
		mv.setViewName("login");
		if (request.getParameter("userName").equals(user.getUserName())
				&& request.getParameter("password").equals(user.getPassword()))
			mv.addObject("Message", "Successfully Logged In");
		else
			mv.addObject("Message", "Login Failed");
		
		return mv;
	}

}
