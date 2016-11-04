<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

<div id="wrapper">
  <header role="banner">
    <h1>TOBA Titan Online Banking Application</h1>
  </header>  
  <nav role="navigation">
    <ul>
	 <li><a href="index.html">Home</a></li>
     <li><a href="login.html">Login</a></li>
	</ul> 
   </nav>
   <form name="loginForm" method="post" action="login">
	<input type="hidden" name="action" value="add">
	<fieldset><legend>Login</legend>
	<label>Username: <input type="email" name="user" id="user" required></label><br><br>
	<label>Password: <input type="password" name="pass" id="pass" required></label><br><br>
	</fieldset>
	<input type="submit" value="Login"> <input type="reset">
	</form>
	<nav role="navigation">
	<a href="new_customer.html">New Customer Sign Up</a> <a href="password_reset.html">Reset Password</a>
	</nav>
</div>
<c:import url="/includes/footer.jsp" />