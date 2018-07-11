package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/hello")
public class helloWord {
	@RequestMapping("/helloWord")
	public String helloWord(Model model) {
		System.out.println("hello  word! first");
		model.addAttribute("message","MVC世界！");
		return "/WEB-INF/jsp/helloWord.jsp";
	}
}
