<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script Src="./functions/function.js" Language="javascript" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="./style/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

	<div id="header">
	
	</div>

<body>
Formulaire d'inscription
<form action="Traitement" method="post">
<table>
			<tr>
			    <td> Votre adresse Mail : </td> <td> <input type="text" id="mailAddress" name="mail" width="30" onkeyup="verifMail()"> <div id="resMail"></div></td>
			    
			</tr>
			<tr>
				<td> Votre nom :  </td><td><input type="text" name="Nom" width="30"></td>	
				<td> Votre prenom :  </td><td><input type="text" name="Prenom" width="30"></td>
			</tr>
			<tr>
				<td> Votre telephone :  </td><td><input type="text" name="Telephone" width="30"></td>
				<td> Votre adresse :  </td><td><input type="text" name="Adresse" width="30"></td>
			</tr>
			<tr>
				<td align="right" colspan="3">
					<button name="submit" type="submit">Enregistrer</button>
				</td>
			</tr>
</table>

</form>
	
	<div id="footer">
	contact 
	</div>

</body>
</html>