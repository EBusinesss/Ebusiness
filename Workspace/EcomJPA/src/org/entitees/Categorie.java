package org.entitees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategorie;
    private String nomCategorie;
    
	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
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
	
	public Categorie(Long idCategorie, String nomCategorie) {
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
	}
	
	

    
}
