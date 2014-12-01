package org.entities;

public class Commande {
	private int idCommande;
	private int _idUtilisateur;
	private int montantCommande;
	private int _idLigneCommande;
	private String etatCommande;
	
	public Commande(int _idUtilisateur, int montantCommande,
			int _idLigneCommande, String etatCommande) {
		super();
		this._idUtilisateur = _idUtilisateur;
		this.montantCommande = montantCommande;
		this._idLigneCommande = _idLigneCommande;
		this.etatCommande = etatCommande;
	}
	
	public int getIdCommande() {
		return idCommande;
	}

	public int get_idUtilisateur() {
		return _idUtilisateur;
	}

	public void set_idUtilisateur(int _idUtilisateur) {
		this._idUtilisateur = _idUtilisateur;
	}

	public int getMontantCommande() {
		return montantCommande;
	}

	public void setMontantCommande(int montantCommande) {
		this.montantCommande = montantCommande;
	}

	public int get_idLigneCommande() {
		return _idLigneCommande;
	}

	public void set_idLigneCommande(int _idLigneCommande) {
		this._idLigneCommande = _idLigneCommande;
	}

	public String getEtatCommande() {
		return etatCommande;
	}

	public void setEtatCommande(String etatCommande) {
		this.etatCommande = etatCommande;
	}
}
