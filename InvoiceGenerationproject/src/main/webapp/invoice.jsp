<%@page import="java.util.List"%>
<%@page import="com.example.firstdynamic.Entity.ZohoInvoice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="/invoicepdf">
      <label>download pdf format</label>
            <input type="submit" value="Clickhere"><br> <br>
      <br>
         <a href="/home.jsp"> logout</a>
      
      </form>
      
</body>
</html>