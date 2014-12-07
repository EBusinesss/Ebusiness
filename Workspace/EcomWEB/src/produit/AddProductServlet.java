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

import org.dao.*;
import org.entitees.Produit;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@EJB private ProduitInterface produitItem;
	

    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomProduit = String.valueOf(request.getParameter("nomProduit"));
		String descProduit = String.valueOf(request.getParameter("descProduit"));
		String imgProduit = String.valueOf(request.getParameter("imgProduit"));
		Integer prixProduit = Integer.valueOf(request.getParameter("prixProduit"));
		Integer quantiteProduit = Integer.valueOf(request.getParameter("quantiteProduit"));

		Writer out = response.getWriter();
		Produit p = new Produit(nomProduit, descProduit, imgProduit, prixProduit, quantiteProduit);
		produitItem.ajouterProduit(p);
		out.write("<html><head><title>Result</title></head><body>");
		out.write("<table>");
		Collection<Produit> resultat = produitItem.getListeProduit();

		for (Produit produit : resultat) {
			out.write("<tr>");
			out.write("<td> Name Product :"+ produit.getNomProduit()+"</td>");
			out.write("<td> Prix Product :"+ produit.getPrixProduit()+"</td>");
			out.write("<tr>");
		}
		out.write("</table>");
		
		out.write("Total Produit en Base :" + produitItem.getListeProduit().size());

		out.write("</body>");
	}

}
