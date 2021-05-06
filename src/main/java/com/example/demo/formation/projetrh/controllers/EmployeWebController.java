package com.example.demo.formation.projetrh.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.formation.projetrh.entities.Employeweb;
import com.example.demo.formation.projetrh.services.EmployewebService;

@Controller
@SessionScope
public class EmployeWebController {
	
	@Autowired
	EmployewebService employewebService;
	
	
	
	@RequestMapping("/addEmp")
	public ModelAndView ajouterEmp(@ModelAttribute Employeweb employeweb) {
		
		ModelAndView model = new ModelAndView("addEmp", "employeweb", employeweb);

		return model;
	}
	
	@RequestMapping("/saveEmp")
	public ModelAndView saveEmp(@ModelAttribute Employeweb employeweb) {

		System.out.println("Employeweb=" + employeweb);
		
		employewebService.add(employeweb);
		ModelAndView model = new ModelAndView("listEmp");
		List<Employeweb> listEmp = new ArrayList<>();
		listEmp=employewebService.findAll();
		
		model.addObject("employeweb", listEmp);

		return model;
	}
	
	@RequestMapping("/listEmp")
	public ModelAndView listEmp() {

		ModelAndView model = new ModelAndView("listEmp");
		List<Employeweb> listEmp = new ArrayList<>();
		listEmp=employewebService.findAll();
		
		model.addObject("emp", listEmp);

		return model;
	}
	
	@RequestMapping("/deleteEmp")
	public ModelAndView delete(BigDecimal code) {
		
		System.out.println("code="+code);
		Employeweb empW= employewebService.findById(code);
		employewebService.delete(empW);
		
		ModelAndView model=new ModelAndView("redirect:/listEmp");
		 return model;
		
	}
	
	@RequestMapping("modifyEmp")
	public ModelAndView modifyEmp(BigDecimal code) {
		
		System.out.println("code="+code);
		Employeweb empWeb = employewebService.findById(code);
	
		ModelAndView model = new ModelAndView("modifyEmp", "employe", empWeb);

		return model;
	}
	
	
	public ModelAndView updateEmp(@ModelAttribute Employeweb empWeb) {
		
		System.out.println("employe="+empWeb);
		employewebService.update(empWeb);
		
		ModelAndView model = new ModelAndView("redirect:/listEmp");

		return model;
	}
}
