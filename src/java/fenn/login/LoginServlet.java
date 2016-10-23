/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenn.login;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class LoginServlet extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
		String url = "/login_failure.html";
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		
		
		if ( "jsmith@toba.com".equals(username) && "letmein".equals(password) ) {
			url = "/account_activity.html";
		}
                else {
			url = "/login_failure.html";
		}
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request,response);
    }
}
