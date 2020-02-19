<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

</head>
<body>
<font size="70px" color="#400000" face="fantasy">Login</font>
<table>
<tr>
	<th bgcolor="#400000" height="5" width="930">
<tr><td height="20">
<tr><td>
<form action="login" method="post">
	<table border="0">
		<tr><td width="300"><td>
		<table align="center" border="0">
			<tr>
				<th>會員登入
			<tr>
				<td><p>帳號：<input type="text" name="user" size="20" required="required"></p>
					<p>密碼：<input type="password" name="password" size="20" required="required"></p>
			<tr>
				<td align="center">
					<input type="submit" value="ok">
					<input type="reset" value="clear">
			<tr>
				<td align="center">還不是會員?<a href="<c:url value='/addmember.jsp'/>">新增會員</a>
			
		</table>
	</table>
	
</form>
</table>
</body>
</html>