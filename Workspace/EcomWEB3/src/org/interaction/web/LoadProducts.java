package org.interaction.web;

import java.io.IOException;
import java.io.Writer;
import java.net.URLEncoder;
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
 * Servlet implementation class LoadProducts
 */
@WebServlet("/LoadProducts")
public class LoadProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private ProduitInterface produitInter;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoadProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
		
		HttpServletResponse response) throws ServletException, IOException {
		Collection<Produit> listeProduits = produitInter.getListeProduit();
		Writer out = response.getWriter();
		int nbProduits = 0;
		out.write("<table id='tabProduits'>");	
		
		for (Produit produit : listeProduits) {
			if ((nbProduits % 4) == 0)
				out.write("<tr>");

			out.write("<td>");
		    printCellProduct(produit.getImgProduit(), produit.getPrixProduit(), produit.getNomProduit(), out);
			out.write("</td>");

			if (((nbProduits + 1) % 4) == 0)
				out.write("</tr>");

			nbProduits++;
		}
		out.write("</table>");

		
	}

	
	protected void printCellProduct(String imgUrl, int prix, String Name, Writer out) throws IOException
	{
		out.write("<table>");
		out.write("<tr> <td colspan=2>");
		out.write(" <img class='imageProduit' title='"+Name+"' src='"
					+ imgUrl + "' alt='"+ Name + "' width='200' height='160'>");
		out.write("</td> </tr>");
		out.write("<tr> <td colspan=2 id='libelleProduit'>" +  Name + "</td></tr>");

		out.write("<tr class='prixPanier'> <td id='prixProduit'>" +  prix +"&euro;</td><td> <div class='ajouterPanier' id='"+ Name +"' onclick=\"ajouterProduitLcmd('"+Name+"')\"></div> </td></tr>");
		out.write("</table>");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
