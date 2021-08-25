package com.human.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
		
//	@RequestMapping(value="/contactus",method=RequestMethod.GET)
//	public String method1(Model model) {
//		model.addAttribute("company", "CSY Solution");
//		model.addAttribute("mobile","1234-5678");
//		model.addAttribute("address","아산시");
//		return "contact";
//	}
	
	//Model And View 방식.
	@RequestMapping("/contactus")
	public ModelAndView method2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("mobile","1234-5678");
		mav.addObject("company","CSY Tech");
		mav.addObject("address","Asan");
		mav.setViewName("contact");
		return mav;
	}
}
