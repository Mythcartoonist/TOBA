<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/includes/header.html" />
<html>
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
    <c:if test="${message != null}">
        <p><i>${message}</i></p>
    </c:if>
   <form name="resetPassword" method="post" action="reset">
	<input type="hidden" name="action" value="add">
	<fieldset><legend>Reset Password</legend>
	<label>Password Reset: <input type="password" name="rpass" id="rpass" required></label><br><br>
	</fieldset>
	<input type="submit" value="Reset Password">
	</form>
</div>
    <c:import url="/includes/footer.jsp" />