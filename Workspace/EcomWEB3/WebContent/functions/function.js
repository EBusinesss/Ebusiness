var listeProduits;

function supprimerProduitLcmd(idLcmd) {
	alert("ok "+idLcmd);
	
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
	xmlhttp.open("GET","SupprimerLcmdItem?idLigneCmd="+idLcmd,true);
	xmlhttp.send();
	
}


function afficherPanier() {
	
	var element = document.getElementById("content");
	ajax(element,"showCartServlet");
}


function ajouterProduitLcmd(product) {	
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
	    document.getElementById("panier").innerHTML = xmlhttp.responseText;
	    
	    }
	  };
	xmlhttp.open("GET","AjoutPanierServlet?produit="+product,true);
	xmlhttp.send();
}

function listOfProducts(){
	var element = document.getElementById("content");
	ajax(element,"LoadProducts");
}
	

function listProduitsParCat(category){
	
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
	xmlhttp.open("GET","RechercherProductByCatServlet?categorie="+category,true);
	xmlhttp.send();
}


function addToCart(id){
	alert(id);
	alert(document.getElementById(id).value);
	
}

function autocomplet(){
	ajaxListeProduits("AutocompleteServlet");
 	var availableTags = listeProduits.split(",");
    $(function() {
        $( "#textSearch" ).autocomplete({
          source: availableTags
        });
      });
}


function seLogger()
{
	window.confirm("ok c'est bon import�");
}


function listproduitsParCat()
	{
	var xmlhttp;
	var category = document.getElementById("ordinateurs").value;
	alert(category);
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
	xmlhttp.open("GET","ListProductsByCat?categorie="+category,true);
	xmlhttp.send();
	}

function listdesSmartphones()
{
ajax("content","SmartphonesServlet");
}


function ajax(element, fichier)
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
		  element.innerHTML = xmlhttp.responseText;
	    }
	  };
	xmlhttp.open("GET",fichier,true);
	xmlhttp.send();
}

function ajaxListeProduits(fichier)
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
      listeProduits = xmlhttp.responseText;
    }
  }
xmlhttp.open("GET", fichier,true);
xmlhttp.send();
}

function verifMail()
{
	var mail = document.getElementById("mailAddress").value;
	var element = document.getElementById("resMail");
	var fichier = "Traitement?mail="+mail;
	ajax(element, fichier);
}
