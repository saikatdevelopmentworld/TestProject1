package com.saikat.thymeleaf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {
	@RequestMapping("/view")
	public String view(HttpServletRequest req, Model model) {
		//create first variable
		model.addAttribute("variable1", "Welcome");
		//create second variable
		model.addAttribute("variable2", "To Thymeleaf");
		
		//Local variables
		
		String[] variable3 = new String[] {"java", "python" , "C#"};
		model.addAttribute("courses", variable3);
		
		return "index";
	}


}
