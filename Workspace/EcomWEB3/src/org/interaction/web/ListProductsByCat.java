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
 * Servlet implementation class ListProductsByCat
 */
@WebServlet("/ListProductsByCat")
public class ListProductsByCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB private ProduitInterface produitItem;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProductsByCat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String catProduit = request.getParameter("categorie");
		
		Collection<Produit> resultat = produitItem.getListProduitParCategorie(catProduit);
		
		Writer out = response.getWriter();
		//out.write("test de connexion ajax ::"+ nomProduit);

		out.write("<table>");

		for (Produit produit : resultat) {
			out.write("<tr>");
			out.write("<td id="+produit.getIdProduit()+"><a onclick=addToCart("+produit.getIdProduit()+")> Name Product : "+ produit.getNomProduit()+"</a></td>");
			out.write("<td> <img class='imageProduit' title='' src='"+produit.getImgProduit()+"' alt='' width='200' height='160'> </td>");
			out.write("<tr>");
		}
		out.write("</table>");
		
		out.write("Total Produit en Base :" + produitItem.getListeProduit().size());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
