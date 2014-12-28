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
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServletold")
public class ProductServletold extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB private ProduitInterface produitItem;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServletold() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Writer out = response.getWriter();
		//out.write("<h3> List des Produits 2 <h3> <br/> ");
		
		Collection<Produit> resultat = produitItem.getListeProduit();
		
		Writer out = response.getWriter();
		out.write("<table>");

		for (Produit produit : resultat) {
			out.write("<tr>");
			out.write("<td id="+produit.getIdProduit()+"><a onclick=addToCart("+produit.getIdProduit()+")> Name Product : "+ produit.getNomProduit()+"</a></td>");
			out.write("<td> <img class='imageProduit' title='ASUS-X53SC' src='"+produit.getImgProduit()+"' alt='ASUS X53SC-SX383V' width='200' height='160'> </td>");
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
