package org.entities;

public class Utilisateur {
	
	private int idUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String telUtilisateur;
	private String Adresse;
	private int soldeUtilisateur;
	
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur,
			String telUtilisateur, String adresse, int soldeUtilisateur) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.telUtilisateur = telUtilisateur;
		Adresse = adresse;
		this.soldeUtilisateur = soldeUtilisateur;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getTelUtilisateur() {
		return telUtilisateur;
	}

	public void setTelUtilisateur(String telUtilisateur) {
		this.telUtilisateur = telUtilisateur;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public int getSoldeUtilisateur() {
		return soldeUtilisateur;
	}

	public void setSoldeUtilisateur(int soldeUtilisateur) {
		this.soldeUtilisateur = soldeUtilisateur;
	}
	
	
	

}
