package org.composants;

import java.util.ArrayList;
import org.entitees.Commande;
import org.entitees.LigneCommande;
import org.entitees.Produit;

public class CmdAddImpl implements CmdAddInterface {

	public void addCommande(Commande cmd,LigneCommande lcmd, int quantite, double prix) {
		if (cmd.getLigneCommande() == null) {
			cmd.setLigneCommande(new ArrayList<LigneCommande>());
		}
		lcmd.setQuantiteProduit(lcmd.getQuantiteProduit() + quantite);
		lcmd.setPrix(lcmd.getPrix() + (quantite * prix));
		cmd.setmontantCommande(cmd.getmontantCommande()+ lcmd.getPrix() + (quantite * prix) );
	}
	
	public void updateCmdAndLineCmd(Commande cmd, LigneCommande lcmd, int quantite, double prix){
        if (cmd.getLigneCommande() == null) {
        	cmd.setLigneCommande(new ArrayList<LigneCommande>());
        }
        int oldQuantite = lcmd.getQuantiteProduit();
        lcmd.setQuantiteProduit(quantite);
        lcmd.setPrix(quantite * prix);
        cmd.setmontantCommande(cmd.getmontantCommande() - (oldQuantite * prix));
        cmd.setmontantCommande(cmd.getmontantCommande() + (quantite * prix));
	}
	
	int cmdID = 0;
	
	public LigneCommande addCommandeAndLineCommande(Commande cmd, Produit produit, int quantite, double prix){
	
		if (cmd.getLigneCommande() == null || cmd.getLigneCommande().isEmpty()){
			cmd.setLigneCommande(new ArrayList<LigneCommande>());
		}
		LigneCommande lcmd = new LigneCommande();
		lcmd.setIdLigneCommande(cmdID);
		lcmd.setProduit(produit);
		lcmd.setQuantiteProduit(quantite);
		lcmd.setPrix(quantite * prix);
		cmd.getLigneCommande().add(lcmd);
		cmd.setmontantCommande(cmd.getmontantCommande()+(quantite+prix));
		cmdID = cmdID + 1;
		return lcmd;
	}
	

    
    
	

}
