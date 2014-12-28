<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../style/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

	<div id="header">
	
	</div>

<body>
Page d'authentification
<form action="Traitement" method="post">
<table>
			<tr>
				<td> Votre nom :  </td><td><input type="text" name="Nom" width="30"></td>	
				<td> Votre prenom :  </td><td><input type="text" name="Prenom" width="30"></td>
			</tr>
			<tr>
				<td align="right" colspan="3">
					<button name="submit" type="submit">Valider</button>
				</td>
			</tr>
</table>

</form>
	
	<div id="footer">
	contact 
	</div>

</body>
</html>