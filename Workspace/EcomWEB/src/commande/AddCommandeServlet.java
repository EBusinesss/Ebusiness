package commande;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.entitees.Commande;
import org.entitees.LigneCommande;
import org.entitees.Produit;
import org.entitees.Utilisateur;

/**
 * Servlet implementation class AddCommandeServlet
 */
@WebServlet("/AddCommandeServlet")
public class AddCommandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
	Utilisateur user = new Utilisateur("LAMGHARI", "Mohammed", "0695882741", "Res Jules Mousserooon", 14900);
	Commande cmd = new Commande(user, null, "En cours", 0);
	Produit p = new Produit("Mac Book Pro", "Apple", "Img Mac", 1090, 2);
	//LigneCommande lcmd = new LigneCommande(p, 1 , p.getPrixProduit(), 12);
	
	LigneCommande lcmd = cmd.addCommandeAndLineCommande(p,2,p.getPrixProduit());
	

	
    public AddCommandeServlet() {
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
		// TODO Auto-generated method stub
	}

}
