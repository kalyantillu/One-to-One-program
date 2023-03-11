<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/webresources/css/welcomestyle.css"/>
</head>
<body>
<form action="/welcomedata" method="post">
      <label> From </label> <br>
      <label> Company Name : Zoho </label> <br>
      <label> Email :  zoho@gmail.com</label> <br><br>
            <label> To </label> <br>
      <label> Customer Name :  </label> <br>
      <input type="text" name = "customername" required placeholder="Enter customer name"><br>
      <label> Invoice Number :  </label> <br>
      <input type="text" name = "invoicenumber" required placeholder="Enter invoice number"><br>
      <label> Title :  </label> <br>
      <input type="text" name = "title"  required placeholder="Enter title name"><br>
      <label> Order Number : </label><br>
      <input type="text" name = "ordernumber" required placeholder="Enter order number"><br>
      <label> Customer Email :  </label><br>
      <input type="text" name = "customeremail" required placeholder="Enter customer email"><br>
      <label> Customer Address :  </label><br>
      <input type="text" name = "customeraddress" required  placeholder="Enter customer address"><br>
      <label> Description :  </label><br>
      <input type="text" name = "description" required placeholder="Enter description"><br>
      <label> Total Amount :  </label><br>
      <input type="text" name = "amount" required placeholder="Enter amount"><br> <br>
      
      <input type="submit" value="Save"><br> <br>
      </form>
       <form action="/showdata">
      <label>The invoice details are </label>
            <input type="submit" value="Clickhere"><br> <br>
      
      </form>
      </body> <br><br>
      
     
</html>  

