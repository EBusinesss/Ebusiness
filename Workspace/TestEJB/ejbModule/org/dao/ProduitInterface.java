package org.dao;

import java.util.Collection;

import org.entitees.Produit;

public interface ProduitInterface{

	public int ajouterProduit(Produit p);
		
	public Collection<Produit> getListeProduitParNom(String nomProduit);
	
	public Collection<Produit> getListeProduit();
	
	public Collection<Produit> getProduitParId(int idProduit);
	
	public Collection<Produit> getListProduitParIdCategorie(Long idCategorie);
	
	public Collection<Produit> getListProduitParCategorie(String Categorie);
	
	public void supprimerProduits(int idP);
}
