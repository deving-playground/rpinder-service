package net.devpg.rpinder.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("message", "hello-world");
		return "main";
	}
}
