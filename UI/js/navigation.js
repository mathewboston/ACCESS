// JavaScript Document

function buildPageBar(){
	document.getElementById("ResourcesPagination").innerHTML = "";
	//Previous
	var li = document.createElement("li");
	var a = document.createElement("a");
	a.setAttribute("href", "#");
	a.setAttribute("aria-label", "Previous");
	a.setAttribute("onClick", "prevPageNav();");
	var span = document.createElement("span");
	span.setAttribute("aria-hidden", "true");
	var spanText = document.createTextNode('\u00ab');
	span.appendChild(spanText);
	a.appendChild(span);
	li.appendChild(a);
	document.getElementById("ResourcesPagination").appendChild(li);
	
	//Pages
	for(var i = 1; i<=pageDivision;i++){
			li = document.createElement("li");
			li.setAttribute("id", "page"+i);
			if(i == 1){
				li.setAttribute("class", "active");
			}
			a = document.createElement("a");
			a.setAttribute("href", "#");
			a.setAttribute("onClick", "pageNav("+i+");");
			spanText = document.createTextNode(i);
			a.appendChild(spanText);
			li.appendChild(a);
			document.getElementById("ResourcesPagination").appendChild(li);	
		}
		
	//Next
	li = document.createElement("li");
	a = document.createElement("a");
	a.setAttribute("href", "#");
	a.setAttribute("aria-label", "Next");
	a.setAttribute("onClick", "nextPageNav();");
	span = document.createElement("span");
	span.setAttribute("aria-hidden", "true");
	spanText = document.createTextNode('\u00bb');
	span.appendChild(spanText);
	a.appendChild(span);
	li.appendChild(a);
	document.getElementById("ResourcesPagination").appendChild(li);
}

function navResource(){
	document.getElementById("ResourcesPage").className += " active";
	document.getElementById("ResourcesContent").hidden = false;
	document.getElementById("DirectoryContent").hidden = true;
	document.getElementById("AnalysisContent").hidden = true;
	document.getElementById("DirectoryPage").className = document.getElementById("DirectoryPage").className.replace( /(?:^|\s)active(?!\S)/g , '' );
	document.getElementById("AnalysisPage").className = document.getElementById("AnalysisPage").className.replace( /(?:^|\s)active(?!\S)/g , '' );
	document.getElementById("ResourcesList").hidden = false;
	document.getElementById("projectPage").hidden = true;
	document.getElementById("initiativePage").hidden = true;
	document.getElementById("activityPage").hidden = true;
}

function navDirectory(){
	document.getElementById("DirectoryPage").className += " active";
	document.getElementById("ResourcesContent").hidden = true;
	document.getElementById("DirectoryContent").hidden = false;
	document.getElementById("AnalysisContent").hidden = true;
	document.getElementById("ResourcesPage").className = document.getElementById("ResourcesPage").className.replace( /(?:^|\s)active(?!\S)/g , '' );
	document.getElementById("AnalysisPage").className = document.getElementById("AnalysisPage").className.replace( /(?:^|\s)active(?!\S)/g , '' );	
	document.getElementById("projectPage").hidden = true;
	document.getElementById("initiativePage").hidden = true;
	document.getElementById("activityPage").hidden = true;
}

function navAnalysis(){
	document.getElementById("AnalysisPage").className += " active";
	document.getElementById("ResourcesContent").hidden = true;
	document.getElementById("DirectoryContent").hidden = true;
	document.getElementById("AnalysisContent").hidden = false;
	document.getElementById("ResourcesPage").className = document.getElementById("ResourcesPage").className.replace( /(?:^|\s)active(?!\S)/g , '' );
	document.getElementById("DirectoryPage").className = document.getElementById("DirectoryPage").className.replace( /(?:^|\s)active(?!\S)/g , '' );
	document.getElementById("projectPage").hidden = true;
	document.getElementById("initiativePage").hidden = true;
	document.getElementById("activityPage").hidden = true;
}

function prevPageNav(){
	if(currentPage>0)
		pageNav(currentPage);
	}

function nextPageNav(){
	if(currentPage+1 < pageDivision)
		pageNav(currentPage+2);
	}

function pageNav(pageNumber){
	document.getElementById("page"+(currentPage+1)).className = "";
	currentPage = pageNumber-1;
	document.getElementById("page"+pageNumber).className = "active";
	loadList(itemList3);
	}

function navProject(projectName){
	document.getElementById("ResourcesPage").className = document.getElementById("ResourcesPage").className.replace( /(?:^|\s)active(?!\S)/g , '' );
	document.getElementById("ResourcesList").hidden = true;
	document.getElementById("projectPage").hidden = false;
	document.getElementById("initiativePage").hidden = true;
	document.getElementById("activityPage").hidden = true;
	//populateProjectPage(projectName);
	}

function navInitiative(initiatveName){
	document.getElementById("ResourcesPage").className = document.getElementById("ResourcesPage").className.replace( /(?:^|\s)active(?!\S)/g , '' );
	document.getElementById("ResourcesList").hidden = true;
	document.getElementById("projectPage").hidden = true;
	document.getElementById("initiativePage").hidden = false;
	document.getElementById("activityPage").hidden = true;
	//populateInitiativePage(initiatveName);
	}

function navActivity(activityName){
	document.getElementById("ResourcesPage").className = document.getElementById("ResourcesPage").className.replace( /(?:^|\s)active(?!\S)/g , '' );
	document.getElementById("ResourcesList").hidden = true;
	document.getElementById("projectPage").hidden = true;
	document.getElementById("initiativePage").hidden = true;
	document.getElementById("activityPage").hidden = false;
	//populateActivityPage(activityName);
	}