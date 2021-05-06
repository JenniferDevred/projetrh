package com.example.demo.formation.projetrh.services;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.formation.projetrh.entities.Sanction;

public interface SanctionService {
	
	public void add(Sanction s);

	public List<Sanction> findAll();

	public Sanction update(Sanction s);

	public void delete(Sanction s);

	public Sanction findById(BigDecimal refSanction );

}
