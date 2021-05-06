package com.example.demo.formation.projetrh.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.formation.projetrh.entities.Employeweb;
import com.example.demo.formation.projetrh.repositories.EmployewebRepository;

@Service
@Transactional
public class EmployeWebServiceImpl implements EmployewebService{

	@Autowired
	EmployewebRepository employewebRepository;
	
	@Override
	public void add(Employeweb empWebServ) {
		// TODO Auto-generated method stub
		employewebRepository.save(empWebServ);
	}

	@Override
	public List<Employeweb> findAll() {
		// TODO Auto-generated method stub
		return (List<Employeweb>) employewebRepository.findAll();
	}



	@Override
	public void delete(Employeweb empWebServ) {
		// TODO Auto-generated method stub
		employewebRepository.delete(empWebServ);
	}

	@Override
	public Employeweb findById(BigDecimal code) {
		// TODO Auto-generated method stub
		return employewebRepository.findById(code).get();
	}

	@Override
	public Employeweb update(Employeweb empWebServ) {
		// TODO Auto-generated method stub
		System.out.println("employeWeb:"+empWebServ);
		employewebRepository.save(empWebServ);
		return empWebServ;
	}

}
