package org.dao.produit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.entitees.LigneCommande;
import org.entitees.Produit;

@Stateless
@Remote(addArticleInterface.class)
public class addArticleImpl implements addArticleInterface {

	private Map<Long, LigneCommande> items =new HashMap<Long, LigneCommande>();

	public void addArticle(Produit p, int quantitee){
		if(items.get(p.getIdProduit())== null){
			LigneCommande lc = new LigneCommande();
			lc.setProduit(p);
			lc.setQuantiteProduit(quantitee);
			lc.setPrix(p.getPrixProduit());
		}
		else {
			LigneCommande lc = items.get(p.getIdProduit());
			lc.setQuantiteProduit(lc.getQuantiteProduit()+ quantitee);
		}
		
	}
	
	public Collection<LigneCommande> getItems(){
		return items.values();
	}
	public double getTotal(){
		double total=0;
		for (LigneCommande lc : items.values()) {
			total += lc.getPrix()* lc.getQuantiteProduit();
		}
		return total;
	}
	public int getSize() {
		return items.size();
	}
	public void deleteItem(Long idProduit){
		items.remove(idProduit);
	}
	

}
