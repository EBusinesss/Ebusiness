<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script Src="./functions/function.js" Language="javascript" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="./style/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>

 

</head>
<body>

	<div id="wrapper">

		<div id="header"></div>
		<table id="barreMenu" class="barreMenu">
			<tr>
				<td></td>
				<td id="enterSearch"><input type="text" id="textSearch"
					name="mail" width="80" onkeydown="autocomplet()">
					</td>
					<td id="tdGoSearch">
					<div id="goSearch" class="menuButton">chercher</div>
				</td>
				<td id="spaceSC"></td>
				<td>
					<div id="myAccount" class="menuButton" onclick="location.href='UserAccount/authentification'">Compte</div>
				</td>
				<td>
				<div id="panier" class="menuButton">
				Panier(0)
				</div>
				</td>
			</tr>

		</table>

		<!-- 
	<div id="navigation">
		 <a href="UserAccount/Inscription.jsp"> s'inscrire </a>
 		 <a href="UserAccount/authentification.jsp"> s'authentifier </a>
	</div>
-->
		<div id="menuLateral">
			<h1>
				<a> voir tous les produits </a>
			</h1>

			<ul>
				<li><a id="Ordinateurs" onclick="listProduitsParCat('ordinateurs')">Ordinateurs</a></li>
				<li><a id="Smartphones" onclick="listProduitsParCat('smartphones')">Smartphones</a></li>
				<li><a id="Tablettes" onclick="listProduitsParCat('tablettes')">Tablettes</a></li>
				<li><a id="Imprimantes" onclick="listProduitsParCat('imprimantes')">Ordinateurs</a></li>
				<li><a id="Liseuses" onclick="listProduitsParCat('liseuses')">Liseuses</a></li>
			</ul>
		</div>

		<div id="content">
			<h1>Liste des Produits</h1>
			<img class="imageProduit" title="ASUS-X53SC" src="./images/ordinateurs/ASUS-X53SC.jpg" alt="ASUS X53SC-SX383V" width="200" height="160">

		</div>


		<div id="footer">contact</div>

	</div>
</body>
</html>