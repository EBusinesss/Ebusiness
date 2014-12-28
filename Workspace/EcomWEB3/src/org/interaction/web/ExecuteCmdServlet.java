package org.interaction.web;

import java.io.IOException;
import java.io.Writer;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.CommandeInterface;
import org.entitees.Commande;
import org.entitees.Produit;
import org.entitees.Utilisateur;

/**
 * Servlet implementation class ValiderCommande
 */
@WebServlet("/ExecuteCmdServlet")
public class ExecuteCmdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private CommandeInterface cmd;
	
	Utilisateur user = new Utilisateur("LAMGHARI", "Mohammed", "0695882741", "Res Jules Mousseron", 14000);	
	
	
    public ExecuteCmdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Commande commande = cmd.cartCommande(user);
		cmd.executeCommande(commande);
		
		Writer out = response.getWriter();
		out.write("<html><head><title>Result</title></head><body>");
		
		out.write("Montant de la commande :" + commande.getmontantCommande());
		out.write("Nombre d'articles :" + commande.getLigneCommande().size());
		out.write("Merci pour votre achat. Votre commande et encours de livraison ");
		out.write("</body>");
		
		
	}

}
