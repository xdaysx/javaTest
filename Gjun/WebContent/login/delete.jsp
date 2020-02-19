<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.ResultSet"
    import="Dao.porderDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<font size="70px" color="#400000" face="fantasy">Delete</font>
<table border="0">
	<tr>
		<th bgcolor="#400000" height="5" width="930">
</table>
<table border="0">
	<tr>
		<td width="680">
		<td><h1><a style=text-decoration:none href="admin.jsp">上一頁 &nbsp;</a>/<a style=text-decoration:none href="../index.jsp">&nbsp;回首頁</a></h1>
	<tr><td colspan=2>
	
	<form action="" method="post">
		
		<table align="center" style="border-top:3px #FFD382 solid;border-bottom:3px #82FFFF solid;" cellpadding="10" border='0'>
			<tr>
				<td>ID：<input type="text" name="id" size="2" required="required">
				<td><input type="submit" value="ok">
		</table>
	</form>
	<br>
	<table width="640" align="center" style="border:3px pink dashed;" border='1'>
		<tr align="center">
			<th>ID<th>NAME<th>鮮奶吐司<th>京都三味<th>神戶紅豆<th>全麥核桃<th>雙層法式草莓布丁<th>繽紛莓果<th>愛戀巧克力<th>你是我的草莓<th>SUM
			<%
				try{
					int ID=Integer.parseInt(request.getParameter("id"));
					new porderDao().delete(ID);
				}catch(NumberFormatException e){}
			
				ResultSet rs=new porderDao().query();
				while(rs.next())
				{
					out.println("<tr align=center><td>"+rs.getInt("id")+
										"<td>"+rs.getString("name")+
										"<td>"+rs.getInt("pro1")+
										"<td>"+rs.getInt("pro2")+
										"<td>"+rs.getInt("pro3")+
										"<td>"+rs.getInt("pro4")+
										"<td>"+rs.getInt("pro5")+
										"<td>"+rs.getInt("pro6")+
										"<td>"+rs.getInt("pro7")+
										"<td>"+rs.getInt("pro8")+
										"<td>"+rs.getInt("sum")+"<br>");
				}
			%>
	</table>
</table>


</body>
</html>