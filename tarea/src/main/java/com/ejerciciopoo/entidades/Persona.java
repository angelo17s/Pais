package com.ejerciciopoo.entidades;





import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Persona {
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	
	@OneToMany(targetEntity = Ranking.class)
	private ArrayList<Ranking> ranking;
	
	public Persona() {
	}
	
	

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public ArrayList<Ranking> getRanking() {
		return ranking;
	}



	public void setRanking(ArrayList<Ranking> ranking) {
		this.ranking = ranking;
	}




}
