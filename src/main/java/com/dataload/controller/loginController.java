package com.dataload.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dataload.modal.RegisterNew;
import com.dataload.service.RegisterService;


@Controller
public class loginController {
	@Autowired
	RegisterService service1;
	
	/*@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}*/
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("redirect:/testspringform");
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("CustomLogin");
	}
	
	@RequestMapping("/userPage")
	public ModelAndView view() {
		return new ModelAndView("registration");
	}
	@RequestMapping("/qaPage")
	public ModelAndView viewqa() {
		return new ModelAndView("qaPage");
	}
	@RequestMapping("/adminPage")
	public ModelAndView viewadmin() {
		return new ModelAndView("adminPage");
	}
	@RequestMapping("/accessdenied")
	public ModelAndView accessdenied() {
		return new ModelAndView("accessdenied");
	}
	@RequestMapping(value="/register" )
	public ModelAndView register(@RequestParam("firstname") String firstname,
			@RequestParam("middlename") String middlename,
			@RequestParam("lastname") String lastname,
			@RequestParam("email") String email,
			@RequestParam("phonenumber") String phoneno,HttpSession session) {
		String message = "";
		try {
			RegisterNew reg=new RegisterNew(firstname, middlename, lastname, email, phoneno);
			boolean status = service1.register(reg);
			if(status) {
//				message = "Saved details successfully.";
				session.setAttribute("success", "success");
			}				
		} catch (Exception e) {
			System.out.println("Exception in RegisterServiceimpl.register"+e.getMessage());
			e.printStackTrace();
		}
		return new ModelAndView("registration");
	}
	
	@RequestMapping(value="/qaregister" )
	public ModelAndView qaregister(@RequestParam("firstname") String firstname,
			@RequestParam("middlename") String middlename,
			@RequestParam("lastname") String lastname,
			@RequestParam("email") String email,
			@RequestParam("phonenumber") String phoneno,HttpSession session) {
		String message = "";
		try {
			RegisterNew reg=new RegisterNew(firstname, middlename, lastname, email, phoneno);
			boolean status = service1.register(reg);
			if(status) {
//				message = "Saved details successfully.";
				session.setAttribute("success", "success");
			}				
		} catch (Exception e) {
			System.out.println("Exception in RegisterServiceimpl.register"+e.getMessage());
			e.printStackTrace();
		}
		return new ModelAndView("qaPage");
	}
	
	@RequestMapping(value="/adminregister" )
	public ModelAndView adminregister(@RequestParam("firstname") String firstname,
			@RequestParam("middlename") String middlename,
			@RequestParam("lastname") String lastname,
			@RequestParam("email") String email,
			@RequestParam("phonenumber") String phoneno,HttpSession session) {
		String message = "";
		try {
			RegisterNew reg=new RegisterNew(firstname, middlename, lastname, email, phoneno);
			boolean status = service1.register(reg);
			if(status) {
//				message = "Saved details successfully.";
				session.setAttribute("success", "success");
			}				
		} catch (Exception e) {
			System.out.println("Exception in RegisterServiceimpl.register"+e.getMessage());
			e.printStackTrace();
		}
		return new ModelAndView("adminPage");
	}
	
	@RequestMapping(value="/pwdEncode" )
	public ModelAndView passwordGenerator(@RequestParam("userName") String username,
			HttpSession session) {
		String message = "";
		try {
			int i = 0;
			while (i < 10) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(username);

			System.out.println(hashedPassword);
			i++;
			}
			/*if(hashedPassword !=null) {
				session.setAttribute("success", "success");
			}*/				
		} catch (Exception e) {
			System.out.println("Exception in RegisterServiceimpl.register"+e.getMessage());
			e.printStackTrace();
		}
		return new ModelAndView("index");
	}
	
	
}
