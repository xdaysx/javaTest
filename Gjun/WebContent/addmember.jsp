<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<form action="addmember" method="post">
	<table border="0">
		<tr><td width="300"><td>
		<table align="center" border="0">
			<tr>
				<th>會員註冊
			<tr>
				<td><p>姓 &nbsp;名：<input type="text" name="name" size="20" required="required"></p>
					<p>帳 &nbsp;號：<input type="text" name="user" size="20" required="required"></p>
					<p>密 &nbsp;碼：<input type="password" name="password" size="20" required="required"></p>
					<p>電 &nbsp;話：<input type="tel" name="mobile" size="20" pattern="[0-9]{2}-[0-9]{8}" placeholder="02-12345678"></p>
					<p>手 &nbsp;機：<input type="tel" name="phone" size="20" pattern="[0-9]{10}" placeholder="0912345678"></p>
					<p>地 &nbsp;址：<input type="text" name="address" size="20" required="required"></p>
					<p>E-mail：<input type="email" name="email" size="20" placeholder="abc@gmail.com"></p>
					<p>TYPE：<select name="type">
							<option value="member">member
							<option value="admin">admin
							</select></p>				
			<tr>
				<td align="center">
					<input type="submit" value="ok">
					<input type="reset" value="clear">
			
		</table>
	</table>
</form>
</body>
</html>