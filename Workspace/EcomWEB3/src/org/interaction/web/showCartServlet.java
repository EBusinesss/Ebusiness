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

import org.dao.CommandeInterface;
import org.dao.ProduitInterface;
import org.entitees.Commande;
import org.entitees.LigneCommande;
import org.entitees.Produit;
import org.entitees.Utilisateur;

/**
 * Servlet implementation class showCartServlet
 */
@WebServlet("/showCartServlet")
public class showCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private ProduitInterface produitInter;
	
	@EJB
	private CommandeInterface cmd;
	
	Utilisateur user = new Utilisateur("LAMGHARI", "Mohammed", "0695882741", "Res Jules Mousseron", 14000);	

	
    public showCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Commande commande = cmd.cartCommande(user);
		
		Writer out = response.getWriter();
		//out.write("test de connexion ajax ::"+ nomProduit);

		out.write("<table width=100%>");

		for (LigneCommande lc : commande.getLigneCommande()) {
			out.write("<tr>");
			out.write("<td width='50%'>"+lc.getProduit().getNomProduit()+"</td>");
			out.write("<td width='20%'>"+lc.getPrix()+"</td>");
			out.write("<td width='15%'> <img class='imagelcmdCart' title='' src='"+lc.getProduit().getImgProduit()+"' alt='' width='100' height='60'> </td>");
			out.write("<td width='15%'> <a class='supprimerlcmd' id='"+ lc.getProduit().getNomProduit() +"' onclick=\"supprimerProduitLcmd('"+lc.getIdLigneCommande()+"')\">&nbsp Supprimer</a></td></tr>");
		}
		out.write("</table>");
		
		out.write("<p> <h2> Nombre des articles  : " +commande.getLigneCommande().size());

		out.write("<p> <h2> Montant Total de la commande  : " + commande.getmontantCommande());

		
		out.write("<p><form action='ExecuteCmdServlet' method='post'>");
		out.write("<button name='submit' type='submit' style='float: right;'>Valider la Commande</button>");
		out.write("</form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
