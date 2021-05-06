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

import com.example.demo.formation.projetrh.entities.Absence;
import com.example.demo.formation.projetrh.entities.Employeweb;
import com.example.demo.formation.projetrh.services.AbsenceService;

@Controller
@SessionScope
public class AbsenceController {

	@Autowired
	AbsenceService absenceService;
	
	Employeweb empWeb;
	
	Absence abs = new Absence();
	
	@RequestMapping("/")
	public String accueil() {
		System.out.println("controller spring boot");
		return "accueil";
	}
	
	@RequestMapping("/addAbs")
	public ModelAndView ajouterAbs() {
		
		ModelAndView model = new ModelAndView("addAbs", "absence", abs);

		return model;
	}
	
	@RequestMapping("/saveAbs")
	public ModelAndView saveAbs(@ModelAttribute Absence absence) {

		System.out.println("Absence=" + abs);
		
		absenceService.add(absence);
		ModelAndView model = new ModelAndView("listAbs");
		List<Absence> listAbs = new ArrayList<>();
		listAbs=absenceService.findAll();
		
		model.addObject("abs", listAbs);

		return model;
	}
	
	@RequestMapping("/listAbs")
	public ModelAndView listAbs() {

		ModelAndView model = new ModelAndView("listAbs");
		List<Absence> listAbs = new ArrayList<>();
		listAbs=absenceService.findAll();
		
		model.addObject("abs", listAbs);

		return model;
	}
	
	@RequestMapping("/deleteAbs")
	public ModelAndView deleteAbs(BigDecimal id) {
		
		System.out.println("id="+id);
		Absence abs= absenceService.findById(id);
		absenceService.delete(abs);
		
		ModelAndView model=new ModelAndView("redirect:/listAbs");
		 return model;
		
	}
	
	@RequestMapping("/editAbs")
	public ModelAndView editAbs(BigDecimal id) {
		
		System.out.println("id="+id);
		Absence abs = absenceService.findById(id);
	
		ModelAndView model = new ModelAndView("editAbs", "abs", abs);

		return model;
	}
	
	
	public ModelAndView updateAbs(@ModelAttribute Absence abs) {
		
		System.out.println("employe="+abs);
		absenceService.update(abs);
		
		ModelAndView model = new ModelAndView("redirect:/listAbs");

		return model;
	}
}
