package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/add")
	public String add() {
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

}
