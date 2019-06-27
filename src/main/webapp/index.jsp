<!-- <!doctype html> -->
<!-- <html lang=""> -->
<!--   <head> -->
<!--     <meta charset="utf-8"> -->
<!-- <body> -->
<%-- <form method="post" action="<%=request.getContextPath() %>/resteasy/name"> --%>
 
<!--  Name:<br> -->
<!--   <input type="text" name="name" ><br> -->
<!--   Name:<br> -->
<!--    <input type="text" name="contact" ><br> -->
    
   
<!--   <input type="submit" value="Submit1" name="btn"> -->
<!-- </form> -->
<!--  </body> -->
<!-- </html> -->

<%@page import="java.util.List"%>
<%@page import="com.axelor.restdemo.domain.Person"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
</head>
<body>

	
	
		<form method="post" action="<%=request.getContextPath() %>/resteasy/name">
		<table border="2px">
				<tr><td>Name:<br><input type="text" name="name" ><br></td>

				</tr>

				<tr>

				<td>Contact:<br><input type="text" name="contact" ><br></td>

 			    </tr>

 			    <tr>

 			    <td><input type="submit" value="Submit1" name="btn" >

			    </tr>

			   	</form>  

	</table>


</body>
</html>



