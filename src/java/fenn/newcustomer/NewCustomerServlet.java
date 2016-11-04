package fenn.newcustomer;
 
import java.io.*;
import fenn.user.User;
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
                        String username = lname + zipcode;
                        String password = "welcome1";
			
			User user = new User(fname, lname, phone, address, city, 
                        state, zipcode, email, username, password);
                        
                        String message;
                        if (fname == null || lname == null || phone == null ||
                                address == null || city == null || state == null
                                || zipcode == null || email == null || fname.isEmpty() ||
                                lname.isEmpty() || phone.isEmpty() || address.isEmpty() ||
                                city.isEmpty()|| state.isEmpty() || zipcode.isEmpty() ||
                                email.isEmpty()) {
                            message = "Please fill out all three text boxes.";
                            url = "/new_customer.jsp";
                        }
                        else {
                            message = null;
                            url = "/success.jsp";
                        }
                        request.setAttribute("user", user);
                        request.setAttribute("message", message);
		}   
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request,response);
    }
}
