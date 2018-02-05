package com.dataload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dataload.modal.Testspringform1;

@Controller
public class Testspringform {
	@RequestMapping("/testspringform")
	public ModelAndView test(Model model) {
		Testspringform1 form =new Testspringform1();
		form.setFirstname("Arun");
		form.setLastname("P");
		form.setEmail("a@gmail.com");
		model.addAttribute("student",form);
		return new ModelAndView("Testspringform");
	}
	@RequestMapping("/testspringform1")
	public ModelAndView testfromform(@ModelAttribute("student") Testspringform1 form) {
		System.out.println(form.getFirstname()+" "+form.getLastname());
		return new ModelAndView("Testspringform");
	}

}
