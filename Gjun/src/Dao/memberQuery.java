package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Dao.implDao;

public class memberQuery extends memberDao{

	public static void main(String[] args) {
		//�P�_�b������System.out.println(new memberQuery().checkUser("a"));
		//�P�_�b���K�X����System.out.println(new memberQuery().checkMember("s", "s"));
		
		ResultSet rs=memberQuery.checkMember2("w", "e");
		
		System.out.println(rs);
		try
		{
		System.out.println(rs.next());
		
		System.out.println(rs.getString("type"));
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static boolean checkUser(String user)//�P�_�b������
	{
		String sql="select * from member where user='"+user+"'";
		Connection conn=implDao.getConn();
		boolean x=false;
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			x=rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public static boolean checkMember(String user,String password)//�P�_�b���K�X�O�_���T
	{
		String sql="SELECT * FROM gjun.member where user='"+user+"' and password='"+password+"'";
		Connection conn=implDao.getConn();
		boolean x=false;
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			
			x=rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
	}
	
	public static ResultSet checkMember2(String user,String password)//�P�_�b���K�X�O�_���T
	{
		String sql="SELECT * FROM gjun.member where user='"+user+"' and password='"+password+"'";
		Connection conn=implDao.getConn();
		ResultSet rs=null;
		try {
			Statement st=conn.createStatement();
			rs=st.executeQuery(sql);
			
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
}
