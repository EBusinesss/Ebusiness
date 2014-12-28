<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script Src="./functions/function.js" Language="javascript"
	type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="./style/style.css" />
<link rel="stylesheet" type="text/css" href="./style/style-ml.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="chargerProduits()">

	<div id="wrapper">

		<div id="header"></div>
		<table id="barreMenu" class="barreMenu">
			<tr>
				<td></td>
				<td id="enterSearch"><input type="text" id="textSearch"
					name="mail" width="80"></td>
				<td id="tdGoSearch">
					<div id="goSearch" class="menuButton">chercher</div>
				</td>
				<td id="spaceSC"></td>
				<td>
					<div id="myAccount" class="menuButton"
						onclick="location.href='UserAccount/authentification'">Compte</div>
				</td>
				<td>
					<div id="panier" class="menuButton" onclick="afficherPanier()">Panier(0)</div>
				</td>
			</tr>

		</table>

		<!-- 
	<div id="navigation">
		 <a href="UserAccount/Inscription.jsp"> s'inscrire </a>
 		 <a href="UserAccount/authentification.jsp"> s'authentifier </a>
	</div>
-->
		<table id="tablebase">
			<tr>
				<td id="menuLateral">

				<ul class="ca-menu">
		            <li>
                        <a id="touslesproduits" onclick="listOfProducts()">
                            <div class="ca-content">
                                <h2 class="ca-main">Tous les produits</h2>
                            </div>
                        </a>
                    </li>                    
                    <li>
                        <a id="Ordinateurs" onclick="listProduitsParCat('ordinateurs')">
                            <div class="ca-content">
                                <h2 class="ca-main">Ordinateurs</h2>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a id="Smartphones" onclick="listProduitsParCat('smartphones')">
                            <div class="ca-content">
                                <h2 class="ca-main">Smartphones</h2>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a id="Tablettes" onclick="listProduitsParCat('tablettes')">
                            <div class="ca-content">
                                <h2 class="ca-main">Tablettes</h2>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a id="Imprimantes" onclick="listProduitsParCat('imprimantes')">
                            <div class="ca-content">
                                <h2 class="ca-main">Imprimantes</h2>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a id="Liseuses" onclick="listProduitsParCat('liseuses')">
                            <div class="ca-content">
                                <h2 class="ca-main">Liseuses</h2>
                            </div>
                        </a>
                    </li>
					<li>
                        <a id="Objets connectées" onclick="listProduitsParCat('objets connectées')">
                            <div class="ca-content">
                                <h2 class="ca-main">Objets connectées</h2>
                            </div>
                        </a>
                    </li>
                </ul>

				</td>
				<td id="content">
						<h1>Liste des Produits</h1>


				</td>
			</tr>
			<tr>
				<td colspan="1" id="footer">
					contact
				</td>
			</tr>
		</table>
	</div>
</body>
</html>