package org.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.entitees.Commande;

@Stateless
@Remote(CommandeInterface.class)
public class CommandeImpl implements CommandeInterface {
	
	@PersistenceContext(unitName="Persist")
	private EntityManager em;

	public void executeCommande(Commande cmd) {
		em.persist(cmd);
	}
}
