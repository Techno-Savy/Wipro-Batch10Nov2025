Servlet : It is used for creating web based applications

which resides on a server side where you deploy(install) your web application

To do the server side programming we will be creating a servlet and follow servlet api 


Web site is a collection of  Web pages ( static files like html , images , graphics )
Web Application  -- is a website but with dynamic finctionality on the server 

HTTP  : --  How server and client get connected :
			Its get connected with the help of Http to communicate with each other
			
			Protocol has certain set or rules that every developer has to follow like
			   api methods to access get , put ,post , delete , (which will help server to 
			   know that which type of request client has made CRUD
			
			
			
			Http is a stateless protocol  -- > it supports only one request per connection
			   	  for that we use session to make http as statefull 
			   	  
Web Server communicate with the servlets and to manage the life cycle of servlet we 
have web container

Before servlets we were using CGI (Common Gateway Interface) which is a cgi program in a seperate OS shell

so for

Drawback --- CGI takes so much time to create the new process for every requests and requires server resources. So, it will limit the number of requests that a server can handle.
high response time because CGI programs execute in their own OS shell
 which is not platform independent. CGI is not scalable , it is not secure or object oriented.
 
 advantages of using Servlets 
 ---- Less response time because each request runs in a separate thread
   servlets are scalable
   servlets are object oriented
   servlets are platform independent
 
 
  Creating a Servlet

There are three different ways by which we can create a servlet.

By implementing the Servlet interface.
By extending the GenericServlet class. ( It is an abstract class) which is an abstract implementation of the servlet interface
It is necessary to extend the HTTPServlet class.


