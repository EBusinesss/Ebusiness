package org.entitees;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-06T21:53:07.115+0100")
@StaticMetamodel(LigneCommande.class)
public class LigneCommande_ {
	public static volatile SingularAttribute<LigneCommande, Integer> idLigneCommande;
	public static volatile SingularAttribute<LigneCommande, Produit> produit;
	public static volatile SingularAttribute<LigneCommande, Integer> quantiteProduit;
	public static volatile SingularAttribute<LigneCommande, Double> prixProduit;
	public static volatile SingularAttribute<LigneCommande, Integer> idCommade;
}
