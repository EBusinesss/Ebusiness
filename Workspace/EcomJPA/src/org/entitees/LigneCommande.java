package org.entitees;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: LigneCommande
 *
 */
@Entity

public class LigneCommande implements Serializable {

	   
	@Id
	private int idLigneCommande;
	private int Produit_idProduit;
	private int quantiteProduitl;
	private static final long serialVersionUID = 1L;

	public LigneCommande() {
		super();
	}   
	public int getIdLigneCommande() {
		return this.idLigneCommande;
	}

	public void setIdLigneCommande(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}   
	public int getProduit_idProduit() {
		return this.Produit_idProduit;
	}

	public void setProduit_idProduit(int Produit_idProduit) {
		this.Produit_idProduit = Produit_idProduit;
	}   
	public int getQuantiteProduitl() {
		return this.quantiteProduitl;
	}

	public void setQuantiteProduitl(int quantiteProduitl) {
		this.quantiteProduitl = quantiteProduitl;
	}
   
}
