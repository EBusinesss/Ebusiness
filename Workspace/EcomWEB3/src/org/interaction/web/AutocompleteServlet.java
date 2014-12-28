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

import org.dao.ProduitInterface;
import org.entitees.Produit;

/**
 * Servlet implementation class AutocompleteServlet
 */
@WebServlet("/AutocompleteServlet")
public class AutocompleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB private ProduitInterface produitItem;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutocompleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Collection<Produit> resultat = produitItem.getListeProduit();
		Writer out = response.getWriter();

		String buffer="";
		for (Produit produit : resultat) {
			buffer = buffer + produit.getNomProduit() +",";
		}
		out.write(buffer);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
