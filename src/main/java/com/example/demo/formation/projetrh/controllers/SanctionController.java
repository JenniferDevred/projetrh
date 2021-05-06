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
import com.example.demo.formation.projetrh.entities.Sanction;
import com.example.demo.formation.projetrh.services.SanctionService;

@Controller
@SessionScope
public class SanctionController {
	
	@Autowired
	SanctionService sanctionService;
	
	Sanction sc;
	
	Employeweb empWeb;
	
	
	@RequestMapping("/addDis")
	public ModelAndView addDis(@ModelAttribute Sanction sc) {
		
		ModelAndView model = new ModelAndView("addDis", "employeweb", sc);

		return model;
	}
	
	@RequestMapping("/saveDis")
	public ModelAndView saveDis(@ModelAttribute Sanction sc) {

		System.out.println("Sanction=" + sc );
		
		sanctionService.add(sc);
		ModelAndView model = new ModelAndView("listDis");
		List<Sanction> listDis = new ArrayList<>();
		listDis=sanctionService.findAll();
		
		model.addObject("listDis", listDis);

		return model;
	}
	
	@RequestMapping("/listDis")
	public ModelAndView listDis() {

		ModelAndView model = new ModelAndView("listDis");
		List<Sanction> listDis = new ArrayList<>();
		listDis=sanctionService.findAll();
		
		model.addObject("sc", listDis);

		return model;
	}
	
	@RequestMapping("/deleteDis")
	public ModelAndView deleteDis(BigDecimal ref) {
		
		System.out.println("code="+ref);
		Sanction sc = sanctionService.findById(ref);
		sanctionService.delete(sc);
		
		ModelAndView model=new ModelAndView("redirect:/listDis");
		 return model;
		
	}
	
	@RequestMapping("edit")
	public ModelAndView modifyDis(BigDecimal ref) {
		
		System.out.println("ref="+ref);
		Sanction sc = sanctionService.findById(ref);
	
		ModelAndView model = new ModelAndView("updateDis", "sanction", sc);

		return model;
	}
	
	public ModelAndView updateDis(@ModelAttribute Sanction sc) {
		
		System.out.println("employe="+sc);
		sanctionService.update(sc);
		
		ModelAndView model = new ModelAndView("redirect:/listDis");

		return model;
	}

}
