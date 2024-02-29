package com.himedia.hicinema.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/customerservice")
//@Controller
//public class CustomerServiceController {
//
//	@GetMapping("/inquiry")
//	public String inquiry() {
//		
//		return "user/inquiry"; 
//	}
//}
@RequestMapping("/customerservice")
@Controller
public class CustomerServiceController {

	@GetMapping("/notice")
	public String notice() {
		
		return "user/notice"; 
	}
	
	@GetMapping("/FAQ")
	public String FAQ() {
		
		return "user/FAQ";
	}
}

