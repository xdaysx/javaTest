<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.porder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%porder p=(porder)session.getAttribute("P"); %>
<body>

<font size="70px" color="#400000" face="fantasy">Confirm</font>
<table>
<tr>
	<th bgcolor="#400000" height="5" width="930">
<tr>
	<td>
	<form action="../ok1" method="post">
		<table align="center">
			<tr>
				<th><%=p.getName() %>這是你的訂單細目<br>
			<tr>
				<td>鮮奶吐司：<%=p.getPro1() %>
			<tr>
				<td>京都三味：<%=p.getPro2() %>
			<tr>
				<td>神戶紅豆：<%=p.getPro3() %>
			<tr>
				<td>全麥核桃：<%=p.getPro4() %>
			<tr>
				<td>雙層法式草莓布丁(6吋+4吋)：<%=p.getPro5() %>
			<tr>
				<td>繽紛莓果：<%=p.getPro6() %>
			<tr>
				<td>愛戀巧克力：<%=p.getPro7() %>
			<tr>
				<td>你是我的草莓(4吋)：<%=p.getPro8() %>
			<tr>
				<td><b>一共：<%=p.getSum() %>元</b>
			<tr>
				<td>
			<tr>
				<td><input type="submit" value="確定">
			<!-- 不使用form鏈結<a href="../ok">確定</a> -->
		</table>
	</form>
</table>

</body>
</html>