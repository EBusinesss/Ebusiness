package org.dao;

import java.util.Collection;

import org.entitees.Categorie;

public interface CategorieInterface {
	
	public void creerCategorie(String nomCat);
	
	public Categorie ajouterCategorie(String nom);
	
	public Categorie getCategorieParNom(String nomCat);
	
	public Collection<Categorie> getListeCategorie();
	
    //public void deleteAll();

}
