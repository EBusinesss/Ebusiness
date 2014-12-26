package org.entitees;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-26T15:40:05.503+0100")
@StaticMetamodel(Commande.class)
public class Commande_ {
	public static volatile SingularAttribute<Commande, Integer> idCommande;
	public static volatile SingularAttribute<Commande, Utilisateur> client;
	public static volatile CollectionAttribute<Commande, LigneCommande> ligneCommande;
	public static volatile SingularAttribute<Commande, String> etatCommande;
	public static volatile SingularAttribute<Commande, Double> montantCommande;
	public static volatile SingularAttribute<Commande, Integer> cmdID;
}
