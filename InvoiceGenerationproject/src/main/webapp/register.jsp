<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration form</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/webresources/css/style.css"/>
</head>
<body>
<div class = "registration-form"> 
<h1>Registration form</h1>
<form action="/postdata" method="post">
      <label>firstname : </label> <br>
      <input type="text" name = "firstname" required placeholder="first name"><br>
      <label> lastname :  </label><br>
      <input type="text" name = "lastname" required placeholder="last name"><br>
      <label> Email :  </label><br>
      
      <input type="text" name = "email" required placeholder="Email"><br>
      <label> password :  </label><br>
      
      <input type="password" name = "password" required placeholder="password"><br> <br>
      <input type="submit" value="Register now"><br> <br>
      </form>
</div>
</body>
</html>