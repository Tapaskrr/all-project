package com.te.checkcheck.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.checkcheck.entity.MyEntity;
import com.te.checkcheck.services.MyServices;

@Controller
public class MyController {

	@Autowired
	private MyServices myservices;

	@GetMapping("/login")
	public String myLogin() {
		return "login";
	}

	@GetMapping("/register")
	public String myRegister() {
		return "register";
	}

	@PostMapping("/loginPage")
	public String submitLogin(MyEntity myEntity, Model map, HttpServletRequest request) {
		if (myEntity != null && myEntity.getEmpId().isEmpty() && myEntity.getEmpPwd().isEmpty()) {
			map.addAttribute("errmsg", "plz fill all fields");
		}

		else {
			MyEntity authenticate = myservices.authenticate(myEntity);
			if (authenticate != null) {
				map.addAttribute("msg", "login successfull" + authenticate.getEmpId());
			} else {
				map.addAttribute("errmsg", "filled details can not be accepted");
			}

		}

		HttpSession session = request.getSession();
		session.setAttribute("loggedIn", myEntity);
		return "loginResponse";
	}

	@PostMapping("/a/registerPage")
	public String submitRegister(MyEntity myEntity, Model map) {
		if (myEntity != null && myEntity.getEmpId().isEmpty() || myEntity.getEmpName().isEmpty()
				|| myEntity.getEmpEmailId().isEmpty() || myEntity.getEmpPwd().isEmpty())
			map.addAttribute("errmsg", "plz fill all fields");
		else {
			if (myservices.myServices(myEntity)) {
				map.addAttribute("msg", "registration successfull");
			} else {
				map.addAttribute("errmsg", "filled details can not be accepted");
			}
		}
		return "registrationResponse";
	}

	@GetMapping("./logout")
	public String logout(Model map,HttpSession session) {
		session.invalidate();
		map.addAttribute("msg", "logout successfull");
		return "login";
	}

}
