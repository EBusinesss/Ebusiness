package org.entitees;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import com.sun.msv.datatype.xsd.TotalDigitsFacet;

@Entity
public class Commande implements Serializable {
	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int idCommande;
	@ManyToOne
	private Utilisateur client;
	@OneToMany
	private Collection<LigneCommande> ligneCommande;
	//private Date dateCommande;
	private String etatCommande;
	private double montantCommande;
	private static final long serialVersionUID = 1L;

	public void ajouterLigneCommande(LigneCommande lcmd, int quantite, double prix) {
		if (ligneCommande == null) {
			ligneCommande = new ArrayList<LigneCommande>();
		}
		lcmd.setQuantiteProduit(lcmd.getQuantiteProduit() + quantite);
		lcmd.setPrix(lcmd.getPrix() + (quantite * prix));
		montantCommande += lcmd.getPrix() + (quantite * prix);
	}
	
	public void modifierLigneCommande(LigneCommande lcmd, int quantite, double prix){
        if (ligneCommande == null) {
        	ligneCommande = new ArrayList<LigneCommande>();
        }
        int oldQuantite = lcmd.getQuantiteProduit();
        lcmd.setQuantiteProduit(quantite);
        lcmd.setPrix(quantite * prix);
        montantCommande = montantCommande - (oldQuantite * prix);
        montantCommande += quantite * prix;
    }
	
	int cmdID = 0;
	public LigneCommande addCommandeAndLineCommande(Produit produit, int quantite, double prix){
	
		if (ligneCommande == null || ligneCommande.isEmpty()){
			ligneCommande = new ArrayList<LigneCommande>();
		}
		LigneCommande lcmd = new LigneCommande();
		lcmd.setIdLigneCommande(cmdID);
		lcmd.setProduit(produit);
		lcmd.setQuantiteProduit(quantite);
		lcmd.setPrix(quantite * prix);
		ligneCommande.add(lcmd);
		montantCommande += quantite * prix ;
		cmdID = cmdID + 1;
		return lcmd;
	}

	
	public Commande() {
	}

	public Commande(Utilisateur client,
			Collection<LigneCommande> ligneCommande,
			String etatCommande, double montantCommande) {
		this.client = client;
		this.ligneCommande = ligneCommande;
		//this.dateCommande = dateCommande;
		this.etatCommande = etatCommande;
		this.montantCommande = montantCommande;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public Utilisateur getClient() {
		return client;
	}

	public void setClient(Utilisateur client) {
		this.client = client;
	}

	public Collection<LigneCommande> getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(Collection<LigneCommande> ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

/*	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}*/

	public String getEtatCommande() {
		return etatCommande;
	}

	public void setEtatCommande(String etatCommande) {
		this.etatCommande = etatCommande;
	}

	public double getmontantCommande() {
		return montantCommande;
	}

	public void setmontantCommande(double montantCommande) {
		this.montantCommande = montantCommande;
	}   
	
}
