package com.te.springmvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvcdemo.pojo.Employee;

@Controller
public class SpringMvcController {

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String getLoginForm() {
		return "homePage";
	}

	@RequestMapping(path = "/login1", method = RequestMethod.GET)
	public String firstWayofGettingFormData(HttpServletRequest httpServletRequest, Model map) {
		String parameter = httpServletRequest.getParameter("user1");
		map.addAttribute("name1", parameter);
		return "welcome";
	}

	// input type name must be same as parameter
	@PostMapping("/login2")
	public String secondWayofGettingFormData(Model map, @RequestParam String user1) {

		map.addAttribute("name1", user1);
		return "welcome";
	}

	// input type name must be same as parameter
	@PostMapping("/login3")
	public String thirdWayofGettingFormData(Model map, String user1) {
		map.addAttribute("name1", user1);
		return "welcome";
	}

	// class fields name must be same as input type
	@PostMapping("/login4")
	public String fourthWayofGettingFormData(Model map, Employee emp) {
		map.addAttribute("name1", emp);
		return "welcome";
	}

}
