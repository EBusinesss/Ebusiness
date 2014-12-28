/**
 * @author LAMGHAARI Mohammed & MAAD Ali & MASOCCO Angelina
 */

var win = Ti.UI.currentWindow;

var winSondage1 = Titanium.UI.createWindow({  
    title:'Sondages',
    backgroundColor:'dimgray',
    url: "/lib/sondage1.js"
});

var winSondage2 = Titanium.UI.createWindow({  
    title:'Sondages',
    backgroundColor: 'dimgray',
    url: "/lib/sondage2.js"
});

var winSondage3 = Titanium.UI.createWindow({  
    title:'Sondages',
    backgroundColor: 'dimgray',
    url: "/lib/sondage3.js"
});

var winSondage4 = Titanium.UI.createWindow({  
    title:'Sondages',
    backgroundColor: 'dimgray',
    url: "/lib/sondage4.js"
});

var winSondage5 = Titanium.UI.createWindow({  
    title:'Sondages',
    backgroundColor: 'dimgray',
    url: "/lib/sondage5.js"
});


var tableS = [ {leftImage:"/images/BU.png",title: "Bibliothèque universitaire",top: '5%',font:{ fontSize:20}}, 
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
        win.add(winSondage1);
        break;
    case 1:
        win.add(winSondage2);
        break;
    case 2:
        win.add(winSondage3);
        break;
    case 3:
        win.add(winSondage4);
        break;
    default:
        win.add(winSondage5);
}

    	//win.add(winSondage1);
    	e.rowData.setBackgroundColor('purple');
    	e.row.hasCheck = true;
    	lastSelectedSondages = e.rowData;
  };
  e.rowData.selected = !e.rowData.selected;
});

//// End Events handle