package org.dao;

import org.entitees.Commande;

import org.entitees.Produit;
import org.entitees.Utilisateur;

public interface CommandeInterface {
	
	public void executeCommande(Commande cmd);
	
	public Commande ajoutCommandeAndLineCommande(Utilisateur user,Produit produit, int quantite, double prix);
	public Commande supprimerLigneCmd(Utilisateur user, int idLcmd, int quantite,double prix);
	
	public void cleanCart(Utilisateur user);
	
	public Commande cartCommande(Utilisateur user);
	
}
