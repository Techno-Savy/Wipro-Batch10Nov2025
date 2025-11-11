

//add event listener  will capture the form submission event triggered by the submit button
document.getElementById("myForm").addEventListener('submit' , function(event){
event.preventDefault(); // prevents default form submission (a page reload)

let userName = document.getElementById('username').value;
let userAge = document.getElementById('age').value;

if(userName == "" && age == "")
    alert("Username and age window can not be blank");
  
console.log(userName);
console.log(userAge);
alert('Form submitter! ' + userName);

});