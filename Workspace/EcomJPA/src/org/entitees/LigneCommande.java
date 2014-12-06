package org.entitees;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class LigneCommande implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long idLigneCommande;
	@OneToOne
	@JoinColumn(name="idProduit")
	private Produit produit;
	private int quantiteProduit;
	private double prixProduit;
	@ManyToOne
	@JoinColumn(name="idCommande")
	private Commande commade;
	
	
	public LigneCommande() {
	}   
	
	
	public LigneCommande(int quantiteProduit, double prixProduit) {
		this.quantiteProduit = quantiteProduit;
		this.prixProduit = prixProduit;
	}

	public Long getIdLigneCommande() {
		return this.idLigneCommande;
	}

	public void setIdLigneCommande(Long idLigneCommande) {
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
	public Commande getCommade() {
		return commade;
	}
	public void setCommade(Commande commade) {
		this.commade = commade;
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
