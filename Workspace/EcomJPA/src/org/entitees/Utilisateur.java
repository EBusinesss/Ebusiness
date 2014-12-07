package org.entitees;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int idUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String telUtilisateur;
	private String adresseUtilisateur;


	private int soldeUtilisateur;
	private static final long serialVersionUID = 1L;

	
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur,
			String telUtilisateur, String adresse, int soldeUtilisateur) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.telUtilisateur = telUtilisateur;
		adresseUtilisateur = adresse;
		this.soldeUtilisateur = soldeUtilisateur;
	}
	public Utilisateur() {
	}   
	public int getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}   
	public String getNomUtilisateur() {
		return this.nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}   
	public String getPrenomUtilisateur() {
		return this.prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}   
	public String getTelUtilisateur() {
		return this.telUtilisateur;
	}

	public void setTelUtilisateur(String telUtilisateur) {
		this.telUtilisateur = telUtilisateur;
	}   

	public String getAdresseUtilisateur() {
		return adresseUtilisateur;
	}
	public void setAdresseUtilisateur(String adresseUtilisateur) {
		this.adresseUtilisateur = adresseUtilisateur;
	}
	
	public int getSoldeUtilisateur() {
		return this.soldeUtilisateur;
	}

	public void setSoldeUtilisateur(int soldeUtilisateur) {
		this.soldeUtilisateur = soldeUtilisateur;
	}
   
}
