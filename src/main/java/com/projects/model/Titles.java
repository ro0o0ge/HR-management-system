package com.projects.model;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Setter
@Getter
@Entity
@Table(name="titels")
public class Titles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id=0;
	@Column(name="DESCRIPTION_EN")
	private String descriptionEN;
	@Column(name="DESCRIPTION_AR")
	private String descriptionAR;
	
	
	public Titles(String descriptionEN, String descriptionAR) {
		super();
		this.descriptionEN = descriptionEN;
		this.descriptionAR = descriptionAR;
	}



}