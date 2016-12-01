//list for testing
var currentPage = 0;
var pageDivision;

function buildList(resourceList){
	pageDivision = Math.ceil((resourceList.length/12));
	var itemCounter = 0;
	var projectList = new Array();
	for(var i = 0; pageDivision > i;i++){
		var pageArray = new Array();
		for(var j = 0; (j < 12) && (itemCounter < resourceList.length) ; j++, itemCounter++){
				pageArray.push(resourceList[itemCounter]);
			}
		projectList.push(pageArray);
		}
	return projectList;
	}
	
function loadList(resourceList, resourceList2){ //test code
	document.getElementById("mainList").innerHTML = ""; //clearPage
	var z = 1;
	var currentPageProject = resourceList[currentPage];
	for(var i = 0; i < currentPageProject.length; i++){
		document.getElementById("mainList").appendChild(buildItem(currentPageProject[i][0],currentPageProject[i][1],currentPageProject[i][2],currentPageProject[i][3],currentPageProject[i][4]));
	}
	for(i = 0; i < currentPageProject.length; i++){
		for(var j = 0; j < 3; j++){	
			document.getElementById("collapseBody"+currentPageProject[i][0].replace(/\s+/g, '')).appendChild(buildItem(resourceList2[0][0]+" "+z,resourceList2[0][1]));
			z++;
		}
	}
}

function sortList(sortType, resourceList){
	var sortListArr = resourceList;	
	sortListArr.sort(function (a,b) {
    if (a[sortType] > b[sortType]) return  1;
    if (a[sortType] < b[sortType]) return -1;
    return 0;
});
	return sortListArr;
	}

function rotate(id){
	if(document.getElementById(id+"_a").className == "rotate270")
	{
		document.getElementById(id+"_a").className = "rotate90";
		for(var i = 0; i < itemList.length; i++)
		{			
			if(!(itemList[i][0].replace(/\s+/g, '') == id))
			{				
			document.getElementById(itemList[i][0].replace(/\s+/g, '')+"_a").className = "rotate270";
			}	
		}
	}
	else
	{
		document.getElementById(id+"_a").className = "rotate270";
	}		
	}

function searchList(resourceList){
	var searchTerm = document.getElementById("ResourceSearchBar").value;
	var itemListSorted = new Array();//random stuff for testing
	for(var i = 0; i < resourceList.length; i++){
		var resourceName = resourceList[i][0].toLowerCase();
		if((resourceName.match(searchTerm.toLowerCase()))){
				itemListSorted.push(resourceList[i]);
			}	
	}
	return itemListSorted;
}

function buildItem(name, Init, type, role, date){
var Name = name.replace(/\s+/g, '');
//var div;	
var builtItem = document.createElement("div");
builtItem.setAttribute("id", Name);
builtItem.setAttribute("class", "panel panel-default");	
var paneldiv = document.createElement("div");
paneldiv.setAttribute("class", "panel-heading");
builtItem.appendChild(paneldiv);
var rowdiv = document.createElement("div");
rowdiv.setAttribute("class", "row");
paneldiv.appendChild(rowdiv);
//Title
var div = document.createElement("div");
div.setAttribute("class", "col-lg-5");
rowdiv.appendChild(div);
var h4 = document.createElement("h4");
h4.setAttribute("id", Name+"ID");
h4.setAttribute("class", "panel-title");
h4.setAttribute("align", "center");
div.appendChild(h4);
if(!Init){
var a = document.createElement("a");
a.setAttribute("data-toggle", "collapse");
a.setAttribute("data-parent", "#mainList");
a.setAttribute("href", "#collapse"+Name);
a.setAttribute("onclick", "rotate(\""+Name+"\");");
var img = document.createElement("img");
img.setAttribute("id", Name+"_a");
img.setAttribute("src", "images/down-arrow.png");
img.setAttribute("width", "10");
img.setAttribute("class", "rotate270");
a.appendChild(img);
h4.appendChild(a);
}
var button = document.createElement("button");
button.setAttribute("class", "btn-link");
if(!Init){
	button.setAttribute("onclick", "navProject(\""+Name+"\");");
	}
if(Init){
	button.setAttribute("onclick", "navInitiative(\""+Name+"\");");
}
h4.appendChild(button);
var buttonText = document.createTextNode("		  "+name);
button.appendChild(buttonText); 

if(!(Init) || type=="Initiative"){
//Type
div = document.createElement("div");
div.setAttribute("class", "col-lg-4");
h4 = document.createElement("h4");
h4.setAttribute("class", "panel-title");
h4.setAttribute("align", "center");
var h4Text = document.createTextNode(type);
h4.appendChild(h4Text); 
div.appendChild(h4);
rowdiv.appendChild(div);
//Role
div = document.createElement("div");
div.setAttribute("class", "col-lg-4");
h4 = document.createElement("h4");
h4.setAttribute("class", "panel-title");
h4.setAttribute("align", "center");
h4Text = document.createTextNode(role);
h4.appendChild(h4Text); 
div.appendChild(h4);
rowdiv.appendChild(div);
//Date
div = document.createElement("div");
div.setAttribute("class", "col-lg-4");
h4 = document.createElement("h4");
h4.setAttribute("class", "panel-title");
h4.setAttribute("align", "center");
h4Text = document.createTextNode(date);
h4.appendChild(h4Text); 
div.appendChild(h4);
rowdiv.appendChild(div);	
var collapsediv = document.createElement("div");
collapsediv.setAttribute("id", "collapse"+Name);
collapsediv.setAttribute("class", "panel-collapse collapse");
builtItem.appendChild(collapsediv);
div = document.createElement("div");
div.setAttribute("class", "panel-body");
div.setAttribute("id", "collapseBody"+Name);
collapsediv.appendChild(div);
}

return builtItem;
}