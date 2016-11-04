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
   <h2>Successfully registered!</h2>
   
   <p>Here is the information that you entered:</p>
   <label>First Name:</label>
   <span>${user.fname}</span><br>
   <label>Last Name:</label>
   <span>${user.lname}</span><br>
   <label>Phone Number:</label>
   <span>${user.phone}</span><br>
   <label>Address:</label>
   <span>${user.address}</span><br>
   <label>City:</label>
   <span>${user.city}</span><br>
   <label>State:</label>
   <span>${user.state}</span><br>
   <label>Zipcode:</label>
   <span>${user.zipcode}</span><br>
   <label>Email:</label>
   <span>${user.email}</span><br>
   <br>
   <p>Here is your username and password:</p>
   <label>Username:</label>
   <span>${user.username}</span><br>
   <label>Password:</label>
   <span>${user.password}</span><br>
</div>
    <c:import url="/includes/footer.jsp" />