package com.candyshop1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.candyshop1.entity.UserBean;
import com.candyshop1.service.CandyService;

@Controller
public class HomeController {
	
	@Autowired
	private CandyService theService;
	
	@RequestMapping("/")
	public String home(Model theModel) {
		UserBean user=new UserBean();
		theModel.addAttribute("reg",user);
		return "reg";
	}
	@RequestMapping("/storeuser")
	public String storeuser(@ModelAttribute("reg") UserBean user) {
		theService.addUser(user);
	
		return "redirect:/login";
	}
	@RequestMapping("/login")
	public String login(Model theModel) {
		UserBean login=new UserBean();
		theModel.addAttribute("login",login);
		return "login";
	}
	@RequestMapping("/forget")
	public String forget(Model theModel) {
		UserBean login=new UserBean();
		theModel.addAttribute("forget",login);
		return "forget";
	}
	@RequestMapping("/change")
	public String change(@ModelAttribute("forget") UserBean user) {
		System.out.println("csd"+user.getPhone());
		theService.updateUser(user);
		return "redirect:/login";
	}
	@RequestMapping("/checklogin")
	public String checklogin(@ModelAttribute("login") UserBean user) {
		return "redirect:/login";
	}
}
