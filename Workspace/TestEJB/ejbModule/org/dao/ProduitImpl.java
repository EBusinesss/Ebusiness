package org.dao;

import java.util.Collection;



import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.entitees.Produit;


@Stateless
@Remote(ProduitInterface.class)
public class ProduitImpl implements ProduitInterface {

	//private static final Logger log = Logger.getLogger(ProduitInterface.class);
	
	//@EJB CategorieImpl Categoriedao;
	@PersistenceContext(unitName="Persist")
	private EntityManager em;
	Produit produit;
	
	public int ajouterProduit(Produit p) {
		try {
			em.persist(p);
			return p.getIdProduit();
		} catch (Exception e) {
			throw e;
		}
	}
    
 	public Collection<Produit> getListeProduit(){
 		try {
 			Query req = em.createQuery("SELECT p FROM Produit p");
 			return req.getResultList();
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public Collection<Produit> getListeProduitParNom(String nomProduit){
		Query req = em.createQuery("SELECT p FROM Produit p WHERE UPPER(p.nomProduit) like UPPER(:x)");
		req.setParameter("x", "%"+nomProduit+"%");
		return req.getResultList();
	}
	
	public Collection<Produit> getProduitParId(int idProduit){
		Query req = em.createQuery("SELECT p FROM Produit p WHERE p.idProduit = :x ");
		req.setParameter("x", idProduit);
		return req.getResultList();
	}

	public Collection<Produit> getListProduitParIdCategorie(Long idCategorie){
		Query req = em.createQuery("SELECT p FROM Produit p WHERE p.idCategorie like :x");
		req.setParameter("x", idCategorie);
		return req.getResultList();	
		}
	
	public String bidon()
	{
		return "Test bidon";
	}

}
