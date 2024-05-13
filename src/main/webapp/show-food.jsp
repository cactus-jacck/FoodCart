<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Menu</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
	<p> Food items coming soon </p>
       <table>
       	   <tr>
       	   		<th> Item Id </th>
       	   		<th> Item Name </th>
       	   		<th> Item Price </th>
       	   </tr>
	       <c:forEach items="${foodItems}" var="foodItem">
			   <tr>
			       	<td>${foodItem.id}</td>
			       	<td>${foodItem.name}</td>
			       	<td>${foodItem.price}</td>
			   </tr>
		   </c:forEach>
       </table>      
       
  </body>
</html>
