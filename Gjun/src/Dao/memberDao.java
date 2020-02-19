package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Dao.implDao;
import model.member;

public class memberDao implements implDao{

	public static void main(String[] args) throws SQLException {
		//測試連線System.out.println(implDao.getConn());
		/*新增 
		member m=new member();
		m.setName("q");
		m.setUser("w");
		m.setPassword("e");
		m.setAddress("r");
		m.setEmail("t");
		m.setMobile("y");
		m.setPhone("09");
		m.setType("admin");
		new memberDao().add(m);*/
		
		/*查詢
		ResultSet rs=new memberDao().query();
			while(rs.next())
			{
				System.out.println("Id="+rs.getInt("id")+
									"\tName="+rs.getString("name")+
									"\tUser="+rs.getString("user")+
									"\tPassword="+rs.getString("password")+
									"\tAddress="+rs.getString("address")+
									"\tEmail="+rs.getString("email")+
									"\tMobile="+rs.getString("mobile")+
									"\tType="+rs.getString("type"));
			}*/
			
		//刪除new memberDao().delete(1);
		
		/*修改member m=new member();
		m.setName("tom");
		new memberDao().update(2, m);*/
	}
	
	
	
	@Override
	public void add(Object o) {
		member m=(member)o;
		String sql="insert into member(name,user,password,mobile,phone,address,email,type) value(?,?,?,?,?,?,?,?)";
		Connection conn=implDao.getConn();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, m.getName());
			ps.setString(2, m.getUser());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getEmail());
			ps.setString(6, m.getMobile());
			ps.setString(7, m.getPhone());
			ps.setString(8, m.getType());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet query() {
		String sql="select * from member";
		Connection conn=implDao.getConn();
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void update(int id, Object o) {
		member m=(member)o;
		String sql="update member set name='"+m.getName()+"' where id="+id;
		Connection conn=implDao.getConn();
		try {
			Statement st=conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void delete(int id) {
		String sql="delete from member where id="+id;
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
