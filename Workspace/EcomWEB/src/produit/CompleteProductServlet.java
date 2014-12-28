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
@WebServlet("/CompleteProductServlet")
public class CompleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@EJB private ProduitInterface produitItem;
	
    public CompleteProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomProduit = request.getParameter("val");
		
		Collection<Produit> resultat = produitItem.getListeProduitParNom(nomProduit);
		
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

	}

}
