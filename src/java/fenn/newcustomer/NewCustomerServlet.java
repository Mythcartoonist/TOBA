package fenn.newcustomer;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NewCustomerServlet extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
		String url = "/new_customer.html";
		
		String action = request.getParameter("action");
		if ( action == null) {
			action = "signup";
		}
		
		if (action.equals("signup")) {
			url = "/new_customer.html";
		}
		else if (action.equals("add")) {
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String zipcode = request.getParameter("zipcode");
			String email = request.getParameter("email");
			
			url = "/success.html";
		}   
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request,response);
    }
}
