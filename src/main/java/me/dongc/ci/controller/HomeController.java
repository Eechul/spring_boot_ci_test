package me.dongc.ci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController extends BaseController {
	
	@GetMapping("")
	public String index() {
		return redirect("/home");
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}

}
