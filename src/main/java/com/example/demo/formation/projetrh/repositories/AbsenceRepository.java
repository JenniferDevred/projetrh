package com.example.demo.formation.projetrh.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.formation.projetrh.entities.Absence;

public interface AbsenceRepository extends JpaRepository<Absence, BigDecimal>{

}
