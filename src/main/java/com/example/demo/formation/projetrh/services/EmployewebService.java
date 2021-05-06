package com.example.demo.formation.projetrh.services;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.formation.projetrh.entities.Employeweb;

public interface EmployewebService {
	
	public void add(Employeweb empWebServ);

	public List<Employeweb> findAll();

	public Employeweb update(Employeweb empWebServ);

	public void delete(Employeweb empWebServ);

	public Employeweb findById(BigDecimal code );


}
