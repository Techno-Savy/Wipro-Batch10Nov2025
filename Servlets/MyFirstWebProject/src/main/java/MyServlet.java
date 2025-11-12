import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet implements Servlet {

	ServletConfig config = null;
	
	
	
	// This method is called by servlet continer at the end of servlet life cycle . Unlike service() that gets called multiple times during life cycle , this 
	//method is called only once by servlet container during the complete life cycle .Once destroy() method is called the servlet container 
	// does not call the service() method for that servlet.
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet life cycle destroyed");
	}

	// It will returns a servlet config object which contains initialization and start up parameters for this servlet
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "A Demo Program written by me";
	}

	// When servlet container starts up ( that happens when the web server starts up) it loads all the servlets and instantiates them 
	// after this init() method gets called for each instantiated servlet , this methds initializes the servlet ( and will be called only once)
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
		System.out.println("Intilization Completed");
	}

	// This is the only method that is called multiple times during servlet life cycle . This methods serves the client request , it is called every time the server receives a request.
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = arg1.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.println("<h5>Called by service method directly</h5>");
		
		pw.print("</body>");
		pw.print("</html>");
	}
	
	
	
	
	
	
	
	
	
	
	
//	private static final long serialVersionUID = 1L;
//
//    /**
//     * Default constructor. 
//     */
//    public MyServlet() {
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
