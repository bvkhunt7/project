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

<%@page import="com.axelor.restdemo.domain.Contact"%>
<%@page import="java.util.List"%>
<%@page import="com.axelor.restdemo.domain.Person"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<style>
body {
  background-color: white;
}

h1 {
  color: black;
  text-align: center;
}

#para1 {
  text-align: center;
  color: red;
}
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>

</head>
<body>

	<h1>Contact Book</h1>
	
		<form method="post" action="<%=request.getContextPath() %>/insert">
	<p id="para1">	<table border="2px">
				<tr><td>Name:<br><input type="text" name="name" ><br></td>

				</tr>

				<tr>

				<td>Contact:<br><input type="text" name="contact" pattern="[1-9]{1}[0-9]{9}" required><br></td>

 			    </tr>

 			    <tr>

 			    <td><input type="submit" value="Submit1" name="btn" >

			    </tr>

			   	</form>  

	</table>  </p>
	
	
	
	
	<table>
	

		<%
			List<Person> studentList = (List<Person>) request.getAttribute("perlist");
			for (Person item : studentList) {
				List<Contact> listofContact1 = item.getLaps();
				for (Contact items:listofContact1){
		%>
		<form method="post">
		<table border="2px">
			<tr>	
			<td><input type="text" name="id" value="<%=item.getId()%>"> </td>
	
			<td><input type="text" name="name" value="<%=item.getName()%>"></td>

			<td><input type="text" name="contact" value="<%=items.getCno()%>"> </td>
				
			<td><input type="text" name="cid" value="<%=items.getCid()%>"> </td>
	
 			<td><button name="button" value="OK" type="submit"onClick = "form.action='<%=request.getContextPath() %>/delete'" >Delete</button>  </td>
 		   
 		   <td><button name="ubutton" value="update" type="submit" onClick ="form.action='<%=request.getContextPath() %>/update'">Update</button>  </td>

			</tr>
			</table>
			   	</form>  
			<%
				}}
			%>
         
         
         <form method="post" action="<%=request.getContextPath() %>/search">
	<p id="para1">	<table border="2px">
				<tr><td>Name:<br><input type="text" name="search" ><br></td>
				</tr>
 			    <tr>
 			    <td><input type="submit" value="Search" name="btn" >
			    </tr>
			   	</form>  

	</table>  </p>
	
	
         
         
         
         
         
         

</body>
</html>



