package stanleyjuliomaciel.web.controllers;

import org.springframework.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping
	public String home() {
		return "/home";
	}

}
