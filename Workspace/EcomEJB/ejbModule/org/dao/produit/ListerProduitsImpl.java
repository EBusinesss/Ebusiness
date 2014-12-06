package org.dao.produit;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.entitees.Produit;

@Stateless
@Remote(ListerProduitsInterface.class)
public class ListerProduitsImpl implements ListerProduitsInterface {
	
	@PersistenceContext(unitName="Persist")
	private EntityManager em;
	
	public List<Produit> listerProduits() {
		Query req = em.createQuery("SELECT p FROM Produit p");
		return req.getResultList();
	}

	@Override
	public List<Produit> listerProduitsParMotCle(String mc) {
		Query req = em.createQuery("SELECT p FROM Produit p WHERE p.nom like:x or p.description like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();	}

}
