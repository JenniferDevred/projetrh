package com.example.demo.formation.projetrh.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.formation.projetrh.entities.Conges;
import com.example.demo.formation.projetrh.repositories.CongesRepository;

@Service
@Transactional
public class CongesServiceImpl implements CongesService {

	@Autowired
	CongesRepository congesRepository;
	
	@Override
	public void add(Conges conges) {
		// TODO Auto-generated method stub
		congesRepository.save(conges);
	}

	@Override
	public List<Conges> findAll() {
		// TODO Auto-generated method stub
		return (List<Conges>) congesRepository.findAll();
	}

	@Override
	public Conges update(Conges conges) {
		// TODO Auto-generated method stub
		System.out.println("conges:"+conges);
		congesRepository.save(conges);
		return conges;
	}

	@Override
	public void delete(Conges conges) {
		// TODO Auto-generated method stub
		congesRepository.delete(conges);
	}

	@Override
	public Conges findById(BigDecimal refConges) {
		// TODO Auto-generated method stub
		return congesRepository.findById(refConges).get();
	}

}
