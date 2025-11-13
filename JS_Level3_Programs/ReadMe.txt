JQuery  -- >  It is a fast , lightweight and very popular JS Library
for adding animations , interactions , ajax functionality to you web application


give you one example

like in JS
 const element = document.getelementbyid("btn");
 element.addeventlistener ("click" , function(){

document.getelementbyid("output").innerHtML = "sdfsdf";

 })

 in JQuery

 $("#btn").click(function(){
    
    $("output").html("fslfjl")
 
 })

 Two ways to use Jquery // even for bootstrap in our projects 
 1) download a jquery/bootstrap  locally
 2) use CDN Links  --- for this we need always a internet connection

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script> 

3) syntax   :

$(selector).action()

for eg :  $("p").hide()

$ is a symbol to access jquery
selector -- define the elements ( tag , class, id , attributes , attributes values)
action() -- what we want to perform 


manipulation Dom in jquery

.text() -- to set or get the text
.html() -- set or get the content with html of selected elements
.val() -- set or get the value of a form



Just use some optimized tips :
Dom access  : cache selectors instead of repeatedly calling document.getElementById()
Loops :  use for or map instead of foreach
Network : use asyn/await with error hanling
Images : lazy load large images 
Code  : js / css -- cdn link bundle 

without optimization there will be 
repeated dom calls
no caching
multiple parallel ajax requests

with optimization
use promise.all() to fetch all data in parallel
update DOM once using a DocumentFragement 
use async/await for readibility


