package com.selenium.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	//@ResponseBody
	@RequestMapping("/app")
    public String Devika() {
    	
    	return "home";	
    	
    }

}
