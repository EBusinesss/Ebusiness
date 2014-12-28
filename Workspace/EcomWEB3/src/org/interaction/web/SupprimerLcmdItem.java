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
import org.entitees.LigneCommande;
import org.entitees.Utilisateur;

/**
 * Servlet implementation class SupprimerLcmdItem
 */
@WebServlet("/SupprimerLcmdItem")
public class SupprimerLcmdItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private CommandeInterface cmd;
	
	Utilisateur user = new Utilisateur("LAMGHARI", "Mohammed", "0695882741", "Res Jules Mousseron", 14000);	

	
    public SupprimerLcmdItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idLigneCmd = request.getParameter("idLigneCmd");
		
		Commande commande = cmd.cartCommande(user);
		commande = cmd.supprimerLigneCmd(user,1,1,150);
		
		
		Writer out = response.getWriter();
		//out.write("test de connexion ajax ::"+ nomProduit);

		out.write("ok remove");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
