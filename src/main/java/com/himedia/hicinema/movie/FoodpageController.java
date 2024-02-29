package com.himedia.hicinema.movie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/foodpage")
@Controller
public class FoodpageController {

	// http://localhost:8010/foodpage/snack_drink
	@GetMapping("/snack_drink")
	public String snack_drink() {

		return "user/foodpage";
	}

	// http://localhost:8010/foodpage/snack_drink_detail
	@GetMapping("/snack_drink_detail")
	public String foodPageDetail() {

		return "user/foodpagedetail";
	}
	
	

}
