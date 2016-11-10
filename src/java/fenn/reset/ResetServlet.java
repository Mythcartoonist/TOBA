package fenn.reset;
 
import java.io.*;
import fenn.user.User;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResetServlet extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
                HttpSession session = request.getSession();
		String url = "/account_activity.jsp";
		
		String action = request.getParameter("action");
		if ( action == null) {
			action = "reset";
		}
		
		if (action.equals("reset")) {
			url = "/account_activity.jsp";
		}
		else if (action.equals("add")) {
                        User user = (User)session.getAttribute("user");
			String password = request.getParameter("rpass");
                        
                        String message;
                        if (password == null || password.isEmpty()) {
                            message = "Please fill out all text boxes.";
                            url = "/password_reset.jsp";
                        }
                        else {
                            message = null;
                            password = user.getPassword();
                            url = "/account_activity.jsp";
                        }
                        session.setAttribute("password", password);
                        request.setAttribute("message", message);
		}   
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request,response);
    }
}
