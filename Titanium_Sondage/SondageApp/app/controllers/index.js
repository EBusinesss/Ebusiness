// create tab group
var tabGroup = Titanium.UI.createTabGroup();
 
// create base UI tabs and  windows
 
var winQuestionnaire = Titanium.UI.createWindow({  
    title:'Questionnaire',
    backgroundColor:'#fff',
    url: "/lib/questionnaire.js"
});
var QuestionnaireTab = Titanium.UI.createTab({  
    icon:'/images/Questionnaire.png',
    //title:'Questionnaire',
    window:winQuestionnaire
});
 
var winSondages = Titanium.UI.createWindow({  
    title:'Liste des Sondages',
    backgroundColor:'#fff',
    url: "/lib/sondages.js"
});
var SondagesTab = Titanium.UI.createTab({  
    icon:'/images/Sondages.png',
    //title:'Sondages',
    window:winSondages
});
 
var winResultats = Titanium.UI.createWindow({  
    title:'Résultats et stats',
    backgroundColor:'#fff',
    url: "/lib/resultats.js"
});
var ResultatsTab = Titanium.UI.createTab({  
    icon:'/images/Statistiques.png',
    //title:'Statistiques',
    window:winResultats
});

var winAide = Titanium.UI.createWindow({  
    title:'Aide',
    backgroundColor:'#fff',
    url: "/lib/aide.js"
});
var AideTab = Titanium.UI.createTab({  
    icon:'/images/Aide.png',
    //title:'Aide',
    window:winAide
});


//  add tab
 
tabGroup.addTab(QuestionnaireTab);  
tabGroup.addTab(SondagesTab);  
tabGroup.addTab(ResultatsTab);
tabGroup.addTab(AideTab);
// open tab group
tabGroup.open();