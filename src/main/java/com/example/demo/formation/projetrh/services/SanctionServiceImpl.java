package com.example.demo.formation.projetrh.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.formation.projetrh.entities.Employeweb;
import com.example.demo.formation.projetrh.entities.Sanction;
import com.example.demo.formation.projetrh.repositories.SanctionRepository;

@Service
@Transactional
public class SanctionServiceImpl implements SanctionService{

	@Autowired
	SanctionRepository sanctionRepository;
	@Override
	public void add(Sanction s) {
		// TODO Auto-generated method stub
		sanctionRepository.save(s);
	}

	@Override
	public List<Sanction> findAll() {
		// TODO Auto-generated method stub
		return (List<Sanction>) sanctionRepository.findAll();
	}

	@Override
	public Sanction update(Sanction s) {
		// TODO Auto-generated method stub
		System.out.println("Sanction:"+s);
		sanctionRepository.save(s);
		return s;
	}

	@Override
	public void delete(Sanction s) {
		// TODO Auto-generated method stub
		sanctionRepository.delete(s);
	}

	@Override
	public Sanction findById(BigDecimal refSanction) {
		// TODO Auto-generated method stub
		return sanctionRepository.findById(refSanction).get();
	}

}
