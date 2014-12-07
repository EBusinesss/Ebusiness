package org.entitees;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCategorie;
    private String nomCategorie;
    
	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public Categorie() {
	}
	
	public Categorie(int idCategorie, String nomCategorie) {
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
	}
	
	

    
}
