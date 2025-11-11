Agenda :
Functional Programming and pure functions . 
     why pure funtions:  where we focus on what to do rather then how to do
      traditional functions are for , foreach -- Here we were focussing on what to do but also on how to do (Logic)

Pure functions are  :-- map() , reduce() and filter()
    we can apply these functional methods like for salary tracking , log file manipulation etc..

Differences between these three:
common array elements are : [45000 , 56000 ,34000] 
map() => when we want to transform each element in an array and it returns a new array

        ==> for eg:  I want to return a new array after adding a 10% bonus on diwali but the actual length of an array will be same as the older one

filter() => when we want to select specific elements that meet a condition or when we want to extract the data
        ==> for eg: would like to return the salary which is greater 20000

reduce() => when we want to return a single value after accumulating array values that we have or you want to summarize or to get aggregate data

        ==> we want to calculate the total sum of 10 natural no's  sum += sum+n


JSON ==> It is a lightweight data-interchange format used to store and exchange data between a client and a server.

there are different sources through which we can exchange the data transfer from server to client or client to server those are 
 xml ,  json , csv , mysql

 JSON is easy for everyone ( human) to read , write and easy to parse and generate results.

 In json data is stored in the form key and value pair
 eg:
 const employee =
{
"name" :"Niti",
"age" : 30,
"Department" : "training"
}

Here in json we JSON.parse(jsonString) (converts json string to js object) -- mainly used when receiving the data from a server
                and JSON.stringify(obj) (converts js object to json string) -- mainly used when sending data to a server


 Synchronous / Asynchronous Based - 
 Synchronous -- line by line , if there is any blocker then in that case the rest of the code will not work 
 it is slow in process

 how we implement :  XMLHttpRequest(sync mode) 

Asynchronous --- Next code runs immediately it's a non - blocker 
fetch() , XMLHttpRequest (async) , either Promise or fetch  , async/await

basically fetch() will return a Promise Object and 
        .then() will be called on that Promise object when it's fulfilled (means data is received) otherwise 
        .catch() will run if the Promise is rejected  ( network error or etc.)
 

