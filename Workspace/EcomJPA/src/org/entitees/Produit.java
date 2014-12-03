package org.entitees;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
public class Produit implements Serializable {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int idProduit;
	private String nomProduit;
	private int prixProduit;
	private int quantiteProduit;
	private static final long serialVersionUID = 1L;

	public Produit() {
		super();
	}   
	public int getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}   
	public String getNomProduit() {
		return this.nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}   
	public int getPrixProduit() {
		return this.prixProduit;
	}

	public void setPrixProduit(int prixProduit) {
		this.prixProduit = prixProduit;
	}   
	public int getQuantiteProduit() {
		return this.quantiteProduit;
	}

	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}
   
}
