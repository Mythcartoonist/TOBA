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
   <h2>Account Activity</h2>
   <c:if test="${username != null}">
   <p>Welcome!</p>
   <span>${user.fname} ${user.lname}</span>
   </c:if>
   
   <c:if test="${username == null}">
       <p>Not Logged In</p> 
   </c:if>
</div>
    <c:import url="/includes/footer.jsp" />
