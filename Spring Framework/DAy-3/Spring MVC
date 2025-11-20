Spring MVC (Model–View–Controller) is a framework built on the Servlet API to build web applications.
It follows the MVC design pattern, where:

Model → Data/Business logic (POJOs, services, DAO).

View → UI (JSP, Thymeleaf, HTML, etc.).

Controller → Handles requests, interacts with Model, and selects View.

Flow of Spring MVC (Step by Step)
1. User sends request

A user enters a URL in the browser or clicks a link/button.

Example:

http://localhost:8080/myapp/hello

2. Request goes to DispatcherServlet

The request is first intercepted by DispatcherServlet (Front Controller).

DispatcherServlet is configured in web.xml (old style) or via @SpringBootApplication (in Spring Boot).

 It acts as the central hub that controls the flow of Spring MVC.

3. DispatcherServlet consults HandlerMapping

DispatcherServlet asks HandlerMapping: “Which Controller should handle this URL?”

HandlerMapping finds the correct Controller method (using @RequestMapping / @GetMapping etc.).

4. Controller handles the request

The Controller method executes.

It may call the Service layer → DAO layer → Database.

Example:

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, Spring MVC!");
        return "welcome";   // logical view name
    }
}

5. Controller returns Model & View name

Controller gives back:

Model data → stored in Model object (message in above code).

View name → e.g., "welcome".

6. DispatcherServlet consults ViewResolver

DispatcherServlet now calls ViewResolver to map the logical view name ("welcome") to an actual view page.

Example: welcome.jsp inside /WEB-INF/views/.

7. View (JSP/Thymeleaf) is rendered

The view technology (JSP/Thymeleaf) merges the model data into the UI.

Example (welcome.jsp):

<h1>${message}</h1>

8. Response sent to browser

Final HTML is generated and sent back to the client’s browser.

Summary ----- Steps

Client → sends request

DispatcherServlet → front controller

HandlerMapping → finds controller

Controller → executes business logic, returns Model + View name

ViewResolver → resolves logical view to physical JSP/HTML

DispatcherServlet → renders view with model data

Client → receives response (HTML page)

 Example in real life:

User submits a login form (/login).

DispatcherServlet → sends to LoginController.

Controller checks DB (via Service/DAO).

If success → returns home.jsp with user details.

ViewResolver resolves home.jsp.

Browser displays the home page.
