<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Commander un Produit :</h1>
		<form action="AddProductServlet" method="post">
		<table>
			<tr><td> nom Produit 		: <input type="text" name="nomProduit" width="25"></td></tr>
			<tr><td> desc Produit 		:<input type="text" name="descProduit" width="25"></td></tr>
			<tr><td> img Produit		:<input type="text" name="imgProduit" width="25"></td></tr>
			<tr><td> prix Produit 		:<input type="text" name="prixProduit" width="25"></td></tr>
			<tr><td> quantite Produit	:<input type="text" name="quantiteProduit" width="25"></td></tr>
			<tr>
				<td align="right" colspan="3">
					<button name="submit" type="submit">Ajouter</button>
				</td>
			</tr>
		</table>
		</form>
		
</body>
</html>