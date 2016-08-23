<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Hello World</title>
</head>
<body>
   <h2>All Customers</h2>

<s:if test="employeeList.size() > 0">
<table border="1px" cellpadding="8px">
	<tr>
		<th>Id</th>
		<th>firstname</th>
		<th>lastname</th>
		<th>salary</th>
		
	</tr>
	<s:iterator value="employeeList" status="userStatus">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="firstName" /></td>
			<td><s:property value="lastName" /></td>
			<td><s:property value="salary" /></td>
			
		</tr>
	</s:iterator>
</table>
</s:if>
<br/>
<br/>
</body>
</html>