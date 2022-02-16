package com.legatohealth.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/dateTime" , method = RequestMethod.GET)
	public ModelAndView home() {
		LocalDateTime localDateTime = LocalDateTime.now();
		ModelAndView mav = new ModelAndView("welcome","date",localDateTime);
		return mav;
	}

}
