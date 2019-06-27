<html>
<body>
	<form method="post" action = "<%=request.getContextPath() %>/resteasy/name">

				<td><input type="text" name="did"
			value="<%=request.getParameter("id")%>"></td>
		<td><input type="text" name="dname"
			value="<%=request.getParameter("name")%>"></td>
			<td><input type="text" name="udname"
			value="<%=request.getParameter("contact")%>"></td>
			
			<td><input type="text" name="cid"
			value="<%=request.getParameter("cid")%>"></td>
		<td><button name="dbtn" value="delete" type="submit">Delete</button>
<!-- 		 <td><button name="ubtn" value="update" type="submit"  >Update</button>  -->
		</tr>
			   	</form>
</body>
</html>
