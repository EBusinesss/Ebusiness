/**
 * @author LAMGHAARI Mohammed & MAAD Ali & MASOCCO Angelina
 */

var win = Ti.UI.currentWindow;

var winResS0 = Titanium.UI.createWindow({  
    title:'Résulatats du Sondages',
	backgroundColor:'lightgray',
    url: "/lib/ResSondage0.js"
});

var winResS1 = Titanium.UI.createWindow({  
    title:'Résulatats du Sondages',
	backgroundColor:'lightgray',
    url: "/lib/ResSondage1.js"
});

var winResS2 = Titanium.UI.createWindow({  
    title:'Résulatats du Sondages',
	backgroundColor:'lightgray',
    url: "/lib/ResSondage2.js"
});

var winResS3 = Titanium.UI.createWindow({  
    title:'Résulatats du Sondages',
	backgroundColor:'lightgray',
    url: "/lib/ResSondage3.js"
});

var winResS4 = Titanium.UI.createWindow({  
    title:'Résulatats du Sondages',
	backgroundColor:'lightgray',
    url: "/lib/ResSondage4.js"
});

var winResS5 = Titanium.UI.createWindow({  
    title:'Résulatats du Sondages',
	backgroundColor:'lightgray',
    url: "/lib/ResSondage5.js"
});


var tableS = [ {leftImage:"/images/UVHC.png",title: "Universite",top: '5%',font:{ fontSize:20}},
			   {leftImage:"/images/BU.png",title: "Bibliothèque universitaire",font:{ fontSize:20}}, 
			   {leftImage:"/images/Trains.png",title: "Trains",font:{ fontSize:20}}, 
			   {leftImage:"/images/Transports.png",title: "Transports",font:{ fontSize:20}},
			   {leftImage:"/images/Titanium.png",title: "Titanium",font:{ fontSize:20}},
			   {leftImage:"/images/Windows.png",title: "Windows",font:{ fontSize:20}}];
var tableSondages = Ti.UI.createTableView({
  data: tableS
});


win.add(tableSondages);

//// Events handle


var lastSelectedSondages =null;
tableSondages.addEventListener('click',function(e){
	
  if (!e.rowData.selected) 
  {
    	if (lastSelectedSondages != null) 
    	{
    		lastSelectedSondages.setBackgroundColor('white');
    		lastSelectedSondages.selected = false;
    		lastSelectedSondages.hasCheck = false;
    	};
    	
    //alert(repUser[1]);
	//alert('title: \'' + e.row.title + '\', index: ' + e.index); 
	
	//alert(e.index);
	switch(e.index) {
    case 0:
        win.add(winResS0);
        break;
    case 1:
        win.add(winResS1);
        break;
    case 2:
        win.add(winResS2);
        break;
    case 3:
        win.add(winResS3);
        break;
    case 4:
        win.add(winResS4);
        break;
    default:
        win.add(winResS5);
}

    	//win.add(winSondage1);
    	e.rowData.setBackgroundColor('purple');
    	e.row.hasCheck = true;
    	lastSelectedSondages = e.rowData;
  };
  e.rowData.selected = !e.rowData.selected;
});

//// End Events handle