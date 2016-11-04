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
    <c:if test="${message != null}">
        <p><i>${message}</i></p>
    </c:if>
   <form method="post" action="signup">
	<fieldset><legend>Sign Up</legend>
	<label>First Name: <input type="text" name="fname" id="fname"></label><br><br>
	<label>Last Name: <input type="text" name="lname" id="lname"></label><br><br>
	<label>Phone: <input type="text" name="phone" id="phone"></label><br><br>
	<label>Address: <input type="text" name="address" id="address"></label><br><br>
	<label>City: <input type="text" name="city" id="city"></label><br><br>
	<label>State: <input type="text" name="state" id="state"></label><br><br>
	<label>Zipcode: <input type="text" name="zipcode" id="zipcode"></label><br><br>
	<label>Email: <input type="email" name="email" id="email"></label><br><br>
	</fieldset>
	<input type="submit" value="Sign Up"> <input type="reset">
	</form>
</div>
    <c:import url="/includes/footer.jsp" />