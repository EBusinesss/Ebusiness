import java.util.Collection;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.dao.CategorieInterface;
import org.dao.LigneCommandeInterface;
import org.dao.ProduitInterface;
import org.entitees.LigneCommande;
import org.entitees.Produit;
import org.glassfish.hk2.utilities.reflection.Logger;


public class Client {
	public static void main(String[] args){

		Collection<Produit> resultat;
		//Collection<Produit> resultat2;
		Produit p;
		//Produit p = new Produit("Galaxy S5","Samsung","Img",159,12);

		CategorieInterface catItem;
		LigneCommandeInterface lCmdItem;
		ProduitInterface item;
		
		
		try {
			lCmdItem = (LigneCommandeInterface) new InitialContext().lookup("org.dao.LigneCommandeInterface");
			LigneCommande lcmd = new LigneCommande(12, 122);
			lCmdItem.persistLineCmd(lcmd);
			System.out.println("ajouterCategorie Test OK");
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
			resultat = item.getListeProduitParNom("Galaxy S5");
			System.out.println(resultat.size());
			System.out.println("getListeProduitParNom Test OK");
			
		} catch (NamingException e) {
			e.printStackTrace();
		}

		try {
			item = (ProduitInterface) new InitialContext().lookup("org.dao.ProduitInterface");
			resultat = item.getProduitParId(51);
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