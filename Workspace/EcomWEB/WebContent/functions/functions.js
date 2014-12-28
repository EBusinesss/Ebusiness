//Fonction pour lister les 
function listOfProducts()
{
var xmlhttp;
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("content").innerHTML = xmlhttp.responseText;
    }
  };
xmlhttp.open("GET","ProductServlet",true);
xmlhttp.send();
}


function Rechercher()
{
var xmlhttp;
var val = document.getElementById('nomProduitRecherche').value;

if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("content").innerHTML = xmlhttp.responseText;
    }
  };
xmlhttp.open("GET","RechercherProductServlet?val="+val,true);
xmlhttp.send();
}

function listProduitsParCat(cat){
	
	var xmlhttp;

	if (window.XMLHttpRequest)
	  {// code for IE7+, Firefox, Chrome, Opera, Safari
	  xmlhttp=new XMLHttpRequest();
	  }
	else
	  {// code for IE6, IE5
	  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	  }
	xmlhttp.onreadystatechange=function()
	  {
	  if (xmlhttp.readyState==4 && xmlhttp.status==200)
	    {
	    document.getElementById("content").innerHTML = xmlhttp.responseText;
	    }
	  };
	xmlhttp.open("GET","RechercherProductByCatServlet?categorie="+cat,true);
	xmlhttp.send();
	

}
