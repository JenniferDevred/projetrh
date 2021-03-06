package com.example.demo.formation.projetrh.entities;
// Generated 29 avr. 2021 � 14:35:25 by Hibernate Tools 4.0.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Conges generated by hbm2java
 */
@Entity
@Table(name = "CONGES", schema = "PROJETRH")
public class Conges implements java.io.Serializable {

	private BigDecimal refConges;
	private Employeweb employeweb;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateDebut;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateFin;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateDemande;
	private BigDecimal soldeConges;

	public Conges() {
	}

	public Conges(BigDecimal refConges) {
		this.refConges = refConges;
	}

	public Conges(BigDecimal refConges, Employeweb employeweb, Date dateDebut, Date dateFin, Date dateDemande,
			BigDecimal soldeConges) {
		this.refConges = refConges;
		this.employeweb = employeweb;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dateDemande = dateDemande;
		this.soldeConges = soldeConges;
	}

	@Id

	@Column(name = "REF_CONGES", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getRefConges() {
		return this.refConges;
	}

	public void setRefConges(BigDecimal refConges) {
		this.refConges = refConges;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_EMP")
	public Employeweb getEmployeweb() {
		return this.employeweb;
	}

	public void setEmployeweb(Employeweb employeweb) {
		this.employeweb = employeweb;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEBUT", length = 7)
	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_FIN", length = 7)
	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEMANDE", length = 7)
	public Date getDateDemande() {
		return this.dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	@Column(name = "SOLDE_CONGES", precision = 22, scale = 0)
	public BigDecimal getSoldeConges() {
		return this.soldeConges;
	}

	public void setSoldeConges(BigDecimal soldeConges) {
		this.soldeConges = soldeConges;
	}

}
