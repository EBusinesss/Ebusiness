<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script Src="./functions/functions.js" Language="javascript"
	type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="./style/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div id="wrapper">

		<div id="header">
			<h3>E-Commerce Bi3 o Chri</h3>

			<table>
				<tr>
					<td><a onclick="listOfProducts()"> Liste des Produits </a></td>
				</tr>
			</table>

		</div>

		<div id="navigation">

			<table class="tableNavig">
				<tr>
					<td width="50%"><input type="text" id="nomProduitRecherche"
						height="25" width="40" align="right"
						onkeydown="if (event.keyCode==13) document.getElementById('btnSearch').click()">
						<div align="right">
							<button onclick="Rechercher()" type="button" id="btnSearch">Rechercher</button>
						</div></td>

					<td width="25%" align="right">
						<div class="Account">
							<div class="icn-Account"></div>
							<a href="" class="AccountLink"> 
								<span>Mon Compte</span>
							</a>
						</div>
					</td>


					<td width="25%" align="right">
						<div class="Basket">
							<div class="icn-Basket"></div>
							<a href="" class="HeaderLink"> <span
								class="bigger">Mon Panier (0)</span>
							</a>
						</div>
					</td>

				</tr>
			</table>


		</div>

		<div id="menuLateral">
			<h1>
				<a> voir tous les produits </a>
			</h1>

			<ul>
				<li><a id="ordinateurs" onclick="listProduitsParCat('ordinateurs')">Ordinateurs</a></li>
				<li>Ordinateurs</li>
			</ul>
		</div>

		<div id="content">
			<h1>
				<a href="http://localhost:8080/EcomWEB/ListProductServlet">Liste
					des Produits </a><br>
			</h1>

			<a href="http://localhost:8080/EcomWEB/ListProductServlet">Liste
				des Produits </a>
		</div>

		<div id="footer">
			<h3>JEE Masters</h3>
		</div>

	</div>
</body>
</html>