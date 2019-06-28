
<%@page import="com.axelor.restdemo.domain.Contact"%>
<%@page import="java.util.List"%>
<%@page import="com.axelor.restdemo.domain.Person"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<form method="post" >

				<td><input type="text" name="id" value="<%=request.getParameter("id")%>"></td>
		
		<td><input type="text" name="name" value="<%=request.getParameter("name")%>"></td>
			
			<td><input type="text" name="contact" value="<%=request.getParameter("contact")%>"></td>
			
			<td><input type="text" name="cid" value="<%=request.getParameter("cid")%>"></td>

<!-- 		<td><button name="dbtn" value="delete" type="submit">Delete</button> -->
		
		 <td><button name="ubutton" value="update" type="submit" onClick ="form.action='<%=request.getContextPath() %>/edit'"> Update</button> 

		</tr>
			   	</form>
			   	
			   	</body>
			   	</html>    