package org.entitees;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

@Entity
public class Produit implements Serializable {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int idProduit;
	private String nomProduit;
	private String descProduit;
	private String imgProduit;
	private String catProduit;
	private int prixProduit;
	private int quantiteProduit;
	private static final long serialVersionUID = 1L;

	public Produit(String nomProduit, String descProduit, String imgProduit,
			String catProduit, int prixProduit, int quantiteProduit) {
		this.nomProduit = nomProduit;
		this.descProduit = descProduit;
		this.imgProduit = imgProduit;
		this.catProduit = catProduit;
		this.prixProduit = prixProduit;
		this.quantiteProduit = quantiteProduit;
	}

	public Produit(String nomProduit, String descProduit, String imgProduit, int prixProduit, int quantiteProduit) {
		super();
		this.nomProduit = nomProduit;
		this.descProduit = descProduit;
		this.imgProduit = imgProduit;
		this.prixProduit = prixProduit;
		this.quantiteProduit = quantiteProduit;
	}
	
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

	public String getDescProduit() {
		return descProduit;
	}

	public void setDescProduit(String descProduit) {
		this.descProduit = descProduit;
	}

	public String getImgProduit() {
		return imgProduit;
	}

	public void setImgProduit(String imgProduit) {
		this.imgProduit = imgProduit;
	}

	public String getCatProduit() {
		return catProduit;
	}

	public void setCatProduit(String catProduit) {
		this.catProduit = catProduit;
	}
   
	
}
