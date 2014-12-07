package org.entitees;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class LigneCommande implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int idLigneCommande;
	@OneToOne
	@JoinColumn(name="idProduit")
	private Produit produit;
	private int quantiteProduit;
	private double prixProduit;
	//@ManyToOne
	//@JoinColumn(name="idCommande")
	private int idCommade;
	
	
	public LigneCommande() {
	}   
	
	

	public LigneCommande(Produit produit, int quantiteProduit,
			double prixProduit, int idCommade) {
		this.produit = produit;
		this.quantiteProduit = quantiteProduit;
		this.prixProduit = prixProduit;
		this.idCommade = idCommade;
	}



	public int getIdLigneCommande() {
		return this.idLigneCommande;
	}

	public void setIdLigneCommande(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}
	
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public double getPrix() {
		return prixProduit;
	}
	public void setPrix(double prix) {
		this.prixProduit = prix;
	}

	public int getIdCommade() {
		return idCommade;
	}

	public void setIdCommade(int idCommade) {
		this.idCommade = idCommade;
	}

	public int getQuantiteProduit() {
		return this.quantiteProduit;
	}

	public double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}
	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}
}
