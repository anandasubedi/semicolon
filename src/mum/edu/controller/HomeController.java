package mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String sayHello(Model model){
		model.addAttribute("greeting","Welcome to Semicolon App");
		return "home";
	}
}
