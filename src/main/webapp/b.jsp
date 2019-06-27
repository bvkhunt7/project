
<%@page import="com.axelor.restdemo.domain.Contact"%>
<%@page import="java.util.List"%>
<%@page import="com.axelor.restdemo.domain.Person"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
</head>
<body>

	<table>
	

		<%
			List<Person> studentList = (List<Person>) request.getAttribute("perlist");
			for (Person item : studentList) {
				List<Contact> listofContact1 = item.getLaps();
				for (Contact items:listofContact1){
		%>
		<form method="post" >
			<tr>	<td><input type="text" name="id" value="<%=item.getId()%>">
				</td>
				<td><input type="text" name="name"
					value="<%=item.getName()%>"></td>
					
					
					<td><input type="text" name="contact" value="<%=items.getCno()%>">
				</td>
				<td><input type="text" name="cid" value="<%=items.getCid()%>">
				</td>
 			    
<!--  			    <td><button name="button" value="OK" type="submit" onClick = "form.action='../delete.jsp'">Delete</button>  -->
<!--  			     <td><button name="ubutton" value="update" type="submit"onClick = "form.action='../delete.jsp'" >Update</button>  -->

			</tr>
			   	</form>  
			<%
				}}
			%>

	
		
		
	</table>
<!-- 	<form action="nbk" > -->
	
<!-- 	<input type = "text"   name="id" >	 -->
<!-- 	< -->
<!-- 	</form>  -->

</body>
</html>
