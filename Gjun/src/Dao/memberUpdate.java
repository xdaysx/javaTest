package Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Dao.implDao;
import model.member;

public class memberUpdate extends memberDao{

	public static void main(String[] args) {
		member m=new member();
		m.setName("ABC");
		m.setPassword("4321");
		m.setAddress("JAP");
		m.setMobile("09123");
		m.setEmail("123@gamil.com");
		new memberUpdate().updateAll(2, m);
	}
	
	public void update1(int id, Object o) {
		member m=(member)o;
		
		
		String sql="update member set name='"+m.getName()+
		"' , password='"+m.getPassword()+
		"' where id="+id;
		
		Connection conn=implDao.getConn();
		
		try {
			Statement st=conn.createStatement();
			
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void update2(int id, Object o) {
		member m=(member)o;
		
		
		String sql="update member set name='"+m.getName()+
				"' , password='"+m.getPassword()+
				"', address='"+m.getAddress()+
				"' where id="+id;
		
		Connection conn=implDao.getConn();
		
		try {
			Statement st=conn.createStatement();
			
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void updateAll(int id, Object o) {
		member m=(member)o;
		String sql="update member set name='"+m.getName()+
				"' , password='"+m.getPassword()+
				"', address='"+m.getAddress()+
				"', email='"+m.getEmail()+
				"', mobile='"+m.getMobile()+
				"' where id="+id;
		
		Connection conn=implDao.getConn();
		
		try {
			Statement st=conn.createStatement();
			
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
