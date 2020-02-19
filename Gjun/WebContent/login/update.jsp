<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.ResultSet"
    import="Dao.porderDao"
    import="model.porder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<font size="70px" color="#400000" face="fantasy">Update</font>
<table border="0">
	<tr>
		<th bgcolor="#400000" height="5" width="930">
</table>
<table border="0">
	<tr>
		<td width="680">
		<td><h1><a style=text-decoration:none href="admin.jsp">上一頁&nbsp;</a>/<a style=text-decoration:none href="../index.jsp">&nbsp;回首頁</a></h1>
	<tr><td colspan=2>
	<form action="update.jsp" method="post">
		
		<table align="center" style="border-top:3px #FFD382 solid;border-bottom:3px #82FFFF solid;" cellpadding="10" border='0'>
			<tr>
				<td>ID：<input type="text" name="id" size="2" required="required">
				<td>
			鮮奶吐司：<select name="pro1">
				<option value="0">0
				<option value="1">1
				<option value="2">2
				<option value="3">3
				<option value="4">4
				<option value="5">5
				<option value="6">6
				<option value="7">7
				<option value="8">8
				<option value="9">9
				<option value="10">10
				</select>
				<td>
			京都三味：<select name="pro2">
				<option value="0">0
				<option value="1">1
				<option value="2">2
				<option value="3">3
				<option value="4">4
				<option value="5">5
				<option value="6">6
				<option value="7">7
				<option value="8">8
				<option value="9">9
				<option value="10">10
				</select>
				<td>
			神戶紅豆：<select name="pro3">
				<option value="0">0
				<option value="1">1
				<option value="2">2
				<option value="3">3
				<option value="4">4
				<option value="5">5
				<option value="6">6
				<option value="7">7
				<option value="8">8
				<option value="9">9
				<option value="10">10
				</select>
				<td>
			全麥核桃：<select name="pro4">
				<option value="0">0
				<option value="1">1
				<option value="2">2
				<option value="3">3
				<option value="4">4
				<option value="5">5
				<option value="6">6
				<option value="7">7
				<option value="8">8
				<option value="9">9
				<option value="10">10
				</select>
				<td>
			<tr>
				<td><input type="submit" value="ok">
			<td>
			雙層法式草莓布丁：<select name="pro5">
				<option value="0">0
				<option value="1">1
				<option value="2">2
				<option value="3">3
				<option value="4">4
				<option value="5">5
				</select>
				<td>
			繽紛莓果：<select name="pro6">
				<option value="0">0
				<option value="1">1
				<option value="2">2
				<option value="3">3
				<option value="4">4
				<option value="5">5
				</select>
				<td>
			愛戀巧克力：<select name="pro7">
				<option value="0">0
				<option value="1">1
				<option value="2">2
				<option value="3">3
				<option value="4">4
				<option value="5">5
				</select>
				<td>
			你是我的草莓：<select name="pro8">
				<option value="0">0
				<option value="1">1
				<option value="2">2
				<option value="3">3
				<option value="4">4
				<option value="5">5
				</select>
		</table>
	</form>
	<br>
	<table width="640" align="center" style="border:3px pink dashed;" border='1'>
		<tr align="center">
			<th>ID<th>NAME<th>鮮奶吐司<th>京都三味<th>神戶紅豆<th>全麥核桃<th>雙層法式草莓布丁<th>繽紛莓果<th>愛戀巧克力<th>你是我的草莓<th>SUM
			<%
				try{
					int ID=Integer.parseInt(request.getParameter("id"));
					int pro1=Integer.parseInt(request.getParameter("pro1"));
					int pro2=Integer.parseInt(request.getParameter("pro2"));
					int pro3=Integer.parseInt(request.getParameter("pro3"));
					int pro4=Integer.parseInt(request.getParameter("pro4"));
					int pro5=Integer.parseInt(request.getParameter("pro5"));
					int pro6=Integer.parseInt(request.getParameter("pro6"));
					int pro7=Integer.parseInt(request.getParameter("pro7"));
					int pro8=Integer.parseInt(request.getParameter("pro8"));
					
					porder p=new porder();
					
					p.setPro1(pro1);
					p.setPro2(pro2);
					p.setPro3(pro3);
					p.setPro4(pro4);
					p.setPro5(pro5);
					p.setPro6(pro6);
					p.setPro7(pro7);
					p.setPro8(pro8);
					new porderDao().updateall(ID, pro1, pro2, pro3, pro4, pro5, pro6, pro7, pro8);
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