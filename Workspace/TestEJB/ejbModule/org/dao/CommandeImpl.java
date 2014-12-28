package org.dao;

import java.util.ArrayList;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.entitees.Commande;
import org.entitees.LigneCommande;
import org.entitees.Produit;
import org.entitees.Utilisateur;

@Stateless
@Remote(CommandeInterface.class)
public class CommandeImpl implements CommandeInterface {
	
	@PersistenceContext(unitName="Persist")
	private EntityManager em;

	public void executeCommande(Commande cmd) {
		em.persist(cmd);
	}

	int lcmdID = 0;
	public Produit p;
	public Commande cmd;
	public ArrayList<LigneCommande> ligneCommande;
	
	public Commande ajoutCommandeAndLineCommande(Utilisateur user,Produit produit, int quantite, double prix) {
		if (ligneCommande == null || ligneCommande.isEmpty()){
			ligneCommande = new ArrayList<LigneCommande>();
		}
		
		if (cmd==null) {
			cmd = new Commande(user, ligneCommande, "encours", 0);
		}
		cmd.addCommandeAndLineCommande(produit, quantite, prix);
		return cmd;	
	}

	public void cleanCart(Utilisateur user){
		lcmdID = 0;
		ligneCommande = new ArrayList<LigneCommande>(); 
		cmd = new Commande(user, ligneCommande,"encours", 0);
	}

	public Commande cartCommande(Utilisateur user) {
		return cmd;
	}


	



}
