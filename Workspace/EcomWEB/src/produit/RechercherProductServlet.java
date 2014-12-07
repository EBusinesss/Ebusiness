package produit;

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
 * Servlet implementation class RechercherProductServlet
 */
@WebServlet("/RechercherProductServlet")
public class RechercherProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@EJB private ProduitInterface produitItem;
	
    public RechercherProductServlet() {
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

		String nomProduit = String.valueOf(request.getParameter("nomProduitRecherche"));
		
		Collection<Produit> resultat = produitItem.getListeProduitParNom(nomProduit);
		
		Writer out = response.getWriter();
		out.write("<html><head><title>Result</title></head><body>");
		out.write("<table>");

		for (Produit produit : resultat) {
			out.write("<tr>");
			out.write("<td> Name Product :"+ produit.getNomProduit()+"</td>");
			out.write("<td> Prix Product :"+ produit.getPrixProduit()+"</td>");
			out.write("<tr>");
		}
		out.write("</table>");
	}

}
