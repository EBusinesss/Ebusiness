package categorie;

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
import org.entitees.Categorie;
import org.entitees.Produit;


@WebServlet("/AddCategoryServlet")
public class AddCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@EJB private CategorieInterface catItem;
	
    public AddCategoryServlet() {
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
		Categorie cat ;
		
		String nomCategorie = String.valueOf(request.getParameter("nomCategorie"));
		cat = catItem.ajouterCategorie(nomCategorie);
		
		Writer out = response.getWriter();
		out.write("<html><head><title>Result</title></head><body>");
		out.write("<table>");

			out.write("<tr>");
			out.write("<td> Name Product :"+ cat.getIdCategorie() +"</td>");
			out.write("<td> Prix Product :"+ cat.getNomCategorie()+"</td>");
			out.write("<tr>");

		out.write("</table>");
		out.write("</body>");
	}

}
