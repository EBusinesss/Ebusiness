/**
 * @author LAMGHAARI Mohammed & MAAD Ali & MASOCCO Angelina
 */

//// region Connexion au fichier json du questionnaire
var file = Ti.Filesystem.getFile(Ti.Filesystem.applicationDataDirectory,"ResUniversite.json");
var title;
var preParseData = (file.read().text);
//alert(preParseData);
var content = JSON.parse(preParseData);
//// end region Connexion au fichier json du questionnaire

//// region creation de composants

var win = Ti.UI.currentWindow;

var view1 = Ti.UI.createView({
	backgroundColor : 'lightgray'
});

var scrollView = Titanium.UI.createScrollView({
	contentWidth : 'auto',
	contentHeight : 'auto',
	top : 0,
	layout : 'vertical',
	showVerticalScrollIndicator : true,
	showHorizontalScrollIndicator : true
});

var txtS1 = 'Résultats du Sondage <br>'+content.Q1[0].intitule;

var txtQ1 = "Q1 - "+content.Q1[0].title;
var txtQ2 = "Q2 - "+content.Q2[0].title;
var txtQ3 = "Q3 - "+content.Q3[0].title;
var txtQ4 = "Q4 - "+content.Q4[0].title;
var txtQ5 = "Q5 - "+content.Q5[0].title;

var txtRepQ1 = "Trés Satisfaisant : "+content.rep1[0].choix1+"<br>Satisfaisant : "+content.rep1[0].choix2+"<br>Peu satisfaisant : "+content.rep1[0].choix3+"<br>Insatisfaisant : "+content.rep1[0].choix4;
var txtRepQ2 = "Trés Satisfaisant : "+content.rep2[0].choix1+"<br>Satisfaisant : "+content.rep2[0].choix2+"<br>Peu satisfaisant : "+content.rep2[0].choix3+"<br>Insatisfaisant : "+content.rep2[0].choix4;
var txtRepQ3 = "Trés Satisfaisant : "+content.rep3[0].choix1+"<br>Satisfaisant : "+content.rep3[0].choix2+"<br>Peu satisfaisant : "+content.rep3[0].choix3+"<br>Insatisfaisant : "+content.rep3[0].choix4;
var txtRepQ4 = "Trés Satisfaisant : "+content.rep4[0].choix1+"<br>Satisfaisant : "+content.rep4[0].choix2+"<br>Peu satisfaisant : "+content.rep4[0].choix3+"<br>Insatisfaisant : "+content.rep4[0].choix4;
var txtRepQ5 = "Trés Satisfaisant : "+content.rep5[0].choix1+"<br>Satisfaisant : "+content.rep5[0].choix2+"<br>Peu satisfaisant : "+content.rep5[0].choix3+"<br>Insatisfaisant : "+content.rep5[0].choix4;
var labelS1 = Ti.UI.createLabel({
	text : txtS1,
	height : "auto",
	width : "90%",
	top: '10%',
	left: 10,
	textAlign : 'center',
	font:{
    fontSize:20,
    fontWeight:'bold'
   		 },
});

var labelQ1 = Ti.UI.createLabel({
	text : txtQ1,
	height : "auto",
	width : "90%",
	top: '5%',
	left: 20,
	textAlign : 'left',
	font:{
    fontSize:15,
    fontWeight:'bold'
   		 },
});

var labelRepQ1 = Ti.UI.createLabel({
	text : txtRepQ1,
	height : "auto",
	width : "90%",
	top: '3%',
	left: 40,
	textAlign : 'left',
	font:{
    fontSize:15,
   		 },
});



scrollView.add(labelS1);

scrollView.add(labelQ1);
scrollView.add(labelRepQ1);


var labelQ2 = Ti.UI.createLabel({
	text : txtQ2,
	height : "auto",
	width : "90%",
	top: '5%',
	left: 20,
	textAlign : 'left',
	font:{
    fontSize:15,
    fontWeight:'bold'
   		 },
});
var labelRepQ2 = Ti.UI.createLabel({
	text : txtRepQ2,
	height : "auto",
	width : "90%",
	top: '3%',
	left: 40,
	textAlign : 'left',
	font:{
    fontSize:15,
   		 },
});

scrollView.add(labelQ2);
scrollView.add(labelRepQ2);

var labelQ3 = Ti.UI.createLabel({
	text : txtQ3,
	height : "auto",
	width : "90%",
	top: '5%',
	left: 20,
	textAlign : 'left',
	font:{
    fontSize:15,
    fontWeight:'bold'
   		 },
});
var labelRepQ3 = Ti.UI.createLabel({
	text : txtRepQ3,
	height : "auto",
	width : "90%",
	top: '3%',
	left: 40,
	textAlign : 'left',
	font:{
    fontSize:15,
   		 },
});

scrollView.add(labelQ3);
scrollView.add(labelRepQ3);


var labelQ4 = Ti.UI.createLabel({
	text : txtQ4,
	height : "auto",
	width : "90%",
	top: '5%',
	left: 20,
	textAlign : 'left',
	font:{
    fontSize:15,
    fontWeight:'bold'
   		 },
});
var labelRepQ4 = Ti.UI.createLabel({
	text : txtRepQ4,
	height : "auto",
	width : "90%",
	top: '3%',
	left: 40,
	textAlign : 'left',
	font:{
    fontSize:15,
   		 },
});

scrollView.add(labelQ4);
scrollView.add(labelRepQ4);

var labelQ5 = Ti.UI.createLabel({
	text : txtQ5,
	height : "auto",
	width : "90%",
	top: '5%',
	left: 20,
	textAlign : 'left',
	font:{
    fontSize:15,
    fontWeight:'bold'
   		 },
});
var labelRepQ5 = Ti.UI.createLabel({
	text : txtRepQ5,
	height : "auto",
	width : "90%",
	top: '3%',
	left: 40,
	textAlign : 'left',
	font:{
    fontSize:15,
   		 },
});

scrollView.add(labelQ5);
scrollView.add(labelRepQ5);

win.add(scrollView);


