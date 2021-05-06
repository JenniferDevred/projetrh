package com.example.demo.formation.projetrh.services;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.formation.projetrh.entities.Conges;

public interface CongesService {

	public void add(Conges conges);

	public List<Conges> findAll();

	public Conges update(Conges conges);

	public void delete(Conges conges);

	public Conges findById(BigDecimal refConges);

}
