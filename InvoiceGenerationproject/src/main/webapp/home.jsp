<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/webresources/css/mystyle.css"/>
</head>
<body>

<div class = "center">
   <h1>Login</h1>
    <form action="/logindata" method="post">
      <div class="txt_field">
      <span></span>
            <label> Userid :  </label> <br>
                  <input type="text" name = "email" required placeholder="Enter user Email"> <br>
                  <br>
      </div>  
            <div class="txt_field">
      <span></span>
            <label> Password :  </label> </div>
            <input type="password" name = "password" required placeholder="Enter password"><br> 
      
      <br>
     <input type="submit" value="login"> 
   <a href="/register.jsp"> Register here</a>
      
      
</form>
    </div>  
</body>
</html>