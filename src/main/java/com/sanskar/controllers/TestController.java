package com.sanskar.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sanskar.dtos.StudentDTO;

@Controller
public class TestController {
	
	@GetMapping("/show_users")
	public ModelAndView showUsers() {
		
		ModelAndView mav = new ModelAndView();
		
		StudentDTO s1 = new StudentDTO("Mrinal",18, 'F', "Global");
		StudentDTO s2 = new StudentDTO("Prakhar", 4, 'M', "SRIT");
		StudentDTO s3 = new StudentDTO("Durgesh", 14, 'M', "JEC");
		StudentDTO s4 = new StudentDTO("Mugdha", 12, 'F', "GGCT");
		StudentDTO s5 = new StudentDTO("Praneeti", 9, 'F', "GGCT");
		StudentDTO s6 = new StudentDTO("Anushka", 8, 'F', "SRIT");
		
		mav.addObject("records",Arrays.asList(s1,s2,s3,s4,s5,s6));
		
		mav.setViewName("records.html");
		
		return mav;
	}
	
}
