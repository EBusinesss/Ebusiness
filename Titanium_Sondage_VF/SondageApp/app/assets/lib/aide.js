var win = Ti.UI.currentWindow;


var txt = '<h1>Développé par:</h1> <br>LAMGHARI Mohammed <br>MAAD Ali <br>MASOCCO Angelina';

var labelDev = Ti.UI.createLabel({
	text : txt,
	height : "auto",
	width : "auto",
	top: '10%',
	textAlign : 'center',
	font:{
    fontSize:18,
    fontWeight:'bold'
   		 },
});

win.add(labelDev);


