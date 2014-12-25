<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="org.dao.ProduitInterface" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.Context" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script Src="./functions/functions.js" Language="javascript" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="./style/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
ProduitInterface listeOfProducts;
%>

<%
try {
Context context = new InitialContext();
listeOfProducts = (ProduitInterface) context.lookup(ProduitInterface.class.getName());
}
catch(Exception e) {
// exception code here
}
%>


<div id="wrapper">

	<div id="header">
	<h3>E-Commerce Bi3 o Chri</h3>
	
		<form action="RechercherProductServlet" method="post">
			<table>
			<tr>
				<td><input type="text" name="nomProduitRecherche" width="25"></td>
				<td align="right" colspan="3">
				<button onclick="Rechercher()" type="button">Rechercher</button></td>
			</tr>
			</table>
		</form>
		
	<p>
	Object ListProduct : <%= listeOfProducts %><br>
	Resultat : <%= listeOfProducts.getListeProduit() %>
	<p>
	</div>

	<div id="navigation">
	<table>
		<tr>
		<td><a href=""> S'inscrire</a></td>
		<td><a onclick="seLogger()"> Se logger</a></td>
		<td><a href=""> </a></td>
		<td><a href=""> </a></td>
	    <td><a onclick="listOfProducts()"> Liste des Produits </a></td>
		</tr>
	</table> 
	</div>

	<div id="menuLateral">
	<h1> <a> voir tous les produits </a> </h1>
	
	<ul>
		<li> Smartphones</li>
		<li> Ordinateurs</li>	
	</ul>
	</div>
	
	<div id="content">
	<h1><a href="http://localhost:8080/EcomWEB/ListProductServlet">Liste des Produits </a><br></h1>
	
	<a href="http://localhost:8080/EcomWEB/ListProductServlet">Liste des Produits </a>
	</div>
	
	<div id="footer">
		<h3>JEE Masters</h3>
	</div>
	
</div>
</body>
</html>