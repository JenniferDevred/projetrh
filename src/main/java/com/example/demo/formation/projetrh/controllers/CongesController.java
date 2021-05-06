package com.example.demo.formation.projetrh.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.formation.projetrh.entities.Conges;
import com.example.demo.formation.projetrh.services.CongesService;

@Controller
@SessionScope
public class CongesController {
	
	@Autowired
	CongesService congesService;
	
	
	@RequestMapping("/addHol")
	public ModelAndView addHol(@ModelAttribute Conges conges) {
		
		ModelAndView model = new ModelAndView("addHol", "conges", conges);

		return model;
	}
	
	@RequestMapping("/saveHol")
	public ModelAndView saveHol(@ModelAttribute Conges conges) {

		System.out.println("Conges=" + conges );
		
		congesService.add(conges);
		ModelAndView model = new ModelAndView("listHol");
		List<Conges> listHol = new ArrayList<>();
		listHol=congesService.findAll();
		
		model.addObject("listhol", listHol);

		return model;
	}
	
	@RequestMapping("/listHol")
	public ModelAndView listHol() {

		ModelAndView model = new ModelAndView("listHol");
		List<Conges> listHol = new ArrayList<>();
		listHol=congesService.findAll();
		
		model.addObject("cg", listHol);

		return model;
	}
	
	@RequestMapping("/deleteHol")
	public ModelAndView deleteHol(BigDecimal ref) {
		
		System.out.println("code="+ref);
		Conges cg = congesService.findById(ref);
		congesService.delete(cg);
		
		ModelAndView model=new ModelAndView("redirect:/listHol");
		 return model;
		
	}
	
	@RequestMapping("modifyHol")
	public ModelAndView modifyHol(BigDecimal ref) {
		
		System.out.println("ref="+ref);
		Conges cg = congesService.findById(ref);
	
		ModelAndView model = new ModelAndView("modifyHol", "conges", cg);

		return model;
	}
	@RequestMapping("update")
	public ModelAndView updateHol(@ModelAttribute Conges conges) {
		
		System.out.println("employe="+conges);
		congesService.update(conges);
		
		ModelAndView model = new ModelAndView("redirect:/listHol");

		return model;
	}

}
