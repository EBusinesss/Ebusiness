/**
 * @author LAMGHAARI Mohammed & MAAD Ali & MASOCCO Angelina
 */


// Fichier Js du formulaire de base lancé au démarrage de l'application


//// region Connexion au fichier json du questionnaire
	var file = Titanium.Filesystem.getFile("/lib/sondages/Universite.json");    
	var json, id, title ,question,questions,logo, repponse;
	var preParseData = (file.read().text); 
	var content = JSON.parse(preParseData); 	
		

//// end region Connexion au fichier json du questionnaire

//// region creation de composants 
var win = Ti.UI.currentWindow;
var view0 = Ti.UI.createView({ backgroundColor: 'lightgray' });
var view1 = Ti.UI.createView({ backgroundColor: 'lightgray' });
var view2 = Ti.UI.createView({ backgroundColor: 'lightgray' });
var view3 = Ti.UI.createView({ backgroundColor: 'lightgray' });
var view4 = Ti.UI.createView({ backgroundColor: 'lightgray' });
var view5 = Ti.UI.createView({ backgroundColor: 'lightgray' });

var labelHeader = Ti.UI.createLabel({
	text : 'Mon appli de sondage <br>',
	height : "auto",
	width : "90%",
	top: '15%',
	textAlign : 'center',
	font:{
    fontSize:20,
    fontWeight:'bold'
   		 },
});

var namefield = Ti.UI.createTextField({
	backgroundColor:'yellow',
	height: 45,
	top: '35%',
	textAlign: 'center',
	width: '70%',
	keyboardType: Ti.UI.KEYBOARD_DEFAULT,
	returnKeyType: Ti.UI.RETURNKEY_DONE,
	borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
	hintText: 'Nom  Prénom'
});
var HommeBtn = Ti.UI.createButton({
	title: 'Homme',
	top: '50%',
	left: '15%',
	height: 40,
	width: '25%',
	layout:'horizontal'
});
var FemmeBtn = Ti.UI.createButton({
	title: 'Femme',
	top: '50%',
	left: '60%',
	height: 40,
	width: '25%',
	layout:'horizontal'
});

var validateBtn = Ti.UI.createButton({
	title: 'Valider',
	top: '85%',
	height: 40,
	width: 200,
	layout:'horizontal'
});

var textfield1 = Ti.UI.createTextField({
	backgroundColor:'yellow',
	height: 40,
	top: 240,
	width: '70%',
	keyboardType: Ti.UI.KEYBOARD_DEFAULT,
	returnKeyType: Ti.UI.RETURNKEY_DONE,
	borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
	hintText: 'Autre ...'
});

var textfield2 = Ti.UI.createTextField({
	backgroundColor:'yellow',
	height: 40,
	top: 240,
	width: '70%',
	keyboardType: Ti.UI.KEYBOARD_DEFAULT,
	returnKeyType: Ti.UI.RETURNKEY_DONE,
	borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
	hintText: 'Autre ...'
});

var textfield3 = Ti.UI.createTextField({
	backgroundColor:'yellow',
	height: 40,
	top: 240,
	width: '70%',
	keyboardType: Ti.UI.KEYBOARD_DEFAULT,
	returnKeyType: Ti.UI.RETURNKEY_DONE,
	borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
	hintText: 'Autre ...'
});

var textfield4 = Ti.UI.createTextField({
	backgroundColor:'yellow',
	height: 40,
	top: 240,
	width: '70%',
	keyboardType: Ti.UI.KEYBOARD_DEFAULT,
	returnKeyType: Ti.UI.RETURNKEY_DONE,
	borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
	hintText: 'Autre ...'
});

var textfield5 = Ti.UI.createTextField({
	backgroundColor:'yellow',
	height: 40,
	top: 240,
	width: '70%',
	keyboardType: Ti.UI.KEYBOARD_DEFAULT,
	returnKeyType: Ti.UI.RETURNKEY_DONE,
	borderStyle: Ti.UI.INPUT_BORDERSTYLE_ROUNDED,
	hintText: 'Autre ...'
});

var lblQ1 = Ti.UI.createLabel({
	text : content.Q1[0].title,
	height : "auto",
	width : "auto",
	top: '70%',
	textAlign : 'center',
	font:{
    fontSize:25,
    fontWeight:'bold'
   		 },
   	//color:'#fff'
});

var lblQ2 = Ti.UI.createLabel({
	text : content.Q2[0].title,
	height : "auto",
	width : "auto",
	top: '70%',
	textAlign : 'center',
	font:{
    fontSize:25,
    fontWeight:'bold'
   		 },
   	//color:'#fff'
});

var lblQ3 = Ti.UI.createLabel({
	text : content.Q3[0].title,
	height : "auto",
	width : "auto",
	top: '70%',
	textAlign : 'center',
	font:{
    fontSize:25,
    fontWeight:'bold'
   		 },
   	//color:'#fff'
});

var lblQ4 = Ti.UI.createLabel({
	text : content.Q4[0].title,
	height : "auto",
	width : "auto",
	top: '70%',
	textAlign : 'center',
	font:{
    fontSize:25,
    fontWeight:'bold'
   		 },
});

var lblQ5 = Ti.UI.createLabel({
	text : content.Q5[0].title,
	height : "auto",
	width : "auto",
	top: '70%',
	textAlign : 'center',
	font:{
    fontSize:25,
    fontWeight:'bold'
   		 }
});

	
var tableQ1 = [ {leftImage:"/images/A.png",title: content.rep1[0].choix1,top: '5%',font:{ fontSize:20}}, {leftImage:"/images/B.png",title: content.rep1[0].choix2,font:{ fontSize:20}}, {leftImage:"/images/C.png",title: content.rep1[0].choix3,font:{ fontSize:20}}, {leftImage:"/images/D.png",title: content.rep1[0].choix4,font:{ fontSize:20}}];
var tableRepQ1 = Ti.UI.createTableView({
  data: tableQ1
});
//tableRepQ1.add(textfield);
var tableQ2 = [ {leftImage:"/images/A.png",title: content.rep2[0].choix1,top: '5%',font:{ fontSize:20}}, {leftImage:"/images/B.png",title: content.rep2[0].choix2,font:{ fontSize:20}}, {leftImage:"/images/C.png",title: content.rep2[0].choix3,font:{ fontSize:20}}, {leftImage:"/images/D.png",title: content.rep2[0].choix4,font:{ fontSize:20}}];
var tableRepQ2 = Ti.UI.createTableView({
  data: tableQ2
});
var tableQ3 = [ {leftImage:"/images/A.png",title: content.rep3[0].choix1,top: '5%',font:{ fontSize:20}}, {leftImage:"/images/B.png",title: content.rep3[0].choix2,font:{ fontSize:20}}, {leftImage:"/images/C.png",title: content.rep3[0].choix3,font:{ fontSize:20}}, {leftImage:"/images/D.png",title: content.rep3[0].choix4,font:{ fontSize:20}}];
var tableRepQ3 = Ti.UI.createTableView({
  data: tableQ3
});
var tableQ4 = [ {leftImage:"/images/A.png",title: content.rep4[0].choix1,top: '5%',font:{ fontSize:20}}, {leftImage:"/images/B.png",title: content.rep4[0].choix2,font:{ fontSize:20}}, {leftImage:"/images/C.png",title: content.rep4[0].choix3,font:{ fontSize:20}}, {leftImage:"/images/D.png",title: content.rep4[0].choix4,font:{ fontSize:20}}];
var tableRepQ4 = Ti.UI.createTableView({
  data: tableQ4
});
var tableQ5 = [ {leftImage:"/images/A.png",title: content.rep5[0].choix1,top: '5%',font:{ fontSize:20}}, {leftImage:"/images/B.png",title: content.rep5[0].choix2,font:{ fontSize:20}}, {leftImage:"/images/C.png",title: content.rep5[0].choix3,font:{ fontSize:20}}, {leftImage:"/images/D.png",title: content.rep5[0].choix4,font:{ fontSize:20}} ];
var tableRepQ5 = Ti.UI.createTableView({
  data: tableQ5
});

//// End region creation de composants 

view0.add(labelHeader);
view0.add(namefield);
view0.add(HommeBtn);
view0.add(FemmeBtn);	
	
view1.add(tableRepQ1);
view2.add(tableRepQ2);
view3.add(tableRepQ3);
view4.add(tableRepQ4);
view5.add(tableRepQ5);



view1.add(lblQ1);
view2.add(lblQ2);
view3.add(lblQ3);
view4.add(lblQ4);
view5.add(lblQ5);

view1.add(textfield1);
view2.add(textfield2);
view3.add(textfield3);
view4.add(textfield4);
view5.add(textfield5);

view5.add(validateBtn);

var scrollableView = Ti.UI.createScrollableView({
  views:[view0,view1,view2,view3,view4,view5],
  showPagingControl:true
});



win.add(scrollableView);


//// Events handle

//tableau qui contient les reponses sur un questionnaire 
var repUser = [0,0,0,0,0];
//Evenement du click sur les TableView
//tableRepQ1.selectionIndicator=true;

var lastSelectedQ1 =null;

tableRepQ1.addEventListener('click',function(e){
	repUser[0]= e.row.title;
	//alert(repUser[1]);
	//alert('title: \'' + e.row.title + '\', index: ' + e.index); 
	
  if (!e.rowData.selected) 
  {
    	if (lastSelectedQ1 != null) 
    	{
    		lastSelectedQ1.setBackgroundColor('lightgray');
    		lastSelectedQ1.selected = false;
    		lastSelectedQ1.hasCheck = false;
    	};
    	e.rowData.setBackgroundColor('purple');
    	e.row.hasCheck = true;
    	lastSelectedQ1 = e.rowData;
  };
  e.rowData.selected = !e.rowData.selected;
});


var lastSelectedQ2 =null;
tableRepQ2.addEventListener('click',function(e){
	repUser[1]= e.row.title;
	
  if (!e.rowData.selected) 
  {
    	if (lastSelectedQ2 != null) 
    	{
    		lastSelectedQ2.setBackgroundColor('lightgray');
    		lastSelectedQ2.selected = false;
    		lastSelectedQ2.hasCheck = false;
    	};
    	e.rowData.setBackgroundColor('purple');
    	e.row.hasCheck = true;
    	lastSelectedQ2 = e.rowData;
  };
  e.rowData.selected = !e.rowData.selected;
});

var lastSelectedQ3 =null;
tableRepQ3.addEventListener('click',function(e){
	repUser[2]= e.row.title;
	
  if (!e.rowData.selected) 
  {
    	if (lastSelectedQ3 != null) 
    	{
    		lastSelectedQ3.setBackgroundColor('lightgray');
    		lastSelectedQ3.selected = false;
    		lastSelectedQ3.hasCheck = false;
    	};
    	e.rowData.setBackgroundColor('purple');
    	e.row.hasCheck = true;
    	lastSelectedQ3 = e.rowData;
  };
  e.rowData.selected = !e.rowData.selected;
});

var lastSelectedQ4 =null;
tableRepQ4.addEventListener('click',function(e){
	repUser[3]= e.row.title;
	
  if (!e.rowData.selected) 
  {
    	if (lastSelectedQ4 != null) 
    	{
    		lastSelectedQ4.setBackgroundColor('lightgray');
    		lastSelectedQ4.selected = false;
    		lastSelectedQ4.hasCheck = false;
    	};
    	e.rowData.setBackgroundColor('purple');
    	e.row.hasCheck = true;
    	lastSelectedQ4 = e.rowData;
  };
  e.rowData.selected = !e.rowData.selected;
});

var lastSelectedQ5 =null;
tableRepQ5.addEventListener('click',function(e){
	repUser[4]= e.row.title;
	
  if (!e.rowData.selected) 
  {
    	if (lastSelectedQ5 != null) 
    	{
    		lastSelectedQ5.setBackgroundColor('lightgray');
    		lastSelectedQ5.selected = false;
    		lastSelectedQ5.hasCheck = false;
    	};
    	e.rowData.setBackgroundColor('purple');
    	e.row.hasCheck = true;
    	lastSelectedQ5 = e.rowData;
  };
  e.rowData.selected = !e.rowData.selected;
});

// Validate Button Event 
validateBtn.addEventListener('click', function() {

	// Alert
	var msgTitle = "Confirmation";
	var msgText = "Voullez vous valider le questionnaire!";
	var alertBox = Ti.UI.createAlertDialog({
						title: msgTitle,
						message: msgText
					});
    alertBox.show();

	//Lecture du fichier resulatats
	var fileRes0 = Ti.Filesystem.getFile(Ti.Filesystem.applicationDataDirectory,"ResUniversite.json");
	if (!fileRes0.exists) {
		fileRes0.createFile();
	}
	//fileRes.write(JSON.stringify(content));
	var preParseData0 = (fileRes0.read().text);
	var contentS0 = JSON.parse(preParseData0); 
	
	

	switch(repUser[0]) {
	    case 'Tres satisfaisant' :
	        contentS0.rep1[0].choix1 += 1 ;
	        break;
	    case 'Satisfaisant' :
	        contentS0.rep1[0].choix2 += 1 ;
	        break;
	    case 'Peu satisfaisant' :
	        contentS0.rep1[0].choix3 += 1 ;
	        break;
	    case 'Insatisfaisant' :
	        contentS0.rep1[0].choix4 += 1 ;
	        break;
	    default:
	        break;
							}
						
		switch(repUser[1]) {
	    case 'Tres satisfaisant' :
	        contentS0.rep2[0].choix1 += 1 ;
	        break;
	    case 'Satisfaisant' :
	        contentS0.rep2[0].choix2 += 1 ;
	        break;
	    case 'Peu satisfaisant' :
	        contentS0.rep2[0].choix3 += 1 ;
	        break;
	    case 'Insatisfaisant' :
	        contentS0.rep2[0].choix4 += 1 ;
	        break;
	    default:
	        break;
						}
    
    	switch(repUser[2]) {
	    case 'Tres satisfaisant' :
	        contentS0.rep3[0].choix1 += 1 ;
	        break;
	    case 'Satisfaisant' :
	        contentS0.rep3[0].choix2 += 1 ;
	        break;
	    case 'Peu satisfaisant' :
	        contentS0.rep3[0].choix3 += 1 ;
	        break;
	    case 'Insatisfaisant' :
	        contentS0.rep3[0].choix4 += 1 ;
	        break;
	    default:
	        break;}
	        
	    switch(repUser[3]) {
	    case 'Tres satisfaisant' :
	        contentS0.rep4[0].choix1 += 1 ;
	        break;
	    case 'Satisfaisant' :
	        contentS0.rep4[0].choix2 += 1 ;
	        break;
	    case 'Peu satisfaisant' :
	        contentS0.rep4[0].choix3 += 1 ;
	        break;
	    case 'Insatisfaisant' :
	        contentS0.rep4[0].choix4 += 1 ;
	        break;
	    default:
	        break;}
	    	switch(repUser[4]) {
	    case 'Tres satisfaisant' :
	        contentS0.rep5[0].choix1 += 1 ;
	        break;
	    case 'Satisfaisant' :
	        contentS0.rep5[0].choix2 += 1 ;
	        break;
	    case 'Peu satisfaisant' :
	        contentS0.rep5[0].choix3 += 1 ;
	        break;
	    case 'Insatisfaisant' :
	        contentS0.rep5[0].choix4 += 1 ;
	        break;
	    default:
	        break;}
    
    fileRes0.write(JSON.stringify(contentS0));
    repUser = [0,0,0,0,0];
    
});

//// End Events handle
