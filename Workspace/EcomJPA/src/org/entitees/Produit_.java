package org.entitees;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-26T15:40:05.717+0100")
@StaticMetamodel(Produit.class)
public class Produit_ {
	public static volatile SingularAttribute<Produit, Integer> idProduit;
	public static volatile SingularAttribute<Produit, String> nomProduit;
	public static volatile SingularAttribute<Produit, String> descProduit;
	public static volatile SingularAttribute<Produit, String> imgProduit;
	public static volatile SingularAttribute<Produit, Categorie> categorie;
	public static volatile SingularAttribute<Produit, Integer> prixProduit;
	public static volatile SingularAttribute<Produit, Integer> quantiteProduit;
}
