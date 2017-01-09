$(document).ready(function(){

    $('#dropgrp').fadeIn("100");  
    $("#profile").fadeIn("100");
	$("#history").fadeOut();
	$("#result").fadeOut();	
	
	$("#profileb").click(function(){
 
	$("#profile").fadeIn("200");
	$("#history").fadeOut();
	$("#result").fadeOut();						  
						   					   
});
$("#historyb").click(function(){
	 
	$("#profile").fadeOut();
	$("#history").fadeIn("200");
	$("#result").fadeOut();		  
						   
						   
						   
						   
});
$("#resultb").click(function(){
	$("#profile").fadeOut();	
	$("#history").fadeOut();
	$("#result").fadeIn("200");							  
						   
						   
						   
						   
						   
});
});



$(document).on('click', '.dropdown-menu', function(e) {
    if ($(this).hasClass('keep-open-on-click')) { e.stopPropagation(); }
});

 

function search() { 

   var input, filter, ul, li, a, i;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    div = document.getElementById("Mydrop");
    a = div.getElementsByTagName("a");
        for (j = 0; j < a.length; j++)
        {
         for (i = 0; i < a[j].innerHTML.length; i++) {
    if(input.value.toLowerCase()!=a[i].innerHTML.substring(0,input.value.length).toLowerCase())
             a[i].style.display = "none";
            else
           a[i].style.display = "";            
           
            
            }
        
        } 
        
         
 
}

function put()
{
    div = document.getElementById("Mydrop");
 var a = div.getElementsByTagName("a");
 var h=document.getElementById("p");
h.innerHTML=a.length;

}
