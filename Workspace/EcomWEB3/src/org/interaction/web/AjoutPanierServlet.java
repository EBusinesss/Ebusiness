package org.interaction.web;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Null;

import org.dao.LigneCommandeInterface;
import org.dao.ProduitInterface;
import org.dao.CommandeInterface;
import org.entitees.Commande;
import org.entitees.LigneCommande;
import org.entitees.Produit;
import org.entitees.Utilisateur;

@WebServlet("/AjoutPanierServlet")
public class AjoutPanierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private ProduitInterface item;
	@EJB
	private LigneCommandeInterface lCmdItem;
	@EJB
	private CommandeInterface cmditem;
	
	public Commande cmd;
	public Commande cmd2;
	Utilisateur user = new Utilisateur("LAMGHARI", "Mohammed", "0695882741", "Res Jules Mousseron", 14000);	


    public AjoutPanierServlet() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//Commande cmd = new Commande();
	Commande cmd = new Commande(user, null, "En cours", 0);

	String product = request.getParameter("produit");
	Collection<Produit> p = item.getListeProduitParNom(product);
	
	
	Writer out = response.getWriter();
	for (Produit produit : p) {
		
		cmd2 = cmditem.ajoutCommandeAndLineCommande(user, produit,1, produit.getPrixProduit());
		
		out.write("Panier("+cmd2.getLigneCommande().size()+")");
		//out.write("&nbsp ClientCommande:"+cmd2.getmontantCommande());
		
	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
