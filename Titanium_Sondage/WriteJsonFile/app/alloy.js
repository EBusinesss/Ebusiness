var file0 = Titanium.Filesystem.getFile("/ResBU.json");
var file1 = Titanium.Filesystem.getFile("/ResTrains.json");
var file2 = Titanium.Filesystem.getFile("/ResTransports.json");
var file3 = Titanium.Filesystem.getFile("/ResUniversite.json");
var file4 = Titanium.Filesystem.getFile("/ResTitanium.json");
var file5 = Titanium.Filesystem.getFile("/ResWindows.json");

var preParseData0 = (file0.read().text);
var preParseData1 = (file1.read().text);
var preParseData2 = (file2.read().text);
var preParseData3 = (file3.read().text);
var preParseData4 = (file4.read().text);
var preParseData5 = (file5.read().text);

alert(preParseData0);

var content0 = JSON.parse(preParseData0);
var content1 = JSON.parse(preParseData1);
var content2 = JSON.parse(preParseData2);
var content3 = JSON.parse(preParseData3);
var content4 = JSON.parse(preParseData4);
var content5 = JSON.parse(preParseData5);
//content.rep1[0].choix1 += 1;
//content.rep1[0].choix2 += 1;
//content.rep1[0].choix3 += 1;
//content.rep1[0].choix4 += 1;
//alert(content);

var fileRes0 = Ti.Filesystem.getFile(Ti.Filesystem.applicationDataDirectory,"ResBU.json");
var fileRes1 = Ti.Filesystem.getFile(Ti.Filesystem.applicationDataDirectory,"ResTrains.json");
var fileRes2 = Ti.Filesystem.getFile(Ti.Filesystem.applicationDataDirectory,"ResTransports.json");
var fileRes3 = Ti.Filesystem.getFile(Ti.Filesystem.applicationDataDirectory,"ResUniversite.json");
var fileRes4 = Ti.Filesystem.getFile(Ti.Filesystem.applicationDataDirectory,"ResTitanium.json");
var fileRes5 = Ti.Filesystem.getFile(Ti.Filesystem.applicationDataDirectory,"ResWindows.json");


if (!fileRes0.exists) {
	fileRes0.createFile();
}
fileRes0.write(JSON.stringify(content0));

if (!fileRes1.exists) {
	fileRes1.createFile();
}
fileRes1.write(JSON.stringify(content1));

if (!fileRes2.exists) {
	fileRes2.createFile();
}
fileRes2.write(JSON.stringify(content2));

if (!fileRes3.exists) {
	fileRes3.createFile();
}
fileRes3.write(JSON.stringify(content3));

if (!fileRes4.exists) {
	fileRes4.createFile();
}
fileRes4.write(JSON.stringify(content4));

if (!fileRes5.exists) {
	fileRes5.createFile();
}
fileRes5.write(JSON.stringify(content5));


var preParseData = (fileRes0.read().text);
alert(preParseData);




