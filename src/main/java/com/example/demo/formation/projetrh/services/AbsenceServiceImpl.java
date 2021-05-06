package com.example.demo.formation.projetrh.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.formation.projetrh.entities.Absence;
import com.example.demo.formation.projetrh.repositories.AbsenceRepository;

@Service
@Transactional
public class AbsenceServiceImpl implements AbsenceService{

	@Autowired
	AbsenceRepository absenceRepository;
	
	@Override
	public void add(Absence abs) {
		// TODO Auto-generated method stub
		absenceRepository.save(abs);
	}

	@Override
	public List<Absence> findAll() {
		// TODO Auto-generated method stub
		return (List<Absence>) absenceRepository.findAll();
	}

	@Override
	public Absence update(Absence abs) {
		// TODO Auto-generated method stub
		System.out.println("abs:"+abs);
		absenceRepository.save(abs);
		return abs;
	}

	@Override
	public void delete(Absence abs) {
		// TODO Auto-generated method stub
		absenceRepository.delete(abs);
	}

	@Override
	public Absence findById(BigDecimal idabsence) {
		// TODO Auto-generated method stub
		return absenceRepository.findById(idabsence).get();
	}

}
