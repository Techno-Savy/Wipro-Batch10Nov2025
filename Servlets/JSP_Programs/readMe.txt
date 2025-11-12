JSP :-- JavaServer Pages is also a server side technology which allows to create dynamic , platform independent
web pages using java 

HTML is on client side and JSP is on server side  why we prefer jsp because it 
combines HTML with Java Code that executes on the server to generate dynamic content for users.

After processing the request of a client, 
 then server will combine the response of java (business logic) and Html(UI) and return to the client
 
 
 JSP Scripting elements ( For java Scripting) -- Scriptlet Tag , Expression Tag and Declaration Tag
 
 Scriptlet tag -- <%  %> -- Java Code --- the code inside a scriptlet it goes to the _jspService() method of the generated  servlet for processing the request .
 if multiple scriptlets are present in the code , then they are appended to this _jspService()
 
 Expression tag -- <%=  %> just like out.print here <%= %>also gets converted to out.print() only , This code will get written to the output stream
 
 Declaration tag --  <%!  %> --- it is used to declare classes / instances / inner class /variables / methods as we can also declare in scriptlet tag but the difference is 
 that this declaration code doesn't go to _jspService() .. this code rather goes to the source file that gets generated outside the _jspService method
 
 JSP Directives -- Page Directive , include directive and TagLib Directive
 
 page directive  :  import , session , isErrorPage , language 
 define directive name like as below
 <%@ page import = "java.util.Date>
 
 
 JSP Action Tags-- Action Tags , include action ,forward action , 
 useBean - setProperty and getProperty
 JSP Custom Tags
 
 Expression Language 
 (EL)
 (JSTL)
 
 Implicit Objects in JSP 
 request
 response
 config
 application
 session
 out
 pageContext
 exception 
 validate Session
 
