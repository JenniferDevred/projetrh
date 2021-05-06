package com.example.demo.formation.projetrh.services;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.formation.projetrh.entities.Absence;

public interface AbsenceService {
	
	public void add(Absence abs);

	public List<Absence> findAll();

	public Absence update(Absence abs);

	public void delete(Absence abs);

	public Absence findById(BigDecimal idabsence);

}
