package org.entitees;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity

public class Commande implements Serializable {

	   
	@Id
	private int idCommande;
	private int Utilisateur_idUtilisateur;
	private String montantCommande;
	private String LigneCommande_idLigneCommande;
	private int etatCommande;
	private static final long serialVersionUID = 1L;

	public Commande() {
		super();
	}   
	public int getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}   
	public int getUtilisateur_idUtilisateur() {
		return this.Utilisateur_idUtilisateur;
	}

	public void setUtilisateur_idUtilisateur(int Utilisateur_idUtilisateur) {
		this.Utilisateur_idUtilisateur = Utilisateur_idUtilisateur;
	}   
	public String getMontantCommande() {
		return this.montantCommande;
	}

	public void setMontantCommande(String montantCommande) {
		this.montantCommande = montantCommande;
	}   
	public String getLigneCommande_idLigneCommande() {
		return this.LigneCommande_idLigneCommande;
	}

	public void setLigneCommande_idLigneCommande(String LigneCommande_idLigneCommande) {
		this.LigneCommande_idLigneCommande = LigneCommande_idLigneCommande;
	}   
	public int getEtatCommande() {
		return this.etatCommande;
	}

	public void setEtatCommande(int etatCommande) {
		this.etatCommande = etatCommande;
	}
   
}
