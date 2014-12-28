import java.util.Collection;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.dao.CategorieInterface;
import org.dao.LigneCommandeInterface;
import org.dao.ProduitInterface;
import org.entitees.Commande;
import org.entitees.LigneCommande;
import org.entitees.Produit;
import org.entitees.Utilisateur;
import org.glassfish.hk2.utilities.reflection.Logger;


public class Client {
	public static void main(String[] args){

		Collection<Produit> resultat;
		//Collection<Produit> resultat2;
		//Produit p;
		Utilisateur user = new Utilisateur("LAMGHARI", "Mohammed", "0695882741", "Res Jules Mousseron", 14000);
		Produit p = new Produit("Galaxy S5","Samsung","Img",100,12);
		LigneCommande lCmd = new LigneCommande( p, 2, 125, 51);

		
		CategorieInterface catItem;
		LigneCommandeInterface lCmdItem;
		ProduitInterface item;
		
		try {
			Commande cmd = new Commande(user, null, "En cours", 0);
			Produit p2 = new Produit("Mac Book Pro", "Apple", "Img Mac", 1000, 2);
			//LigneCommande lcmd2 = new LigneCommande(p, 1 , p.getPrixProduit(), 12);
			
			LigneCommande lcmd = cmd.addCommandeAndLineCommande(p2 , 2, p2.getPrixProduit());
			System.out.println("Prix de la Commande :" + cmd.getmontantCommande());
			LigneCommande lcmd2 = cmd.addCommandeAndLineCommande(p , 1, p.getPrixProduit());
			System.out.println("Prix de la Commande :" + cmd.getmontantCommande());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			lCmdItem = (LigneCommandeInterface) new InitialContext().lookup("org.dao.LigneCommandeInterface");
			
			//lCmdItem.persistLineCmd(lCmd);
			System.out.println("LigneCommandeInterface Test OK");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		try {
			catItem = (CategorieInterface) new InitialContext().lookup("org.dao.CategorieInterface");
			//catItem.ajouterCategorie("SmartPhone");
			System.out.println("ajouterCategorie Test OK");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		try {
			item = (ProduitInterface) new InitialContext().lookup("org.dao.ProduitInterface");
			//item.ajouterProduit(p);
			resultat = item.getListeProduit();
			System.out.println(resultat.size());
			System.out.println("getListeProduit Test OK");
			
			for (Produit produit : resultat) {
				System.out.println(" id : "+ produit.getIdProduit()+ " Nom :" + produit.getNomProduit()); 
			}
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		try {
			item = (ProduitInterface) new InitialContext().lookup("org.dao.ProduitInterface");
			resultat = item.getListeProduitParNom("APPLE iPad mini");
			System.out.println(resultat.size());
			System.out.println("getListeProduitParNom Test OK");
			
		} catch (NamingException e) {
			e.printStackTrace();
		}

		try {
			item = (ProduitInterface) new InitialContext().lookup("org.dao.ProduitInterface");
			resultat = item.getProduitParId(3);
			System.out.println(resultat.size());
			System.out.println("getProduitParId Test OK");
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		

			//item.ajouterProduit(p);
			//System.out.println("d�but du test : ");
			//resultat = item.getListeProduit();
			//System.out.println(resultat.size());
			//System.out.println(item.bidon());
			
			//resultat2 = item.getListeProduitParNom("Samsung");
			//System.out.println(resultat2.size());

/*		ProduitInterface item = (ProduitInterface) new InitialContext().lookup("org.dao.ProduitInterface");
		item.ajouterProduit(p);
		item.getListeProduitParNom("Ordinateur");
		*/
	
	}
}