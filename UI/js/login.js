// JavaScript Document
//var bool = false;
	
function signIn(){
document.getElementById("logoutButton").innerHTML = "Sign in";
document.getElementById("username").innerHTML = "";
	document.getElementById("logoutButton").onclick = signOut;
}

function signOut(){
	document.getElementById("logoutButton").innerHTML = "Sign Out";
	document.getElementById("username").innerHTML = "John Doe";
	document.getElementById("logoutButton").onclick = signIn;

}
