package org.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.entitees.LigneCommande;

@Stateless
@Remote(LigneCommandeInterface.class)
public class LigneCommandeImpl implements LigneCommandeInterface {

	@PersistenceContext(unitName="Persist")
	private EntityManager em;

    public void persistLineCmd(LigneCommande lcmd) {
        em.persist(lcmd);
    }
	
}
