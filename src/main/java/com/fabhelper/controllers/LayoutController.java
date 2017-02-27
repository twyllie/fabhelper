package com.fabhelper.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LayoutController {

	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String landingPage(){
		return "landingPage";
	}
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String landingPageProc(HttpServletRequest request, Model model){
		return "landingPage";
	}
}
